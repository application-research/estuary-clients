package io.swagger.api;

import java.io.File;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
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

@Path("/content")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-01-30T18:30:37.026Z[GMT]")
public class ContentApi {

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
    public Response contentAddCarPost(@Valid String body,  @QueryParam("ignore-dupes") 

 @Parameter(description = "Ignore Dupes")  String ignoreDupes
,  @QueryParam("filename") 

 @Parameter(description = "Filename")  String filename
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentAddIpfsPost(@Valid PinnerIpfsPin body,  @QueryParam("ignore-dupes") 

 @Parameter(description = "Ignore Dupes")  String ignoreDupes
,  @QueryParam("overwrite") 

 @Parameter(description = "Overwrite conflicting files in collections")  String overwrite
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentAddPost( @FormParam(value = "data") InputStream dataInputStream,
   @FormParam(value = "data") Attachment dataDetail,@FormParam(value = "filename")  String filename,  @QueryParam("coluuid") 

 @Parameter(description = "Collection UUID")  String coluuid
,  @QueryParam("replication") 

 @Parameter(description = "Replication value")  Integer replication
,  @QueryParam("ignore-dupes") 

 @Parameter(description = "Ignore Dupes true/false")  String ignoreDupes
,  @QueryParam("overwrite") 

 @Parameter(description = "Overwrite files with the same path on same collection")  String overwrite
,  @QueryParam("lazy-provide") 

 @Parameter(description = "Lazy Provide true/false")  String lazyProvide
,  @QueryParam("dir") 

 @Parameter(description = "Directory")  String dir
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentAggregatedContentGet( @PathParam("content")

 @Parameter(description = "Content ID") String content
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentAllDealsGet( @NotNull  @QueryParam("begin") 

 @Parameter(description = "Begin")  String begin
, @NotNull  @QueryParam("duration") 

 @Parameter(description = "Duration")  String duration
, @NotNull  @QueryParam("all") 

 @Parameter(description = "All")  String all
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentBwUsageContentGet( @PathParam("content")

 @Parameter(description = "Content ID") String content
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentContentsGet( @NotNull  @QueryParam("limit") 

 @Parameter(description = "limit")  String limit
, @NotNull  @QueryParam("offset") 

 @Parameter(description = "offset")  String offset
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentCreatePost(@Valid UtilContentCreateBody body,  @QueryParam("ignore-dupes") 

 @Parameter(description = "Ignore Dupes")  String ignoreDupes
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentDealsGet(  @QueryParam("limit") 

 @Parameter(description = "Limit")  Integer limit
,  @QueryParam("offset") 

 @Parameter(description = "Offset")  Integer offset
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentEnsureReplicationDatacidGet( @PathParam("datacid")

 @Parameter(description = "Data CID") String datacid
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentFailuresContentGet( @PathParam("content")

 @Parameter(description = "Content ID") String content
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentIdGet( @PathParam("id")

 @Parameter(description = "Content ID") Integer id
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentListGet() {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentStagingZonesGet() {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentStagingZonesStagingZoneContentsGet( @PathParam("staging_zone")

 @Parameter(description = "Staging Zone Content ID") Integer stagingZone
, @NotNull  @QueryParam("limit") 

 @Parameter(description = "limit")  String limit
, @NotNull  @QueryParam("offset") 

 @Parameter(description = "offset")  String offset
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentStagingZonesStagingZoneGet( @PathParam("staging_zone")

 @Parameter(description = "Staging Zone Content ID") Integer stagingZone
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentStatsGet( @NotNull  @QueryParam("limit") 

 @Parameter(description = "limit")  String limit
, @NotNull  @QueryParam("offset") 

 @Parameter(description = "offset")  String offset
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response contentStatusIdGet( @PathParam("id")

 @Parameter(description = "Content ID") Integer id
) {
        return Response.ok().entity("magic!").build();
    }}
