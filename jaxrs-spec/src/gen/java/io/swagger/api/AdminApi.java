package io.swagger.api;

import java.util.List;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/admin")
@Api(description = "the admin API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-11-07T20:06:06.071Z")
public class AdminApi {

    @POST
    @Path("/autoretrieve/init")
    @Produces({ "application/json" })
    @ApiOperation(value = "Register autoretrieve server", notes = "This endpoint registers a new autoretrieve server", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminAutoretrieveInitPost(@FormParam(value = "addresses")  String addresses,@FormParam(value = "pubKey")  String pubKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/autoretrieve/list")
    @Produces({ "application/json" })
    @ApiOperation(value = "List autoretrieve servers", notes = "This endpoint lists all registered autoretrieve servers", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminAutoretrieveListGet() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove peers on Peering Service", notes = "This endpoint can be used to remove a Peer from the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminPeeringPeersDelete(@Valid List<Boolean> peerIds) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all Peering peers", notes = "This endpoint can be used to list all peers on Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminPeeringPeersGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/peering/peers")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add peers on Peering Service", notes = "This endpoint can be used to add a Peer from the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminPeeringPeersPost() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/peering/start")
    @Produces({ "application/json" })
    @ApiOperation(value = "Start Peering", notes = "This endpoint can be used to start the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminPeeringStartPost() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/peering/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Check Peering Status", notes = "This endpoint can be used to check the Peering status", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminPeeringStatusGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/peering/stop")
    @Produces({ "application/json" })
    @ApiOperation(value = "Stop Peering", notes = "This endpoint can be used to stop the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", "peering", "peers",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminPeeringStopPost() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/system/config")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get systems(estuary/shuttle) config", notes = "This endpoint is used to get system configs.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminSystemConfigGet() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all users", notes = "This endpoint is used to get all users.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class)
    })
    public Response adminUsersGet() {
        return Response.ok().entity("magic!").build();
    }
}
