package io.swagger.api;

import java.util.List;
import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user")
@Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class UserApi {

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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response userApiKeysGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response userApiKeysKeyDelete(@PathParam("key") @ApiParam("Key") String key) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response userApiKeysPost(@QueryParam("expiry")   @ApiParam("Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h")  String expiry,@QueryParam("perms")   @ApiParam("Permissions -- currently unused")  String perms) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response userExportGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response userStatsGet() {
        return Response.ok().entity("magic!").build();
    }
}
