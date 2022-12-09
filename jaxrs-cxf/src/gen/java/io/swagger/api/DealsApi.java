package io.swagger.api;

import io.swagger.model.ApiChannelIDParam;
import io.swagger.model.ApiEstimateDealBody;
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
public interface DealsApi  {

    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     *
     */
    @POST
    @Path("/deal/estimate")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Estimate the cost of a deal", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealEstimatePost(@Valid ApiEstimateDealBody body);

    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     *
     */
    @GET
    @Path("/deal/info/{dealid}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Deal Info", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealInfoDealidGet(@PathParam("dealid") Integer dealid);

    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     *
     */
    @GET
    @Path("/deal/proposal/{propcid}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Proposal", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealProposalPropcidGet(@PathParam("propcid") String propcid);

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    @GET
    @Path("/deal/query/{miner}")
    @Produces({ "application/json" })
    @Operation(summary = "Query Ask", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealQueryMinerGet(@PathParam("miner") String miner);

    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     *
     */
    @GET
    @Path("/deal/status-by-proposal/{propcid}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Deal Status by PropCid", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealStatusByProposalPropcidGet(@PathParam("propcid") String propcid);

    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    @GET
    @Path("/deal/status/{miner}/{propcid}")
    @Produces({ "application/json" })
    @Operation(summary = "Deal Status", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealStatusMinerPropcidGet(@PathParam("miner") String miner, @PathParam("propcid") String propcid);

    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     *
     */
    @GET
    @Path("/deal/transfer/in-progress")
    @Produces({ "application/json" })
    @Operation(summary = "Transfer In Progress", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealTransferInProgressGet();

    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     *
     */
    @POST
    @Path("/deal/transfer/status")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Transfer Status", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealTransferStatusPost(@Valid ApiChannelIDParam body);

    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     *
     */
    @GET
    @Path("/deals/failures")
    @Produces({ "application/json" })
    @Operation(summary = "Get storage failures for user", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealsFailuresGet();

    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     *
     */
    @POST
    @Path("/deals/make/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Make Deal", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealsMakeMinerPost(@Valid String body, @PathParam("miner") String miner);

    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    @GET
    @Path("/deals/status/{deal}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Deal Status", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String dealsStatusDealGet(@PathParam("deal") Integer deal);

    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     *
     */
    @GET
    @Path("/public/deals/failures")
    @Produces({ "application/json" })
    @Operation(summary = "Get storage failures", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String publicDealsFailuresGet();

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    @GET
    @Path("/public/miners/storage/query/{miner}")
    @Produces({ "application/json" })
    @Operation(summary = "Query Ask", tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String publicMinersStorageQueryMinerGet(@PathParam("miner") String miner);
}
