package br.com.measure.resource;

import br.com.measure.service.CybersicknessService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.ExecutionException;

@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CybersicknessResource {

    @Inject
    CybersicknessService cybersicknessService;

    @GET
    @Path("/cybersickness")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getItem() throws ExecutionException, InterruptedException {

        return Response.ok(cybersicknessService.listarCybersickness()).build();

    }
}
