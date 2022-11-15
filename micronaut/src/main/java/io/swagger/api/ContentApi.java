/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-11-15T21:05:26.582Z[GMT]")
@Controller
public interface ContentApi {


    @Operation(summary = "Add Car object", operationId = "contentAddCarPost", description = "This endpoint is used to add a car object to the network. The object can be a file or a directory." , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/content/add-car", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> contentAddCarPost(@Parameter(description = "Car") @Valid @Body String body
,@Nullable @Parameter(description = "Ignore Dupes") @Valid @QueryValue(value = "ignore-dupes") String ignoreDupes
,@Nullable @Parameter(description = "Filename") @Valid @QueryValue(value = "filename") String filename
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add IPFS object", operationId = "contentAddIpfsPost", description = "This endpoint is used to add an IPFS object to the network. The object can be a file or a directory." , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/content/add-ipfs", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> contentAddIpfsPost(@Parameter(description = "IPFS Body") @Valid @Body UtilContentAddIpfsBody body
,@Nullable @Parameter(description = "Ignore Dupes") @Valid @QueryValue(value = "ignore-dupes") String ignoreDupes
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add new content", operationId = "contentAddPost", description = "This endpoint is used to upload new content." , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/content/add", produces = { "application/json" }, consumes = {"multipart/form-data"})
    default Single<HttpResponse<UtilContentAddResponse>> contentAddPost(@Parameter(description = "file detail") @Valid MultipartFile data
,@Parameter(description = "") @QueryValue(value = "filename")  String filename
,@Nullable @Parameter(description = "Collection UUID") @Valid @QueryValue(value = "coluuid") String coluuid
,@Nullable @Parameter(description = "Replication value") @Valid @QueryValue(value = "replication") Integer replication
,@Nullable @Parameter(description = "Ignore Dupes true/false") @Valid @QueryValue(value = "ignore-dupes") String ignoreDupes
,@Nullable @Parameter(description = "Lazy Provide true/false") @Valid @QueryValue(value = "lazy-provide") String lazyProvide
,@Nullable @Parameter(description = "Directory") @Valid @QueryValue(value = "dir") String dir
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get aggregated content stats", operationId = "contentAggregatedContentGet", description = "This endpoint returns aggregated content stats" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/aggregated/{content}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentAggregatedContentGet(@Parameter(description = "Content ID") @PathVariable("content") String content
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get all deals for a user", operationId = "contentAllDealsGet", description = "This endpoint is used to get all deals for a user" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/all-deals", produces = { "application/json" })
    default Single<HttpResponse<String>> contentAllDealsGet(@NotNull @Parameter(description = "Begin") @Valid @QueryValue(value = "begin") String begin
,@NotNull @Parameter(description = "Duration") @Valid @QueryValue(value = "duration") String duration
,@NotNull @Parameter(description = "All") @Valid @QueryValue(value = "all") String all
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get content bandwidth", operationId = "contentBwUsageContentGet", description = "This endpoint returns content bandwidth" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/bw-usage/{content}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentBwUsageContentGet(@Parameter(description = "Content ID") @PathVariable("content") String content
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add a new content", operationId = "contentCreatePost", description = "This endpoint adds a new content" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/content/create", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> contentCreatePost(@Parameter(description = "Content") @Valid @Body UtilContentCreateBody body
,@Nullable @Parameter(description = "Ignore Dupes") @Valid @QueryValue(value = "ignore-dupes") String ignoreDupes
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Content with deals", operationId = "contentDealsGet", description = "This endpoint lists all content with deals" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/deals", produces = { "application/json" })
    default Single<HttpResponse<String>> contentDealsGet(@Nullable @Parameter(description = "Limit") @Valid @QueryValue(value = "limit") Integer limit
,@Nullable @Parameter(description = "Offset") @Valid @QueryValue(value = "offset") Integer offset
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Ensure Replication", operationId = "contentEnsureReplicationDatacidGet", description = "This endpoint ensures that the content is replicated to the specified number of providers" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/ensure-replication/{datacid}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentEnsureReplicationDatacidGet(@Parameter(description = "Data CID") @PathVariable("datacid") String datacid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List all failures for a content", operationId = "contentFailuresContentGet", description = "This endpoint returns all failures for a content" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/failures/{content}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentFailuresContentGet(@Parameter(description = "Content ID") @PathVariable("content") String content
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Content", operationId = "contentIdGet", description = "This endpoint returns a content by its ID" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/{id}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentIdGet(@Parameter(description = "Content ID") @PathVariable("id") Integer id
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Import a deal", operationId = "contentImportdealPost", description = "This endpoint imports a deal into the shuttle." , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/content/importdeal", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> contentImportdealPost(@Parameter(description = "Import a deal") @Valid @Body MainImportDealBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List all pinned content", operationId = "contentListGet", description = "This endpoint lists all content" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/list", produces = { "application/json" })
    default Single<HttpResponse<String>> contentListGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Read content", operationId = "contentReadContGet", description = "This endpoint reads content from the blockstore" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/read/{cont}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentReadContGet(@Parameter(description = "CID") @PathVariable("cont") String cont
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get staging zone for user", operationId = "contentStagingZonesGet", description = "This endpoint is used to get staging zone for user." , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/staging-zones", produces = { "application/json" })
    default Single<HttpResponse<String>> contentStagingZonesGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get content statistics", operationId = "contentStatsGet", description = "This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/stats", produces = { "application/json" })
    default Single<HttpResponse<String>> contentStatsGet(@NotNull @Parameter(description = "limit") @Valid @QueryValue(value = "limit") String limit
,@NotNull @Parameter(description = "offset") @Valid @QueryValue(value = "offset") String offset
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Content Status", operationId = "contentStatusIdGet", description = "This endpoint returns the status of a content" , tags = {"content"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/content/status/{id}", produces = { "application/json" })
    default Single<HttpResponse<String>> contentStatusIdGet(@Parameter(description = "Content ID") @PathVariable("id") Integer id
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
