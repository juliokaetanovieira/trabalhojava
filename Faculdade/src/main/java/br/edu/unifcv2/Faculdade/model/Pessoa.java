package br.edu.unifcv2.Faculdade.model;

public class Pessoa extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobrenome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {

		this.idade = idade;

	}
	
	public String getsobrenome() {
		return sobrenome;
	}

	public void setsobrenome(String sobrenome) {

		this.sobrenome = sobrenome;

	}

}
