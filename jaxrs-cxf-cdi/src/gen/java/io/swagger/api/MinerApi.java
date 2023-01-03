package io.swagger.api;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;
import io.swagger.api.MinerApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/miner")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-03T16:17:33.393Z[GMT]")
public class MinerApi  {

  @Context SecurityContext securityContext;

  @Inject MinerApiService delegate;


    @GET
    @Path("/claim/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Miner Message", description = "This endpoint lets a user get the message in order to claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClaimMsgResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response minerClaimMinerGet(
@Parameter(description = "Miner claim message",required=true) @PathParam("miner") String miner
) {
        return delegate.minerClaimMinerGet(miner, securityContext);
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
    public Response minerClaimPost(
@Parameter(description = "Claim Miner Body" ,required=true) MinerClaimMinerBody body
) {
        return delegate.minerClaimPost(body, securityContext);
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
    public Response minerSetInfoMinerPut(
@Parameter(description = "Miner set info params" ,required=true) MinerMinerSetInfoParams body
, 
@Parameter(description = "Miner to set info for",required=true) @PathParam("miner") String miner
) {
        return delegate.minerSetInfoMinerPut(body, miner, securityContext);
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
    public Response minerSuspendMinerPost(
@Parameter(description = "Suspend Miner Body" ,required=true) MinerSuspendMinerBody body
, 
@Parameter(description = "Miner to suspend",required=true) @PathParam("miner") String miner
) {
        return delegate.minerSuspendMinerPost(body, miner, securityContext);
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
    public Response minerUnsuspendMinerPut(
@Parameter(description = "Miner to unsuspend",required=true) @PathParam("miner") String miner
) {
        return delegate.minerUnsuspendMinerPut(miner, securityContext);
    }
}
