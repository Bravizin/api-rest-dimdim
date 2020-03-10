package br.com.dimdim.entities;

import java.util.Calendar;

public class PessoaDto {
	
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String celular;
	
	private String cpf;
	
	private String endereco;
	
	private Calendar dataIngresso;
	
	public PessoaDto() {
		
	}

	public PessoaDto(Long id, String nome, String email, String celular, String cpf, String endereco,
			Calendar dataIngresso) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataIngresso = dataIngresso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Calendar dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	
}
