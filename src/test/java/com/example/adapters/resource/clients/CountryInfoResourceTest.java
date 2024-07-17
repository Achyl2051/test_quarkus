package com.example.adapters.resource.clients;

import com.example.adapters.service.clients.CountryInfoServiceClient;
import com.example.generated.TContinent;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@QuarkusTest
class CountryInfoResourceTest{

    @InjectMock
    CountryInfoServiceClient countryInfoServiceClient;

    @Test
    void getListOfContinents() {
        TContinent continent1 = new TContinent();
        continent1.setSName("Africa");
        TContinent continent2 = new TContinent();
        continent2.setSName("Asia");

        List<TContinent> continentList = Arrays.asList(continent1, continent2);

        when(countryInfoServiceClient.getListOfContinents()).thenReturn(continentList);

        given()
                .contentType(MediaType.APPLICATION_JSON)
                .when().get("/countryinfo/continents")
                .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .contentType(MediaType.APPLICATION_JSON)
                .body("size()", is(2));
    }
}