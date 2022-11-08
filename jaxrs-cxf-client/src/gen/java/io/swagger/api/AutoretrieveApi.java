package io.swagger.api;

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

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface AutoretrieveApi  {

    /**
     * Register autoretrieve server
     *
     * This endpoint registers a new autoretrieve server
     *
     */
    @POST
    @Path("/admin/autoretrieve/init")
    @Produces({ "application/json" })
    @ApiOperation(value = "Register autoretrieve server", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String adminAutoretrieveInitPost(@Multipart(value = "addresses")  String addresses, @Multipart(value = "pubKey")  String pubKey);

    /**
     * List autoretrieve servers
     *
     * This endpoint lists all registered autoretrieve servers
     *
     */
    @GET
    @Path("/admin/autoretrieve/list")
    @Produces({ "application/json" })
    @ApiOperation(value = "List autoretrieve servers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String adminAutoretrieveListGet();

    /**
     * Marks autoretrieve server as up
     *
     * This endpoint updates the lastConnection field for autoretrieve
     *
     */
    @POST
    @Path("/autoretrieve/heartbeat")
    @Produces({ "application/json" })
    @ApiOperation(value = "Marks autoretrieve server as up", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String autoretrieveHeartbeatPost(@HeaderParam("token") String token);
}

