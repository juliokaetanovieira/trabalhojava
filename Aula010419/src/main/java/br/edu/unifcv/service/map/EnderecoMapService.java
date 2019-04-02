package br.edu.unifcv.service.map;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifcv.model.Endereco;
import br.edu.unifcv.model.Professor;
import br.edu.unifcv.service.EnderecoService;
import br.edu.unifcv.service.exception.RecursoNaoEncontradoException;

@Service
public class EnderecoMapService extends AbstractMapService<Endereco, Long> implements EnderecoService {

	@Autowired
	EnderecoMapService EnderecoMapService;	
	
	@Override
	public Set<Endereco> getAll() {
		return super.findAll();
	}

	@Override
	public Endereco findById(Long id) {
		Optional<Endereco> p = Optional.ofNullable(super.findById(id));
		if (p.isPresent())
			return p.get();
		throw new RecursoNaoEncontradoException("Não achei o id : " + id);
	}

	@Override
	public Endereco saveOrUpdate(Endereco object) {
		
		return super.saveOrUpdate(object);
	}

	@Override
	public void delete(Endereco object) {
		super.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

}
