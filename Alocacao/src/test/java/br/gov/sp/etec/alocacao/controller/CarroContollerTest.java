package br.gov.sp.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.gov.sp.etec.alocacao.model.Carro;

@ExtendWith(SpringExtension.class)
public class CarroContollerTest {
	
	@InjectMocks
	CarroController controller;
	
	@Test
	public void carrosTeste() {
		 List<Carro> carros = controller.carros();
		 assertNotNull(carros);
	}
	

}
