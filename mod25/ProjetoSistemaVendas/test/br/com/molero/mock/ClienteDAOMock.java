package br.com.molero.mock;

import br.com.molero.dao.ClienteDAO;
import br.com.molero.dao.IClienteDAO;
import br.com.molero.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorId(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public Boolean excluir(Long cpf) {
        return true;
    }
}
