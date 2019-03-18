package br.edu.unifcv2.Faculdade.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifcv2.Faculdade.model.Professor;
import br.edu.unifcv2.Faculdade.service.map.ProfessorMapService;

@RestController
@RequestMapping(path = "/professor")
public class ProfessorController {

	@Autowired
	ProfessorMapService professorMapService;

	@RequestMapping(method = RequestMethod.GET)
	public Set<Professor> getAll() {
		return professorMapService.getAll();
	}	
	
	@RequestMapping(path = "/nome/{nome}", method = RequestMethod.GET)
	public Professor findByNome(@PathVariable String nome) {
		return professorMapService.findByName(nome);
	}
	@RequestMapping(path = "/sobrenome/{sobrenome}", method = RequestMethod.GET)
	public Professor findBySobrenome(@PathVariable String sobrenome) {
		return professorMapService.findBySobrenome(sobrenome);
	}
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Professor findById(@PathVariable Long id) {
		return professorMapService.findById(id);
	}
	
	@RequestMapping(path = "/count", method = RequestMethod.GET)
	public int count() {
		return professorMapService.count();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Professor saveProfessor(@RequestBody Professor professor) {
		return professorMapService.save(professor);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteProfessorById(@PathVariable Long id) {
		professorMapService.deleteById(id);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteProfessor(@RequestBody Professor professor) {
		professorMapService.delete(professor);
	}
	
}
