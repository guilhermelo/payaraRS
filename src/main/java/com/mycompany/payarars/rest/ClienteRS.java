/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payarars.rest;

import com.mycompany.payarars.dao.ClienteDAO;
import com.mycompany.payarars.entity.Cliente;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("clientes")
public class ClienteRS {
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/{codigo}")
    public Cliente getByCodigo(@PathParam("codigo") int codigo) {
        return new ClienteDAO().busca(codigo);
    }
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Cliente> getAll() {
        return new ClienteDAO().busca();
    }
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void add(Cliente cliente) {
        new ClienteDAO().add(cliente);
    }
    
    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void edit(Cliente cliente) {
        new ClienteDAO().edit(cliente);
    }
    
    @DELETE
    @Path("/{codigo}")
    public void delete(@PathParam("codigo") int codigo) {
        new ClienteDAO().remove(codigo);
    }
}
