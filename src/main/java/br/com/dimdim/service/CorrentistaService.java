package br.com.dimdim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dimdim.entities.Correntista;
import br.com.dimdim.repositories.CorrentistaRepository;

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	
	public List<Correntista> listarCorrentista() {
		return repository.findAll();
	}

	public Correntista visualizarCorrentista(Long id) {
		Optional<Correntista> obj = repository.findById(id);
		return obj.get();
	}

	public Correntista inserirCorrentista(Correntista obj) {
		return repository.save(obj);
	}

	public void excluirCorrentista(Long id) {
		repository.deleteById(id);
	}
	
	public Correntista editarCorrentista(Long id, Correntista obj) {
		Correntista entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Correntista entity, Correntista obj) {
		entity.setNome(obj.getNome());
	}
	
}
