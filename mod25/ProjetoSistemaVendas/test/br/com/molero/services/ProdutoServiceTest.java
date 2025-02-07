package br.com.molero.services;

import br.com.molero.dao.IProduoDAO;
import br.com.molero.domain.Produto;
import br.com.molero.exceptions.TipoChaveNaoEncontradaException;
import br.com.molero.generics.services.IGenericService;
import br.com.molero.mock.ProdutoDAOMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoServiceTest {
    private IGenericService iProdutoService;
    private Produto produto;

    public ProdutoServiceTest(){
        IProduoDAO iProduoDAO = new ProdutoDAOMock();
        iProdutoService = new ProdutoService(iProduoDAO);
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setNome("Monitor Gamer 144Hz");
        produto.setCodigo(1241763L);
        produto.setValor(879.9);
        iProdutoService.cadastrar(produto);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean produtoSalvo = iProdutoService.cadastrar(produto);
        Assert.assertTrue(produtoSalvo);
    }

    @Test
    public void buscarPorID(){
        Produto produtoEncontrado = (Produto) iProdutoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoEncontrado);
    }

    @Test
    public void excluir(){
        iProdutoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        Double novoValor = 797.9;
        produto.setValor(novoValor);
        iProdutoService.alterar(produto);

        Assert.assertEquals(novoValor, produto.getValor());
    }

}