package br.com.molero.service;

import br.com.molero.dao.IContractDAO;

public class ContractService {

    private IContractDAO contractDAO;

    public ContractService(IContractDAO contractDAO){
        this.contractDAO = contractDAO;
    }

    public String salvar(){
        contractDAO.salvar();
        return "Contrato Salvo";
    }

    public String buscar(){
        contractDAO.buscar();
        return "Contrato Encontrado";
    }

    public String excluir(){
        contractDAO.excluir();
        return "Contrato Excluído";
    }

    public String alterar(){
        contractDAO.alterar();
        return "Contrato Alterado";
    }

}
