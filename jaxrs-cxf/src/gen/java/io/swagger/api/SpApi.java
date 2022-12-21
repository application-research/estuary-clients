package io.swagger.api;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
public interface SpApi  {

    /**
     * Claim Storage Provider
     *
     * This endpoint lets a user claim a storage provider
     *
     */
    @POST
    @Path("/storage-providers/claim")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Claim Storage Provider", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public GithubComApplicationResearchEstuaryApiV2ClaimResponse storageProvidersClaimPost(@Valid MinerClaimMinerBody body);

    /**
     * Get Claim Storage Provider
     *
     * This endpoint lets a user get the message in order to claim a storage provider
     *
     */
    @GET
    @Path("/storage-providers/claim/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Storage Provider", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storageProvidersClaimSpGet(@PathParam("sp") String sp);

    /**
     * Get all storage providers deals
     *
     * This endpoint returns all storage providers deals
     *
     */
    @GET
    @Path("/storage-providers/deals/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers deals", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String storageProvidersDealsSpGet(@PathParam("sp") String sp, @QueryParam("ignore-failed") String ignoreFailed);

    /**
     * Get all storage providers
     *
     * This endpoint returns all storage providers
     *
     */
    @GET
    @Path("/storage-providers/failures/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String storageProvidersFailuresSpGet(@PathParam("sp") String sp);

    /**
     * Get all storage providers
     *
     * This endpoint returns all storage providers
     *
     */
    @GET
    @Path("/storage-providers")
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ApiStorageProviderResp.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public List<ApiStorageProviderResp> storageProvidersGet();

    /**
     * Set Storage Provider Info
     *
     * This endpoint lets a user set storage provider info.
     *
     */
    @PUT
    @Path("/storage-providers/set-info/{sp}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Set Storage Provider Info", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public void storageProvidersSetInfoSpPut(@Valid MinerMinerSetInfoParams body, @PathParam("sp") String sp);

    /**
     * Get storage provider stats
     *
     * This endpoint returns storage provider stats
     *
     */
    @GET
    @Path("/storage-providers/stats/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get storage provider stats", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String storageProvidersStatsSpGet(@PathParam("sp") String sp);

    /**
     * Suspend Storage Provider
     *
     * This endpoint lets a user suspend a storage provider.
     *
     */
    @POST
    @Path("/storage-providers/suspend/{sp}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Suspend Storage Provider", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Map<String, String> storageProvidersSuspendSpPost(@Valid MinerSuspendMinerBody body, @PathParam("sp") String sp);

    /**
     * Unuspend Storage Provider
     *
     * This endpoint lets a user unsuspend a Storage Provider.
     *
     */
    @PUT
    @Path("/storage-providers/unsuspend/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Storage Provider", tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public void storageProvidersUnsuspendSpPut(@PathParam("sp") String sp);
}
