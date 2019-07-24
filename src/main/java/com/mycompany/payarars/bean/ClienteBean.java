/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payarars.bean;

import br.alerario.ICliente;
import com.mycompany.payarars.dao.ClienteDAO;
import com.mycompany.payarars.entity.Cliente;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean {
    
    private int codigo;
    private String nome;
    private String cidade;
    
    public void add() {
        Cliente c = new Cliente(codigo, nome, cidade);
        
        new ClienteDAO().add(c);
        zeraValores();
    }
    
    public void zeraValores() {
        codigo = 0;
        nome = "";
        cidade = "";
    }
    
    public List<Cliente> clientes() {
        return new ClienteDAO().busca();
    }
    
    public boolean hasClientes() {
        List<Cliente> clientes = new ClienteDAO().busca();
        return !clientes.isEmpty();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
