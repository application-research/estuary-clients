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
public interface MetricsApi  {

    /**
     * Get deal metrics
     *
     * This endpoint is used to get deal metrics
     *
     */
    @GET
    @Path("/public/metrics/deals-on-chain")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get deal metrics", tags={  })
    @ApiResponses(value = {  })
    public void publicMetricsDealsOnChainGet();
}

