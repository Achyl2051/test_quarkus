package com.example.ports;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8081")
@Path("/hello")
public interface MessagePort {
    @GET
    public String getMessage();
}
