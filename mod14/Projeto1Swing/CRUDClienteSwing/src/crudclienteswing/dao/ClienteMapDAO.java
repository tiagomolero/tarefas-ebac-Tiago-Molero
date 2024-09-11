/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudclienteswing.dao;

import crudclienteswing.domain.Cliente;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ServicedeskBrasil
 */
public class ClienteMapDAO implements IClienteDAO{
    
    private Map<Long, Cliente> map;
    
    public ClienteMapDAO(){
        this.map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(map.containsKey(cliente.getCpf())){
            return false;
        }
        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setCpf(cliente.getCpf());
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }
    
}
