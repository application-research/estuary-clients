/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-11-22T22:05:02.846Z[GMT]")
@Controller
public interface DealApi {


    @Operation(summary = "Estimate the cost of a deal", operationId = "dealEstimatePost", description = "This endpoint estimates the cost of a deal" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/deal/estimate", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> dealEstimatePost(@Parameter(description = "The size of the deal in bytes, the replication factor, and the duration of the deal in blocks") @Valid @Body MainEstimateDealBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get Deal Info", operationId = "dealInfoDealidGet", description = "This endpoint returns the deal info for a deal" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deal/info/{dealid}", produces = { "application/json" })
    default Single<HttpResponse<String>> dealInfoDealidGet(@Parameter(description = "Deal ID") @PathVariable("dealid") Integer dealid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get Proposal", operationId = "dealProposalPropcidGet", description = "This endpoint returns the proposal for a deal" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deal/proposal/{propcid}", produces = { "application/json" })
    default Single<HttpResponse<String>> dealProposalPropcidGet(@Parameter(description = "Proposal CID") @PathVariable("propcid") String propcid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Query Ask", operationId = "dealQueryMinerGet", description = "This endpoint returns the ask for a given CID" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deal/query/{miner}", produces = { "application/json" })
    default Single<HttpResponse<String>> dealQueryMinerGet(@Parameter(description = "CID") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get Deal Status by PropCid", operationId = "dealStatusByProposalPropcidGet", description = "Get Deal Status by PropCid" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deal/status-by-proposal/{propcid}", produces = { "application/json" })
    default Single<HttpResponse<String>> dealStatusByProposalPropcidGet(@Parameter(description = "PropCid") @PathVariable("propcid") String propcid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Deal Status", operationId = "dealStatusMinerPropcidGet", description = "This endpoint returns the status of a deal" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deal/status/{miner}/{propcid}", produces = { "application/json" })
    default Single<HttpResponse<String>> dealStatusMinerPropcidGet(@Parameter(description = "Miner") @PathVariable("miner") String miner
,@Parameter(description = "Proposal CID") @PathVariable("propcid") String propcid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Transfer In Progress", operationId = "dealTransferInProgressGet", description = "This endpoint returns the in-progress transfers" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deal/transfer/in-progress", produces = { "application/json" })
    default Single<HttpResponse<String>> dealTransferInProgressGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Transfer Status", operationId = "dealTransferStatusPost", description = "This endpoint returns the status of a transfer" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/deal/transfer/status", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> dealTransferStatusPost(@Parameter(description = "Channel ID") @Valid @Body MainChannelIDParam body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
