package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AdminApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;
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

@Path("/admin")


@io.swagger.annotations.Api(description = "the admin API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class AdminApi  {

    @Inject AdminApiService service;

    @POST
    @Path("/autoretrieve/init")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Register autoretrieve server", notes = "This endpoint registers a new autoretrieve server", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminAutoretrieveInitPost(@ApiParam(value = "Autoretrieve's comma-separated list of addresses", required=true)@FormParam("addresses")  String addresses,@ApiParam(value = "Autoretrieve's public key", required=true)@FormParam("pubKey")  String pubKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminAutoretrieveInitPost(addresses,pubKey,securityContext);
    }
    @GET
    @Path("/autoretrieve/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List autoretrieve servers", notes = "This endpoint lists all registered autoretrieve servers", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminAutoretrieveListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminAutoretrieveListGet(securityContext);
    }
    @DELETE
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove peers on Peering Service", notes = "This endpoint can be used to remove a Peer from the Peering Service", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminPeeringPeersDelete(@ApiParam(value = "Peer ids" ,required=true) List<Boolean> peerIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringPeersDelete(peerIds,securityContext);
    }
    @GET
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all Peering peers", notes = "This endpoint can be used to list all peers on Peering Service", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminPeeringPeersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringPeersGet(securityContext);
    }
    @POST
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add peers on Peering Service", notes = "This endpoint can be used to add a Peer from the Peering Service", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminPeeringPeersPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringPeersPost(securityContext);
    }
    @POST
    @Path("/peering/start")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Start Peering", notes = "This endpoint can be used to start the Peering Service", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminPeeringStartPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringStartPost(securityContext);
    }
    @GET
    @Path("/peering/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Check Peering Status", notes = "This endpoint can be used to check the Peering status", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminPeeringStatusGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringStatusGet(securityContext);
    }
    @POST
    @Path("/peering/stop")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Stop Peering", notes = "This endpoint can be used to stop the Peering Service", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminPeeringStopPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminPeeringStopPost(securityContext);
    }
    @GET
    @Path("/system/config")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get systems(estuary/shuttle) config", notes = "This endpoint is used to get system configs.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminSystemConfigGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminSystemConfigGet(securityContext);
    }
    @GET
    @Path("/users")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all users", notes = "This endpoint is used to get all users.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "admin", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response adminUsersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adminUsersGet(securityContext);
    }
}
