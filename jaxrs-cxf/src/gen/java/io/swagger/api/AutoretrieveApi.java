package io.swagger.api;


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
    @ApiOperation(value = "Register autoretrieve server", tags={ "autoretrieve",  })
    @ApiResponses(value = {  })
    public void adminAutoretrieveInitPost(@Valid String addresses, @Valid String pubKey);

    /**
     * List autoretrieve servers
     *
     * This endpoint lists all registered autoretrieve servers
     *
     */
    @GET
    @Path("/admin/autoretrieve/list")
    @Produces({ "application/json" })
    @ApiOperation(value = "List autoretrieve servers", tags={ "autoretrieve",  })
    @ApiResponses(value = {  })
    public void adminAutoretrieveListGet();

    /**
     * Marks autoretrieve server as up
     *
     * This endpoint updates the lastConnection field for autoretrieve
     *
     */
    @POST
    @Path("/autoretrieve/heartbeat")
    @Produces({ "application/json" })
    @ApiOperation(value = "Marks autoretrieve server as up", tags={ "autoretrieve" })
    @ApiResponses(value = {  })
    public void autoretrieveHeartbeatPost(@HeaderParam("token") String token);
}

