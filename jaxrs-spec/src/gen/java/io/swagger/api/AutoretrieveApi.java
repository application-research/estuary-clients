package io.swagger.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/autoretrieve")
@Api(description = "the autoretrieve API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-07T23:59:40.764Z")
public class AutoretrieveApi {

    @POST
    @Path("/heartbeat")
    @Produces({ "application/json" })
    @ApiOperation(value = "Marks autoretrieve server as up", notes = "This endpoint updates the lastConnection field for autoretrieve", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
    })
    public Response autoretrieveHeartbeatPost(@HeaderParam("token") @NotNull   @ApiParam("Autoretrieve&#39;s auth token") String token) {
        return Response.ok().entity("magic!").build();
    }
}
