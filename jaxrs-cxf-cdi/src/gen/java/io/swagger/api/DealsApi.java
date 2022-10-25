package io.swagger.api;

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


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-10-25T22:53:06.813Z")

public class DealsApi  {

  @Context SecurityContext securityContext;

  @Inject DealsApiService delegate;


    @GET
    @Path("/failures")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get storage failures for user", notes = "This endpoint returns a list of storage failures for user", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealsFailuresGet() {
        return delegate.dealsFailuresGet(securityContext);
    }

    @POST
    @Path("/make/{miner}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Make Deal", notes = "This endpoint makes a deal for a given content and miner", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals",  })
    @ApiResponses(value = {  })
    public Response dealsMakeMinerPost(@ApiParam(value = "Miner",required=true) @PathParam("miner") String miner, @ApiParam(value = "Deal Request" ,required=true) String dealRequest) {
        return delegate.dealsMakeMinerPost(miner, dealRequest, securityContext);
    }

    @GET
    @Path("/status/{deal}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Deal Status", notes = "This endpoint returns the status of a deal", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "deals" })
    @ApiResponses(value = {  })
    public Response dealsStatusDealGet(@ApiParam(value = "Deal ID",required=true) @PathParam("deal") Integer deal) {
        return delegate.dealsStatusDealGet(deal, securityContext);
    }
}
