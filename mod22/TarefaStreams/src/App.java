import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos nomes você deseja inserir ?");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        adicionarPessoas(qtd);

        scanner.close();



    }

    public static void adicionarPessoas(int qtd){
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < qtd; i++){
            System.out.println((i+1) + "º PESSOA");
            String nomeESexo = scanner.nextLine();
            String[] delimitador = nomeESexo.split(",");
            String nome = delimitador[0].trim().toLowerCase();
            String genero = delimitador[1].trim().toLowerCase();
            Pessoa p = new Pessoa(nome, genero);
            pessoas.add(p);
        }

        List<Pessoa> mulheres = pessoas.stream().
                filter(pessoa -> pessoa.getGenero().equals("feminino")).toList();
        mulheres.forEach(m -> System.out.println(m.getNome()));
    }

}
