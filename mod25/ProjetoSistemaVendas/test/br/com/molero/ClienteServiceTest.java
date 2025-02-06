package br.com.molero;

import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;
import br.com.molero.mock.ClienteDAOMock;
import br.com.molero.services.ClienteService;
import br.com.molero.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
    private IClienteService iClienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO iClienteDAO = new ClienteDAOMock();
        iClienteService = new ClienteService(iClienteDAO);
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setNome("Tiago");
        cliente.setCpf(12312312312L);
        cliente.setEndereco("Rua X");
        cliente.setContato(11999999999L);
        iClienteService.salvar(cliente);
    }

    @Test
    public void salvarCliente(){
        Boolean clienteCadastrado = iClienteService.salvar(cliente);
        Assert.assertTrue(clienteCadastrado);
    }

    @Test
    public void buscarCliente(){
        Cliente clienteEncontrado = iClienteService.buscarPorId(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);
    }

    @Test
    public void excluirCliente(){
        Boolean clienteExcluido = iClienteService.excluir(cliente.getCpf());
        Assert.assertTrue(clienteExcluido);
    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Tiago Molero");
        Cliente clienteAlterado = iClienteService.alterar(cliente);
        Assert.assertEquals("Tiago Molero", clienteAlterado.getNome());
    }


}
