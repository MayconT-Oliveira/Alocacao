package br.gov.sp.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.alocacao.entity.Alocacao;

@Repository
public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {

}
