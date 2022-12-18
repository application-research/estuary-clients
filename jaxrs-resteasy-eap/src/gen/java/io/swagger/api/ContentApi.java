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

import java.io.File;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
@Path("/content")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-18T07:30:24.278Z[GMT]")public interface ContentApi  {
   
    @POST
    @Path("/add-car")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add Car object", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentAddCarPost(@Parameter(description = "Car" ,required=true) String body, @QueryParam("ignore-dupes") String ignoreDupes, @QueryParam("filename") String filename,@Context SecurityContext securityContext);

    @POST
    @Path("/add-ipfs")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add IPFS object", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentAddIpfsPost(@Parameter(description = "IPFS Body" ,required=true) TypesIpfsPin body, @QueryParam("ignore-dupes") String ignoreDupes,@Context SecurityContext securityContext);

    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "Add new content", description = "This endpoint is used to upload new content.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentAddPost(MultipartFormDataInput input, @QueryParam("coluuid") String coluuid, @QueryParam("replication") Integer replication, @QueryParam("ignore-dupes") String ignoreDupes, @QueryParam("lazy-provide") String lazyProvide, @QueryParam("dir") String dir,@Context SecurityContext securityContext);

    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", description = "This endpoint returns aggregated content stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentAggregatedContentGet( @PathParam("content") String content,@Context SecurityContext securityContext);

    @GET
    @Path("/all-deals")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all deals for a user", description = "This endpoint is used to get all deals for a user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentAllDealsGet( @NotNull @QueryParam("begin") String begin, @NotNull @QueryParam("duration") String duration, @NotNull @QueryParam("all") String all,@Context SecurityContext securityContext);

    @GET
    @Path("/bw-usage/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get content bandwidth", description = "This endpoint returns content bandwidth", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentBwUsageContentGet( @PathParam("content") String content,@Context SecurityContext securityContext);

    @GET
    @Path("/contents")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get user contents", description = "This endpoint is used to get user contents", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentContentsGet( @NotNull @QueryParam("limit") String limit, @NotNull @QueryParam("offset") String offset,@Context SecurityContext securityContext);

    @POST
    @Path("/create")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new content", description = "This endpoint adds a new content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentCreatePost(@Parameter(description = "Content" ,required=true) UtilContentCreateBody body, @QueryParam("ignore-dupes") String ignoreDupes,@Context SecurityContext securityContext);

    @GET
    @Path("/deals")
    
    @Produces({ "application/json" })
    @Operation(summary = "Content with deals", description = "This endpoint lists all content with deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentDealsGet( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext);

    @GET
    @Path("/ensure-replication/{datacid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Ensure Replication", description = "This endpoint ensures that the content is replicated to the specified number of providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentEnsureReplicationDatacidGet( @PathParam("datacid") String datacid,@Context SecurityContext securityContext);

    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", description = "This endpoint returns all failures for a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentFailuresContentGet( @PathParam("content") String content,@Context SecurityContext securityContext);

    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Content", description = "This endpoint returns a content by its ID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentIdGet( @PathParam("id") Integer id,@Context SecurityContext securityContext);

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", description = "This endpoint lists all content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentListGet(@Context SecurityContext securityContext);

    @GET
    @Path("/staging-zones")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get staging zone for user, excluding its contents", description = "This endpoint is used to get staging zone for user, excluding its contents.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentStagingZonesGet(@Context SecurityContext securityContext);

    @GET
    @Path("/staging-zones/{staging_zone}/contents")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get contents for a staging zone", description = "This endpoint is used to get the contents for a staging zone", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentStagingZonesStagingZoneContentsGet( @PathParam("staging_zone") Integer stagingZone, @NotNull @QueryParam("limit") String limit, @NotNull @QueryParam("offset") String offset,@Context SecurityContext securityContext);

    @GET
    @Path("/staging-zones/{staging_zone}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get staging zone without its contents field populated", description = "This endpoint is used to get a staging zone, excluding its contents.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentStagingZonesStagingZoneGet( @PathParam("staging_zone") Integer stagingZone,@Context SecurityContext securityContext);

    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get content statistics", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentStatsGet( @NotNull @QueryParam("limit") String limit, @NotNull @QueryParam("offset") String offset,@Context SecurityContext securityContext);

    @GET
    @Path("/status/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Content Status", description = "This endpoint returns the status of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response contentStatusIdGet( @PathParam("id") Integer id,@Context SecurityContext securityContext);

}
