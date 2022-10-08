package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/deal")
@Api(description = "the deal API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-07T23:59:40.764Z")
public class DealApi {

    @POST
    @Path("/estimate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Estimate the cost of a deal", notes = "This endpoint estimates the cost of a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealEstimatePost(@Valid MainEstimateDealBody body) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/info/{dealid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Info", notes = "This endpoint returns the deal info for a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealInfoDealidGet(@PathParam("dealid") @ApiParam("Deal ID") Integer dealid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/proposal/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Proposal", notes = "This endpoint returns the proposal for a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealProposalPropcidGet(@PathParam("propcid") @ApiParam("Proposal CID") String propcid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/query/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealQueryMinerGet(@PathParam("miner") @ApiParam("CID") String miner) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status-by-proposal/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status by PropCid", notes = "Get Deal Status by PropCid", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealStatusByProposalPropcidGet(@PathParam("propcid") @ApiParam("PropCid") String propcid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status/{miner}/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deal Status", notes = "This endpoint returns the status of a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealStatusMinerPropcidGet(@PathParam("miner") @ApiParam("Miner") String miner,@PathParam("propcid") @ApiParam("Proposal CID") String propcid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/transfer/in-progress")
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer In Progress", notes = "This endpoint returns the in-progress transfers", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
    })
    public Response dealTransferInProgressGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/transfer/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer Status", notes = "This endpoint returns the status of a transfer", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = { 
    })
    public Response dealTransferStatusPost() {
        return Response.ok().entity("magic!").build();
    }
}
