import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String d = "";

        do {
            System.out.println("Informe o nome do Aluno(a) ");
            String nomeAluno = ler.next();

            CalculaNotas(nomeAluno);

            System.out.println("Você deseja calcular com outro aluno? ");
            d = ler.next();
        }while (d.equalsIgnoreCase("Sim"));

        System.out.println("ATÉ LOGO ;)");

    }

    public static void CalculaNotas(String nome){

        Scanner s = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        double media;

        System.out.println("Insira o primeira nota: ");
        nota1 = s.nextDouble();
        System.out.println("Insira o segunda nota: ");
        nota2 = s.nextDouble();
        System.out.println("Insira o terceira nota: ");
        nota3 = s.nextDouble();
        System.out.println("Insira o quarta nota: ");
        nota4 = s.nextDouble();

        media = (nota1+nota2+nota3+nota4) / 4;

        if(media >= 7){
            System.out.println("A nota do aluno(a) " + nome + " foi: " + media);
            System.out.println("VOCÊ FOI APROVADO :)");
        } else if (media >= 5 && media < 7){
            System.out.println("A nota do aluno(a) " + nome + " foi: " + media);
            System.out.println("VOCÊ ESTÁ DE RECUPERAÇÃO :|");
        }else{
            System.out.println("A nota do aluno(a) " + nome + " foi: " + media);
            System.out.println("VOCÊ FOI REPROVADO :(");

        }
    }

}