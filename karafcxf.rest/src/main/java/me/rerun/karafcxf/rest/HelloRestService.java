package me.rerun.karafcxf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("say")
public interface HelloRestService {

    @GET
    @Path("hello/{name}")
    public String handleGet(@PathParam("name") String name);

}
