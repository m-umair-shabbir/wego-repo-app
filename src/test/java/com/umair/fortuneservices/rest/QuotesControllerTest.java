package com.umair.fortuneservices.rest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class QuotesControllerTest {

    @Test
    public void getQuote(){
        get("http://localhost:8080/fortune_services/v1/fortune")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
