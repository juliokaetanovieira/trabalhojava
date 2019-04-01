package br.edu.unifcv2.Faculdade.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import br.edu.unifcv2.Faculdade.model.Telefone;

@Service
public class TelefoneMapService extends AbstractMapService<Telefone, Long> implements TelefoneService{

	@Override
	public Set<Telefone> getAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Telefone findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Telefone save(Telefone object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Telefone object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
