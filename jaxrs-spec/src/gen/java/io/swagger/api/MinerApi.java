package io.swagger.api;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/miner")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-12-14T06:22:41.298Z[GMT]")
public class MinerApi {

    @GET
    @Path("/claim/{miner}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Miner Message", description = "This endpoint lets a user get the message in order to claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClaimMsgResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response minerClaimMinerGet( @PathParam("miner")

 @Parameter(description = "Miner claim message") String miner
) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response minerClaimPost(@Valid MinerClaimMinerBody body) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response minerSetInfoMinerPut(@Valid MinerMinerSetInfoParams body, @PathParam("miner")

 @Parameter(description = "Miner to set info for") String miner
) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response minerSuspendMinerPost(@Valid MinerSuspendMinerBody body, @PathParam("miner")

 @Parameter(description = "Miner to suspend") String miner
) {
        return Response.ok().entity("magic!").build();
    }
    @PUT
    @Path("/unsuspend/{miner}")
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Miner", description = "This endpoint lets a user unsuspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response minerUnsuspendMinerPut( @PathParam("miner")

 @Parameter(description = "Miner to unsuspend") String miner
) {
        return Response.ok().entity("magic!").build();
    }}
