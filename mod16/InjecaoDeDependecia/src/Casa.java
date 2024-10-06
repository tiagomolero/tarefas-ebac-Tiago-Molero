public class Casa {

    private SistemaEletrico sistemaEletrico;

    public Casa(SistemaEletrico sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }

    public void ligarEnergia() {
        sistemaEletrico.fornecerEnergia();
        System.out.println("Casa ligada com energia!");
    }
}
