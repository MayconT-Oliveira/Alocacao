package br.gov.sp.etec.alocacao.dto;

import java.time.LocalDate;

public class AlocacaoDto {
	
	private Long IdCliente;
	
	private Long IdCarro;
	
	private LocalDate dataInicioAlocacao;
	
	private LocalDate dataFimAlocacao;

	public Long getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Long idCliente) {
		IdCliente = idCliente;
	}

	public Long getIdCarro() {
		return IdCarro;
	}

	public void setIdCarro(Long idCarro) {
		IdCarro = idCarro;
	}

	public LocalDate getDataInicioAlocacao() {
		return dataInicioAlocacao;
	}

	public void setDataInicioAlocacao(LocalDate dataInicioAlocacao) {
		this.dataInicioAlocacao = dataInicioAlocacao;
	}

	public LocalDate getDataFimAlocacao() {
		return dataFimAlocacao;
	}

	public void setDataFimAlocacao(LocalDate dataFimAlocacao) {
		this.dataFimAlocacao = dataFimAlocacao;
	}
	
	
}
