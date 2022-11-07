package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.api.DealsApiService;

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
@Path("/deals")
@RequestScoped

@Api(description = "the deals API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class DealsApi  {

  @Context SecurityContext securityContext;

  @Inject DealsApiService delegate;


    @GET
    @Path("/failures")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures for user", notes = "This endpoint returns a list of storage failures for user", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealsFailuresGet() {
        return delegate.dealsFailuresGet(securityContext);
    }

    @POST
    @Path("/make/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Make Deal", notes = "This endpoint makes a deal for a given content and miner", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealsMakeMinerPost(@ApiParam(value = "Miner",required=true) @PathParam("miner") String miner, @ApiParam(value = "Deal Request" ,required=true) String dealRequest) {
        return delegate.dealsMakeMinerPost(miner, dealRequest, securityContext);
    }

    @GET
    @Path("/status/{deal}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status", notes = "This endpoint returns the status of a deal", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response dealsStatusDealGet(@ApiParam(value = "Deal ID",required=true) @PathParam("deal") Integer deal) {
        return delegate.dealsStatusDealGet(deal, securityContext);
    }
}
