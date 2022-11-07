package io.swagger.api;

import java.util.List;
import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;
import io.swagger.api.UserApiService;

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
@Path("/user")
@RequestScoped

@Api(description = "the user API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class UserApi  {

  @Context SecurityContext securityContext;

  @Inject UserApiService delegate;


    @GET
    @Path("/api-keys")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get API keys for a user", notes = "This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.", response = List.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = List.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userApiKeysGet() {
        return delegate.userApiKeysGet(securityContext);
    }

    @DELETE
    @Path("/api-keys/{key}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Revoke a User API Key.", notes = "This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userApiKeysKeyDelete(@ApiParam(value = "Key",required=true) @PathParam("key") String key) {
        return delegate.userApiKeysKeyDelete(key, securityContext);
    }

    @POST
    @Path("/api-keys")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create API keys for a user", notes = "This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.", response = MainGetApiKeysResp.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainGetApiKeysResp.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userApiKeysPost( @ApiParam(value = "Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h")  @QueryParam("expiry") String expiry,  @ApiParam(value = "Permissions -- currently unused")  @QueryParam("perms") String perms) {
        return delegate.userApiKeysPost(expiry, perms, securityContext);
    }

    @GET
    @Path("/export")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Export user data", notes = "This endpoint is used to get API keys for a user.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userExportGet() {
        return delegate.userExportGet(securityContext);
    }

    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create API keys for a user", notes = "This endpoint is used to create API keys for a user.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userStatsGet() {
        return delegate.userStatsGet(securityContext);
    }
}
