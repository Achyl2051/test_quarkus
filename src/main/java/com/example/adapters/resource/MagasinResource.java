package com.example.adapters.resource;

import com.example.adapters.service.MagasinService;
import com.example.domain.Magasin;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.Multi;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/magasins")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Blocking
public class MagasinResource {

    @Inject
    MagasinService magasinService;

    @GET
    @PermitAll
    @Path("/{id}")
    public Uni<Magasin> findById(@PathParam("id") int idMagasin) {
        return magasinService.findById(idMagasin);
    }

    @GET
    @PermitAll
    public Multi<Magasin> findAll() {
        return magasinService.findAll();
    }

    @POST
    @RolesAllowed("admin")
    public Uni<Response> save(Magasin magasin) {
        return magasinService.save(magasin)
                .onItem().transform(v -> Response.status(Response.Status.CREATED).build());
    }

    @PUT
    @RolesAllowed({"admin","writer"})
    public Uni<Response> update(Magasin magasin) {
        return magasinService.update(magasin)
                .onItem().transform(v -> Response.ok().build());
    }

    @DELETE
    @RolesAllowed("admin")
    @Path("/{id}")
    public Uni<Response> delete(@PathParam("id") int id) {
        return magasinService.delete(id)
                .onItem().transformToUni(ignored -> Uni.createFrom().item(Response.noContent().build()))
                .onFailure().recoverWithItem(t -> Response.status(Response.Status.NOT_FOUND)
                        .entity("Magasin non trouvé : " + id).build());
    }
}
