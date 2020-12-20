package org.mmajiade.service;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;

@Path("reverse")
public class HelloService {

    @GET
    @Path("/{word}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMsg(@PathParam("word") String msg) {

        StringBuilder builder = new StringBuilder(msg);
        String output = builder.reverse().toString();

        return Response.status(200).entity(output).build();
    }
}




