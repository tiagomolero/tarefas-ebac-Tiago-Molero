package br.com.molero.generics.dao;

import br.com.molero.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IGenericDAO<T> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
    public void excluir(Long valor);
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;
    public T consultar(Long valor);
    public Collection<T> buscarTodos();

}
