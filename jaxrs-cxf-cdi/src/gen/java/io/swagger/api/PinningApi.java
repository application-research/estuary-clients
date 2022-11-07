package io.swagger.api;

import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilHttpError;
import io.swagger.api.PinningApiService;

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
@Path("/pinning")
@RequestScoped

@Api(description = "the pinning API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class PinningApi  {

  @Context SecurityContext securityContext;

  @Inject PinningApiService delegate;


    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pin status objects", notes = "This endpoint lists all pin status objects", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsGet() {
        return delegate.pinningPinsGet(securityContext);
    }

    @DELETE
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a pinned object", notes = "This endpoint deletes a pinned object.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPinidDelete(@ApiParam(value = "Pin ID",required=true) @PathParam("pinid") String pinid) {
        return delegate.pinningPinsPinidDelete(pinid, securityContext);
    }

    @GET
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a pin status object", notes = "This endpoint returns a pin status object.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPinidGet(@ApiParam(value = "cid",required=true) @PathParam("pinid") String pinid) {
        return delegate.pinningPinsPinidGet(pinid, securityContext);
    }

    @POST
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Replace a pinned object", notes = "This endpoint replaces a pinned object.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPinidPost(@ApiParam(value = "Pin ID",required=true) @PathParam("pinid") String pinid) {
        return delegate.pinningPinsPinidPost(pinid, securityContext);
    }

    @POST
    @Path("/pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add and pin object", notes = "This endpoint adds a pin to the IPFS daemon.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response pinningPinsPost(@ApiParam(value = "Pin Body {cid:cid, name:name}" ,required=true) TypesIpfsPin pin) {
        return delegate.pinningPinsPost(pin, securityContext);
    }
}
