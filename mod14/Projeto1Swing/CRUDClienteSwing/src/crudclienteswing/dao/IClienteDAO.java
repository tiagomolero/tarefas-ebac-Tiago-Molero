/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudclienteswing.dao;

import crudclienteswing.domain.Cliente;

/**
 *
 * @author ServicedeskBrasil
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
            
    
}
