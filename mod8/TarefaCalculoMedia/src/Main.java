public class Main {
    public static void main(String[] args) {
        mediaNota();
    }

    public static void mediaNota() {
        double nota1 = 7.4;
        double nota2 = 10;
        double nota3 = 6;
        double nota4 = 7.4;

        double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é : " + mediaNota);
    }
}