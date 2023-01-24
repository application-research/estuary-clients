/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.38).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-24T07:25:42.279Z[GMT]")
@Controller
public interface MinerApi {


    @Operation(summary = "Get Claim Miner Message", operationId = "minerClaimMinerGet", description = "This endpoint lets a user get the message in order to claim a miner" , tags = {"miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/miner/claim/{miner}", produces = { "application/json" })
    default Single<HttpResponse<ApiClaimMsgResponse>> minerClaimMinerGet(@Parameter(description = "Miner claim message") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Claim Miner", operationId = "minerClaimPost", description = "This endpoint lets a user claim a miner" , tags = {"miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/miner/claim", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<ApiClaimResponse>> minerClaimPost(@Parameter(description = "Claim Miner Body") @Valid @Body MinerClaimMinerBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Set Miner Info", operationId = "minerSetInfoMinerPut", description = "This endpoint lets a user set miner info." , tags = {"miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Put(value = "/miner/set-info/{miner}", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<ApiEmptyResp>> minerSetInfoMinerPut(@Parameter(description = "Miner set info params") @Valid @Body MinerMinerSetInfoParams body
,@Parameter(description = "Miner to set info for") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Suspend Miner", operationId = "minerSuspendMinerPost", description = "This endpoint lets a user suspend a miner." , tags = {"miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/miner/suspend/{miner}", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<ApiEmptyResp>> minerSuspendMinerPost(@Parameter(description = "Suspend Miner Body") @Valid @Body MinerSuspendMinerBody body
,@Parameter(description = "Miner to suspend") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Unuspend Miner", operationId = "minerUnsuspendMinerPut", description = "This endpoint lets a user unsuspend a miner." , tags = {"miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Put(value = "/miner/unsuspend/{miner}", produces = { "application/json" })
    default Single<HttpResponse<ApiEmptyResp>> minerUnsuspendMinerPut(@Parameter(description = "Miner to unsuspend") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
