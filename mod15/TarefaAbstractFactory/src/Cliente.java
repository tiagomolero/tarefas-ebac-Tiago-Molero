public class Cliente {

    private String categoria;
    private String marca;

    public Cliente(String categoria, String marca){
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }
}
