package io.swagger.api;

import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentCreateBody;
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
public interface ContentApi  {

    /**
     * Create an Estuary invite
     *
     * This endpoint is used to create an estuary invite.
     *
     */
    @POST
    @Path("/admin/invites/{code}")
    @Produces({ "application/json" })
    @Operation(summary = "Create an Estuary invite", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String adminInvitesCodePost(@PathParam("code") String code);

    /**
     * Get Estuary invites
     *
     * This endpoint is used to list all estuary invites.
     *
     */
    @GET
    @Path("/admin/invites")
    @Produces({ "application/json" })
    @Operation(summary = "Get Estuary invites", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String adminInvitesGet();

    /**
     * Upload content via a car file
     *
     * This endpoint uploads content via a car file
     *
     */
    @POST
    @Path("/content/add-car")
    @Produces({ "application/json" })
    @Operation(summary = "Upload content via a car file", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentAddCarPost();

    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     *
     */
    @POST
    @Path("/content/add-ipfs")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add IPFS object", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentAddIpfsPost(UtilContentAddIpfsBody body, @QueryParam("ignore-dupes")String ignoreDupes);

    /**
     * Upload a file
     *
     * This endpoint uploads a file.
     *
     */
    @POST
    @Path("/content/add")
    @Produces({ "application/json" })
    @Operation(summary = "Upload a file", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentAddPost();

    /**
     * Get aggregated content stats
     *
     * This endpoint returns aggregated content stats
     *
     */
    @GET
    @Path("/content/aggregated/{content}")
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
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
    @Operation(summary = "Get all deals for a user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentAllDealsGet(@QueryParam("begin")String begin, @QueryParam("duration")String duration, @QueryParam("all")String all);

    /**
     * Get content bandwidth
     *
     * This endpoint returns content bandwidth
     *
     */
    @GET
    @Path("/content/bw-usage/{content}")
    @Produces({ "application/json" })
    @Operation(summary = "Get content bandwidth", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentBwUsageContentGet(@PathParam("content") String content);

    /**
     * Add a new content
     *
     * This endpoint adds a new content
     *
     */
    @POST
    @Path("/content/create")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentCreatePost(UtilContentCreateBody body, @QueryParam("ignore-dupes")String ignoreDupes);

    /**
     * Content with deals
     *
     * This endpoint lists all content with deals
     *
     */
    @GET
    @Path("/content/deals")
    @Produces({ "application/json" })
    @Operation(summary = "Content with deals", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentDealsGet(@QueryParam("limit")Integer limit, @QueryParam("offset")Integer offset);

    /**
     * Ensure Replication
     *
     * This endpoint ensures that the content is replicated to the specified number of providers
     *
     */
    @GET
    @Path("/content/ensure-replication/{datacid}")
    @Produces({ "application/json" })
    @Operation(summary = "Ensure Replication", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentEnsureReplicationDatacidGet(@PathParam("datacid") String datacid);

    /**
     * List all failures for a content
     *
     * This endpoint returns all failures for a content
     *
     */
    @GET
    @Path("/content/failures/{content}")
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentFailuresContentGet(@PathParam("content") String content);

    /**
     * Content
     *
     * This endpoint returns a content by its ID
     *
     */
    @GET
    @Path("/content/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentIdGet(@PathParam("id") Integer id);

    /**
     * Import a deal
     *
     * This endpoint imports a deal into the shuttle.
     *
     */
    @POST
    @Path("/content/importdeal")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Import a deal", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentImportdealPost(MainImportDealBody body);

    /**
     * List all pinned content
     *
     * This endpoint lists all content
     *
     */
    @GET
    @Path("/content/list")
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentListGet();

    /**
     * Read content
     *
     * This endpoint reads content from the blockstore
     *
     */
    @GET
    @Path("/content/read/{cont}")
    @Produces({ "application/json" })
    @Operation(summary = "Read content", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentReadContGet(@PathParam("cont") String cont);

    /**
     * Get staging zone for user
     *
     * This endpoint is used to get staging zone for user.
     *
     */
    @GET
    @Path("/content/staging-zones")
    @Produces({ "application/json" })
    @Operation(summary = "Get staging zone for user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentStagingZonesGet();

    /**
     * Get content statistics
     *
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
     *
     */
    @GET
    @Path("/content/stats")
    @Produces({ "application/json" })
    @Operation(summary = "Get content statistics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentStatsGet(@QueryParam("limit")String limit, @QueryParam("offset")String offset);

    /**
     * Content Status
     *
     * This endpoint returns the status of a content
     *
     */
    @GET
    @Path("/content/status/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Content Status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String contentStatusIdGet(@PathParam("id") Integer id);
}
