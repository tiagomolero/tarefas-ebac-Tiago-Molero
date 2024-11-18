package br.com.dao;

import br.com.domain.Carro;

public interface ICarroDAO <T extends Carro>{

    public Boolean cadastrarCarro(T carro);
    public T consultarCarro(String placa);

}
