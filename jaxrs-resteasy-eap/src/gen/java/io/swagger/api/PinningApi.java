package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-18T07:30:24.278Z[GMT]")public interface PinningApi  {
   
    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pin status objects", description = "This endpoint lists all pin status objects", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsListPinStatusResponse.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response pinningPinsGet(@Context SecurityContext securityContext);

    @DELETE
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Delete a pinned object", description = "This endpoint deletes a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "202", description = "Accepted"),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response pinningPinsPinidDelete( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);

    @GET
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a pin status object", description = "This endpoint returns a pin status object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsPinStatusResponse.class))),
                @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response pinningPinsPinidGet( @PathParam("pinid") String pinid,@Context SecurityContext securityContext);

    @POST
    @Path("/pins/{pinid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Replace a pinned object", description = "This endpoint replaces a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsPinStatusResponse.class))),
                @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response pinningPinsPinidPost(@Parameter(description = "New pin" ,required=true) TypesIpfsPin body, @PathParam("pinid") String pinid,@Context SecurityContext securityContext);

    @POST
    @Path("/pins")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add and pin object", description = "This endpoint adds a pin to the IPFS daemon.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TypesIpfsPinStatusResponse.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response pinningPinsPost(@Parameter(description = "Pin Body {cid:cid, name:name}" ,required=true) TypesIpfsPin body,@Context SecurityContext securityContext);

}
