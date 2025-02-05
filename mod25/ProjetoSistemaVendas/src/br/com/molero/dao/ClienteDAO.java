package br.com.molero.dao;

import br.com.molero.domain.Cliente;

public class ClienteDAO implements IClienteDAO{
    @Override
    public void salvar(Cliente cliente) {
        System.out.println(cliente.getNome() + " Salvo no Banco de Dados");
    }

    @Override
    public Cliente buscarPorId(Long cpf) {
        return null;
    }
}
