package io.swagger.api;

import java.io.File;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;
import io.swagger.api.ContentApiService;

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
@Path("/content")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-04T12:55:54.251Z[GMT]")
public class ContentApi  {

  @Context SecurityContext securityContext;

  @Inject ContentApiService delegate;


    @POST
    @Path("/add-car")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add Car object", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilContentAddResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentAddCarPost(
@Parameter(description = "Car" ,required=true) String body
,  
@Parameter(description = "Ignore Dupes")  @QueryParam("ignore-dupes") String ignoreDupes
,  
@Parameter(description = "Filename")  @QueryParam("filename") String filename
) {
        return delegate.contentAddCarPost(body, ignoreDupes, filename, securityContext);
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
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentAddIpfsPost(
@Parameter(description = "IPFS Body" ,required=true) TypesIpfsPin body
,  
@Parameter(description = "Ignore Dupes")  @QueryParam("ignore-dupes") String ignoreDupes
,  
@Parameter(description = "Overwrite conflicting files in collections")  @QueryParam("overwrite") String overwrite
) {
        return delegate.contentAddIpfsPost(body, ignoreDupes, overwrite, securityContext);
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
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentAddPost( @Multipart(value = "data") InputStream dataInputStream, @Multipart(value = "data" ) Attachment dataDetail, @Multipart(value = "filename")  String filename,  
@Parameter(description = "Collection UUID")  @QueryParam("coluuid") String coluuid
,  
@Parameter(description = "Replication value")  @QueryParam("replication") Integer replication
,  
@Parameter(description = "Ignore Dupes true/false")  @QueryParam("ignore-dupes") String ignoreDupes
,  
@Parameter(description = "Overwrite files with the same path on same collection")  @QueryParam("overwrite") String overwrite
,  
@Parameter(description = "Lazy Provide true/false")  @QueryParam("lazy-provide") String lazyProvide
,  
@Parameter(description = "Directory")  @QueryParam("dir") String dir
) {
        return delegate.contentAddPost(dataInputStream, dataDetail, filename, coluuid, replication, ignoreDupes, overwrite, lazyProvide, dir, securityContext);
    }

    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get aggregated content stats", description = "This endpoint returns aggregated content stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentAggregatedContentGet(
@Parameter(description = "Content ID",required=true) @PathParam("content") String content
) {
        return delegate.contentAggregatedContentGet(content, securityContext);
    }

    @GET
    @Path("/all-deals")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all deals for a user", description = "This endpoint is used to get all deals for a user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentAllDealsGet( @NotNull 
@Parameter(description = "Begin",required=true)  @QueryParam("begin") String begin
,  @NotNull 
@Parameter(description = "Duration",required=true)  @QueryParam("duration") String duration
,  @NotNull 
@Parameter(description = "All",required=true)  @QueryParam("all") String all
) {
        return delegate.contentAllDealsGet(begin, duration, all, securityContext);
    }

    @GET
    @Path("/bw-usage/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get content bandwidth", description = "This endpoint returns content bandwidth", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentBwUsageContentGet(
@Parameter(description = "Content ID",required=true) @PathParam("content") String content
) {
        return delegate.contentBwUsageContentGet(content, securityContext);
    }

    @GET
    @Path("/contents")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get user contents", description = "This endpoint is used to get user contents", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentContentsGet( @NotNull 
@Parameter(description = "limit",required=true)  @QueryParam("limit") String limit
,  @NotNull 
@Parameter(description = "offset",required=true)  @QueryParam("offset") String offset
) {
        return delegate.contentContentsGet(limit, offset, securityContext);
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
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentCreatePost(
@Parameter(description = "Content" ,required=true) UtilContentCreateBody body
,  
@Parameter(description = "Ignore Dupes")  @QueryParam("ignore-dupes") String ignoreDupes
) {
        return delegate.contentCreatePost(body, ignoreDupes, securityContext);
    }

    @GET
    @Path("/deals")
    
    @Produces({ "application/json" })
    @Operation(summary = "Content with deals", description = "This endpoint lists all content with deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentDealsGet( 
@Parameter(description = "Limit")  @QueryParam("limit") Integer limit
,  
@Parameter(description = "Offset")  @QueryParam("offset") Integer offset
) {
        return delegate.contentDealsGet(limit, offset, securityContext);
    }

    @GET
    @Path("/ensure-replication/{datacid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Ensure Replication", description = "This endpoint ensures that the content is replicated to the specified number of providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentEnsureReplicationDatacidGet(
@Parameter(description = "Data CID",required=true) @PathParam("datacid") String datacid
) {
        return delegate.contentEnsureReplicationDatacidGet(datacid, securityContext);
    }

    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all failures for a content", description = "This endpoint returns all failures for a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentFailuresContentGet(
@Parameter(description = "Content ID",required=true) @PathParam("content") String content
) {
        return delegate.contentFailuresContentGet(content, securityContext);
    }

    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Content", description = "This endpoint returns a content by its ID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentIdGet(
@Parameter(description = "Content ID",required=true) @PathParam("id") Integer id
) {
        return delegate.contentIdGet(id, securityContext);
    }

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pinned content", description = "This endpoint lists all content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentListGet() {
        return delegate.contentListGet(securityContext);
    }

    @GET
    @Path("/staging-zones")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get staging zone for user, excluding its contents", description = "This endpoint is used to get staging zone for user, excluding its contents.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentStagingZonesGet() {
        return delegate.contentStagingZonesGet(securityContext);
    }

    @GET
    @Path("/staging-zones/{staging_zone}/contents")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get contents for a staging zone", description = "This endpoint is used to get the contents for a staging zone", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentStagingZonesStagingZoneContentsGet(
@Parameter(description = "Staging Zone Content ID",required=true) @PathParam("staging_zone") Integer stagingZone
,  @NotNull 
@Parameter(description = "limit",required=true)  @QueryParam("limit") String limit
,  @NotNull 
@Parameter(description = "offset",required=true)  @QueryParam("offset") String offset
) {
        return delegate.contentStagingZonesStagingZoneContentsGet(stagingZone, limit, offset, securityContext);
    }

    @GET
    @Path("/staging-zones/{staging_zone}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get staging zone without its contents field populated", description = "This endpoint is used to get a staging zone, excluding its contents.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentStagingZonesStagingZoneGet(
@Parameter(description = "Staging Zone Content ID",required=true) @PathParam("staging_zone") Integer stagingZone
) {
        return delegate.contentStagingZonesStagingZoneGet(stagingZone, securityContext);
    }

    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get content statistics", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentStatsGet( @NotNull 
@Parameter(description = "limit",required=true)  @QueryParam("limit") String limit
,  @NotNull 
@Parameter(description = "offset",required=true)  @QueryParam("offset") String offset
) {
        return delegate.contentStatsGet(limit, offset, securityContext);
    }

    @GET
    @Path("/status/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Content Status", description = "This endpoint returns the status of a content", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response contentStatusIdGet(
@Parameter(description = "Content ID",required=true) @PathParam("id") Integer id
) {
        return delegate.contentStatusIdGet(id, securityContext);
    }
}
