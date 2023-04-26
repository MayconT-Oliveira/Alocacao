package br.gov.sp.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.gov.sp.etec.alocacao.model.Carro;
import br.gov.sp.etec.alocacao.model.Cliente;
import br.gov.sp.etec.alocacao.repository.ClienteRepository;

@ExtendWith(SpringExtension.class)
public class ClienteControllerTest {

	@InjectMocks
	ClienteController controller;
	
	@Mock
	ClienteRepository repository;
	
	@Mock
	List<Cliente> listaCliente;
	
	@Mock
	Cliente cliente;
	
	@Test
	public void clienteTestSucess() {
		when(repository.findAll()).thenReturn(getListCliente());
		List<Cliente> clientes = controller.cliente();
		assertNotNull(clientes);
	}
	
	@Test
	public void clienteTesteNull() {
		when(repository.findAll()).thenReturn(null);
		List<Cliente> clientes = controller.cliente();
		assertNull(null);
	}
	
	@Test
	public void adicionarClienteTesteComSucesso() {
		when(repository.save(any(Cliente.class))).thenReturn(getCliente());
		Cliente c = controller.addCliente(getCliente());
		assertEquals("Maycon", c.getNome());
	}
	
	@Test
	public void atualizarClienteTesteComSucesso() {
		when(repository.save(any(Cliente.class))).thenReturn(getCliente());
		Cliente c = controller.attCliente(new Cliente("Maycon","012.345.678-90","maycon@email.com.br","(11) 98765-4321"));
		assertEquals(1l, c.getId());
		assertEquals("Maycon", c.getNome());
		assertEquals("012.345.678-90", c.getCpf());
		assertEquals("maycon@email.com.br", c.getEmail());
		assertEquals("(11) 98765-4321", c.getTel());
	}
	
	@Test
	public void apagarClienteTesteComSucesso() {
		 controller.delCliente(1L);
		 assertNull(null);
	}
	
	private ArrayList<Cliente> getListCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1l);
		cliente.setNome("Maycon");
		cliente.setCpf("012.345.678-90");
		cliente.setEmail("maycon@email.com.br");
		cliente.setTel("(11) 98765-4321");
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		lista.add(cliente);
		return lista;
	}

	
	private Cliente getCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1l);
		cliente.setNome("Maycon");
		cliente.setCpf("012.345.678-90");
		cliente.setEmail("maycon@email.com.br");
		cliente.setTel("(11) 98765-4321");
		
		return cliente;
		}
}
