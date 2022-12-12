/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiPublicNodeInfo;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-12T21:11:36.611Z[GMT]")
@Controller
public interface PublicApi {


    @Operation(summary = "Get Content by Cid", operationId = "publicByCidCidGet", description = "This endpoint returns the content record associated with a CID" , tags = {"public"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/by-cid/{cid}", produces = { "application/json" })
    default Single<HttpResponse<String>> publicByCidCidGet(@Parameter(description = "Cid") @PathVariable("cid") String cid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get storage failures", operationId = "publicDealsFailuresGet", description = "This endpoint returns a list of storage failures" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/deals/failures", produces = { "application/json" })
    default Single<HttpResponse<String>> publicDealsFailuresGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get public node info", operationId = "publicInfoGet", description = "This endpoint returns information about the node" , tags = {"public"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/info", produces = { "application/json" })
    default Single<HttpResponse<ApiPublicNodeInfo>> publicInfoGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get deal metrics", operationId = "publicMetricsDealsOnChainGet", description = "This endpoint is used to get deal metrics" , tags = {"public", "metrics"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/metrics/deals-on-chain", produces = { "application/json" })
    default Single<HttpResponse<String>> publicMetricsDealsOnChainGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all miners deals", operationId = "publicMinersDealsMinerGet", description = "This endpoint returns all miners deals" , tags = {"public", "miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/miners/deals/{miner}", produces = { "application/json" })
    default Single<HttpResponse<String>> publicMinersDealsMinerGet(@Parameter(description = "Filter by miner") @PathVariable("miner") String miner
,@Nullable @Parameter(description = "Ignore Failed") @Valid @QueryValue(value = "ignore-failed") String ignoreFailed
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all miners", operationId = "publicMinersFailuresMinerGet", description = "This endpoint returns all miners" , tags = {"public", "net"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/miners/failures/{miner}", produces = { "application/json" })
    default Single<HttpResponse<String>> publicMinersFailuresMinerGet(@Parameter(description = "Filter by miner") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all miners", operationId = "publicMinersGet", description = "This endpoint returns all miners" , tags = {"public", "net"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/miners", produces = { "application/json" })
    default Single<HttpResponse<String>> publicMinersGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get miner stats", operationId = "publicMinersStatsMinerGet", description = "This endpoint returns miner stats" , tags = {"public", "miner"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/miners/stats/{miner}", produces = { "application/json" })
    default Single<HttpResponse<String>> publicMinersStatsMinerGet(@Parameter(description = "Filter by miner") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Query Ask", operationId = "publicMinersStorageQueryMinerGet", description = "This endpoint returns the ask for a given CID" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/miners/storage/query/{miner}", produces = { "application/json" })
    default Single<HttpResponse<String>> publicMinersStorageQueryMinerGet(@Parameter(description = "CID") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Net Addrs", operationId = "publicNetAddrsGet", description = "This endpoint is used to get net addrs" , tags = {"public", "net"})
    @ApiResponse(responseCode = "200", description = "OK")
    @Get(value = "/public/net/addrs", produces = { "application/json" })
    default Single<HttpResponse<List<String>>> publicNetAddrsGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Net Peers", operationId = "publicNetPeersGet", description = "This endpoint is used to get net peers" , tags = {"public", "net"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/net/peers", produces = { "application/json" })
    default Single<HttpResponse<List<String>>> publicNetPeersGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Public stats", operationId = "publicStatsGet", description = "This endpoint is used to get public stats." , tags = {"public"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/public/stats", produces = { "application/json" })
    default Single<HttpResponse<String>> publicStatsGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
