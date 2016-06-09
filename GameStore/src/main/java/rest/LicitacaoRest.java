/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.LicitacaoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;
import list.Licitacao;
import list.Utilizador;

/**
 *
 * @author fabio
 */
@Path("Licitacao")
public class LicitacaoRest {
    
    @EJB
    private LicitacaoFacade facade = new LicitacaoFacade();
    
    @GET
    @Path("/")
    public Response findall() {

        List<Licitacao> licitacaoList = facade.findAll();
        String output = licitacaoList.toString();
        return Response.status(200).entity(output).build();
    }
    
    @POST
    @Path("/{licitador}/{licitacao}")
    public Response add(@PathParam("licitador") Utilizador licitador, @PathParam("licitacao") double licitacao ) {

        Licitacao bid = new Licitacao();
        bid.setLicitador(licitador);
        bid.setLicitacao(licitacao);
        facade.create(bid);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @GET
    @Path("/{licitador}")
    public Response find(@PathParam("licitador") Utilizador licitador) {

        Licitacao desiredBid = facade.find(licitador);
        if (desiredBid == null) {
            return Response.status(201).entity("{\"State\":\"Bid does not exist\"}").build();
        }
        String output = desiredBid.toString();
        return Response.status(200).entity(output).build();
    }
    
    @DELETE
    @Path("/{licitador}")
    public Response delete(@PathParam("licitador") Utilizador licitador) {

        Licitacao desiredBid = facade.find(licitador);
        if (desiredBid == null) {
            return Response.status(201).entity("{\"State\":\"Bid does not exist\"}").build();
        }
        facade.remove(desiredBid);
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @POST
    @Path("/{licitador}/{licitacao}")
    public Response edit(@PathParam("licitador") Utilizador licitador, @PathParam("licitacao") double licitacao ) {

        Licitacao bid = facade.find(licitador);
        if (bid == null) {
            return Response.status(200).entity("{\"State\":\"Bid does not exist\"}").build();
        }
        bid.setLicitador(licitador);
        bid.setLicitacao(licitacao);
        facade.edit(bid);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
}