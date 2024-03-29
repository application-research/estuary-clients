package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ContentApiService;
import io.swagger.api.factories.ContentApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.io.File;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
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


@Path("/content")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-02-02T18:38:37.222Z[GMT]")public class ContentApi  {
   private final ContentApiService delegate;

   public ContentApi(@Context ServletConfig servletContext) {
      ContentApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ContentApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ContentApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ContentApiServiceFactory.getContentApi();
      }

      this.delegate = delegate;
   }

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
    public Response contentAddCarPost(@Parameter(in = ParameterIn.DEFAULT, description = "Car" ,required=true) String body

,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes") @QueryParam("ignore-dupes") String ignoreDupes
,@Parameter(in = ParameterIn.QUERY, description = "Filename") @QueryParam("filename") String filename
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAddCarPost(body,ignoreDupes,filename,securityContext);
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
    public Response contentAddIpfsPost(@Parameter(in = ParameterIn.DEFAULT, description = "IPFS Body" ,required=true) PinnerIpfsPin body

,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes") @QueryParam("ignore-dupes") String ignoreDupes
,@Parameter(in = ParameterIn.QUERY, description = "Overwrite conflicting files in collections") @QueryParam("overwrite") String overwrite
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAddIpfsPost(body,ignoreDupes,overwrite,securityContext);
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
    public Response contentAddPost(@FormDataParam("data") InputStream dataInputStream,
            @FormDataParam("data") FormDataContentDisposition dataDetail
,@Parameter(description = "", required=true)  @FormParam("filename")  String filename
,@Parameter(in = ParameterIn.QUERY, description = "Collection UUID") @QueryParam("coluuid") String coluuid
,@Parameter(in = ParameterIn.QUERY, description = "Replication value") @QueryParam("replication") Integer replication
,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes true/false") @QueryParam("ignore-dupes") String ignoreDupes
,@Parameter(in = ParameterIn.QUERY, description = "Overwrite files with the same path on same collection") @QueryParam("overwrite") String overwrite
,@Parameter(in = ParameterIn.QUERY, description = "Lazy Provide true/false") @QueryParam("lazy-provide") String lazyProvide
,@Parameter(in = ParameterIn.QUERY, description = "Directory") @QueryParam("dir") String dir
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAddPost(data,filename,coluuid,replication,ignoreDupes,overwrite,lazyProvide,dir,securityContext);
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
    public Response contentAggregatedContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("content") String content
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAggregatedContentGet(content,securityContext);
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
    public Response contentAllDealsGet(@Parameter(in = ParameterIn.QUERY, description = "Begin",required=true) @QueryParam("begin") String begin
,@Parameter(in = ParameterIn.QUERY, description = "Duration",required=true) @QueryParam("duration") String duration
,@Parameter(in = ParameterIn.QUERY, description = "All",required=true) @QueryParam("all") String all
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentAllDealsGet(begin,duration,all,securityContext);
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
    public Response contentBwUsageContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("content") String content
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentBwUsageContentGet(content,securityContext);
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
    public Response contentContentsGet(@Parameter(in = ParameterIn.QUERY, description = "limit",required=true) @QueryParam("limit") String limit
,@Parameter(in = ParameterIn.QUERY, description = "offset",required=true) @QueryParam("offset") String offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentContentsGet(limit,offset,securityContext);
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
    public Response contentCreatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Content" ,required=true) UtilContentCreateBody body

,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes") @QueryParam("ignore-dupes") String ignoreDupes
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentCreatePost(body,ignoreDupes,securityContext);
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
    public Response contentDealsGet(@Parameter(in = ParameterIn.QUERY, description = "Limit") @QueryParam("limit") Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "Offset") @QueryParam("offset") Integer offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentDealsGet(limit,offset,securityContext);
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
    public Response contentEnsureReplicationDatacidGet(@Parameter(in = ParameterIn.PATH, description = "Data CID",required=true) @PathParam("datacid") String datacid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentEnsureReplicationDatacidGet(datacid,securityContext);
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
    public Response contentFailuresContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("content") String content
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentFailuresContentGet(content,securityContext);
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
    public Response contentIdGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentIdGet(id,securityContext);
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
    public Response contentListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
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
    public Response contentStagingZonesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
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
    public Response contentStagingZonesStagingZoneContentsGet(@Parameter(in = ParameterIn.PATH, description = "Staging Zone Content ID",required=true) @PathParam("staging_zone") Integer stagingZone
,@Parameter(in = ParameterIn.QUERY, description = "limit",required=true) @QueryParam("limit") String limit
,@Parameter(in = ParameterIn.QUERY, description = "offset",required=true) @QueryParam("offset") String offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStagingZonesStagingZoneContentsGet(stagingZone,limit,offset,securityContext);
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
    public Response contentStagingZonesStagingZoneGet(@Parameter(in = ParameterIn.PATH, description = "Staging Zone Content ID",required=true) @PathParam("staging_zone") Integer stagingZone
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStagingZonesStagingZoneGet(stagingZone,securityContext);
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
    public Response contentStatsGet(@Parameter(in = ParameterIn.QUERY, description = "limit",required=true) @QueryParam("limit") String limit
,@Parameter(in = ParameterIn.QUERY, description = "offset",required=true) @QueryParam("offset") String offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStatsGet(limit,offset,securityContext);
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
    public Response contentStatusIdGet(@Parameter(in = ParameterIn.PATH, description = "Content ID",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contentStatusIdGet(id,securityContext);
    }
}
