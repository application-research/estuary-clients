package io.swagger.api;

import io.swagger.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/autoretrieve")


@io.swagger.annotations.Api(description = "the autoretrieve API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-11-07T20:06:03.798Z")
public interface AutoretrieveApi  {
   
    @POST
    @Path("/heartbeat")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Marks autoretrieve server as up", notes = "This endpoint updates the lastConnection field for autoretrieve", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response autoretrieveHeartbeatPost(@ApiParam(value = "Autoretrieve's auth token" ,required=true)@HeaderParam("token") String token,@Context SecurityContext securityContext);
}
