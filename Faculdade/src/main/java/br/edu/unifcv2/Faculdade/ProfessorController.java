package br.edu.unifcv2.Faculdade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path= "/professor")
public class ProfessorController {
	
	List<Professor> professor;
	
	public ProfessorController() {
		professor = new ArrayList<>();
		Professor p = new Professor();
		p.setId(1);
		p.setNome("Andre");
		professor.add(p);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Professor> getProfessor(@PathVariable int id) {
		return ResponseEntity.ok(professor.get(id));
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Professor> saveProfessor(@RequestBody Professor p){
		p.setId(professor.size() + 1);
		professor.add(p);
		return ResponseEntity.ok(p);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Professor> updateProfessor(@PathVariable int id, @RequestBody Professor p) {
		Professor p1 = professor.get(id);
		p1.setNome(p.getNome());
		professor.add(id, p1);
		return ResponseEntity.ok(p1);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteProfessor(@PathVariable int id) {
		professor.remove(id);
		return ResponseEntity.noContent().build();
	}
}
