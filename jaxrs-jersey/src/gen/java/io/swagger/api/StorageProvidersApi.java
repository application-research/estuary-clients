package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StorageProvidersApiService;
import io.swagger.api.factories.StorageProvidersApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
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


@Path("/storage-providers")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-21T01:22:10.613Z[GMT]")public class StorageProvidersApi  {
   private final StorageProvidersApiService delegate;

   public StorageProvidersApi(@Context ServletConfig servletContext) {
      StorageProvidersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StorageProvidersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StorageProvidersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = StorageProvidersApiServiceFactory.getStorageProvidersApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/claim")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Claim Storage Provider", description = "This endpoint lets a user claim a storage provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Storage Provider Body" ,required=true) MinerClaimMinerBody body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersClaimPost(body,securityContext);
    }
    @GET
    @Path("/claim/{sp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Claim Storage Provider", description = "This endpoint lets a user get the message in order to claim a storage provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersClaimSpGet(@Parameter(in = ParameterIn.PATH, description = "Storage Provider claim message",required=true) @PathParam("sp") String sp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersClaimSpGet(sp,securityContext);
    }
    @GET
    @Path("/deals/{sp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers deals", description = "This endpoint returns all storage providers deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersDealsSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider",required=true) @PathParam("sp") String sp
,@Parameter(in = ParameterIn.QUERY, description = "Ignore Failed") @QueryParam("ignore-failed") String ignoreFailed
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersDealsSpGet(sp,ignoreFailed,securityContext);
    }
    @GET
    @Path("/failures/{sp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers", description = "This endpoint returns all storage providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersFailuresSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider",required=true) @PathParam("sp") String sp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersFailuresSpGet(sp,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all storage providers", description = "This endpoint returns all storage providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ApiStorageProviderResp.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersGet(securityContext);
    }
    @PUT
    @Path("/set-info/{sp}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Set Storage Provider Info", description = "This endpoint lets a user set storage provider info.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersSetInfoSpPut(@Parameter(in = ParameterIn.DEFAULT, description = "Storage Provider set info params" ,required=true) MinerMinerSetInfoParams body

,@Parameter(in = ParameterIn.PATH, description = "Storage Provider to set info for",required=true) @PathParam("sp") String sp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersSetInfoSpPut(body,sp,securityContext);
    }
    @GET
    @Path("/stats/{sp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get storage provider stats", description = "This endpoint returns storage provider stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersStatsSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider",required=true) @PathParam("sp") String sp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersStatsSpGet(sp,securityContext);
    }
    @GET
    @Path("/storage/query/{cid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersStorageQueryCidGet(@Parameter(in = ParameterIn.PATH, description = "CID",required=true) @PathParam("cid") String cid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersStorageQueryCidGet(cid,securityContext);
    }
    @POST
    @Path("/suspend/{sp}")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Suspend Storage Provider", description = "This endpoint lets a user suspend a storage provider.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersSuspendSpPost(@Parameter(in = ParameterIn.DEFAULT, description = "Suspend Storage Provider Body" ,required=true) MinerSuspendMinerBody body

,@Parameter(in = ParameterIn.PATH, description = "Storage Provider to suspend",required=true) @PathParam("sp") String sp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersSuspendSpPost(body,sp,securityContext);
    }
    @PUT
    @Path("/unsuspend/{sp}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Unuspend Storage Provider", description = "This endpoint lets a user unsuspend a Storage Provider.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response storageProvidersUnsuspendSpPut(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to unsuspend",required=true) @PathParam("sp") String sp
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storageProvidersUnsuspendSpPut(sp,securityContext);
    }
}
