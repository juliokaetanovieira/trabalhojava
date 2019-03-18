package br.edu.unifcv2.Faculdade.bootstrap;

import org.springframework.boot.CommandLineRunner;

import br.edu.unifcv2.Faculdade.model.Professor;

public class DataLoader implements CommandLineRunner {

	br.edu.unifcv2.Faculdade.service.map.ProfessorMapService ProfessorMapService = new br.edu.unifcv2.Faculdade.service.map.ProfessorMapService();

	@Override
	public void run(String... args) throws Exception {
		inserirDados();
	}

	private void inserirDados() {

		Professor professor = new Professor();
		professor.setNome("André");	
		professor.setIdade(42);
		professor.setAno(3);
		professor.setsobrenome("Naosei");
		professor.setPeriodo("Noturno");
		professor.setTurma("B");
		professor.setFaculdade("Faculdade Cidade Verde");
		ProfessorMapService.save(professor);
	}
}
