package br.com.molero;

import br.com.molero.dao.ClienteDAO;
import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;
import br.com.molero.mock.ClienteDAOMock;
import br.com.molero.services.ClienteService;
import br.com.molero.services.IClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    private IClienteService iClienteService;

    public ClienteTest(){
        IClienteDAO iClienteDAO = new ClienteDAOMock();
        iClienteService = new ClienteService(iClienteDAO);
    }

    @Test
    public void buscarCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Tiago");
        cliente.setCpf(12312312312L);
        cliente.setEndereco("Rua X");
        cliente.setContato(11999999999L);

        iClienteService.salvar(cliente);
        Cliente clienteEncontrado = iClienteService.buscarPorId(cliente.getCpf());

        Assert.assertNotNull(clienteEncontrado);
        System.out.println(clienteEncontrado.getCpf());

    }

}
