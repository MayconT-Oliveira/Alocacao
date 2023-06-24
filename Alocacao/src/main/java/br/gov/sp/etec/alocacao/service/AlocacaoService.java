package br.gov.sp.etec.alocacao.service;

import br.gov.sp.etec.alocacao.dto.AlocacaoDto;
import br.gov.sp.etec.alocacao.entity.Alocacao;

public interface AlocacaoService {

	public Alocacao calcular(AlocacaoDto alocacaoDto);
}
