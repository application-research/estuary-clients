package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PinningApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.PinnerIpfsListPinStatusResponse;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.PinnerIpfsPinStatusResponse;
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

@Path("/pinning")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2023-01-30T18:30:33.522Z[GMT]")public class PinningApi  {

   private PinningApiService delegate;

   protected PinningApi() {
   }

   @javax.inject.Inject
   public PinningApi(PinningApiService delegate) {
      this.delegate = delegate;
   }

    @GET
    @Path("/pins")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all pin status objects", description = "This endpoint lists all pin status objects", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PinnerIpfsListPinStatusResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsGet(securityContext);
    }
    @DELETE
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Delete a pinned object", description = "This endpoint deletes a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Accepted"),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPinidDelete(@Parameter(in = ParameterIn.PATH, description = "Pin ID",required=true) @PathParam("pinid") String pinid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPinidDelete(pinid,securityContext);
    }
    @GET
    @Path("/pins/{pinid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a pin status object", description = "This endpoint returns a pin status object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PinnerIpfsPinStatusResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPinidGet(@Parameter(in = ParameterIn.PATH, description = "cid",required=true) @PathParam("pinid") String pinid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPinidGet(pinid,securityContext);
    }
    @POST
    @Path("/pins/{pinid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Replace a pinned object", description = "This endpoint replaces a pinned object.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PinnerIpfsPinStatusResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPinidPost(@Parameter(in = ParameterIn.DEFAULT, description = "New pin" ,required=true) PinnerIpfsPin body

,@Parameter(in = ParameterIn.PATH, description = "Pin ID to be replaced",required=true) @PathParam("pinid") String pinid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPinidPost(body,pinid,securityContext);
    }
    @POST
    @Path("/pins")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add and pin object", description = "This endpoint adds a pin to the IPFS daemon.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "pinning" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Accepted", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PinnerIpfsPinStatusResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response pinningPinsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Pin Body {cid:cid, name:name}" ,required=true) PinnerIpfsPin body

,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes") @QueryParam("ignore-dupes") String ignoreDupes
,@Parameter(in = ParameterIn.QUERY, description = "Overwrite conflicting files in collections") @QueryParam("overwrite") String overwrite
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pinningPinsPost(body,ignoreDupes,overwrite,securityContext);
    }
}
