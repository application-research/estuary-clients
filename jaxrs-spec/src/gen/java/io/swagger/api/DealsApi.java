package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/deals")
@Api(description = "the deals API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-07T23:22:02.407Z")
public class DealsApi {

    @GET
    @Path("/failures")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures for user", notes = "This endpoint returns a list of storage failures for user", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealsFailuresGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/make/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Make Deal", notes = "This endpoint makes a deal for a given content and miner", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealsMakeMinerPost(@PathParam("miner") @ApiParam("Miner") String miner,@Valid String dealRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status/{deal}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status", notes = "This endpoint returns the status of a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealsStatusDealGet(@PathParam("deal") @ApiParam("Deal ID") Integer deal) {
        return Response.ok().entity("magic!").build();
    }
}
