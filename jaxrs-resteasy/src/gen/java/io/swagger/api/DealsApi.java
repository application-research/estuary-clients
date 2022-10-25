package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DealsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-25T22:53:11.261Z")
public class DealsApi  {

    @Inject DealsApiService service;

    @GET
    @Path("/failures")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get storage failures for user", notes = "This endpoint returns a list of storage failures for user", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealsFailuresGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsFailuresGet(securityContext);
    }
    @POST
    @Path("/make/{miner}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Make Deal", notes = "This endpoint makes a deal for a given content and miner", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealsMakeMinerPost( @PathParam("miner") String miner,@ApiParam(value = "Deal Request" ,required=true) String dealRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsMakeMinerPost(miner,dealRequest,securityContext);
    }
    @GET
    @Path("/status/{deal}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Deal Status", notes = "This endpoint returns the status of a deal", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "deals", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response dealsStatusDealGet( @PathParam("deal") Integer deal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.dealsStatusDealGet(deal,securityContext);
    }
}
