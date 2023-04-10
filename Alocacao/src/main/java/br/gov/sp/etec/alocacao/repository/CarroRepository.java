package br.gov.sp.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.alocacao.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
