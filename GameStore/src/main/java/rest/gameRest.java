/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.GameFacade;
import list.Jogo;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;
import list.Categoria;
/**
 *
 * @author david-pc
 */
@Path("product")
public class gameRest {

    @EJB
    private GameFacade facade = new GameFacade();


    @GET
    @Path("/")
    public Response findall() {

        List<Jogo> gameList = facade.findAll();
        String output = gameList.toString();
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/{nome}/{price}/{description}/{url}/{category}")
    public Response add(@PathParam(" nome;") String nome,@PathParam("desc") String desc
            ,@PathParam("req") String req,@PathParam("plataforma") String plataforma, @PathParam("categoria") Categoria ct) {

        Jogo game = new Jogo();
        game.setNome(nome);
        game.setDesc(desc);
        game.setReq(req);
        game.setPlataforma(plataforma);
        game.setCategoria(ct);
        facade.create(game);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }

    @GET
    @Path("/{id}")
    public Response find(@PathParam("ID_Jogo") Long ID_Jogo) {

        Jogo desiredProduct = facade.find(ID_Jogo);
        if (desiredProduct == null) {
            return Response.status(201).entity("{\"State\":\"Product does not exist\"}").build();
        }
        String output = desiredProduct.toString();
        return Response.status(200).entity(output).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("ID_Jogo") Long ID_Jogo) {

        Jogo desiredGame = facade.find(ID_Jogo);
        if (desiredGame == null) {
            return Response.status(201).entity("{\"State\":\"Product does not exist\"}").build();
        }
        facade.remove(desiredGame);
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }

    @POST
    @Path("/{id}/{nome}/{price}/{description}/{url}/{category}")
    public Response edit(@PathParam(" nome;") String nome,@PathParam("desc") String desc
            ,@PathParam("req") String req,@PathParam("plataforma") String plataforma, @PathParam("categoria") Categoria ct) {

        Jogo game = facade.find(nome);
        if (game == null) {
            return Response.status(200).entity("{\"State\":\"Product does not exist\"}").build();
        }
        game.setNome(nome);
        game.setDesc(desc);
        game.setReq(req);
        game.setPlataforma(plataforma);
        game.setCategoria(ct);
        facade.edit(game);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
}

