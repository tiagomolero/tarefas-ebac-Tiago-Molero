package br.com.molero.services;

import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.generics.services.GenericService;
import br.com.molero.generics.services.IGenericService;

import java.util.Collection;
import java.util.List;

public class ClienteService implements IGenericService {

    private IClienteDAO iClienteDAO;

    public ClienteService(IClienteDAO iClienteDAO){
        this.iClienteDAO = iClienteDAO;
    }


    @Override
    public Boolean cadastrar(Object entity) throws TipoChaveNaoEncontradaException {
        return iClienteDAO.cadastrar((Cliente) entity);
    }

    @Override
    public void excluir(Long valor) {
        iClienteDAO.excluir(valor);
    }

    @Override
    public void alterar(Object entity) throws TipoChaveNaoEncontradaException {
        iClienteDAO.alterar((Cliente) entity);
    }

    @Override
    public Object consultar(Long valor) {
        return iClienteDAO.consultar(valor);
    }

    @Override
    public Collection buscarTodos() {
        return iClienteDAO.buscarTodos();
    }
}
