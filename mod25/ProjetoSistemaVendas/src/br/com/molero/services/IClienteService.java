package br.com.molero.services;

import br.com.molero.domain.Cliente;

public interface IClienteService {

    public void salvar(Cliente cliente);
    public Cliente buscarPorId(Long cpf);

}
