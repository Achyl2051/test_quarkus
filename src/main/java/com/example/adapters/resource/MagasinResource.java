package com.example.adapters.resource;

import com.example.adapters.MagasinService;
import com.example.domain.Magasin;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

import java.util.List;

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

    @GET
    public List<Magasin> findAll()
    {
        return magasinService.findAll();
    }

    @PUT
    public Response update(Magasin magasin) {
        magasinService.update(magasin);
        return Response.ok(magasin).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") int id) {
        magasinService.delete(id);
        return Response.noContent().build();
    }
}
