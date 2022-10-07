package io.swagger.api;

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


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-10-07T23:21:55.508Z")

public class AutoretrieveApi  {

  @Context SecurityContext securityContext;

  @Inject AutoretrieveApiService delegate;


    @POST
    @Path("/heartbeat")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Marks autoretrieve server as up", notes = "This endpoint updates the lastConnection field for autoretrieve", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public Response autoretrieveHeartbeatPost(@ApiParam(value = "Autoretrieve's auth token" ,required=true)@HeaderParam("token") String token) {
        return delegate.autoretrieveHeartbeatPost(token, securityContext);
    }
}
