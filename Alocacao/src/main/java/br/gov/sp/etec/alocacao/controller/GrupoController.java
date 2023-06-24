package br.gov.sp.etec.alocacao.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.alocacao.entity.Grupo;
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
		grupo.setDataCriacao(LocalDate.now());
		grupo.setDataAtualizacao(LocalDate.now());
		Grupo g = repository.save(grupo);
		return g;
	}
	
	@PutMapping("atualizar-grupo")
	public Grupo attGrupo(@RequestBody Grupo grupo) {
		grupo.setDataAtualizacao(LocalDate.now());
		Grupo g = repository.save(grupo);
		return g;
	}
	
	@DeleteMapping("deletar-grupo/{id}")
	public void delGrupo(@PathVariable long id) {
		repository.deleteById(id);
	}
}