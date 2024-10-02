public class Carro {

    private int potencia;
    private String tanque;
    private String cor;
    private String modelo;

    public Carro(String modelo, int potencia, String tanque, String cor){
        this.potencia = potencia;
        this.tanque = tanque;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void descrisaoCarro(){
        System.out.println(modelo + " com " + potencia + "cv de potência");
    }

    public void lavar(){
        System.out.println("Carro lavado e com a cor "+ cor + " brilhando!!");
    }

    public void tanqueCarro(){
        System.out.println("O tanque do carro está: " + tanque);
    }
    public void revisao(){
        System.out.println("Carro revisado, e pronto para as ruas");
    }

}
