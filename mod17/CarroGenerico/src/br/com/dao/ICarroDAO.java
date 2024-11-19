package br.com.dao;

import br.com.domain.Carro;

import java.util.Map;

public interface ICarroDAO <T extends Carro>{

    public Boolean cadastrarCarro(T carro);
    public T consultarCarro(String placa, Class obj);
    public void consultarCarros();

}
