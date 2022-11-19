/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.UtilHttpError;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-11-19T20:28:52.869Z[GMT]")
@Controller
public interface AdminApi {


    @Operation(summary = "Register autoretrieve server", operationId = "adminAutoretrieveInitPost", description = "This endpoint registers a new autoretrieve server" , tags = {"autoretrieve"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/admin/autoretrieve/init", produces = { "application/json" }, consumes = {"multipart/form-data"})
    default Single<HttpResponse<String>> adminAutoretrieveInitPost(@Parameter(description = "") @QueryValue(value = "addresses")  String addresses
,@Parameter(description = "") @QueryValue(value = "pubKey")  String pubKey
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List autoretrieve servers", operationId = "adminAutoretrieveListGet", description = "This endpoint lists all registered autoretrieve servers" , tags = {"autoretrieve"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/admin/autoretrieve/list", produces = { "application/json" })
    default Single<HttpResponse<String>> adminAutoretrieveListGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Remove peers on Peering Service", operationId = "adminPeeringPeersDelete", description = "This endpoint can be used to remove a Peer from the Peering Service" , tags = {"admin", "peering", "peers"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Delete(value = "/admin/peering/peers", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> adminPeeringPeersDelete(@Parameter(description = "Peer ids") @Valid @Body List<Boolean> body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List all Peering peers", operationId = "adminPeeringPeersGet", description = "This endpoint can be used to list all peers on Peering Service" , tags = {"admin", "peering", "peers"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/admin/peering/peers", produces = { "application/json" })
    default Single<HttpResponse<String>> adminPeeringPeersGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add peers on Peering Service", operationId = "adminPeeringPeersPost", description = "This endpoint can be used to add a Peer from the Peering Service" , tags = {"admin", "peering", "peers"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/admin/peering/peers", produces = { "application/json" })
    default Single<HttpResponse<String>> adminPeeringPeersPost() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Start Peering", operationId = "adminPeeringStartPost", description = "This endpoint can be used to start the Peering Service" , tags = {"admin", "peering", "peers"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/admin/peering/start", produces = { "application/json" })
    default Single<HttpResponse<String>> adminPeeringStartPost() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Check Peering Status", operationId = "adminPeeringStatusGet", description = "This endpoint can be used to check the Peering status" , tags = {"admin", "peering", "peers"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/admin/peering/status", produces = { "application/json" })
    default Single<HttpResponse<String>> adminPeeringStatusGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Stop Peering", operationId = "adminPeeringStopPost", description = "This endpoint can be used to stop the Peering Service" , tags = {"admin", "peering", "peers"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/admin/peering/stop", produces = { "application/json" })
    default Single<HttpResponse<String>> adminPeeringStopPost() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get systems(estuary/shuttle) config", operationId = "adminSystemConfigGet", description = "This endpoint is used to get system configs." , tags = {"admin"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/admin/system/config", produces = { "application/json" })
    default Single<HttpResponse<String>> adminSystemConfigGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all users", operationId = "adminUsersGet", description = "This endpoint is used to get all users." , tags = {"admin"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/admin/users", produces = { "application/json" })
    default Single<HttpResponse<String>> adminUsersGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
