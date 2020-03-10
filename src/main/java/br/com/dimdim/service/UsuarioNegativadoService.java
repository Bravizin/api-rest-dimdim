package br.com.dimdim.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dimdim.entities.UsuarioNegativado;
import br.com.dimdim.repositories.UsuarioNegativadoRepository;

@Service
public class UsuarioNegativadoService {
	
	@Autowired
	private UsuarioNegativadoRepository repository;
	
	public UsuarioNegativado visualizarUsuarioNegativado(String id) {
		Optional<UsuarioNegativado> obj = repository.findById(id);
		return obj.get();
	}
	
}
