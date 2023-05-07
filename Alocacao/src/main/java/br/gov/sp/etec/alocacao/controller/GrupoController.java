package br.gov.sp.etec.alocacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.alocacao.model.Grupo;
import br.gov.sp.etec.alocacao.repository.GrupoRepository;

@RestController
public class GrupoController {
	
	@Autowired
	GrupoRepository repository;
	
	@GetMapping("/grupos")
	public List<Grupo> grupos() {
		return repository.findAll();
	}
	
	@PostMapping("adicionar-grupo")
	public Grupo addGrupo(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@PutMapping("atualizar-grupo")
	public Grupo attGrupo(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@DeleteMapping("deletar-grupo/{id}")
	public void delGrupo(@PathVariable long id) {
		repository.deleteById(id);
	}
}