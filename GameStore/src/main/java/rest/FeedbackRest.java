/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.FeedbackFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;
import list.Feedback;
import list.Negocio;

/**
 *
 * @author fabio
 */
@Path("Feedback")
public class FeedbackRest {
    
    @EJB
    private FeedbackFacade facade = new FeedbackFacade();
    
    @GET
    @Path("/")
    public Response findall() {

        List<Feedback> feedbackList = facade.findAll();
        String output = feedbackList.toString();
        return Response.status(200).entity(output).build();
    }
    
    @POST
    @Path("/{negocio}/{isPositive}")
    public Response add(@PathParam("negocio") Negocio neg, @PathParam("isPositive") boolean isPositive ) {

        Feedback feedback = new Feedback();
        feedback.setNeg(neg);
        feedback.setIsPositive(isPositive);
        facade.create(feedback);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @GET
    @Path("/{negocio}")
    public Response find(@PathParam("negocio") Negocio neg) {

        Feedback desiredFeedback = facade.find(neg);
        if (desiredFeedback == null) {
            return Response.status(201).entity("{\"State\":\"Feedback does not exist\"}").build();
        }
        String output = desiredFeedback.toString();
        return Response.status(200).entity(output).build();
    }
    
    @DELETE
    @Path("/{negocio}")
    public Response delete(@PathParam("negocio") Negocio neg) {

        Feedback desiredFeedback = facade.find(neg);
        if (desiredFeedback == null) {
            return Response.status(201).entity("{\"State\":\"Feedback does not exist\"}").build();
        }
        facade.remove(desiredFeedback);
        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
    
    @POST
    @Path("/{negocio}/{isPositive}")
    public Response edit(@PathParam("negocio") Negocio neg, @PathParam("isPositive") boolean isPositive ) {

        Feedback feedback = facade.find(neg);
        if (feedback == null) {
            return Response.status(200).entity("{\"State\":\"Feedback does not exist\"}").build();
        }
        feedback.setNeg(neg);
        feedback.setIsPositive(isPositive);
        facade.edit(feedback);

        return Response.status(200).entity("{\"State\":\"OK\"}").build();
    }
}