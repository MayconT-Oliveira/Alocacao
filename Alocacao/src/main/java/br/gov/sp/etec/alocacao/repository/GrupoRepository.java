package br.gov.sp.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import br.gov.sp.etec.alocacao.entity.Grupo;
=======
import br.gov.sp.etec.alocacao.model.Grupo;
>>>>>>> 255e8e3b4debab56ff4c1e6a2b796809103a7a53

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long>{

}
