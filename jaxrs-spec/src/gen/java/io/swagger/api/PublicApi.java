package io.swagger.api;

import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/public")
@Api(description = "the public API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class PublicApi {

    @GET
    @Path("/by-cid/{cid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Content by Cid", notes = "This endpoint returns the content associated with a CID", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicByCidCidGet(@PathParam("cid") @ApiParam("Cid") String cid) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicDealsFailuresGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicInfoGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicMetricsDealsOnChainGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicMinersDealsMinerGet(@PathParam("miner") @ApiParam("Filter by miner") String miner,@QueryParam("ignore-failed")   @ApiParam("Ignore Failed")  String ignoreFailed) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicMinersFailuresMinerGet(@PathParam("miner") @ApiParam("Filter by miner") String miner) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicMinersGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicMinersStatsMinerGet(@PathParam("miner") @ApiParam("Filter by miner") String miner) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicMinersStorageQueryMinerGet(@PathParam("miner") @ApiParam("CID") String miner) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/net/addrs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Addrs", notes = "This endpoint is used to get net addrs", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "public", "net",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List")
    })
    public Response publicNetAddrsGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicNetPeersGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response publicStatsGet() {
        return Response.ok().entity("magic!").build();
    }
}
