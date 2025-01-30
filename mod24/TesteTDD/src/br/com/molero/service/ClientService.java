package br.com.molero.service;

import br.com.molero.dao.ClientDAO;
import br.com.molero.dao.IClientDAO;

public class ClientService {

    private IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO){
        this.clientDAO = clientDAO;
    }

    public String salvar() {
        clientDAO.salvar();
        return "Sucesso Salvar Service";
    }

    public String buscar() {
        clientDAO.buscar();
        return "Sucesso Buscar Service";
    }
    public String excluir() {
        clientDAO.excluir();
        return "Sucesso Excluir Service";
    }
    public String atualizar() {
        clientDAO.atualizar();
        return "Sucesso Atualizar Service";
    }

}
