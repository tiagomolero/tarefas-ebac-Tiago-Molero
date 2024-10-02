public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("esportivo", "Fiat");
        FabricaDeCarro fabricaDeCarro = getFabrica(cliente);
        fabricaDeCarro.create(cliente.getCategoria());
    }

    private static FabricaDeCarro getFabrica(Cliente cliente) {
        if (cliente.getMarca().equals("Fiat")){
            return new Fiat();
        }else if(cliente.getMarca().equals("Volkswagen")) {
            return new Volkswagen();
        } else{
            return null;
        }
    }

}
