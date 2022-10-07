package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AutoretrieveApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/autoretrieve")


@io.swagger.annotations.Api(description = "the autoretrieve API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T23:21:59.224Z")
public class AutoretrieveApi  {

    @Inject AutoretrieveApiService service;

    @POST
    @Path("/heartbeat")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Marks autoretrieve server as up", notes = "This endpoint updates the lastConnection field for autoretrieve", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response autoretrieveHeartbeatPost(@ApiParam(value = "Autoretrieve's auth token" ,required=true)@HeaderParam("token") String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.autoretrieveHeartbeatPost(token,securityContext);
    }
}
