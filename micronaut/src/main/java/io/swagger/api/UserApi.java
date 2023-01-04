/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiGetApiKeysResp;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-04T12:55:53.483Z[GMT]")
@Controller
public interface UserApi {


    @Operation(summary = "Get API keys for a user", operationId = "userApiKeysGet", description = "This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user." , tags = {"User"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "404", description = "Not Found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/user/api-keys", produces = { "application/json" })
    default Single<HttpResponse<List<ApiGetApiKeysResp>>> userApiKeysGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Revoke a User API Key.", operationId = "userApiKeysKeyOrHashDelete", description = "This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable." , tags = {"User"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Delete(value = "/user/api-keys/{key_or_hash}", produces = { "application/json" })
    default Single<HttpResponse<String>> userApiKeysKeyOrHashDelete(@Parameter(description = "Key or Hash") @PathVariable("key_or_hash") String keyOrHash
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Create API keys for a user", operationId = "userApiKeysPost", description = "This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features." , tags = {"User"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "404", description = "Not Found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/user/api-keys", produces = { "application/json" })
    default Single<HttpResponse<ApiGetApiKeysResp>> userApiKeysPost(@Nullable @Parameter(description = "Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h") @Valid @QueryValue(value = "expiry") String expiry
,@Nullable @Parameter(description = "Permissions -- currently unused") @Valid @QueryValue(value = "perms") String perms
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Export user data", operationId = "userExportGet", description = "This endpoint is used to get API keys for a user." , tags = {"User"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/user/export", produces = { "application/json" })
    default Single<HttpResponse<String>> userExportGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get stats for the current user", operationId = "userStatsGet", description = "This endpoint is used to get stats for the current user." , tags = {"User"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/user/stats", produces = { "application/json" })
    default Single<HttpResponse<String>> userStatsGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
