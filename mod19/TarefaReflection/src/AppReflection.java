import java.lang.annotation.Annotation;

public class AppReflection {

    public static void main(String[] args){

        Class cliente = Cliente.class;

        if (cliente.isAnnotationPresent(Tabela.class)){
            Tabela tabela = (Tabela) cliente.getAnnotation(Tabela.class);
            System.out.println("VALOR DA ANOTAÇÃO: " + tabela.tabela());
        }

    }

}
