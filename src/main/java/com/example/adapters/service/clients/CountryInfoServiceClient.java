package com.example.adapters.service.clients;

import com.example.generated.ArrayOftContinent;
import com.example.adapters.service.generated.CountryInfoService;
import com.example.ports.generated.CountryInfoServiceSoapType;
import com.example.generated.TContinent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CountryInfoServiceClient {

    @Inject
    CountryInfoService service;

    public List<TContinent> getListOfContinents() {
        try {
            CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
            ArrayOftContinent continents = port.listOfContinentsByName();
            List<TContinent> continentList = continents.getTContinent();
            return continentList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
