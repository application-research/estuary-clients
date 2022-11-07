package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.api.NetApiService;

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
@Path("/net")
@RequestScoped

@Api(description = "the net API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class NetApi  {

  @Context SecurityContext securityContext;

  @Inject NetApiService delegate;


    @GET
    @Path("/addrs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Net Addrs", notes = "This endpoint is used to get net addrs", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "net" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response netAddrsGet() {
        return delegate.netAddrsGet(securityContext);
    }
}
