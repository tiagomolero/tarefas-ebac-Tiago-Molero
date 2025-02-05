package br.com.molero.services;

import br.com.molero.dao.ClienteDAO;
import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO iClienteDAO;

    public ClienteService(IClienteDAO iClienteDAO){
        this.iClienteDAO = iClienteDAO;
    }


    @Override
    public void salvar(Cliente cliente) {
        iClienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorId(Long cpf) {
        Cliente clientEncontrado = iClienteDAO.buscarPorId(cpf);
        return clientEncontrado;
    }
}
