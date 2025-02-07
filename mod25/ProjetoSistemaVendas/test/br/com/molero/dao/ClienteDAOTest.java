package br.com.molero.dao;

import br.com.molero.domain.Cliente;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.mock.ClienteDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private Cliente cliente;
    private IClienteDAO iClienteDAO;

    public ClienteDAOTest(){
        this.iClienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setNome("Tiago");
        cliente.setCpf(12312312312L);
        cliente.setEndereco("Rua X");
        cliente.setContato(11999999999L);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean clienteSalvo = iClienteDAO.cadastrar(cliente);
        Assert.assertTrue(clienteSalvo);
    }

    @Test
    public void buscarPorID(){
        Cliente clienteEncontrado = iClienteDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);
    }

    @Test
    public void excluir(){
        iClienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Tiago Molero");
        iClienteDAO.alterar(cliente);
        Assert.assertEquals("Tiago Molero", cliente.getNome());
    }

}
