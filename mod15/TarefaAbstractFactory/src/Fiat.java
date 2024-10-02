public class Fiat extends FabricaDeCarro{
    @Override
    Carro solicitarCarro(String categoria) {
        if (categoria.equals("passeio")){
            return new ArgoCarro("Argo",100, "cheio", "Cinza");
        } else if (categoria.equals("esportivo")){
            return new CoupeCarro("Coupé",220, "cheio", "Azul");
        } else{
            return null;
        }
    }
}
