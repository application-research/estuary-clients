package io.swagger.api;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;
import io.swagger.api.PinningApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/pinning")
@RequestScoped




@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-21T15:23:20.634Z[GMT]")
public class PinningApi  {

  @Context SecurityContext securityContext;

  @Inject PinningApiService delegate;


    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pin status objects", description = "This endpoint lists all pin status objects", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsListPinStatusResponse.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsGet() {
        return delegate.pinningPinsGet(securityContext);
    }

    @DELETE
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Delete a pinned object", description = "This endpoint deletes a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = ""),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPinidDelete(
@Parameter(description = "Pin ID",required=true) @PathParam("pinid") String pinid
) {
        return delegate.pinningPinsPinidDelete(pinid, securityContext);
    }

    @GET
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a pin status object", description = "This endpoint returns a pin status object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsPinStatusResponse.class))),
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPinidGet(
@Parameter(description = "cid",required=true) @PathParam("pinid") String pinid
) {
        return delegate.pinningPinsPinidGet(pinid, securityContext);
    }

    @POST
    @Path("/pins/{pinid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Replace a pinned object", description = "This endpoint replaces a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsPinStatusResponse.class))),
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPinidPost(
@Parameter(description = "Pin ID",required=true) @PathParam("pinid") String pinid
, 
@Parameter(description = "Meta information of new pin" ) String body
) {
        return delegate.pinningPinsPinidPost(pinid, body, securityContext);
    }

    @POST
    @Path("/pins")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add and pin object", description = "This endpoint adds a pin to the IPFS daemon.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsPinStatusResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPost(
@Parameter(description = "Pin Body {cid:cid, name:name}" ,required=true) TypesIpfsPin body
) {
        return delegate.pinningPinsPost(body, securityContext);
    }
}
