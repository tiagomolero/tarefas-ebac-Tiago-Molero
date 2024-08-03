package br.com.tmolero;

public class Cachorro {

    /**
     * @author tiago.molero
     * @version 1.0
     */

    private String raca;
    private String nome;
    private String cor;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Método que salva os abritudos do Cachorro<br/>
     *
     * <br/>
     * Deve obrigatóriamente passar os parâmetros abaixo
     * @param nome
     * @param raca
     * @param cor
     *
     * @see Cachorro#exibeCachorro()
     */
    public void inserirCachorro(String nome, String raca, String cor){

        this.setNome(nome);
        this.setRaca(raca);
        this.setCor(cor);
    }

    /**
     * Método que exibe os abritudos do Cachorro<br/>
     *
     * 
     * @see Cachorro#inserirCachorro(String, String, String) 
     */
    public void exibeCachorro(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Raça: " + this.getRaca());
        System.out.println("Cor: " + this.getCor());
    }

}
