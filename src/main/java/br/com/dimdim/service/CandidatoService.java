package br.com.dimdim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dimdim.entities.Candidato;
import br.com.dimdim.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repository;
	
	public List<Candidato> listarCandidatos() {
		return repository.findAll();
	}

	public Candidato visualizarCandidato(Long id) {
		Optional<Candidato> obj = repository.findById(id);
		return obj.get();
	}

	public Candidato inserirCandidato(Candidato obj) {
		return repository.save(obj);
	}

	public void excluirCandidato(Long id) {
		repository.deleteById(id);
	}
	
	public Candidato editarCandidato(Long id, Candidato obj) {
		Candidato entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Candidato entity, Candidato obj) {
		entity.setNome(obj.getNome());
	}
	
}
