package br.edu.unifcv2.Faculdade.service.map;

import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifcv2.Faculdade.model.Professor;
import br.edu.unifcv2.Faculdade.model.Telefone;
import br.edu.unifcv2.Faculdade.service.crud.ProfessorService;
import br.edu.unifcv2.Faculdade.service.exception.RecursoNaoEncontradoException;
import br.edu.unifcv2.Faculdade.service.exception.RegraDeNegocioException;

@Service
public class ProfessorMapService extends AbstractMapService<Professor, Long> implements ProfessorService{

	@Autowired
	TelefoneMapService TelefoneMapService;

	@Override
	public Professor findById(Long id) {
		Optional<Professor> p = Optional.ofNullable(super.findById(id));
		if(p.isPresent())
			return p.get();
		throw new RecursoNaoEncontradoException("Não achei o id : " + id);
		
	}

	@Override
	public Set<Professor> getAll() {
		return super.findAll();
	}

	@Override
	public Professor findByName(String nome) {
		for(Entry<Long, Professor> entry: map.entrySet()) {
			if(entry.getValue().getNome().equalsIgnoreCase(nome)) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public Professor findBySobrenome(String sobrenome) {
		for(Entry<Long, Professor> entry: map.entrySet()) {
			if(entry.getValue().getsobrenome().equalsIgnoreCase(sobrenome)) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public int count() {
		int count = map.size();
		return count;
	}

	@Override
	public Professor save(Professor professor) {
		if (professor.getNome() == "") {
			throw new RegraDeNegocioException("Nome não pode ser vazio!");
		}
		if(professor.getTelefone() != null) {
			this.save(professor);
		}
		return super.save(professor);
	}
	
	private void saveOrUpdateTelefone(Telefone telefone) {
		if(telefone.getId() ==  null) {
			Telefone t = TelefoneMapService.save(telefone);
			telefone.setId(t.getId());
		}
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Professor professor) {
		 super.delete(professor);
	}

}
