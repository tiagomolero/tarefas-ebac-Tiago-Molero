package br.com.molero.services;

import br.com.molero.dao.IProduoDAO;
import br.com.molero.domain.Produto;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.generics.services.IGenericService;

import java.util.Collection;
import java.util.List;

public class ProdutoService implements IGenericService {

    private IProduoDAO iProduoDAO;

    public ProdutoService(IProduoDAO iProduoDAO){
        this.iProduoDAO = iProduoDAO;
    }

    @Override
    public Boolean cadastrar(Object entity) throws TipoChaveNaoEncontradaException {
        return iProduoDAO.cadastrar((Produto) entity);
    }

    @Override
    public void excluir(Long valor) {
        iProduoDAO.excluir(valor);
    }

    @Override
    public void alterar(Object entity) throws TipoChaveNaoEncontradaException {
        iProduoDAO.alterar((Produto) entity);
    }

    @Override
    public Object consultar(Long valor) {
        return iProduoDAO.consultar(valor);
    }

    @Override
    public Collection buscarTodos() {
        return iProduoDAO.buscarTodos();
    }
}
