/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-21T01:22:09.878Z[GMT]")
@Controller
public interface StorageProvidersApi {


    @Operation(summary = "Claim Storage Provider", operationId = "storageProvidersClaimPost", description = "This endpoint lets a user claim a storage provider" , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/storage-providers/claim", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<GithubComApplicationResearchEstuaryApiV2ClaimResponse>> storageProvidersClaimPost(@Parameter(description = "Claim Storage Provider Body") @Valid @Body MinerClaimMinerBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get Claim Storage Provider", operationId = "storageProvidersClaimSpGet", description = "This endpoint lets a user get the message in order to claim a storage provider" , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/storage-providers/claim/{sp}", produces = { "application/json" })
    default Single<HttpResponse<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>> storageProvidersClaimSpGet(@Parameter(description = "Storage Provider claim message") @PathVariable("sp") String sp
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all storage providers deals", operationId = "storageProvidersDealsSpGet", description = "This endpoint returns all storage providers deals" , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/storage-providers/deals/{sp}", produces = { "application/json" })
    default Single<HttpResponse<String>> storageProvidersDealsSpGet(@Parameter(description = "Filter by storage provider") @PathVariable("sp") String sp
,@Nullable @Parameter(description = "Ignore Failed") @Valid @QueryValue(value = "ignore-failed") String ignoreFailed
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all storage providers", operationId = "storageProvidersFailuresSpGet", description = "This endpoint returns all storage providers" , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/storage-providers/failures/{sp}", produces = { "application/json" })
    default Single<HttpResponse<String>> storageProvidersFailuresSpGet(@Parameter(description = "Filter by storage provider") @PathVariable("sp") String sp
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all storage providers", operationId = "storageProvidersGet", description = "This endpoint returns all storage providers" , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/storage-providers", produces = { "application/json" })
    default Single<HttpResponse<List<ApiStorageProviderResp>>> storageProvidersGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Set Storage Provider Info", operationId = "storageProvidersSetInfoSpPut", description = "This endpoint lets a user set storage provider info." , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Put(value = "/storage-providers/set-info/{sp}", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<Void>> storageProvidersSetInfoSpPut(@Parameter(description = "Storage Provider set info params") @Valid @Body MinerMinerSetInfoParams body
,@Parameter(description = "Storage Provider to set info for") @PathVariable("sp") String sp
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get storage provider stats", operationId = "storageProvidersStatsSpGet", description = "This endpoint returns storage provider stats" , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/storage-providers/stats/{sp}", produces = { "application/json" })
    default Single<HttpResponse<String>> storageProvidersStatsSpGet(@Parameter(description = "Filter by storage provider") @PathVariable("sp") String sp
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Query Ask", operationId = "storageProvidersStorageQueryCidGet", description = "This endpoint returns the ask for a given CID" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/storage-providers/storage/query/{cid}", produces = { "application/json" })
    default Single<HttpResponse<String>> storageProvidersStorageQueryCidGet(@Parameter(description = "CID") @PathVariable("cid") String cid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Suspend Storage Provider", operationId = "storageProvidersSuspendSpPost", description = "This endpoint lets a user suspend a storage provider." , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/storage-providers/suspend/{sp}", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<Map<String, String>>> storageProvidersSuspendSpPost(@Parameter(description = "Suspend Storage Provider Body") @Valid @Body MinerSuspendMinerBody body
,@Parameter(description = "Storage Provider to suspend") @PathVariable("sp") String sp
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Unuspend Storage Provider", operationId = "storageProvidersUnsuspendSpPut", description = "This endpoint lets a user unsuspend a Storage Provider." , tags = {"sp"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Put(value = "/storage-providers/unsuspend/{sp}", produces = { "application/json" })
    default Single<HttpResponse<Void>> storageProvidersUnsuspendSpPut(@Parameter(description = "Storage Provider to unsuspend") @PathVariable("sp") String sp
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
