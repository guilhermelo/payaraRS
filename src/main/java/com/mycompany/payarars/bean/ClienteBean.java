/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payarars.bean;

import br.alerario.ICliente;
import com.mycompany.payarars.entity.Cliente;
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
