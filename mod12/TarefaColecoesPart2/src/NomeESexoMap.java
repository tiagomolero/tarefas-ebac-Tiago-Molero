import java.util.*;

public class NomeESexoMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> pessoasMasculinas = new ArrayList<>();
        List<String> pessoasFemininas = new ArrayList<>();

        Map<String, List<String>> pessoas = new HashMap<>();

        String r;


        do {
            System.out.println("Informe o nome");
            String nome = scanner.next();
            System.out.println("Qual sexo ? Informe o número");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            Integer sexo = scanner.nextInt();

            if (sexo == 1) {
                pessoasMasculinas.add(nome);
            } else if (sexo == 2) {
                pessoasFemininas.add(nome);
            }

            System.out.println("Deseja informa mais nomes ? (s/n)");
            r = scanner.next();

        } while (r.equals("s"));

        pessoas.put("Masculino", pessoasMasculinas);
        pessoas.put("Feminino", pessoasFemininas);

        System.out.println("--------- GRUPO MASCULINO ---------");
        imprimirPessoas(pessoas.get("Masculino"));

        System.out.println("--------- GRUPO FEMININO ---------");
        imprimirPessoas(pessoas.get("Feminino"));


    }

    private static void imprimirPessoas(List<String> masculino) {
        for(String nomes : masculino){
            System.out.println(nomes);
        }
    }


}
