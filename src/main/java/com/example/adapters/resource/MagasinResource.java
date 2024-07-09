package com.example.adapters.resource;

import com.example.adapters.MagasinService;
import com.example.domain.Magasin;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/magasins")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MagasinResource {

    private static final Logger LOGGER = Logger.getLogger(MagasinResource.class);
    @Inject
    MagasinService magasinService;

    @GET
    @Path("/{id}")
    public Magasin findById(@PathParam("id") int id)
    {
        LOGGER.info("la classe "+this.getClass().getName()+" a appelé la fonction findById comme parametre(id="+id+")");
        return magasinService.findById(id);
    }
}
