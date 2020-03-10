package br.com.dimdim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dimdim.entities.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long>  {
	
	
}
