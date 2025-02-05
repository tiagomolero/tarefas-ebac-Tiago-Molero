package br.com.molero.mock;

import br.com.molero.dao.ClienteDAO;
import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorId(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
