package br.com.molero;

import br.com.molero.dao.ContractDAO;
import br.com.molero.dao.IContractDAO;
import br.com.molero.service.ContractService;
import org.junit.Assert;
import org.junit.Test;

public class ContractServiceTest {

    @Test
    public void salvar(){
        IContractDAO iContractDAO = new ContractDAO();
        ContractService contractService = new ContractService(iContractDAO);
        String retorno = contractService.salvar();
        Assert.assertEquals("Contrato Salvo", retorno);
    }

    @Test
    public void buscar(){
        IContractDAO iContractDAO = new ContractDAO();
        ContractService contractService = new ContractService(iContractDAO);
        String retorno = contractService.buscar();
        Assert.assertEquals("Contrato Encontrado", retorno);
    }

    @Test
    public void excluir(){
        IContractDAO iContractDAO = new ContractDAO();
        ContractService contractService = new ContractService(iContractDAO);
        String retorno = contractService.excluir();
        Assert.assertEquals("Contrato Excluído", retorno);
    }

    @Test
    public void alterar(){
        IContractDAO iContractDAO = new ContractDAO();
        ContractService contractService = new ContractService(iContractDAO);
        String retorno = contractService.alterar();
        Assert.assertEquals("Contrato Alterado", retorno);
    }

}
