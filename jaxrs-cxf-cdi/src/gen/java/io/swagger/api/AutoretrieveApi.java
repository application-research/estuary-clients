package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.api.AutoretrieveApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/autoretrieve")
@RequestScoped

@Api(description = "the autoretrieve API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class AutoretrieveApi  {

  @Context SecurityContext securityContext;

  @Inject AutoretrieveApiService delegate;


    @POST
    @Path("/heartbeat")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Marks autoretrieve server as up", notes = "This endpoint updates the lastConnection field for autoretrieve", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response autoretrieveHeartbeatPost(@ApiParam(value = "Autoretrieve's auth token" ,required=true)@HeaderParam("token") String token) {
        return delegate.autoretrieveHeartbeatPost(token, securityContext);
    }
}
