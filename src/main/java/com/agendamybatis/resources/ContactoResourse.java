package com.agendamybatis.resources;

import com.agendamybatis.logic.ContactoLogic;
import com.agendamybatis.model.Contacto;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author santiago.mamani
 */
@Path("/contactos")
@Produces("application/json")
@Consumes("application/json")
public class ContactoResourse {

    private ContactoLogic contactoLogic = new ContactoLogic();

    @POST
    public String insertMovie(Contacto contacto) {
        return contactoLogic.insert(contacto);
    }

    @GET
    @Path("/{id}")
    public Contacto get(@PathParam("id") int idContacto) {
        System.out.println("ESTOY GET");
        return contactoLogic.get(idContacto);
    }
}
