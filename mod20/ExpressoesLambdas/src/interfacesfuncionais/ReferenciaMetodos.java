package interfacesfuncionais;

import interfacesfuncionais.criada.MyEventConsumer;

public class ReferenciaMetodos {

    public static void main(String[] args) {

        //Função Lambda
        MyEventConsumer myEvent = my -> System.out.println(my);
        myEvent.getValor(50);

        //Refrência de Método
        MyEventConsumer myEvent2 = System.out::println;
        myEvent2.getValor("Refência de Método");

    }

}
