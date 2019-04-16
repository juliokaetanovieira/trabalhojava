package br.edu.unifcv.bootstrap;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.unifcv.model.Endereco;
import br.edu.unifcv.model.Aluno;
import br.edu.unifcv.model.Telefone;
import br.edu.unifcv.service.map.AlunoMapService;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	private AlunoMapService alunoMapService;

	@Override
	public void run(String... args) throws Exception {
		saveData();
	}

	private void saveData() {
		
		Aluno a1 = new Aluno();
		
		Endereco e1 = new Endereco();
		e1.setLogradouro("Rua xpto");
		e1.setBairro("Centro");
		e1.setCidade("Maringa");
		e1.setEstado("PR");
		e1.setNumero("123");
		
		
	    List<Endereco> lista = new ArrayList<>();
	    lista.add(e1);
	    
	    Telefone t1 = new Telefone();
	    t1.setContato("Contato XXXX");
	    t1.setTelefone("44999995555");

		a1.setNome("André");
		a1.setSobreNome("Oliveira");
		a1.setIdade(34);
		a1.setPeriodo("Noturno");
		a1.setFaculdade("UniFCV");
		a1.setTurma("5° Semestre");
		a1.setAno("2019");
		a1.setEndereco(lista);
		a1.setTelefone(t1);

		this.alunoMapService.saveOrUpdate(a1);

	}

}
