package com.example.adapters.resource.clients;

import com.example.generated.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/countryinfo")
public class CountryInfoResource {

    @GET
    @Path("/continents")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TContinent> getListOfContinents() {
        try {
            CountryInfoService service = new CountryInfoService();
            CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
            ArrayOftContinent continents = port.listOfContinentsByName();
            return continents.getTContinent();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
