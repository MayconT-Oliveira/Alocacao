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

import br.gov.sp.etec.alocacao.model.Carro;
import br.gov.sp.etec.alocacao.repository.CarroRepository;

@RestController
public class CarroController {

	@Autowired
	CarroRepository repository;
	
	@GetMapping("/carros")
	public List<Carro> carros() {
		return repository.findAll();
	}
	
	@PostMapping("adicionar-carro")
	public Carro addCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}
	
	@PutMapping("atualizar-carro")
	public Carro attCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}
	
	@DeleteMapping("deletar-carro/{id}")
	public void delCarro(@PathVariable long id) {
		repository.deleteById(id);
	}
}