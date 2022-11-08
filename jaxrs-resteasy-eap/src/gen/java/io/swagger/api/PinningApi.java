package io.swagger.api;

import io.swagger.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pinning")


@io.swagger.annotations.Api(description = "the pinning API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-11-08T19:38:20.184Z")
public interface PinningApi  {
   
    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all pin status objects", notes = "This endpoint lists all pin status objects", response = TypesIpfsListPinStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = TypesIpfsListPinStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsGet(@Context SecurityContext securityContext);
    @DELETE
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a pinned object", notes = "This endpoint deletes a pinned object.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPinidDelete( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);
    @GET
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a pin status object", notes = "This endpoint returns a pin status object.", response = TypesIpfsPinStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = TypesIpfsPinStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPinidGet( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);
    @POST
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Replace a pinned object", notes = "This endpoint replaces a pinned object.", response = TypesIpfsPinStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Accepted", response = TypesIpfsPinStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPinidPost( @PathParam("pinid") String pinid,@ApiParam(value = "CID of new pin" ,required=true) String cid,@ApiParam(value = "Name (filename) of new pin" ) String name,@ApiParam(value = "Origins of new pin" ) String origins,@ApiParam(value = "Meta information of new pin" ) String meta,@Context SecurityContext securityContext);
    @POST
    @Path("/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add and pin object", notes = "This endpoint adds a pin to the IPFS daemon.", response = TypesIpfsPinStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "pinning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Accepted", response = TypesIpfsPinStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPost(@ApiParam(value = "Pin Body {cid:cid, name:name}" ,required=true) TypesIpfsPin pin,@Context SecurityContext securityContext);
}
