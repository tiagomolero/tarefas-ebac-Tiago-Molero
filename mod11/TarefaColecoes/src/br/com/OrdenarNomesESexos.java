package br.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomesESexos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita a lista de nomes
        System.out.println("Informe o nome e o sexo");
        String nomesESexos = scanner.nextLine();

        ordenar(nomesESexos);


    }


    private static void ordenar(String lista){

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        String[] delimitadorVirg = lista.split(",");

        for(String p : delimitadorVirg){
            String pe = p.toLowerCase().replace(" ","");
            String[] pessoaArray = pe.split("-");

            if (pessoaArray[1].contains("m")){
                masculino.add(pessoaArray[0]);
            }else if (pessoaArray[1].contains("f")){
                feminino.add(pessoaArray[0]);
            }

        }

        System.out.println("------------------GRUPO MASCULINO------------------");
        System.out.print(masculino);
        System.out.print(" --> ");
        Collections.sort(masculino);
        System.out.print(masculino);
        System.out.println();
        System.out.println();
        System.out.println("------------------GRUPO FEMININO------------------");
        System.out.print(feminino);
        System.out.print(" --> ");
        Collections.sort(feminino);
        System.out.print(feminino);


    }



}
