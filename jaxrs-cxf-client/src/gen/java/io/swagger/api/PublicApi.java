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
public interface PublicApi  {

    /**
     * Get Content by Cid
     *
     * This endpoint returns the content associated with a CID
     *
     */
    @GET
    @Path("/public/by-cid/{cid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Content by Cid", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicByCidCidGet(@PathParam("cid") String cid);

    /**
     * Get public node info
     *
     * This endpoint returns information about the node
     *
     */
    @GET
    @Path("/public/info")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get public node info", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicInfoGet();

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
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicMetricsDealsOnChainGet();

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
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicMinersDealsMinerGet(@PathParam("miner") String miner, @QueryParam("ignore-failed")String ignoreFailed);

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    @GET
    @Path("/public/miners/failures/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all miners", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicMinersFailuresMinerGet(@PathParam("miner") String miner);

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    @GET
    @Path("/public/miners")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all miners", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicMinersGet();

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
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicMinersStatsMinerGet(@PathParam("miner") String miner);

    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     */
    @GET
    @Path("/public/net/addrs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Addrs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public List<String> publicNetAddrsGet();

    /**
     * Net Peers
     *
     * This endpoint is used to get net peers
     *
     */
    @GET
    @Path("/public/net/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Peers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public List<String> publicNetPeersGet();

    /**
     * Public stats
     *
     * This endpoint is used to get public stats.
     *
     */
    @GET
    @Path("/public/stats")
    @Produces({ "application/json" })
    @ApiOperation(value = "Public stats", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public String publicStatsGet();
}

