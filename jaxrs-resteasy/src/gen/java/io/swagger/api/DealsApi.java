package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DealsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/deals")


@io.swagger.annotations.Api(description = "the deals API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class DealsApi  {

    @Inject DealsApiService service;

    @GET
    @Path("/failures")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get storage failures for user", notes = "This endpoint returns a list of storage failures for user", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealsFailuresGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsFailuresGet(securityContext);
    }
    @POST
    @Path("/make/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Make Deal", notes = "This endpoint makes a deal for a given content and miner", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealsMakeMinerPost( @PathParam("miner") String miner,@ApiParam(value = "Deal Request" ,required=true) String dealRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsMakeMinerPost(miner,dealRequest,securityContext);
    }
    @GET
    @Path("/status/{deal}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Deal Status", notes = "This endpoint returns the status of a deal", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealsStatusDealGet( @PathParam("deal") Integer deal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsStatusDealGet(deal,securityContext);
    }
}
