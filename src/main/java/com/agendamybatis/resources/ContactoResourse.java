package com.agendamybatis.resources;

import com.agendamybatis.logic.ContactoLogic;
import com.agendamybatis.model.Contacto;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author santiago.mamani
 */
@Path("contactos")
public class ContactoResourse {

    private ContactoLogic contactoLogic = new ContactoLogic();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String insertMovie(Contacto contacto) {
        //  Contacto contacto = new Contacto("Elias","Zeballos",74839001 );
        System.out.println("MMMM");
        return contactoLogic.insert(contacto);
    }
}
