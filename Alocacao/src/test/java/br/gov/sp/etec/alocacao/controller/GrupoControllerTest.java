package br.gov.sp.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.gov.sp.etec.alocacao.model.Grupo;
import br.gov.sp.etec.alocacao.repository.GrupoRepository;

@ExtendWith(SpringExtension.class)
public class GrupoControllerTest {
	
	@InjectMocks
	GrupoController controller;
	
	@Mock
	GrupoRepository repository;
	
	@Mock
	List<Grupo> listaGrupo;
	
	@Mock
	Grupo grupo;
	
	@Test
	public void grupoTestSucess() throws Exception  {
		when(repository.findAll()).thenReturn(getListGrupo());
		List<Grupo> grupos = getListGrupo();
		assertNotNull(grupos);
	}
	
	@Test
	public void grupoTestNull() throws Exception  {
		when(repository.findAll()).thenReturn(null);
		List<Grupo> grupos = getListGrupo();
		assertNull(grupos);
	}
	
	@Test
	public void adicionarGrupoTest() throws Exception  {
		when(repository.save(any(Grupo.class))).thenReturn(getGrupo());
		Grupo g = controller.addGrupo(getGrupo());
		assertEquals("SUV", g.getDescricao());
	}
	
	@Test
	public void atualizarGrupoTest() throws Exception  {
		when(repository.save(any(Grupo.class))).thenReturn(getGrupo());
		Grupo g = controller.attGrupo(new Grupo("Compacto",2000,"05-05-2023","06-05-2023",false));
		assertEquals(1L, g.getIdGrupo());
		assertEquals("SUV", g.getDescricao());
		assertEquals(1000, g.getValorDiaria());
		assertEquals("02-05-2023", g.getDataCriacao());
		assertEquals("02-05-2023", g.getDataAtualizacao());
		assertEquals(true, g.getStatus());
	}
	

	@Test
	public void apagarGrupoTest() throws Exception  {
		controller.delGrupo(1L);
		assertNull(null);
		
	}
	
	private ArrayList<Grupo> getListGrupo() throws Exception {
		Grupo grupo = new Grupo();
		grupo.setIdGrupo(1L);
		grupo.setDescricao("SUV");
		grupo.setValorDiaria(1000);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		grupo.setDataCriacao(dateFormat.parse("02-05-2023"));
		grupo.setDataAtualizacao(dateFormat.parse("02-05-2023"));
		
		grupo.setStatus(true);
		
		ArrayList<Grupo> lista = new ArrayList<Grupo>();
		lista.add(grupo);
		return lista;
	}
	
	private Grupo getGrupo() throws Exception {
	    Grupo grupo = new Grupo();
	    grupo.setIdGrupo(1L);
	    grupo.setDescricao("SUV");
	    grupo.setValorDiaria(1000);

	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    grupo.setDataCriacao(dateFormat.parse("02-05-2023"));
	    grupo.setDataAtualizacao(dateFormat.parse("02-05-2023"));

	    grupo.setStatus(true);

	    return grupo;
	}

}
