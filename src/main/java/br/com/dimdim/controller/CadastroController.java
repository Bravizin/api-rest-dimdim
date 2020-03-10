package br.com.dimdim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dimdim.entities.Candidato;
import br.com.dimdim.entities.Correntista;
import br.com.dimdim.entities.PessoaDto;
import br.com.dimdim.entities.UsuarioNegativado;
import br.com.dimdim.resources.EnviarEmailResouce;
import br.com.dimdim.service.CandidatoService;
import br.com.dimdim.service.CorrentistaService;
import br.com.dimdim.service.UsuarioNegativadoService;

@Controller
public class CadastroController {
	
	@Autowired
	private CorrentistaService correntistaService;
	@Autowired
	private CandidatoService candidatoService;
	@Autowired
	private UsuarioNegativadoService usuarioNegativadoService;
	
	@RequestMapping("/teste")
	public void teste() {
		EnviarEmailResouce enviaEmail = new EnviarEmailResouce();
 		enviaEmail.enviaEmail("TESTE", "leo_rse@hotmail.com", false);
	}
	
	@RequestMapping("/")
	public String novoCliente(Model model) {
		PessoaDto pessoa = new PessoaDto();
		model.addAttribute("pessoa", pessoa);
		return "cadastro";
	}
	
	@RequestMapping("/analisar")
	public String analisarCliente(@ModelAttribute("pessoa") PessoaDto pessoa) {
		UsuarioNegativado u =  usuarioNegativadoService.visualizarUsuarioNegativado(pessoa.getCpf());
		boolean isNegativado = false;
		if(u == null) {
			Correntista c =  new Correntista();
			c.setNome(pessoa.getNome());
			c.setEmail(pessoa.getEmail());
			c.setCelular(pessoa.getCelular());
			c.setCpf(pessoa.getCpf());
			c.setEndereco(pessoa.getEndereco());
			c.setDataIngresso(pessoa.getDataIngresso());
			correntistaService.inserirCorrentista(c);
		} else {
			isNegativado = true;
			Candidato c = new Candidato();
			c.setNome(pessoa.getNome());
			c.setEmail(pessoa.getEmail());
			c.setCelular(pessoa.getCelular());
			c.setCpf(pessoa.getCpf());
			c.setEndereco(pessoa.getEndereco());
			c.setDataAnalise(pessoa.getDataIngresso());
			candidatoService.inserirCandidato(c);
		}
		
		//CHAMAR AQUI A API DO RAILIXO
		EnviarEmailResouce enviaEmail = new EnviarEmailResouce();
		enviaEmail.enviaEmail(pessoa.getNome(), pessoa.getEmail(), isNegativado);
		
		return "termino";
	}
	
}
