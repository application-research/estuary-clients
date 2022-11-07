package io.swagger.api;

import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pinning")
@Api(description = "the pinning API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class PinningApi {

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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response pinningPinsGet() {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response pinningPinsPinidDelete(@PathParam("pinid") @ApiParam("Pin ID") String pinid) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response pinningPinsPinidGet(@PathParam("pinid") @ApiParam("cid") String pinid) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response pinningPinsPinidPost(@PathParam("pinid") @ApiParam("Pin ID") String pinid) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response pinningPinsPost(@Valid TypesIpfsPin pin) {
        return Response.ok().entity("magic!").build();
    }
}
