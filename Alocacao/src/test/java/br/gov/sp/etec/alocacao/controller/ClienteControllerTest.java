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

<<<<<<< HEAD
import br.gov.sp.etec.alocacao.entity.Cliente;
=======
import br.gov.sp.etec.alocacao.model.Cliente;
>>>>>>> 255e8e3b4debab56ff4c1e6a2b796809103a7a53
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
		List<Cliente> clientes = getListCliente();
		assertNotNull(clientes);
	}
	
	@Test
	public void clienteTestNull() {
		when(repository.findAll()).thenReturn(null);
		List<Cliente> clientes  = getListCliente();
		assertNull(clientes);
	}
	
	@Test
	public void adicionarClienteTest() {
		when(repository.save(any(Cliente.class))).thenReturn(getCliente());
		Cliente c = controller.addCliente(getCliente());
		assertEquals("Maycon", c.getNome());
	}
	
	@Test
	public void atualizarClienteTest() {
		when(repository.save(any(Cliente.class))).thenReturn(getCliente());
		Cliente c = controller.attCliente(new Cliente("Guilherme","987.654.321-09","guilherme@email.com.br","(13) 12345-6789"));
		assertEquals(1l, c.getId());
		assertEquals("Maycon", c.getNome());
		assertEquals("012.345.678-90", c.getCpf());
		assertEquals("maycon@email.com.br", c.getEmail());
		assertEquals("(11) 98765-4321", c.getTel());
	}
	
	@Test
	public void apagarClienteTest() {
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
