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

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface PeersApi  {

    /**
     * Remove peers on Peering Service
     *
     * This endpoint can be used to remove a Peer from the Peering Service
     *
     */
    @DELETE
    @Path("/admin/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove peers on Peering Service", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringPeersDelete();

    /**
     * List all Peering peers
     *
     * This endpoint can be used to list all peers on Peering Service
     *
     */
    @GET
    @Path("/admin/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all Peering peers", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringPeersGet();

    /**
     * Add peers on Peering Service
     *
     * This endpoint can be used to add a Peer from the Peering Service
     *
     */
    @POST
    @Path("/admin/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add peers on Peering Service", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringPeersPost();

    /**
     * Start Peering
     *
     * This endpoint can be used to start the Peering Service
     *
     */
    @POST
    @Path("/admin/peering/start")
    @Produces({ "application/json" })
    @ApiOperation(value = "Start Peering", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringStartPost();

    /**
     * Check Peering Status
     *
     * This endpoint can be used to check the Peering status
     *
     */
    @GET
    @Path("/admin/peering/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Check Peering Status", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringStatusGet();

    /**
     * Stop Peering
     *
     * This endpoint can be used to stop the Peering Service
     *
     */
    @POST
    @Path("/admin/peering/stop")
    @Produces({ "application/json" })
    @ApiOperation(value = "Stop Peering", tags={  })
    @ApiResponses(value = {  })
    public void adminPeeringStopPost();
}

