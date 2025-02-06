package br.com.molero.dao;

import br.com.molero.domain.Cliente;

public class ClienteDAO implements IClienteDAO{
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorId(Long cpf) {
        return null;
    }

    @Override
    public Boolean excluir(Long cpf) {
        return true;
    }
}
