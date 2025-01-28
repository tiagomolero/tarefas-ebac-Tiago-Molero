import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantos nomes você deseja inserir ?");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtd; i++){
            System.out.println((i+1) + "º PESSOA");
            String nomeESexo = scanner.nextLine();
            Pessoa p = separaNomeESexo(nomeESexo);
            pessoas.add(p);
        }
        scanner.close();

        MulheresValidador mulheresValidador = new MulheresValidador();
        mulheresValidador.adicionaMulheres(pessoas);

    }

    public static Pessoa separaNomeESexo(String nomeESexo){
        String[] delimitador = nomeESexo.split(",");
        String nome = delimitador[0].trim().toLowerCase();
        String genero = delimitador[1].trim().toLowerCase();
        Pessoa pessoa = new Pessoa(nome, genero);
        return pessoa;
    }


}
