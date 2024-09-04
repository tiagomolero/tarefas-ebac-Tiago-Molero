public class Programa {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("João");
        pf.setIdade(34);
        pf.setCpf("123.145.234-01");
        imprimir(pf);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Aguinaldo");
        pj.setIdade(41);
        pj.setCnpj("23.124.124/0001-00");
        imprimir(pj);
    }

    private static void imprimir(Pessoa pessoa) {
        if (pessoa instanceof PessoaFisica){
            System.out.println("PESSOA FÍSICA");
            System.out.println("CPF: " + pessoa.identificacao());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        } else if (pessoa instanceof PessoaJuridica) {
            System.out.println("PESSOA JURÍDICA");
            System.out.println("CNPJ: " + pessoa.identificacao());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());

        }

    }

}
