package br.gov.sp.etec.alocacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.alocacao.dto.AlocacaoDto;
import br.gov.sp.etec.alocacao.entity.Alocacao;
import br.gov.sp.etec.alocacao.service.AlocacaoService;

@RestController
public class AlocacaoController {
	
	@Autowired
	private AlocacaoService service;
	
	@PostMapping("alugar")
	public Alocacao alugar(@RequestBody AlocacaoDto dto) {
		return service.calcular(dto);
	}
	

}
