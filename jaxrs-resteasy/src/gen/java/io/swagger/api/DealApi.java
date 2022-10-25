package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DealApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.MainEstimateDealBody;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/deal")


@io.swagger.annotations.Api(description = "the deal API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-25T22:24:58.988Z")
public class DealApi  {

    @Inject DealApiService service;

    @POST
    @Path("/estimate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Estimate the cost of a deal", notes = "This endpoint estimates the cost of a deal", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealEstimatePost(@ApiParam(value = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true) MainEstimateDealBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealEstimatePost(body,securityContext);
    }
    @GET
    @Path("/info/{dealid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Deal Info", notes = "This endpoint returns the deal info for a deal", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealInfoDealidGet( @PathParam("dealid") Integer dealid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealInfoDealidGet(dealid,securityContext);
    }
    @GET
    @Path("/proposal/{propcid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Proposal", notes = "This endpoint returns the proposal for a deal", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealProposalPropcidGet( @PathParam("propcid") String propcid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealProposalPropcidGet(propcid,securityContext);
    }
    @GET
    @Path("/query/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealQueryMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealQueryMinerGet(miner,securityContext);
    }
    @GET
    @Path("/status-by-proposal/{propcid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Deal Status by PropCid", notes = "Get Deal Status by PropCid", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealStatusByProposalPropcidGet( @PathParam("propcid") String propcid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealStatusByProposalPropcidGet(propcid,securityContext);
    }
    @GET
    @Path("/status/{miner}/{propcid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deal Status", notes = "This endpoint returns the status of a deal", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealStatusMinerPropcidGet( @PathParam("miner") String miner, @PathParam("propcid") String propcid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealStatusMinerPropcidGet(miner,propcid,securityContext);
    }
    @GET
    @Path("/transfer/in-progress")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transfer In Progress", notes = "This endpoint returns the in-progress transfers", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealTransferInProgressGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealTransferInProgressGet(securityContext);
    }
    @POST
    @Path("/transfer/status")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealTransferStatusPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealTransferStatusPost(securityContext);
    }
}
