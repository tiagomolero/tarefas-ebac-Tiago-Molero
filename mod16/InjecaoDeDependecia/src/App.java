public class App {

    public static void main(String[] args) {
        SistemaEletrico sistemaEletrico = new SistemaEletrico();

        Casa casa = new Casa(sistemaEletrico);
        casa.ligarEnergia();

    }

}
