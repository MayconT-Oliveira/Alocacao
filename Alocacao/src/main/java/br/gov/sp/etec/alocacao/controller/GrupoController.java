package br.gov.sp.etec.alocacao.controller;

<<<<<<< HEAD
import java.time.LocalDate;
=======
>>>>>>> 255e8e3b4debab56ff4c1e6a2b796809103a7a53
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import br.gov.sp.etec.alocacao.entity.Grupo;
=======
import br.gov.sp.etec.alocacao.model.Grupo;
>>>>>>> 255e8e3b4debab56ff4c1e6a2b796809103a7a53
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
<<<<<<< HEAD
		grupo.setDataCriacao(LocalDate.now());
		grupo.setDataAtualizacao(LocalDate.now());
		Grupo g = repository.save(grupo);
		return g;
=======
		return repository.save(grupo);
>>>>>>> 255e8e3b4debab56ff4c1e6a2b796809103a7a53
	}
	
	@PutMapping("atualizar-grupo")
	public Grupo attGrupo(@RequestBody Grupo grupo) {
<<<<<<< HEAD
		grupo.setDataAtualizacao(LocalDate.now());
		Grupo g = repository.save(grupo);
		return g;
=======
		return repository.save(grupo);
>>>>>>> 255e8e3b4debab56ff4c1e6a2b796809103a7a53
	}
	
	@DeleteMapping("deletar-grupo/{id}")
	public void delGrupo(@PathVariable long id) {
		repository.deleteById(id);
	}
}