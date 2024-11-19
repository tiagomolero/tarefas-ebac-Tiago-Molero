package br.com.dao;

import br.com.domain.Carro;
import br.com.domain.Fiat;
import br.com.domain.Renault;

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
    public T consultarCarro(String placa, Class obj) {
        if (obj.equals(Fiat.class)){
            Map<String, T> mapaFiat = this.listaCarros.get(Fiat.class);
            return mapaFiat.get(placa);
        } else if (obj.equals(Renault.class)) {
            Map<String, T> mapaRenault = this.listaCarros.get(Renault.class);
            return mapaRenault.get(placa);
        }else {
            System.out.println("Objeto não encontrado");
            return null;
        }

    }

    @Override
    public void consultarCarros() {
        System.out.println(listaCarros.values());
    }


}
