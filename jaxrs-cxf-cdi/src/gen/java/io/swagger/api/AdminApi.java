package io.swagger.api;

import io.swagger.api.AdminApiService;

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
@Path("/admin")
@RequestScoped

@Api(description = "the admin API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-10-07T23:59:33.064Z")

public class AdminApi  {

  @Context SecurityContext securityContext;

  @Inject AdminApiService delegate;


    @POST
    @Path("/autoretrieve/init")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Register autoretrieve server", notes = "This endpoint registers a new autoretrieve server", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve",  })
    @ApiResponses(value = {  })
    public Response adminAutoretrieveInitPost(@ApiParam(value = "Autoretrieve's comma-separated list of addresses" ,required=true) String addresses, @ApiParam(value = "Autoretrieve's public key" ,required=true) String pubKey) {
        return delegate.adminAutoretrieveInitPost(addresses, pubKey, securityContext);
    }

    @GET
    @Path("/autoretrieve/list")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List autoretrieve servers", notes = "This endpoint lists all registered autoretrieve servers", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve",  })
    @ApiResponses(value = {  })
    public Response adminAutoretrieveListGet() {
        return delegate.adminAutoretrieveListGet(securityContext);
    }

    @DELETE
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove peers on Peering Service", notes = "This endpoint can be used to remove a Peer from the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersDelete() {
        return delegate.adminPeeringPeersDelete(securityContext);
    }

    @GET
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List all Peering peers", notes = "This endpoint can be used to list all peers on Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersGet() {
        return delegate.adminPeeringPeersGet(securityContext);
    }

    @POST
    @Path("/peering/peers")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add peers on Peering Service", notes = "This endpoint can be used to add a Peer from the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = {  })
    public Response adminPeeringPeersPost() {
        return delegate.adminPeeringPeersPost(securityContext);
    }

    @POST
    @Path("/peering/start")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Start Peering", notes = "This endpoint can be used to start the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = {  })
    public Response adminPeeringStartPost() {
        return delegate.adminPeeringStartPost(securityContext);
    }

    @GET
    @Path("/peering/status")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Check Peering Status", notes = "This endpoint can be used to check the Peering status", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = {  })
    public Response adminPeeringStatusGet() {
        return delegate.adminPeeringStatusGet(securityContext);
    }

    @POST
    @Path("/peering/stop")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Stop Peering", notes = "This endpoint can be used to stop the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = {  })
    public Response adminPeeringStopPost() {
        return delegate.adminPeeringStopPost(securityContext);
    }

    @GET
    @Path("/system/config")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get systems(estuary/shuttle) config", notes = "This endpoint is used to get system configs.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin",  })
    @ApiResponses(value = {  })
    public Response adminSystemConfigGet() {
        return delegate.adminSystemConfigGet(securityContext);
    }

    @GET
    @Path("/users")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all users", notes = "This endpoint is used to get all users.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = {  })
    public Response adminUsersGet() {
        return delegate.adminUsersGet(securityContext);
    }
}
