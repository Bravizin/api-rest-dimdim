package br.com.dimdim.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DD_CANDIDATO")
public class Candidato implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CLI")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME_CLI")
	private String nome;
	
	@Column(name = "EMAIL_CLI")
	private String email;
	
	@Column(name = "CELULAR_CLI")
	private String celular;
	
	@Column(name = "CPF_CLI")
	private String cpf;
	
	@Column(name = "ENDERECO_CLI")
	private String endereco;
	
	@Column(name = "DT_ANALISE")
	private Calendar dataAnalise;
	
	public Candidato() {
		
	}

	public Candidato(Long id, String nome, String email, String celular, String cpf, String endereco,
			Calendar dataAnalise) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataAnalise = dataAnalise;
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

	public Calendar getDataAnalise() {
		return dataAnalise;
	}

	public void setDataAnalise(Calendar dataAnalise) {
		this.dataAnalise = dataAnalise;
	}
	
}
