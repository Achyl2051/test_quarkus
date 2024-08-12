package com.example.adapters.resource.jwt;

import com.example.adapters.service.jwt.JwtService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/jwt")
@ApplicationScoped
public class JwtResource {
    @Inject
    JwtService jwtService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getJwt() {
        String jwt=jwtService.generateToken();
        return Response.ok(jwt).build();
    }
}
