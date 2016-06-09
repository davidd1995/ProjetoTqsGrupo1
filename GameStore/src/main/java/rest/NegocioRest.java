/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.NegocioFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;
import list.Leilao;
import list.Negocio;

/**
 *
 * @author fabio
 */
@Path("Negocio")
public class NegocioRest {
    
    @EJB
    private NegocioFacade facade = new NegocioFacade();
    
    @GET
    @Path("/")
    public Response findall() {

        List<Negocio> businessList = facade.findAll();
        String output = businessList.toString();
        return Response.status(200).entity(output).build();
    }
    
    @POST
    @Path("/{leilao}/{precoFinal}")
    public Response add(@PathParam("Leilao") Leilao ll,@PathParam("precoFinal") double precoFinal) {
        Negocio negocio = new Negocio(ll);
        negocio.setPrecoFinal();
        facade.create(negocio);
        
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @GET
    @Path("/{leilao}")
    public Response find(@PathParam("leilao") Leilao ll) {

        Negocio desiredNegocio = facade.find(ll);
        if (desiredNegocio == null) {
            return Response.status(201).entity("{\"State\":\"Business does not exist\"}").build();
        }
        String output = desiredNegocio.toString();
        return Response.status(200).entity(output).build();
    }
    
    @DELETE
    @Path("/{leilao}")
    public Response delete(@PathParam("leilao") Leilao ll) {

        Negocio desiredNegocio = facade.find(ll);
        if (desiredNegocio == null) {
            return Response.status(201).entity("{\"State\":\"Business does not exist\"}").build();
        }
        facade.remove(desiredNegocio);
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @POST
    @Path("/{leilao}/{precoFinal}")
    public Response edit(@PathParam("Leilao") Leilao ll,@PathParam("precoFinal") double precoFinal) {
        
        Negocio negocio = facade.find(ll);
        negocio.setPrecoFinal();
        facade.edit(negocio);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
}