package br.com.dimdim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dimdim.entities.UsuarioNegativado;

public interface UsuarioNegativadoRepository extends JpaRepository<UsuarioNegativado, String>  {
	
	
}
