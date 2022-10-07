package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;

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
public interface DealsApi  {

    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     *
     */
    @POST
    @Path("/deal/estimate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Estimate the cost of a deal", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealEstimatePost(@Valid MainEstimateDealBody body);

    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     *
     */
    @GET
    @Path("/deal/info/{dealid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Info", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealInfoDealidGet(@PathParam("dealid") Integer dealid);

    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     *
     */
    @GET
    @Path("/deal/proposal/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Proposal", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealProposalPropcidGet(@PathParam("propcid") String propcid);

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    @GET
    @Path("/deal/query/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Query Ask", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealQueryMinerGet(@PathParam("miner") String miner);

    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     *
     */
    @GET
    @Path("/deal/status-by-proposal/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status by PropCid", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealStatusByProposalPropcidGet(@PathParam("propcid") String propcid);

    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    @GET
    @Path("/deal/status/{miner}/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deal Status", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealStatusMinerPropcidGet(@PathParam("miner") String miner, @PathParam("propcid") String propcid);

    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     *
     */
    @GET
    @Path("/deal/transfer/in-progress")
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer In Progress", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealTransferInProgressGet();

    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     *
     */
    @POST
    @Path("/deal/transfer/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer Status", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealTransferStatusPost();

    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     *
     */
    @GET
    @Path("/deals/failures")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures for user", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealsFailuresGet();

    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     *
     */
    @POST
    @Path("/deals/make/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Make Deal", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealsMakeMinerPost(@PathParam("miner") String miner, @Valid String dealRequest);

    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    @GET
    @Path("/deals/status/{deal}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void dealsStatusDealGet(@PathParam("deal") Integer deal);

    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     *
     */
    @GET
    @Path("/public/deals/failures")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures", tags={ "deals",  })
    @ApiResponses(value = {  })
    public void publicDealsFailuresGet();

    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    @GET
    @Path("/public/miners/storage/query/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Query Ask", tags={ "deals" })
    @ApiResponses(value = {  })
    public void publicMinersStorageQueryMinerGet(@PathParam("miner") String miner);
}

