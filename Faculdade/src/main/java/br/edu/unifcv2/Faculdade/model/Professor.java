package br.edu.unifcv2.Faculdade.model;

public class Professor extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private String Turma;
	private String Periodo;
	private int Ano;
	private String Faculdade;
	private Telefone telefone;
	
	public String getTurma() {
		return Turma;
	}
	
	public void setTurma(String turma) {
		Turma = turma;
	}	
	
	public String getPeriodo() {
		return Periodo;
	}
	
	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}
	
	public int getAno() {
		return Ano;
	}
	
	public void setAno(int ano) {
		Ano = ano;
	}
	
	public String getFaculdade() {
		return Faculdade;
	}
	
	public void setFaculdade(String faculdade) {
		Faculdade = faculdade;
	}

	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		telefone = telefone;
	}	
	
	
	
}
