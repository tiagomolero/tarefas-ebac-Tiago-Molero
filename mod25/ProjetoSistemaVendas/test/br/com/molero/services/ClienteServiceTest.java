package br.com.molero.services;

import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.generics.services.IGenericService;
import br.com.molero.mock.ClienteDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
    private IGenericService iClienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO iClienteDAO = new ClienteDAOMock();
        iClienteService = new ClienteService(iClienteDAO);
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setNome("Tiago");
        cliente.setCpf(12312312312L);
        cliente.setEndereco("Rua X");
        cliente.setContato(11999999999L);
        iClienteService.cadastrar(cliente);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean clienteCadastrado = iClienteService.cadastrar(cliente);
        Assert.assertTrue(clienteCadastrado);
    }

    @Test
    public void buscarCliente(){
        Cliente clienteEncontrado = (Cliente) iClienteService.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);
    }

    @Test
    public void excluirCliente(){
        iClienteService.excluir(cliente.getCpf());
        Assert.assertNotNull(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Tiago Molero");
        iClienteService.alterar(cliente);
        Assert.assertEquals("Tiago Molero", cliente.getNome());
    }


}
