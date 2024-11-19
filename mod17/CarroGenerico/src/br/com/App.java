package br.com;

import br.com.dao.CarroDAO;
import br.com.domain.Carro;
import br.com.domain.Fiat;
import br.com.domain.Renault;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        CarroDAO<Carro> carros = new CarroDAO<>();

        Fiat siena = new Fiat("Siena", "Preto", "EDA1E12");
        Renault kwid = new Renault("Kwid", "Branco", "FGR4D89");

        carros.cadastrarCarro(siena);
        carros.cadastrarCarro(kwid);

        System.out.println("\nCARRO CONSULTADO");
        System.out.println(carros.consultarCarro("FGR4D89", kwid.getClass()));

        System.out.println("\nTODOS OS CARROS");
        carros.consultarCarros();



    }

}
