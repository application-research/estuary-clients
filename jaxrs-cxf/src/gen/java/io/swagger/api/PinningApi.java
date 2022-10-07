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
public interface PinningApi  {

    /**
     * List all pin status objects
     *
     * This endpoint lists all pin status objects
     *
     */
    @GET
    @Path("/pinning/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pin status objects", tags={ "pinning",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public void pinningPinsGet();

    /**
     * Delete a pinned object
     *
     * This endpoint deletes a pinned object.
     *
     */
    @DELETE
    @Path("/pinning/pins/{pinid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a pinned object", tags={ "pinning",  })
    @ApiResponses(value = {  })
    public void pinningPinsPinidDelete(@PathParam("pinid") String pinid);

    /**
     * Get a pin status object
     *
     * This endpoint returns a pin status object.
     *
     */
    @GET
    @Path("/pinning/pins/{pinid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a pin status object", tags={ "pinning",  })
    @ApiResponses(value = {  })
    public void pinningPinsPinidGet(@PathParam("pinid") String pinid);

    /**
     * Replace a pinned object
     *
     * This endpoint replaces a pinned object.
     *
     */
    @POST
    @Path("/pinning/pins/{pinid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Replace a pinned object", tags={ "pinning",  })
    @ApiResponses(value = {  })
    public void pinningPinsPinidPost(@PathParam("pinid") String pinid);

    /**
     * Add and pin object
     *
     * This endpoint adds a pin to the IPFS daemon.
     *
     */
    @POST
    @Path("/pinning/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add and pin object", tags={ "pinning" })
    @ApiResponses(value = {  })
    public void pinningPinsPost(@PathParam("cid") String cid, @PathParam("name") String name);
}

