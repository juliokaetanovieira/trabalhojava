package br.edu.unifcv.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value = "id")
public class Telefone extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String contato;
	private String telefone;
	
	private Long professor_id;
	


	public Long getProfessor_id() {
		return professor_id;
	}

	public void setProfessor_id(Long professor_id) {
		this.professor_id = professor_id;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
