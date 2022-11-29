package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/user")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-29T10:27:01.923Z[GMT]")public class UserApi  {

   private UserApiService delegate;

   protected UserApi() {
   }

   @javax.inject.Inject
   public UserApi(UserApiService delegate) {
      this.delegate = delegate;
   }

    @GET
    @Path("/api-keys")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get API keys for a user", description = "This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = MainGetApiKeysResp.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response userApiKeysGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userApiKeysGet(securityContext);
    }
    @DELETE
    @Path("/api-keys/{key_or_hash}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Revoke a User API Key.", description = "This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response userApiKeysKeyOrHashDelete(@Parameter(in = ParameterIn.PATH, description = "Key or Hash",required=true) @PathParam("key_or_hash") String keyOrHash
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userApiKeysKeyOrHashDelete(keyOrHash,securityContext);
    }
    @POST
    @Path("/api-keys")
    
    @Produces({ "application/json" })
    @Operation(summary = "Create API keys for a user", description = "This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MainGetApiKeysResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response userApiKeysPost(@Parameter(in = ParameterIn.QUERY, description = "Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h") @QueryParam("expiry") String expiry
,@Parameter(in = ParameterIn.QUERY, description = "Permissions -- currently unused") @QueryParam("perms") String perms
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userApiKeysPost(expiry,perms,securityContext);
    }
    @GET
    @Path("/export")
    
    @Produces({ "application/json" })
    @Operation(summary = "Export user data", description = "This endpoint is used to get API keys for a user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response userExportGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userExportGet(securityContext);
    }
    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get stats for the current user", description = "This endpoint is used to geet stats for the current user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response userStatsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userStatsGet(securityContext);
    }
}
