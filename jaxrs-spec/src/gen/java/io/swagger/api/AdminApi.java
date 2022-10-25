package io.swagger.api;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/admin")
@Api(description = "the admin API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-25T22:53:14.677Z")
public class AdminApi {

    @POST
    @Path("/autoretrieve/init")
    @Produces({ "application/json" })
    @ApiOperation(value = "Register autoretrieve server", notes = "This endpoint registers a new autoretrieve server", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve",  })
    @ApiResponses(value = { 
    })
    public Response adminAutoretrieveInitPost(@Valid String addresses,@Valid String pubKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/autoretrieve/list")
    @Produces({ "application/json" })
    @ApiOperation(value = "List autoretrieve servers", notes = "This endpoint lists all registered autoretrieve servers", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve",  })
    @ApiResponses(value = { 
    })
    public Response adminAutoretrieveListGet() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove peers on Peering Service", notes = "This endpoint can be used to remove a Peer from the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
    })
    public Response adminPeeringPeersDelete(@Valid List<String> body) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all Peering peers", notes = "This endpoint can be used to list all peers on Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
    })
    public Response adminPeeringPeersGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add peers on Peering Service", notes = "This endpoint can be used to add a Peer from the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
    })
    public Response adminPeeringPeersPost() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/peering/start")
    @Produces({ "application/json" })
    @ApiOperation(value = "Start Peering", notes = "This endpoint can be used to start the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
    })
    public Response adminPeeringStartPost() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/peering/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Check Peering Status", notes = "This endpoint can be used to check the Peering status", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
    })
    public Response adminPeeringStatusGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/peering/stop")
    @Produces({ "application/json" })
    @ApiOperation(value = "Stop Peering", notes = "This endpoint can be used to stop the Peering Service", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
    })
    public Response adminPeeringStopPost() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/system/config")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get systems(estuary/shuttle) config", notes = "This endpoint is used to get system configs.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin",  })
    @ApiResponses(value = { 
    })
    public Response adminSystemConfigGet() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all users", notes = "This endpoint is used to get all users.", response = Void.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
    })
    public Response adminUsersGet() {
        return Response.ok().entity("magic!").build();
    }
}
