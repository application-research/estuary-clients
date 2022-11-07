package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;
import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

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

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class UserApi  {

    @Inject UserApiService service;

    @GET
    @Path("/api-keys")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get API keys for a user", notes = "This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.", response = List.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = List.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userApiKeysGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userApiKeysGet(securityContext);
    }
    @DELETE
    @Path("/api-keys/{key}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Revoke a User API Key.", notes = "This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userApiKeysKeyDelete( @PathParam("key") String key,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userApiKeysKeyDelete(key,securityContext);
    }
    @POST
    @Path("/api-keys")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create API keys for a user", notes = "This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.", response = MainGetApiKeysResp.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MainGetApiKeysResp.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userApiKeysPost(  @QueryParam("expiry") String expiry,  @QueryParam("perms") String perms,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userApiKeysPost(expiry,perms,securityContext);
    }
    @GET
    @Path("/export")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Export user data", notes = "This endpoint is used to get API keys for a user.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userExportGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userExportGet(securityContext);
    }
    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create API keys for a user", notes = "This endpoint is used to create API keys for a user.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response userStatsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userStatsGet(securityContext);
    }
}
