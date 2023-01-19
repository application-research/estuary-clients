package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AdminApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ApiMinerResp;
import io.swagger.model.PeeringPeeringPeer;
import io.swagger.model.UtilHttpError;

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
@Path("/admin")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T16:30:00.063Z[GMT]")public class AdminApi  {

    @Inject AdminApiService service;

    @POST
    @Path("/autoretrieve/init")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @Operation(summary = "Register autoretrieve server", description = "This endpoint registers a new autoretrieve server", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminAutoretrieveInitPost(MultipartFormDataInput input,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminAutoretrieveInitPost(input,securityContext);
    }
    @GET
    @Path("/autoretrieve/list")
    
    @Produces({ "application/json" })
    @Operation(summary = "List autoretrieve servers", description = "This endpoint lists all registered autoretrieve servers", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminAutoretrieveListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminAutoretrieveListGet(securityContext);
    }
    @POST
    @Path("/invites/{code}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Create an Estuary invite", description = "This endpoint is used to create an estuary invite.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminInvitesCodePost( @PathParam("code") String code,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminInvitesCodePost(code,securityContext);
    }
    @GET
    @Path("/invites")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Estuary invites", description = "This endpoint is used to list all estuary invites.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "content" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminInvitesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminInvitesGet(securityContext);
    }
    @GET
    @Path("/miners/")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all miners", description = "This endpoint returns all miners. Note: value may be cached", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin", "net" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiMinerResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminMinersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminMinersGet(securityContext);
    }
    @DELETE
    @Path("/peering/peers")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Remove peers on Peering Service", description = "This endpoint can be used to remove a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminPeeringPeersDelete(@Parameter(description = "Peer ids" ,required=true) List<String> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringPeersDelete(body,securityContext);
    }
    @GET
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all Peering peers", description = "This endpoint can be used to list all peers on Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminPeeringPeersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringPeersGet(securityContext);
    }
    @POST
    @Path("/peering/peers")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Add peers on Peering Service", description = "This endpoint can be used to add a Peer from the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminPeeringPeersPost(@Parameter(description = "Peering Peer array" ,required=true) List<PeeringPeeringPeer> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringPeersPost(body,securityContext);
    }
    @POST
    @Path("/peering/start")
    
    @Produces({ "application/json" })
    @Operation(summary = "Start Peering", description = "This endpoint can be used to start the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminPeeringStartPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringStartPost(securityContext);
    }
    @GET
    @Path("/peering/status")
    
    @Produces({ "application/json" })
    @Operation(summary = "Check Peering Status", description = "This endpoint can be used to check the Peering status", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminPeeringStatusGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringStatusGet(securityContext);
    }
    @POST
    @Path("/peering/stop")
    
    @Produces({ "application/json" })
    @Operation(summary = "Stop Peering", description = "This endpoint can be used to stop the Peering Service", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminPeeringStopPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringStopPost(securityContext);
    }
    @GET
    @Path("/system/config")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get systems(estuary/shuttle) config", description = "This endpoint is used to get system configs.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminSystemConfigGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminSystemConfigGet(securityContext);
    }
    @GET
    @Path("/users")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all users", description = "This endpoint is used to get all users.", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response adminUsersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminUsersGet(securityContext);
    }
}
