package io.swagger.api;

import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/autoretrieve")
@Api(description = "the autoretrieve API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class AutoretrieveApi {

    @POST
    @Path("/heartbeat")
    @Produces({ "application/json" })
    @ApiOperation(value = "Marks autoretrieve server as up", notes = "This endpoint updates the lastConnection field for autoretrieve", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response autoretrieveHeartbeatPost(@HeaderParam("token") @NotNull   @ApiParam("Autoretrieve&#39;s auth token") String token) {
        return Response.ok().entity("magic!").build();
    }
}
