package io.swagger.api;

import java.io.File;
import java.io.InputStream;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
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


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-10-07T23:21:55.508Z")

public class ContentApi  {

  @Context SecurityContext securityContext;

  @Inject ContentApiService delegate;


    @POST
    @Path("/add-car")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add Car object", notes = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentAddCarPost(@ApiParam(value = "Car" ,required=true) String body,  @ApiParam(value = "Filename")  @QueryParam("filename") String filename,  @ApiParam(value = "Commp")  @QueryParam("commp") String commp,  @ApiParam(value = "Size")  @QueryParam("size") String size) {
        return delegate.contentAddCarPost(body, filename, commp, size, securityContext);
    }

    @POST
    @Path("/add-ipfs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add IPFS object", notes = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentAddIpfsPost(@ApiParam(value = "IPFS Body" ,required=true) UtilContentAddIpfsBody body) {
        return delegate.contentAddIpfsPost(body, securityContext);
    }

    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add new content", notes = "This endpoint is used to upload new content.", response = UtilContentAddResponse.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UtilContentAddResponse.class) })
    public Response contentAddPost( @Multipart(value = "file") InputStream fileInputStream, @Multipart(value = "file" ) Attachment fileDetail, @ApiParam(value = "Collection UUID",required=true) @PathParam("coluuid") String coluuid, @ApiParam(value = "Directory",required=true) @PathParam("dir") String dir) {
        return delegate.contentAddPost(fileInputStream, fileDetail, coluuid, dir, securityContext);
    }

    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get aggregated content stats", notes = "This endpoint returns aggregated content stats", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response contentAggregatedContentGet(@ApiParam(value = "Content ID",required=true) @PathParam("content") String content) {
        return delegate.contentAggregatedContentGet(content, securityContext);
    }

    @GET
    @Path("/all-deals")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all deals for a user", notes = "This endpoint is used to get all deals for a user", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentAllDealsGet( @NotNull @ApiParam(value = "Begin",required=true)  @QueryParam("begin") String begin,  @NotNull @ApiParam(value = "Duration",required=true)  @QueryParam("duration") String duration,  @NotNull @ApiParam(value = "All",required=true)  @QueryParam("all") String all) {
        return delegate.contentAllDealsGet(begin, duration, all, securityContext);
    }

    @GET
    @Path("/bw-usage/{content}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content bandwidth", notes = "This endpoint returns content bandwidth", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentBwUsageContentGet(@ApiParam(value = "Content ID",required=true) @PathParam("content") String content) {
        return delegate.contentBwUsageContentGet(content, securityContext);
    }

    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new content", notes = "This endpoint adds a new content", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentCreatePost(@ApiParam(value = "Content" ,required=true) String body) {
        return delegate.contentCreatePost(body, securityContext);
    }

    @GET
    @Path("/deals")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Content with deals", notes = "This endpoint lists all content with deals", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentDealsGet( @ApiParam(value = "Limit")  @QueryParam("limit") Integer limit,  @ApiParam(value = "Offset")  @QueryParam("offset") Integer offset) {
        return delegate.contentDealsGet(limit, offset, securityContext);
    }

    @GET
    @Path("/ensure-replication/{datacid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Ensure Replication", notes = "This endpoint ensures that the content is replicated to the specified number of providers", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
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
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response contentFailuresContentGet(@ApiParam(value = "Content ID",required=true) @PathParam("content") String content) {
        return delegate.contentFailuresContentGet(content, securityContext);
    }

    @POST
    @Path("/importdeal")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Import a deal", notes = "This endpoint imports a deal into the shuttle.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentImportdealPost(@ApiParam(value = "Import a deal" ,required=true) MainImportDealBody body) {
        return delegate.contentImportdealPost(body, securityContext);
    }

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pinned content", notes = "This endpoint lists all content", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public Response contentListGet() {
        return delegate.contentListGet(securityContext);
    }

    @GET
    @Path("/read/{cont}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Read content", notes = "This endpoint reads content from the blockstore", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentReadContGet(@ApiParam(value = "CID",required=true) @PathParam("cont") String cont) {
        return delegate.contentReadContGet(cont, securityContext);
    }

    @GET
    @Path("/staging-zones")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get staging zone for user", notes = "This endpoint is used to get staging zone for user.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentStagingZonesGet() {
        return delegate.contentStagingZonesGet(securityContext);
    }

    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get content statistics", notes = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content",  })
    @ApiResponses(value = {  })
    public Response contentStatsGet(@ApiParam(value = "limit",required=true) @PathParam("limit") String limit) {
        return delegate.contentStatsGet(limit, securityContext);
    }

    @GET
    @Path("/status/{id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Content Status", notes = "This endpoint returns the status of a content", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "content" })
    @ApiResponses(value = {  })
    public Response contentStatusIdGet(@ApiParam(value = "Content ID",required=true) @PathParam("id") Integer id) {
        return delegate.contentStatusIdGet(id, securityContext);
    }
}
