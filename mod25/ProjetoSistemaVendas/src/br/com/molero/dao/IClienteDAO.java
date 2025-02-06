package br.com.molero.dao;

import br.com.molero.domain.Cliente;

public interface IClienteDAO {

    Boolean salvar(Cliente cliente);
    Cliente buscarPorId(Long cpf);
    Boolean excluir(Long cpf);
}
