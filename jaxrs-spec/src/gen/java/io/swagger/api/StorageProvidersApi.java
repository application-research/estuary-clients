package io.swagger.api;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
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

@Path("/storage-providers")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-12-21T01:22:11.666Z[GMT]")
public class StorageProvidersApi {

    @POST
    @Path("/claim")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Claim Storage Provider", description = "This endpoint lets a user claim a storage provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersClaimPost(@Valid MinerClaimMinerBody body) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/claim/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Storage Provider", description = "This endpoint lets a user get the message in order to claim a storage provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersClaimSpGet( @PathParam("sp")

 @Parameter(description = "Storage Provider claim message") String sp
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/deals/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers deals", description = "This endpoint returns all storage providers deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersDealsSpGet( @PathParam("sp")

 @Parameter(description = "Filter by storage provider") String sp
,  @QueryParam("ignore-failed") 

 @Parameter(description = "Ignore Failed")  String ignoreFailed
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/failures/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers", description = "This endpoint returns all storage providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersFailuresSpGet( @PathParam("sp")

 @Parameter(description = "Filter by storage provider") String sp
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers", description = "This endpoint returns all storage providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ApiStorageProviderResp.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersGet() {
        return Response.ok().entity("magic!").build();
    }
    @PUT
    @Path("/set-info/{sp}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Set Storage Provider Info", description = "This endpoint lets a user set storage provider info.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersSetInfoSpPut(@Valid MinerMinerSetInfoParams body, @PathParam("sp")

 @Parameter(description = "Storage Provider to set info for") String sp
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/stats/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Get storage provider stats", description = "This endpoint returns storage provider stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersStatsSpGet( @PathParam("sp")

 @Parameter(description = "Filter by storage provider") String sp
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/storage/query/{cid}")
    @Produces({ "application/json" })
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersStorageQueryCidGet( @PathParam("cid")

 @Parameter(description = "CID") String cid
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/suspend/{sp}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Suspend Storage Provider", description = "This endpoint lets a user suspend a storage provider.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersSuspendSpPost(@Valid MinerSuspendMinerBody body, @PathParam("sp")

 @Parameter(description = "Storage Provider to suspend") String sp
) {
        return Response.ok().entity("magic!").build();
    }
    @PUT
    @Path("/unsuspend/{sp}")
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Storage Provider", description = "This endpoint lets a user unsuspend a Storage Provider.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
    })
    public Response storageProvidersUnsuspendSpPut( @PathParam("sp")

 @Parameter(description = "Storage Provider to unsuspend") String sp
) {
        return Response.ok().entity("magic!").build();
    }}
