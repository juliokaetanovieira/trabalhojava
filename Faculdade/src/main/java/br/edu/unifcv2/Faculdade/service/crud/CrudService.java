package br.edu.unifcv2.Faculdade.service.crud;

import java.util.Set;

public interface CrudService<T, ID> {

	Set<T> getAll();
	
	T findById(ID id);
	
	T save(T object);

	void delete(T object);

	void deleteById(ID id);
}

