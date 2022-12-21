package io.swagger.api;

import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
public interface MinerApi  {

    /**
     * Get Claim Miner Message
     *
     * This endpoint lets a user get the message in order to claim a miner
     *
     */
    @GET
    @Path("/miner/claim/{miner}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Miner Message", tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse minerClaimMinerGet(@PathParam("miner") String miner);

    /**
     * Claim Miner
     *
     * This endpoint lets a user claim a miner
     *
     */
    @POST
    @Path("/miner/claim")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Claim Miner", tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV1ClaimResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public GithubComApplicationResearchEstuaryApiV1ClaimResponse minerClaimPost(@Valid MinerClaimMinerBody body);

    /**
     * Set Miner Info
     *
     * This endpoint lets a user set miner info.
     *
     */
    @PUT
    @Path("/miner/set-info/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Set Miner Info", tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Map<String, String> minerSetInfoMinerPut(@Valid MinerMinerSetInfoParams body, @PathParam("miner") String miner);

    /**
     * Suspend Miner
     *
     * This endpoint lets a user suspend a miner.
     *
     */
    @POST
    @Path("/miner/suspend/{miner}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Suspend Miner", tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Map<String, String> minerSuspendMinerPost(@Valid MinerSuspendMinerBody body, @PathParam("miner") String miner);

    /**
     * Unuspend Miner
     *
     * This endpoint lets a user unsuspend a miner.
     *
     */
    @PUT
    @Path("/miner/unsuspend/{miner}")
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Miner", tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Map<String, String> minerUnsuspendMinerPut(@PathParam("miner") String miner);
}
