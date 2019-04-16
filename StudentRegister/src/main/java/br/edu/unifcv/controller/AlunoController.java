package br.edu.unifcv.controller;


import java.net.URI;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.edu.unifcv.model.Aluno;
import br.edu.unifcv.service.map.AlunoMapService;


@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {

	@Autowired
	AlunoMapService alunoMapService;

	@RequestMapping
	public Set<Aluno> getAll() {
		return alunoMapService.findAll();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Aluno> getProfessor(@PathVariable Long id) {
		return ResponseEntity.ok(alunoMapService.findById(id)); 
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Aluno> saveProfessor(@RequestBody Aluno aluno) {
		
		Aluno p = alunoMapService.saveOrUpdate(aluno);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}


	@RequestMapping(path = "/update", method = RequestMethod.PUT)
	public 	ResponseEntity<Aluno> updateProfessor(@RequestBody Aluno professor) {
		return ResponseEntity.ok(alunoMapService.saveOrUpdate(professor));
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteProfessor(@PathVariable Long id) {
		alunoMapService.deleteById(id);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(path = "/nome/{nome}", method = RequestMethod.GET)
	public ResponseEntity<Aluno> getByName(@PathVariable String nome) {
		try {
			Aluno p = alunoMapService.findByNome(nome);
			return ResponseEntity.ok(p);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(path = "/sobrenome/{sobrenome}", method = RequestMethod.GET)
	public ResponseEntity<Aluno> getBySobrenome(@PathVariable String sobrenome) {
		try {
			Aluno p = alunoMapService.findBySobreNome(sobrenome);
			return ResponseEntity.ok(p);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(path = "/registros")
	public Long count() {
		return alunoMapService.count();
	}

}
