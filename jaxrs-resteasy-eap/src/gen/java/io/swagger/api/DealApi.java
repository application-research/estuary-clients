package io.swagger.api;

import io.swagger.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/deal")


@io.swagger.annotations.Api(description = "the deal API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-11-07T20:06:03.798Z")
public interface DealApi  {
   
    @POST
    @Path("/estimate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Estimate the cost of a deal", notes = "This endpoint estimates the cost of a deal", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealEstimatePost(@ApiParam(value = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true) MainEstimateDealBody body,@Context SecurityContext securityContext);
    @GET
    @Path("/info/{dealid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Deal Info", notes = "This endpoint returns the deal info for a deal", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealInfoDealidGet( @PathParam("dealid") Integer dealid,@Context SecurityContext securityContext);
    @GET
    @Path("/proposal/{propcid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Proposal", notes = "This endpoint returns the proposal for a deal", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealProposalPropcidGet( @PathParam("propcid") String propcid,@Context SecurityContext securityContext);
    @GET
    @Path("/query/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealQueryMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);
    @GET
    @Path("/status-by-proposal/{propcid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Deal Status by PropCid", notes = "Get Deal Status by PropCid", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealStatusByProposalPropcidGet( @PathParam("propcid") String propcid,@Context SecurityContext securityContext);
    @GET
    @Path("/status/{miner}/{propcid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deal Status", notes = "This endpoint returns the status of a deal", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealStatusMinerPropcidGet( @PathParam("miner") String miner, @PathParam("propcid") String propcid,@Context SecurityContext securityContext);
    @GET
    @Path("/transfer/in-progress")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transfer In Progress", notes = "This endpoint returns the in-progress transfers", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealTransferInProgressGet(@Context SecurityContext securityContext);
    @POST
    @Path("/transfer/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transfer Status", notes = "This endpoint returns the status of a transfer", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealTransferStatusPost(@ApiParam(value = "Channel ID" ,required=true) MainChannelIDParam chanid,@Context SecurityContext securityContext);
}
