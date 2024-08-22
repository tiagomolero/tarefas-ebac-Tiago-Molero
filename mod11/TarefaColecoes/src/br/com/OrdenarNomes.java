package br.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma lista de nomes");
        String nomes = scanner.nextLine();

        lerNomes(nomes);
    }

    private static void lerNomes(String n){

        List<String> listaNomes = new ArrayList<>();

        //Faz a separação dos itens delimitados por "," e adiciona no Array
        String[] nArray = n.split(",");

        //Percorre cada nome dentro do Array
        for(String s : nArray){

            //Remove o espaços externo do nome e altera eles para caixa baixa.
            //Por fim, insere o nome na Lista de Nomes
            listaNomes.add(s.trim().toLowerCase());
        }

        System.out.println("------------LISTA DOS NOMES SEPARADOS------------");
        for(String a : listaNomes){
            System.out.println(a);
        }

        //Ordena a lista em ordem alfabética
        Collections.sort(listaNomes);
        System.out.println("------------LISTA DOS NOMES ORDENADOS------------");
        System.out.println(listaNomes);


    }

}
