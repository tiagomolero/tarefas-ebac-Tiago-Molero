public class Volkswagen extends FabricaDeCarro{
    @Override
    Carro solicitarCarro(String categoria) {
        if (categoria.equals("passeio")){
            return new PoloCarro("Polo",100, "cheio", "Preto");
        } else if (categoria.equals("esportivo")){
            return new GolfGtiCarro("Golf GTI",240, "cheio", "Branco");
        } else{
            return null;
        }
    }
}
