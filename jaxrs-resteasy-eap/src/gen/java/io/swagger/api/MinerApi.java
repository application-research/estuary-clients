package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/miner")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-21T01:22:11.593Z[GMT]")public interface MinerApi  {
   
    @GET
    @Path("/claim/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Miner Message", description = "This endpoint lets a user get the message in order to claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response minerClaimMinerGet( @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @POST
    @Path("/claim")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Claim Miner", description = "This endpoint lets a user claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV1ClaimResponse.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response minerClaimPost(@Parameter(description = "Claim Miner Body" ,required=true) MinerClaimMinerBody body,@Context SecurityContext securityContext);

    @PUT
    @Path("/set-info/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Set Miner Info", description = "This endpoint lets a user set miner info.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response minerSetInfoMinerPut(@Parameter(description = "Miner set info params" ,required=true) MinerMinerSetInfoParams body, @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @POST
    @Path("/suspend/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Suspend Miner", description = "This endpoint lets a user suspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response minerSuspendMinerPost(@Parameter(description = "Suspend Miner Body" ,required=true) MinerSuspendMinerBody body, @PathParam("miner") String miner,@Context SecurityContext securityContext);

    @PUT
    @Path("/unsuspend/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Miner", description = "This endpoint lets a user unsuspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response minerUnsuspendMinerPut( @PathParam("miner") String miner,@Context SecurityContext securityContext);

}
