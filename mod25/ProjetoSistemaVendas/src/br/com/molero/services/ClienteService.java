package br.com.molero.services;

import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.generics.GenericDAO;

public class ClienteService implements IClienteService {

    private IClienteDAO iClienteDAO;

    public ClienteService(IClienteDAO iClienteDAO){
        this.iClienteDAO = iClienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return iClienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorId(Long cpf) {
        return iClienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        iClienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        iClienteDAO.alterar(cliente);
    }
}
