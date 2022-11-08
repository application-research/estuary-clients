/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;
import io.swagger.model.UtilHttpError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-08T04:05:50.900Z")

@Validated
@Api(value = "admin", description = "the admin API")
@RequestMapping(value = "")
public interface AdminApi {

    @ApiOperation(value = "Register autoretrieve server", nickname = "adminAutoretrieveInitPost", notes = "This endpoint registers a new autoretrieve server", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/autoretrieve/init",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> adminAutoretrieveInitPost(@ApiParam(value = "Autoretrieve's comma-separated list of addresses", required=true) @RequestParam(value="addresses", required=true)  String addresses,@ApiParam(value = "Autoretrieve's public key", required=true) @RequestParam(value="pubKey", required=true)  String pubKey);


    @ApiOperation(value = "List autoretrieve servers", nickname = "adminAutoretrieveListGet", notes = "This endpoint lists all registered autoretrieve servers", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "autoretrieve", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/autoretrieve/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> adminAutoretrieveListGet();


    @ApiOperation(value = "Remove peers on Peering Service", nickname = "adminPeeringPeersDelete", notes = "This endpoint can be used to remove a Peer from the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/peering/peers",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> adminPeeringPeersDelete(@ApiParam(value = "Peer ids" ,required=true )  @Valid @RequestBody List<Boolean> peerIds);


    @ApiOperation(value = "List all Peering peers", nickname = "adminPeeringPeersGet", notes = "This endpoint can be used to list all peers on Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/peering/peers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> adminPeeringPeersGet();


    @ApiOperation(value = "Add peers on Peering Service", nickname = "adminPeeringPeersPost", notes = "This endpoint can be used to add a Peer from the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/peering/peers",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> adminPeeringPeersPost();


    @ApiOperation(value = "Start Peering", nickname = "adminPeeringStartPost", notes = "This endpoint can be used to start the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/peering/start",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> adminPeeringStartPost();


    @ApiOperation(value = "Check Peering Status", nickname = "adminPeeringStatusGet", notes = "This endpoint can be used to check the Peering status", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/peering/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> adminPeeringStatusGet();


    @ApiOperation(value = "Stop Peering", nickname = "adminPeeringStopPost", notes = "This endpoint can be used to stop the Peering Service", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin","peering","peers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/peering/stop",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> adminPeeringStopPost();


    @ApiOperation(value = "Get systems(estuary/shuttle) config", nickname = "adminSystemConfigGet", notes = "This endpoint is used to get system configs.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/system/config",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> adminSystemConfigGet();


    @ApiOperation(value = "Get all users", nickname = "adminUsersGet", notes = "This endpoint is used to get all users.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/admin/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> adminUsersGet();

}
