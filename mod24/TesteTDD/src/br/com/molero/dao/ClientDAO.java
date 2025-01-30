package br.com.molero.dao;

public class ClientDAO implements IClientDAO{

    @Override
    public String salvar() {
        return "Cliente salvo";
    }

    @Override
    public String buscar() {
        return "Cliente encontrado";
    }

    @Override
    public String excluir() {
        return "Cliente exlcuido";
    }

    @Override
    public String atualizar() {
        return "Cliente atualizado";
    }

}
