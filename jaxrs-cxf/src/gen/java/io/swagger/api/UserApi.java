package io.swagger.api;

import java.util.List;
import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface UserApi  {

    /**
     * Get API keys for a user
     *
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     *
     */
    @GET
    @Path("/user/api-keys")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get API keys for a user", tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = List.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public List<List<MainGetApiKeysResp>> userApiKeysGet();

    /**
     * Revoke a User API Key.
     *
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
     *
     */
    @DELETE
    @Path("/user/api-keys/{key}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Revoke a User API Key.", tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String userApiKeysKeyDelete(@PathParam("key") String key);

    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     *
     */
    @POST
    @Path("/user/api-keys")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create API keys for a user", tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainGetApiKeysResp.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public MainGetApiKeysResp userApiKeysPost(@QueryParam("expiry") String expiry, @QueryParam("perms") String perms);

    /**
     * Export user data
     *
     * This endpoint is used to get API keys for a user.
     *
     */
    @GET
    @Path("/user/export")
    @Produces({ "application/json" })
    @ApiOperation(value = "Export user data", tags={ "User",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String userExportGet();

    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user.
     *
     */
    @GET
    @Path("/user/stats")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create API keys for a user", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String userStatsGet();
}

