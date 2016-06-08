/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.ClienteFacade;
import list.Utilizador;
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
 * @author david-pc
 */
@Path("Cliente")
public class ClienteRest {

    @EJB
    private ClienteFacade facade = new ClienteFacade();

    @GET
    @Path("/")
    public Response findAll() {

        List<Utilizador> clientList = facade.findAll();
        String output = clientList.toString();
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/{nome}/{email}/{adress}/{password}/{SSN}")
    public Response add(@PathParam("nome") String name, @PathParam("email") String email,
            @PathParam("password") String password, @PathParam("userName") String username) {
        if (!facade.validUser(email)) {
            return Response.status(201).entity("{\"State\":\"Duplicated User\"}").build();
        }
        Utilizador client = new Utilizador();
        client.setNome(name);
        client.setEmail(email);
        client.setPassword(password);
        client.setUserName(username);
        facade.create(client);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }

    @GET
    @Path("/{User}")
    public Response find(@PathParam("User") String user) {

        if (!facade.clientExists(user)) {
            return Response.status(201).entity("{\"State\":\"Client does not exist\"}").build();
        }
        //Utilizador desiredClient = facade.getClientByUser(user);
       // String output = desiredClient.toString();
       // return Response.status(200).entity(output).build();
        return null;
    }

    @DELETE
    @Path("/{User}")
    public Response delete(@PathParam("User") String user) {

        if (!facade.clientExists(user)) {
            return Response.status(200).entity("{\"State\":\"Client does not exist\"}").build();
        }
        //Utilizador desiredClient = facade.getClientByUser(user);
        //facade.remove(desiredClient);
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }

    @POST
    @Path("/{id}/{nome}/{email}/{adress}/{password}")
    public Response edit(@PathParam("nome") String name, @PathParam("email") String email,
            @PathParam("password") String password, @PathParam("userName") String username) {

        if (!facade.clientExists(email)) {
            return Response.status(201).entity("{\"State\":\"Client does not exist\"}").build();
        }
        /*Utilizador desiredClient = facade.getClientByUser(email);
        desiredClient.setNome(name);
        desiredClient.setEmail(email);
        desiredClient.setPassword(password);
        desiredClient.setUserName(username);

        facade.edit(desiredClient);*/

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
}
