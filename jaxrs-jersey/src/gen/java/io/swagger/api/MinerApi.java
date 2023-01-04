package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MinerApiService;
import io.swagger.api.factories.MinerApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
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


@Path("/miner")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-04T12:55:53.153Z[GMT]")public class MinerApi  {
   private final MinerApiService delegate;

   public MinerApi(@Context ServletConfig servletContext) {
      MinerApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MinerApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MinerApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MinerApiServiceFactory.getMinerApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/claim/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Miner Message", description = "This endpoint lets a user get the message in order to claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClaimMsgResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response minerClaimMinerGet(@Parameter(in = ParameterIn.PATH, description = "Miner claim message",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.minerClaimMinerGet(miner,securityContext);
    }
    @POST
    @Path("/claim")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Claim Miner", description = "This endpoint lets a user claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClaimResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response minerClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Miner Body" ,required=true) MinerClaimMinerBody body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.minerClaimPost(body,securityContext);
    }
    @PUT
    @Path("/set-info/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Set Miner Info", description = "This endpoint lets a user set miner info.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response minerSetInfoMinerPut(@Parameter(in = ParameterIn.DEFAULT, description = "Miner set info params" ,required=true) MinerMinerSetInfoParams body

,@Parameter(in = ParameterIn.PATH, description = "Miner to set info for",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.minerSetInfoMinerPut(body,miner,securityContext);
    }
    @POST
    @Path("/suspend/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Suspend Miner", description = "This endpoint lets a user suspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response minerSuspendMinerPost(@Parameter(in = ParameterIn.DEFAULT, description = "Suspend Miner Body" ,required=true) MinerSuspendMinerBody body

,@Parameter(in = ParameterIn.PATH, description = "Miner to suspend",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.minerSuspendMinerPost(body,miner,securityContext);
    }
    @PUT
    @Path("/unsuspend/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Miner", description = "This endpoint lets a user unsuspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response minerUnsuspendMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to unsuspend",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.minerUnsuspendMinerPut(miner,securityContext);
    }
}
