package br.com.molero.services;

import br.com.molero.domain.Cliente;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;
    Cliente buscarPorId(Long cpf);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
