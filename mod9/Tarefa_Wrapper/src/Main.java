import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int primitivo = console.nextInt();

        Integer castWrapper = primitivo;

        System.out.println("O número " + castWrapper + " foi convertido com sucesso de Primitivo (int) para Wrapper (Integer)");

    }
}12