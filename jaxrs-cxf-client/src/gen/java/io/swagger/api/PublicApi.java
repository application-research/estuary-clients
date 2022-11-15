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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
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
    @Operation(summary = "Get Content by Cid", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get public node info", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get deal metrics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get all miners deals", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get all miners", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get all miners", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get miner stats", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Net Addrs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
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
    @Operation(summary = "Net Peers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Public stats", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String publicStatsGet();
}
