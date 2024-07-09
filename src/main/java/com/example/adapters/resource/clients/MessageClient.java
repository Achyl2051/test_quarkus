package com.example.adapters.resource.clients;

import com.example.ports.MessagePort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/messages")
public class MessageClient {
    @RestClient
    MessagePort message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage()
    {
        return message.getMessage();
    }
}
