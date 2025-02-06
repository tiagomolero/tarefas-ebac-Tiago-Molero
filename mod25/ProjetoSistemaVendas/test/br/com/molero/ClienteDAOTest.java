package br.com.molero;

import br.com.molero.dao.ClienteDAO;
import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;
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
    public void salvar(){
        Boolean clienteSalvo = iClienteDAO.salvar(cliente);
        Assert.assertTrue(clienteSalvo);
    }

    @Test
    public void buscarPorID(){
        Cliente clienteEncontrado = iClienteDAO.buscarPorId(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);
    }

    @Test
    public void excluir(){
        Boolean clienteExcluido = iClienteDAO.excluir(cliente.getCpf());
        Assert.assertTrue(clienteExcluido);
    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Tiago Molero");
        Cliente clienteAlterado = iClienteDAO.alterar(cliente);
        Assert.assertEquals("Tiago Molero", clienteAlterado.getNome());
    }

}
