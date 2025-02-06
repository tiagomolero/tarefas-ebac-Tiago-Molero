package br.com.molero.dao;

import br.com.molero.domain.Cliente;
import br.com.molero.generics.dao.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO{

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
