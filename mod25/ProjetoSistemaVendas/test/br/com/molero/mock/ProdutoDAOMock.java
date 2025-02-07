package br.com.molero.mock;

import br.com.molero.dao.IProduoDAO;
import br.com.molero.dao.ProdutoDAO;
import br.com.molero.domain.Produto;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class ProdutoDAOMock implements IProduoDAO {
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(Long valor) {
        Produto produto = new Produto();
        produto.setCodigo(12435L);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return List.of();
    }
}
