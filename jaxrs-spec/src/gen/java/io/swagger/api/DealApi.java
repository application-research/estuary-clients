package io.swagger.api;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/deal")
@Api(description = "the deal API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class DealApi {

    @POST
    @Path("/estimate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Estimate the cost of a deal", notes = "This endpoint estimates the cost of a deal", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealEstimatePost(@Valid MainEstimateDealBody body) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/info/{dealid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Info", notes = "This endpoint returns the deal info for a deal", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealInfoDealidGet(@PathParam("dealid") @ApiParam("Deal ID") Integer dealid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/proposal/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Proposal", notes = "This endpoint returns the proposal for a deal", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealProposalPropcidGet(@PathParam("propcid") @ApiParam("Proposal CID") String propcid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/query/{miner}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealQueryMinerGet(@PathParam("miner") @ApiParam("CID") String miner) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status-by-proposal/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status by PropCid", notes = "Get Deal Status by PropCid", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealStatusByProposalPropcidGet(@PathParam("propcid") @ApiParam("PropCid") String propcid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/status/{miner}/{propcid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deal Status", notes = "This endpoint returns the status of a deal", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealStatusMinerPropcidGet(@PathParam("miner") @ApiParam("Miner") String miner,@PathParam("propcid") @ApiParam("Proposal CID") String propcid) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/transfer/in-progress")
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer In Progress", notes = "This endpoint returns the in-progress transfers", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealTransferInProgressGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/transfer/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer Status", notes = "This endpoint returns the status of a transfer", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response dealTransferStatusPost(@Valid MainChannelIDParam chanid) {
        return Response.ok().entity("magic!").build();
    }
}
