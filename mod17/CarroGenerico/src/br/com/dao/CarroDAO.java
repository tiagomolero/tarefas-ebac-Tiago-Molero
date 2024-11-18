package br.com.dao;

import br.com.domain.Carro;

import java.util.HashMap;
import java.util.Map;

public class CarroDAO<T extends Carro> implements ICarroDAO<T>{

    public Map<Class, Map<String, T>> listaCarros;

    public CarroDAO() {
        this.listaCarros = new HashMap<>();
    }

    @Override
    public Boolean cadastrarCarro(T carro) {
        Map<String, T> mapaInterno = this.listaCarros.get(carro.getClass());

        if (mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.listaCarros.put(carro.getClass(), mapaInterno);
        }

        if(mapaInterno.containsKey(carro.getPlaca())){
            return false;
        }
        mapaInterno.put(carro.getPlaca(), carro);
        return true;
    }

    @Override
    public T consultarCarro(String placa) {
        Map<String, T> mapaInterno = this.listaCarros.get(placa.getClass());

        return mapaInterno.get(placa);
    }
}
