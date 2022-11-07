package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.NetApiService;

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

@Path("/net")


@io.swagger.annotations.Api(description = "the net API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class NetApi  {

    @Inject NetApiService service;

    @GET
    @Path("/addrs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Net Addrs", notes = "This endpoint is used to get net addrs", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "net", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response netAddrsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.netAddrsGet(securityContext);
    }
}
