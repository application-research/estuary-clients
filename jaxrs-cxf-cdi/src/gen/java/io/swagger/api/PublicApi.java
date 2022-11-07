package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.api.PublicApiService;

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
@Path("/public")
@RequestScoped

@Api(description = "the public API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class PublicApi  {

  @Context SecurityContext securityContext;

  @Inject PublicApiService delegate;


    @GET
    @Path("/by-cid/{cid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Content by Cid", notes = "This endpoint returns the content associated with a CID", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicByCidCidGet(@ApiParam(value = "Cid",required=true) @PathParam("cid") String cid) {
        return delegate.publicByCidCidGet(cid, securityContext);
    }

    @GET
    @Path("/deals/failures")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures", notes = "This endpoint returns a list of storage failures", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicDealsFailuresGet() {
        return delegate.publicDealsFailuresGet(securityContext);
    }

    @GET
    @Path("/info")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get public node info", notes = "This endpoint returns information about the node", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicInfoGet() {
        return delegate.publicInfoGet(securityContext);
    }

    @GET
    @Path("/metrics/deals-on-chain")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get deal metrics", notes = "This endpoint is used to get deal metrics", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "metrics",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicMetricsDealsOnChainGet() {
        return delegate.publicMetricsDealsOnChainGet(securityContext);
    }

    @GET
    @Path("/miners/deals/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all miners deals", notes = "This endpoint returns all miners deals", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "miner",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicMinersDealsMinerGet(@ApiParam(value = "Filter by miner",required=true) @PathParam("miner") String miner,  @ApiParam(value = "Ignore Failed")  @QueryParam("ignore-failed") String ignoreFailed) {
        return delegate.publicMinersDealsMinerGet(miner, ignoreFailed, securityContext);
    }

    @GET
    @Path("/miners/failures/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all miners", notes = "This endpoint returns all miners", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "net",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicMinersFailuresMinerGet(@ApiParam(value = "Filter by miner",required=true) @PathParam("miner") String miner) {
        return delegate.publicMinersFailuresMinerGet(miner, securityContext);
    }

    @GET
    @Path("/miners")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all miners", notes = "This endpoint returns all miners", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "net",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicMinersGet() {
        return delegate.publicMinersGet(securityContext);
    }

    @GET
    @Path("/miners/stats/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get miner stats", notes = "This endpoint returns miner stats", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "miner",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicMinersStatsMinerGet(@ApiParam(value = "Filter by miner",required=true) @PathParam("miner") String miner) {
        return delegate.publicMinersStatsMinerGet(miner, securityContext);
    }

    @GET
    @Path("/miners/storage/query/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Query Ask", notes = "This endpoint returns the ask for a given CID", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicMinersStorageQueryMinerGet(@ApiParam(value = "CID",required=true) @PathParam("miner") String miner) {
        return delegate.publicMinersStorageQueryMinerGet(miner, securityContext);
    }

    @GET
    @Path("/net/addrs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Addrs", notes = "This endpoint is used to get net addrs", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "net",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public Response publicNetAddrsGet() {
        return delegate.publicNetAddrsGet(securityContext);
    }

    @GET
    @Path("/net/peers")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Peers", notes = "This endpoint is used to get net peers", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "net",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicNetPeersGet() {
        return delegate.publicNetPeersGet(securityContext);
    }

    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Public stats", notes = "This endpoint is used to get public stats.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response publicStatsGet() {
        return delegate.publicStatsGet(securityContext);
    }
}
