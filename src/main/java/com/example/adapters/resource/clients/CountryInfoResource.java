package com.example.adapters.resource.clients;

import com.example.adapters.service.clients.CountryInfoServiceClient;
import com.example.generated.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/countryinfo")
public class CountryInfoResource {
    @Inject
    CountryInfoServiceClient countryInfoServiceClient;

    @GET
    @Path("/continents")
    public Response getListOfContinents() {
        return Response.ok(countryInfoServiceClient.getListOfContinents()).build();
    }
}
