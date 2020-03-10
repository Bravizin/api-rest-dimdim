package br.com.dimdim.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DD_SPC")
public class UsuarioNegativado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CPF_CANDIDATO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cpf;
	
	public UsuarioNegativado() {
		
	}

	public UsuarioNegativado(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
