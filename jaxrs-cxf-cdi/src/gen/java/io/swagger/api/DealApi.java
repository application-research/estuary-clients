package io.swagger.api;

import io.swagger.model.MainEstimateDealBody;
import io.swagger.api.DealApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/deal")
@RequestScoped

@Api(description = "the deal API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-10-25T22:24:54.497Z")

public class DealApi  {

  @Context SecurityContext securityContext;

  @Inject DealApiService delegate;


    @POST
    @Path("/estimate")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Estimate the cost of a deal", notes = "This endpoint estimates the cost of a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealEstimatePost(@ApiParam(value = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true) MainEstimateDealBody body) {
        return delegate.dealEstimatePost(body, securityContext);
    }

    @GET
    @Path("/info/{dealid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Info", notes = "This endpoint returns the deal info for a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealInfoDealidGet(@ApiParam(value = "Deal ID",required=true) @PathParam("dealid") Integer dealid) {
        return delegate.dealInfoDealidGet(dealid, securityContext);
    }

    @GET
    @Path("/proposal/{propcid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Proposal", notes = "This endpoint returns the proposal for a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealProposalPropcidGet(@ApiParam(value = "Proposal CID",required=true) @PathParam("propcid") String propcid) {
        return delegate.dealProposalPropcidGet(propcid, securityContext);
    }

    @GET
    @Path("/query/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealQueryMinerGet(@ApiParam(value = "CID",required=true) @PathParam("miner") String miner) {
        return delegate.dealQueryMinerGet(miner, securityContext);
    }

    @GET
    @Path("/status-by-proposal/{propcid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status by PropCid", notes = "Get Deal Status by PropCid", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealStatusByProposalPropcidGet(@ApiParam(value = "PropCid",required=true) @PathParam("propcid") String propcid) {
        return delegate.dealStatusByProposalPropcidGet(propcid, securityContext);
    }

    @GET
    @Path("/status/{miner}/{propcid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Deal Status", notes = "This endpoint returns the status of a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealStatusMinerPropcidGet(@ApiParam(value = "Miner",required=true) @PathParam("miner") String miner, @ApiParam(value = "Proposal CID",required=true) @PathParam("propcid") String propcid) {
        return delegate.dealStatusMinerPropcidGet(miner, propcid, securityContext);
    }

    @GET
    @Path("/transfer/in-progress")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Transfer In Progress", notes = "This endpoint returns the in-progress transfers", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealTransferInProgressGet() {
        return delegate.dealTransferInProgressGet(securityContext);
    }

    @POST
    @Path("/transfer/status")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={  })
    @ApiResponses(value = {  })
    public Response dealTransferStatusPost() {
        return delegate.dealTransferStatusPost(securityContext);
    }
}
