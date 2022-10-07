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
public interface MinerApi  {

    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     */
    @GET
    @Path("/public/miners/deals/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all miners deals", tags={  })
    @ApiResponses(value = {  })
    public void publicMinersDealsMinerGet(@PathParam("miner") String miner);

    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     */
    @GET
    @Path("/public/miners/stats/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get miner stats", tags={  })
    @ApiResponses(value = {  })
    public void publicMinersStatsMinerGet(@PathParam("miner") String miner);
}

