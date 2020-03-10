package br.com.dimdim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dimdim.entities.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Long>  {
	
	
}
