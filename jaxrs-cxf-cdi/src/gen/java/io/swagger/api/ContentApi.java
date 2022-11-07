package io.swagger.api;

import java.io.File;
import java.io.InputStream;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
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

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/content")
@RequestScoped

@Api(description = "the content API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class ContentApi  {

  @Context SecurityContext securityContext;

  @Inject ContentApiService delegate;


    @POST
    @Path("/add-car")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Car object", notes = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentAddCarPost(@ApiParam(value = "Car" ,required=true) String body,  @ApiParam(value = "Ignore Dupes")  @QueryParam("ignore-dupes") String ignoreDupes,  @ApiParam(value = "Filename")  @QueryParam("filename") String filename) {
        return delegate.contentAddCarPost(body, ignoreDupes, filename, securityContext);
    }

    @POST
    @Path("/add-ipfs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add IPFS object", notes = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentAddIpfsPost(@ApiParam(value = "IPFS Body" ,required=true) UtilContentAddIpfsBody body,  @ApiParam(value = "Ignore Dupes")  @QueryParam("ignore-dupes") String ignoreDupes) {
        return delegate.contentAddIpfsPost(body, ignoreDupes, securityContext);
    }

    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add new content", notes = "This endpoint is used to upload new content.", response = UtilContentAddResponse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UtilContentAddResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentAddPost( @Multipart(value = "data") InputStream dataInputStream, @Multipart(value = "data" ) Attachment dataDetail, @Multipart(value = "filename", required = false)  String filename,  @ApiParam(value = "Collection UUID")  @QueryParam("coluuid") String coluuid,  @ApiParam(value = "Replication value")  @QueryParam("replication") Integer replication,  @ApiParam(value = "Ignore Dupes true/false")  @QueryParam("ignore-dupes") String ignoreDupes,  @ApiParam(value = "Lazy Provide true/false")  @QueryParam("lazy-provide") String lazyProvide,  @ApiParam(value = "Directory")  @QueryParam("dir") String dir) {
        return delegate.contentAddPost(dataInputStream, dataDetail, filename, coluuid, replication, ignoreDupes, lazyProvide, dir, securityContext);
    }

    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get aggregated content stats", notes = "This endpoint returns aggregated content stats", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentAggregatedContentGet(@ApiParam(value = "Content ID",required=true) @PathParam("content") String content) {
        return delegate.contentAggregatedContentGet(content, securityContext);
    }

    @GET
    @Path("/all-deals")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all deals for a user", notes = "This endpoint is used to get all deals for a user", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentAllDealsGet( @NotNull @ApiParam(value = "Begin",required=true)  @QueryParam("begin") String begin,  @NotNull @ApiParam(value = "Duration",required=true)  @QueryParam("duration") String duration,  @NotNull @ApiParam(value = "All",required=true)  @QueryParam("all") String all) {
        return delegate.contentAllDealsGet(begin, duration, all, securityContext);
    }

    @GET
    @Path("/bw-usage/{content}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content bandwidth", notes = "This endpoint returns content bandwidth", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentBwUsageContentGet(@ApiParam(value = "Content ID",required=true) @PathParam("content") String content) {
        return delegate.contentBwUsageContentGet(content, securityContext);
    }

    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new content", notes = "This endpoint adds a new content", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentCreatePost(@ApiParam(value = "Content" ,required=true) UtilContentCreateBody req,  @ApiParam(value = "Ignore Dupes")  @QueryParam("ignore-dupes") String ignoreDupes) {
        return delegate.contentCreatePost(req, ignoreDupes, securityContext);
    }

    @GET
    @Path("/deals")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Content with deals", notes = "This endpoint lists all content with deals", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentDealsGet( @ApiParam(value = "Limit")  @QueryParam("limit") Integer limit,  @ApiParam(value = "Offset")  @QueryParam("offset") Integer offset) {
        return delegate.contentDealsGet(limit, offset, securityContext);
    }

    @GET
    @Path("/ensure-replication/{datacid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Ensure Replication", notes = "This endpoint ensures that the content is replicated to the specified number of providers", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentEnsureReplicationDatacidGet(@ApiParam(value = "Data CID",required=true) @PathParam("datacid") String datacid) {
        return delegate.contentEnsureReplicationDatacidGet(datacid, securityContext);
    }

    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List all failures for a content", notes = "This endpoint returns all failures for a content", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentFailuresContentGet(@ApiParam(value = "Content ID",required=true) @PathParam("content") String content) {
        return delegate.contentFailuresContentGet(content, securityContext);
    }

    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Content", notes = "This endpoint returns a content by its ID", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentIdGet(@ApiParam(value = "Content ID",required=true) @PathParam("id") Integer id) {
        return delegate.contentIdGet(id, securityContext);
    }

    @POST
    @Path("/importdeal")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Import a deal", notes = "This endpoint imports a deal into the shuttle.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentImportdealPost(@ApiParam(value = "Import a deal" ,required=true) MainImportDealBody body) {
        return delegate.contentImportdealPost(body, securityContext);
    }

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pinned content", notes = "This endpoint lists all content", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentListGet() {
        return delegate.contentListGet(securityContext);
    }

    @GET
    @Path("/read/{cont}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Read content", notes = "This endpoint reads content from the blockstore", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentReadContGet(@ApiParam(value = "CID",required=true) @PathParam("cont") String cont) {
        return delegate.contentReadContGet(cont, securityContext);
    }

    @GET
    @Path("/staging-zones")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get staging zone for user", notes = "This endpoint is used to get staging zone for user.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentStagingZonesGet() {
        return delegate.contentStagingZonesGet(securityContext);
    }

    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content statistics", notes = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentStatsGet( @NotNull @ApiParam(value = "limit",required=true)  @QueryParam("limit") String limit,  @NotNull @ApiParam(value = "offset",required=true)  @QueryParam("offset") String offset) {
        return delegate.contentStatsGet(limit, offset, securityContext);
    }

    @GET
    @Path("/status/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Content Status", notes = "This endpoint returns the status of a content", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response contentStatusIdGet(@ApiParam(value = "Content ID",required=true) @PathParam("id") Integer id) {
        return delegate.contentStatusIdGet(id, securityContext);
    }
}
