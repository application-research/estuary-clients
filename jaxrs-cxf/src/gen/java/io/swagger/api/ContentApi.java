package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

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
public interface ContentApi  {

    /**
     * Add Car object
     *
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     *
     */
    @POST
    @Path("/content/add-car")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Car object", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentAddCarPost(@Valid String body, @QueryParam("filename") String filename, @QueryParam("commp") String commp, @QueryParam("size") String size);

    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     *
     */
    @POST
    @Path("/content/add-ipfs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add IPFS object", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentAddIpfsPost(@Valid UtilContentAddIpfsBody body);

    /**
     * Add new content
     *
     * This endpoint is used to upload new content.
     *
     */
    @POST
    @Path("/content/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add new content", tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UtilContentAddResponse.class) })
    public UtilContentAddResponse contentAddPost( @Multipart(value = "file" ) Attachment fileDetail, @PathParam("coluuid") String coluuid, @PathParam("dir") String dir);

    /**
     * Get aggregated content stats
     *
     * This endpoint returns aggregated content stats
     *
     */
    @GET
    @Path("/content/aggregated/{content}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get aggregated content stats", tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String contentAggregatedContentGet(@PathParam("content") String content);

    /**
     * Get all deals for a user
     *
     * This endpoint is used to get all deals for a user
     *
     */
    @GET
    @Path("/content/all-deals")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all deals for a user", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentAllDealsGet(@QueryParam("begin") @NotNull String begin, @QueryParam("duration") @NotNull String duration, @QueryParam("all") @NotNull String all);

    /**
     * Get content bandwidth
     *
     * This endpoint returns content bandwidth
     *
     */
    @GET
    @Path("/content/bw-usage/{content}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content bandwidth", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentBwUsageContentGet(@PathParam("content") String content);

    /**
     * Add a new content
     *
     * This endpoint adds a new content
     *
     */
    @POST
    @Path("/content/create")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new content", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentCreatePost(@Valid String body);

    /**
     * Content with deals
     *
     * This endpoint lists all content with deals
     *
     */
    @GET
    @Path("/content/deals")
    @Produces({ "application/json" })
    @ApiOperation(value = "Content with deals", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentDealsGet(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    /**
     * Ensure Replication
     *
     * This endpoint ensures that the content is replicated to the specified number of providers
     *
     */
    @GET
    @Path("/content/ensure-replication/{datacid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Ensure Replication", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentEnsureReplicationDatacidGet(@PathParam("datacid") String datacid);

    /**
     * List all failures for a content
     *
     * This endpoint returns all failures for a content
     *
     */
    @GET
    @Path("/content/failures/{content}")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all failures for a content", tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String contentFailuresContentGet(@PathParam("content") String content);

    /**
     * Import a deal
     *
     * This endpoint imports a deal into the shuttle.
     *
     */
    @POST
    @Path("/content/importdeal")
    @Produces({ "application/json" })
    @ApiOperation(value = "Import a deal", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentImportdealPost(@Valid MainImportDealBody body);

    /**
     * List all pinned content
     *
     * This endpoint lists all content
     *
     */
    @GET
    @Path("/content/list")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pinned content", tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public List<String> contentListGet();

    /**
     * Read content
     *
     * This endpoint reads content from the blockstore
     *
     */
    @GET
    @Path("/content/read/{cont}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Read content", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentReadContGet(@PathParam("cont") String cont);

    /**
     * Get staging zone for user
     *
     * This endpoint is used to get staging zone for user.
     *
     */
    @GET
    @Path("/content/staging-zones")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get staging zone for user", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentStagingZonesGet();

    /**
     * Get content statistics
     *
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     *
     */
    @GET
    @Path("/content/stats")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content statistics", tags={ "content",  })
    @ApiResponses(value = {  })
    public void contentStatsGet(@PathParam("limit") String limit);

    /**
     * Content Status
     *
     * This endpoint returns the status of a content
     *
     */
    @GET
    @Path("/content/status/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Content Status", tags={ "content" })
    @ApiResponses(value = {  })
    public void contentStatusIdGet(@PathParam("id") Integer id);
}

