package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ContentApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/content")


@io.swagger.annotations.Api(description = "the content API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T23:21:59.224Z")
public class ContentApi  {

    @Inject ContentApiService service;

    @POST
    @Path("/add-car")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add Car object", notes = "This endpoint is used to add a car object to the network. The object can be a file or a directory.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentAddCarPost(@ApiParam(value = "Car" ,required=true) String body,  @QueryParam("filename") String filename,  @QueryParam("commp") String commp,  @QueryParam("size") String size,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentAddCarPost(body,filename,commp,size,securityContext);
    }
    @POST
    @Path("/add-ipfs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add IPFS object", notes = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentAddIpfsPost(@ApiParam(value = "IPFS Body" ,required=true) UtilContentAddIpfsBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentAddIpfsPost(body,securityContext);
    }
    @POST
    @Path("/add")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add new content", notes = "This endpoint is used to upload new content.", response = UtilContentAddResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = UtilContentAddResponse.class) })
    public Response contentAddPost(MultipartFormDataInput input, @PathParam("coluuid") String coluuid, @PathParam("dir") String dir,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentAddPost(input,coluuid,dir,securityContext);
    }
    @GET
    @Path("/aggregated/{content}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get aggregated content stats", notes = "This endpoint returns aggregated content stats", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response contentAggregatedContentGet( @PathParam("content") String content,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentAggregatedContentGet(content,securityContext);
    }
    @GET
    @Path("/all-deals")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all deals for a user", notes = "This endpoint is used to get all deals for a user", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentAllDealsGet( @NotNull  @QueryParam("begin") String begin, @NotNull  @QueryParam("duration") String duration, @NotNull  @QueryParam("all") String all,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentAllDealsGet(begin,duration,all,securityContext);
    }
    @GET
    @Path("/bw-usage/{content}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get content bandwidth", notes = "This endpoint returns content bandwidth", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentBwUsageContentGet( @PathParam("content") String content,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentBwUsageContentGet(content,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new content", notes = "This endpoint adds a new content", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentCreatePost(@ApiParam(value = "Content" ,required=true) String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentCreatePost(body,securityContext);
    }
    @GET
    @Path("/deals")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Content with deals", notes = "This endpoint lists all content with deals", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentDealsGet(  @QueryParam("limit") Integer limit,  @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentDealsGet(limit,offset,securityContext);
    }
    @GET
    @Path("/ensure-replication/{datacid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Ensure Replication", notes = "This endpoint ensures that the content is replicated to the specified number of providers", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentEnsureReplicationDatacidGet( @PathParam("datacid") String datacid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentEnsureReplicationDatacidGet(datacid,securityContext);
    }
    @GET
    @Path("/failures/{content}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all failures for a content", notes = "This endpoint returns all failures for a content", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response contentFailuresContentGet( @PathParam("content") String content,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentFailuresContentGet(content,securityContext);
    }
    @POST
    @Path("/importdeal")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Import a deal", notes = "This endpoint imports a deal into the shuttle.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentImportdealPost(@ApiParam(value = "Import a deal" ,required=true) MainImportDealBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentImportdealPost(body,securityContext);
    }
    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all pinned content", notes = "This endpoint lists all content", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public Response contentListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentListGet(securityContext);
    }
    @GET
    @Path("/read/{cont}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Read content", notes = "This endpoint reads content from the blockstore", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentReadContGet( @PathParam("cont") String cont,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentReadContGet(cont,securityContext);
    }
    @GET
    @Path("/staging-zones")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get staging zone for user", notes = "This endpoint is used to get staging zone for user.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentStagingZonesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentStagingZonesGet(securityContext);
    }
    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get content statistics", notes = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentStatsGet( @PathParam("limit") String limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentStatsGet(limit,securityContext);
    }
    @GET
    @Path("/status/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Content Status", notes = "This endpoint returns the status of a content", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "content", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response contentStatusIdGet( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contentStatusIdGet(id,securityContext);
    }
}
