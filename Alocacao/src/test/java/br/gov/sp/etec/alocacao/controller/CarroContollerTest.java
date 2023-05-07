package br.gov.sp.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.gov.sp.etec.alocacao.model.Carro;
import br.gov.sp.etec.alocacao.repository.CarroRepository;

@ExtendWith(SpringExtension.class)
public class CarroContollerTest {
	
	@InjectMocks
	CarroController controller;
	
	@Mock
	CarroRepository repository;
	
	@Mock
	List<Carro> listaCarro;
	
	@Mock
	Carro carro;
	
	@Test
	public void carrosTestComListaDeCarro() {
		when(repository.findAll()).thenReturn(listaCarro);
		List<Carro> carros = controller.carros();
		assertNotNull(carros);
	}
	
	@Test
	public void carrosTestNull() {
		when(repository.findAll()).thenReturn(null);
		List<Carro> carros = controller.carros();
		assertNull(carros);
	}
	
	@Test
	public void adicionarCarrosTest() {
		when(repository.save(any(Carro.class))).thenReturn(getCarro());
		Carro c = controller.addCarro(getCarro());
		assertEquals("WBM", c.getModelo());
	}
	
	@Test
	public void atualizarCarrosTest() {
		when(repository.save(any(Carro.class))).thenReturn(getCarro());
		Carro c = controller.attCarro(new Carro("Branco Escuro","LMB-0702",20000207l,"Toro"));
		assertEquals(1l, c.getId());
		assertEquals("WBM", c.getModelo());
		assertEquals("Preto Claro", c.getCor());
		assertEquals("OPA-6924", c.getPlaca());
		assertEquals(687561l, c.getChassi());
	}
	
	@Test
	public void apagarCarrosTest() {
		 controller.delCarro(1L);
		 assertNull(null);
	}
	
	private Carro getCarro() {
		Carro carro = new Carro();
		carro.setId(1l);
		carro.setModelo("WBM");
		carro.setCor("Preto Claro");
		carro.setPlaca("OPA-6924");
		carro.setChassi(687561l);
		return carro;
	}
}
	

