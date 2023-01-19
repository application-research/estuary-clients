/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.37).
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-19T16:30:00.179Z[GMT]")
@Controller
public interface DealsApi {


    @Operation(summary = "Get storage failures for user", operationId = "dealsFailuresGet", description = "This endpoint returns a list of storage failures for user" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deals/failures", produces = { "application/json" })
    default Single<HttpResponse<String>> dealsFailuresGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Make Deal", operationId = "dealsMakeMinerPost", description = "This endpoint makes a deal for a given content and miner" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/deals/make/{miner}", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> dealsMakeMinerPost(@Parameter(description = "Deal Request") @Valid @Body String body
,@Parameter(description = "Miner") @PathVariable("miner") String miner
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get Deal Status", operationId = "dealsStatusDealGet", description = "This endpoint returns the status of a deal" , tags = {"deals"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/deals/status/{deal}", produces = { "application/json" })
    default Single<HttpResponse<String>> dealsStatusDealGet(@Parameter(description = "Deal ID") @PathVariable("deal") Integer deal
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
