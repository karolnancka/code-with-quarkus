package com.karolnancka.learning;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        int a = 0;
        int b = 10;
        int results = a + b;
        return "Hello from RESTEasy Reactive, results of adding a+b: " + results;
    }
}
