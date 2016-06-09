/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;
import facades.LeilaoFacade;
import facades.UtilizadorFacade;
import facades.JogoFacade;
import list.Utilizador;
import list.Jogo;
import list.Negocio;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;
import list.Leilao;

/**
 *
 * @author david-pc
 */
@Path("sale")
public class LeilaoRest {

    @EJB
    private LeilaoFacade sale = new LeilaoFacade();

    @EJB
    private UtilizadorFacade cliente = new UtilizadorFacade();

    @EJB
    private JogoFacade game = new JogoFacade();

    @GET
    @Path("/")
    public Response findall() {

        List<Leilao> list = sale.findAll();
        String output = list.toString();
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/{Utilizador}")
    public Response newSale(@PathParam("Utilizador") String userName, @PathParam("Jogo") Jogo jogo) {

        if (!cliente.clientExists(userName)) {
            return Response.status(201).entity("{\"State\":\"Client does not exist\"}").build();
        }

        Utilizador desiredClient = cliente.getClientByUser(userName);
        Leilao sale = new Leilao();
        sale.setVendedor(desiredClient);
        sale.setJogo(jogo);
        this.sale.create(sale);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }

    @POST
    @Path("/{Leilao}/{Jogo}")
    public Response addProd(@PathParam("Jogo") Jogo jogo) {

        Jogo desiredProduct = game.find(jogo);
        if (desiredProduct == null) {
            return Response.status(202).entity("{\"State\":\"Game does not exist\"}").build();
        }
        Leilao desiredSale = this.sale.find(sale);
        if (desiredSale == null) {
            return Response.status(201).entity("{\"State\":\"Sale does not exist\"}").build();
        }
        desiredSale.setJogo(desiredProduct);
        this.sale.edit(desiredSale);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }

    @GET
    @Path("/{id}")
    public Response find(@PathParam("ID_Jogo") Long ID_Jogo) {

        Leilao desiredSale = sale.find(ID_Jogo);
        if (desiredSale == null) {
            return Response.status(201).entity("{\"State\":\"Sale does not exist\"}").build();
        }
        String output = desiredSale.toString();
        return Response.status(200).entity(output).build();
    }
}