package br.com.molero.dao;

import br.com.molero.domain.Cliente;

public interface IClienteDAO {

    public void salvar(Cliente cliente);
    public Cliente buscarPorId(Long cpf);

}
