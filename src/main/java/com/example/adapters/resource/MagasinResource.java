package com.example.adapters.resource;

import com.example.adapters.MagasinService;
import com.example.domain.Magasin;
import com.example.ports.MessagePort;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Path("/magasins")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MagasinResource {

    private static final Logger LOGGER = Logger.getLogger(MagasinResource.class);
    @Inject
    MagasinService magasinService;

    @RestClient
    MessagePort message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage()
    {
        return message.getMessage();
    }

    @GET
    @Path("/{id}")
    public Magasin findById(@PathParam("id") int id)
    {
        LOGGER.info("la classe "+this.getClass().getName()+" a appelé la fonction findById comme parametre(id="+id+")");
        return magasinService.findById(id);
    }
}
