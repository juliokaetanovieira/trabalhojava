package br.edu.unifcv2.Faculdade.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import br.edu.unifcv2.Faculdade.model.Professor;
import br.edu.unifcv2.Faculdade.model.Telefone;
import br.edu.unifcv2.Faculdade.service.crud.ProfessorService;
import br.edu.unifcv2.Faculdade.service.map.ProfessorMapService;

public class DataLoader implements CommandLineRunner {

	@Autowired
	private ProfessorMapService professorMapService;

	@Override
	public void run(String... args) throws Exception {
		inserirDados();
	}

	private void inserirDados() {

		Professor p2 = new Professor();

		Telefone t2 = new Telefone();
		t2.setContato("Contato YYY");
		t2.setTelefone("44991472580");

		p2.setNome("Anna");
		p2.setIdade(17);
		p2.setAno(5);
		p2.setsobrenome("Laura");
		p2.setPeriodo("Noturno");
		p2.setTurma("A");
		p2.setFaculdade("Faculdade Cidade Verde");
		p2.setTelefone(t2);
		professorMapService.save(p2);
	}

}
