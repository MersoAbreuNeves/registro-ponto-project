package com.project.ibm.dto;

import java.time.Instant;
import java.time.LocalDateTime;


public class RegistroUsuarioDTO {

	private String nome;
	
	private LocalDateTime dataRegistro;
	
	public RegistroUsuarioDTO() {
		
	}
	
	
	public RegistroUsuarioDTO(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	

}
