package io.swagger.api;

import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/deals")
@Api(description = "the deals API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class DealsApi {

    @GET
    @Path("/failures")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures for user", notes = "This endpoint returns a list of storage failures for user", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealsFailuresGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/make/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Make Deal", notes = "This endpoint makes a deal for a given content and miner", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealsMakeMinerPost(@PathParam("miner") @ApiParam("Miner") String miner,@Valid String dealRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status/{deal}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status", notes = "This endpoint returns the status of a deal", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealsStatusDealGet(@PathParam("deal") @ApiParam("Deal ID") Integer deal) {
        return Response.ok().entity("magic!").build();
    }
}
