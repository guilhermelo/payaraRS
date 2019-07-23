/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payarars.dao;

import com.mycompany.payarars.entity.Cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author guilherme
 */
public class ClienteDAO {
    
    private static List<Cliente> clientes = new ArrayList<>();
    
    public List<Cliente> busca() {
        return clientes;
    }
    
    public void add(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void remove(Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public void edit(Cliente cliente) {
        
        for (Cliente c : clientes) {
            if(cliente.getCodigo() == c.getCodigo()) {
                c.setNome(cliente.getNome());
                c.setCidade(cliente.getCidade());
            }
        }
    }

    public Cliente busca(int codigo) {
        return this.clientes.stream().filter(c -> c.getCodigo() == codigo).findFirst().orElse(null);
    }
}
