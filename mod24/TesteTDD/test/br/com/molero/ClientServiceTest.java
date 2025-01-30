package br.com.molero;

import br.com.molero.dao.ClientDAO;
import br.com.molero.dao.IClientDAO;
import br.com.molero.service.ClientService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {

    @Test
    public void salvarTest() {
        IClientDAO dao = new ClientDAO();
        ClientService clientService = new ClientService(dao);
        String retorno = clientService.salvar();
        Assert.assertEquals("Sucesso Salvar Service", retorno);
    }

    @Test
    public void buscarTest() {
        IClientDAO dao = new ClientDAO();
        ClientService clientService = new ClientService(dao);
        String retorno = clientService.buscar();
        Assert.assertEquals("Sucesso Buscar Service", retorno);
    }

    @Test
    public void excluirTest() {
        IClientDAO dao = new ClientDAO();
        ClientService clientService = new ClientService(dao);
        String retorno = clientService.excluir();
        Assert.assertEquals("Sucesso Excluir Service", retorno);
    }

    @Test
    public void atualizarTest() {
        IClientDAO dao = new ClientDAO();
        ClientService clientService = new ClientService(dao);
        String retorno = clientService.atualizar();
        Assert.assertEquals("Sucesso Atualizar Service", retorno);
    }


}