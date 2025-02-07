package br.com.molero.dao;

import br.com.molero.domain.Cliente;
import br.com.molero.domain.Produto;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.mock.ProdutoDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ProdutoDAOTest {
    private Produto produto;
    private IProduoDAO iProduoDAO;

    public ProdutoDAOTest(){
        this.iProduoDAO = new ProdutoDAOMock();
    }

    @Before
    public void init(){
        produto = new Produto();
        produto.setNome("Monitor Gamer 144Hz");
        produto.setCodigo(1241763L);
        produto.setValor(879.9);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean produtoSalvo = iProduoDAO.cadastrar(produto);
        Assert.assertTrue(produtoSalvo);
    }

    @Test
    public void buscarPorID(){
        Produto produtoEncontrado = iProduoDAO.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoEncontrado);
    }

    @Test
    public void excluir(){
        iProduoDAO.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        Double novoValor = 797.9;
        produto.setValor(novoValor);
        iProduoDAO.alterar(produto);

        Assert.assertEquals(novoValor, produto.getValor());
    }

}