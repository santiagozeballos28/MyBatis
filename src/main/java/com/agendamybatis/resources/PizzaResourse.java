/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agendamybatis.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author santiago.mamani
 */
@Path("Pizza")
public class PizzaResourse {

    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        return "<datos>Ejemplo Colección Test1</datos>";
        // throw new UnsupportedOperationException();
    }

    /**
     * POST method for creating an instance of PizzaRecurso
     *
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    public Response postXml(String content) {
        System.out.println("por aqui");
        return Response.ok().build();
        // return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for {id}
     */
    @GET
    @Path("/{id}")
    public String getPizzaRecurso(@PathParam("id") String id) {
        System.out.println("reclamamos elemento");
        return "Complicando los mappings";
    }
}
