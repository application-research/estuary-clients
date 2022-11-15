package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DealApiService;
import io.swagger.api.factories.DealApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/deal")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-15T21:05:26.107Z[GMT]")public class DealApi  {
   private final DealApiService delegate;

   public DealApi(@Context ServletConfig servletContext) {
      DealApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DealApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DealApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DealApiServiceFactory.getDealApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/estimate")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Estimate the cost of a deal", description = "This endpoint estimates the cost of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealEstimatePost(@Parameter(in = ParameterIn.DEFAULT, description = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks" ,required=true) MainEstimateDealBody body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealEstimatePost(body,securityContext);
    }
    @GET
    @Path("/info/{dealid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Deal Info", description = "This endpoint returns the deal info for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealInfoDealidGet(@Parameter(in = ParameterIn.PATH, description = "Deal ID",required=true) @PathParam("dealid") Integer dealid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealInfoDealidGet(dealid,securityContext);
    }
    @GET
    @Path("/proposal/{propcid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Proposal", description = "This endpoint returns the proposal for a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealProposalPropcidGet(@Parameter(in = ParameterIn.PATH, description = "Proposal CID",required=true) @PathParam("propcid") String propcid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealProposalPropcidGet(propcid,securityContext);
    }
    @GET
    @Path("/query/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealQueryMinerGet(@Parameter(in = ParameterIn.PATH, description = "CID",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealQueryMinerGet(miner,securityContext);
    }
    @GET
    @Path("/status-by-proposal/{propcid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Deal Status by PropCid", description = "Get Deal Status by PropCid", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealStatusByProposalPropcidGet(@Parameter(in = ParameterIn.PATH, description = "PropCid",required=true) @PathParam("propcid") String propcid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealStatusByProposalPropcidGet(propcid,securityContext);
    }
    @GET
    @Path("/status/{miner}/{propcid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Deal Status", description = "This endpoint returns the status of a deal", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealStatusMinerPropcidGet(@Parameter(in = ParameterIn.PATH, description = "Miner",required=true) @PathParam("miner") String miner
,@Parameter(in = ParameterIn.PATH, description = "Proposal CID",required=true) @PathParam("propcid") String propcid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealStatusMinerPropcidGet(miner,propcid,securityContext);
    }
    @GET
    @Path("/transfer/in-progress")
    
    @Produces({ "application/json" })
    @Operation(summary = "Transfer In Progress", description = "This endpoint returns the in-progress transfers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealTransferInProgressGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealTransferInProgressGet(securityContext);
    }
    @POST
    @Path("/transfer/status")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Transfer Status", description = "This endpoint returns the status of a transfer", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response dealTransferStatusPost(@Parameter(in = ParameterIn.DEFAULT, description = "Channel ID" ,required=true) MainChannelIDParam body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dealTransferStatusPost(body,securityContext);
    }
}
