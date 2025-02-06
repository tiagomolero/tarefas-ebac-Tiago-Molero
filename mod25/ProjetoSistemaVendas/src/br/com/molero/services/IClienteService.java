package br.com.molero.services;

import br.com.molero.domain.Cliente;

public interface IClienteService {

    Boolean salvar(Cliente cliente);
    Cliente buscarPorId(Long cpf);
    Boolean excluir(Long cpf);
    Cliente alterar(Cliente cliente);
}
