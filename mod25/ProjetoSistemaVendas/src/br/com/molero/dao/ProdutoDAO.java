package br.com.molero.dao;

import br.com.molero.domain.Produto;
import br.com.molero.generics.dao.GenericDAO;

public class ProdutoDAO extends GenericDAO<Produto> implements IProduoDAO {
    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {

    }
}
