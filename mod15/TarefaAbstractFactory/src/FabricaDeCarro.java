public abstract class FabricaDeCarro {

    public Carro create(String categoria){
        Carro carro = solicitarCarro(categoria);
        carro = prepararCarro(carro);
        return carro;
    }

    private Carro prepararCarro(Carro carro){
        carro.descrisaoCarro();
        carro.lavar();
        carro.revisao();
        carro.tanqueCarro();
        return carro;
    }

    abstract Carro solicitarCarro(String categoria);

}
