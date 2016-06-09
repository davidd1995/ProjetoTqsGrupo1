/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.CategoriaFacade;
import list.Categoria;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;

/**
 *
 * @author fabio
 */

@Path("Categoria")
public class CategoriaRest {
    
    @EJB
    private CategoriaFacade facade = new CategoriaFacade();
    
    @GET
    @Path("/")
    public Response findall() {
        
        List<Categoria> categoryList = facade.findAll();
        String output = categoryList.toString();
        return Response.status(200).entity(output).build();
    }
    
    @POST
    @Path("/{nome}")
    public Response add(@PathParam(" nome;") String nome) {
        Categoria category = new Categoria();
        category.setNome(nome);
        
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @GET
    @Path("/{nome}")
    public Response find(@PathParam("nome") String nome) {
        
        Categoria desiredCategory = facade.find(nome);
        if (desiredCategory == null) {
            return Response.status(201).entity("{\"State\":\"Category does not exist\"}").build();
        }
        String output = desiredCategory.toString();
        return Response.status(200).entity(output).build();
    }
    
    @DELETE
    @Path("/{nome}")
    public Response delete(@PathParam("nome") String nome) {

        Categoria desiredCategory = facade.find(nome);
        if (desiredCategory == null) {
            return Response.status(201).entity("{\"State\":\"Category does not exist\"}").build();
        }
        facade.remove(desiredCategory);
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @POST
    @Path("/{nome}")
    public Response edit(@PathParam(" nome;") String nome) {

        Categoria category = facade.find(nome);
        if (category == null) {
            return Response.status(200).entity("{\"State\":\"Category does not exist\"}").build();
        }
        category.setNome(nome);
        facade.edit(category);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
}