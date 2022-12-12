/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-12T11:11:32.220Z[GMT]")
@Controller
public interface PinningApi {


    @Operation(summary = "List all pin status objects", operationId = "pinningPinsGet", description = "This endpoint lists all pin status objects" , tags = {"pinning"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/pinning/pins", produces = { "application/json" })
    default Single<HttpResponse<TypesIpfsListPinStatusResponse>> pinningPinsGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Delete a pinned object", operationId = "pinningPinsPinidDelete", description = "This endpoint deletes a pinned object." , tags = {"pinning"})
    @ApiResponse(responseCode = "202", description = "Accepted")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Delete(value = "/pinning/pins/{pinid}", produces = { "application/json" })
    default Single<HttpResponse<Void>> pinningPinsPinidDelete(@Parameter(description = "Pin ID") @PathVariable("pinid") String pinid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get a pin status object", operationId = "pinningPinsPinidGet", description = "This endpoint returns a pin status object." , tags = {"pinning"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "404", description = "Not Found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/pinning/pins/{pinid}", produces = { "application/json" })
    default Single<HttpResponse<TypesIpfsPinStatusResponse>> pinningPinsPinidGet(@Parameter(description = "cid") @PathVariable("pinid") String pinid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Replace a pinned object", operationId = "pinningPinsPinidPost", description = "This endpoint replaces a pinned object." , tags = {"pinning"})
    @ApiResponse(responseCode = "202", description = "Accepted")
    @ApiResponse(responseCode = "404", description = "Not Found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/pinning/pins/{pinid}", produces = { "application/json" }, consumes = {"application/json"})
    default Single<HttpResponse<TypesIpfsPinStatusResponse>> pinningPinsPinidPost(@Parameter(description = "New pin") @Valid @Body TypesIpfsPin body
,@Parameter(description = "Pin ID to be replaced") @PathVariable("pinid") String pinid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add and pin object", operationId = "pinningPinsPost", description = "This endpoint adds a pin to the IPFS daemon." , tags = {"pinning"})
    @ApiResponse(responseCode = "202", description = "Accepted")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/pinning/pins", produces = { "application/json" }, consumes = {"application/json"})
    default Single<HttpResponse<TypesIpfsPinStatusResponse>> pinningPinsPost(@Parameter(description = "Pin Body {cid:cid, name:name}") @Valid @Body TypesIpfsPin body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
