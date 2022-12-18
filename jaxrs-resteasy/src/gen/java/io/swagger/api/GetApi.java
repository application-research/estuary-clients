package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.GetApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

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
@Path("/get")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-12-18T07:30:24.829Z[GMT]")public class GetApi  {

    @Inject GetApiService service;

    @GET
    @Path("/{cid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Full Content by Cid", description = "This endpoint returns the content associated with a CID", security = {
        @SecurityRequirement(name = "bearerAuth")
    }, tags={ "public" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "307", description = "Temporary Redirect", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response getCidGet( @PathParam("cid") String cid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCidGet(cid,securityContext);
    }
}
