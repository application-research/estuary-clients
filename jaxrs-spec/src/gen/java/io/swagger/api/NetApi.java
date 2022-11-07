package io.swagger.api;

import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/net")
@Api(description = "the net API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class NetApi {

    @GET
    @Path("/addrs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Addrs", notes = "This endpoint is used to get net addrs", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "net" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response netAddrsGet() {
        return Response.ok().entity("magic!").build();
    }
}
