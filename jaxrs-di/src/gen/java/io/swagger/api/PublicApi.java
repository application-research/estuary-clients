package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PublicApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/public")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-23T18:54:22.817Z[GMT]")public class PublicApi  {

   private PublicApiService delegate;

   protected PublicApi() {
   }

   @javax.inject.Inject
   public PublicApi(PublicApiService delegate) {
      this.delegate = delegate;
   }

    @GET
    @Path("/by-cid/{cid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Content by Cid", description = "This endpoint returns the content record associated with a CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicByCidCidGet(@Parameter(in = ParameterIn.PATH, description = "Cid",required=true) @PathParam("cid") String cid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicByCidCidGet(cid,securityContext);
    }
    @GET
    @Path("/deals/failures")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get storage failures", description = "This endpoint returns a list of storage failures", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicDealsFailuresGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicDealsFailuresGet(securityContext);
    }
    @GET
    @Path("/info")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get public node info", description = "This endpoint returns information about the node", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicInfoGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicInfoGet(securityContext);
    }
    @GET
    @Path("/metrics/deals-on-chain")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get deal metrics", description = "This endpoint is used to get deal metrics", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "metrics" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicMetricsDealsOnChainGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMetricsDealsOnChainGet(securityContext);
    }
    @GET
    @Path("/miners/deals/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all miners deals", description = "This endpoint returns all miners deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicMinersDealsMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner",required=true) @PathParam("miner") String miner
,@Parameter(in = ParameterIn.QUERY, description = "Ignore Failed") @QueryParam("ignore-failed") String ignoreFailed
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersDealsMinerGet(miner,ignoreFailed,securityContext);
    }
    @GET
    @Path("/miners/failures/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicMinersFailuresMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersFailuresMinerGet(miner,securityContext);
    }
    @GET
    @Path("/miners")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicMinersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersGet(securityContext);
    }
    @GET
    @Path("/miners/stats/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get miner stats", description = "This endpoint returns miner stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicMinersStatsMinerGet(@Parameter(in = ParameterIn.PATH, description = "Filter by miner",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersStatsMinerGet(miner,securityContext);
    }
    @GET
    @Path("/miners/storage/query/{miner}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicMinersStorageQueryMinerGet(@Parameter(in = ParameterIn.PATH, description = "CID",required=true) @PathParam("miner") String miner
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicMinersStorageQueryMinerGet(miner,securityContext);
    }
    @GET
    @Path("/net/addrs")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Addrs", description = "This endpoint is used to get net addrs", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))) })
    public Response publicNetAddrsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicNetAddrsGet(securityContext);
    }
    @GET
    @Path("/net/peers")
    
    @Produces({ "application/json" })
    @Operation(summary = "Net Peers", description = "This endpoint is used to get net peers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicNetPeersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicNetPeersGet(securityContext);
    }
    @GET
    @Path("/stats")
    
    @Produces({ "application/json" })
    @Operation(summary = "Public stats", description = "This endpoint is used to get public stats.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "public" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response publicStatsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.publicStatsGet(securityContext);
    }
}
