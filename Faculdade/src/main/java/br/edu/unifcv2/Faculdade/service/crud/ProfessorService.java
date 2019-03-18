package br.edu.unifcv2.Faculdade.service.crud;

import br.edu.unifcv2.Faculdade.model.Professor;

public interface ProfessorService extends CrudService<Professor, Long> {
	
	Professor findByName(String nome);
	
	Professor findBySobrenome(String sobrenome);
	
	int count();
}
