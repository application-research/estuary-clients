/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-09T03:38:45.180Z[GMT]")
@Controller
public interface CollectionsApi {


    @Operation(summary = "Produce a CID of the collection contents", operationId = "collectionsColuuidCommitPost", description = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection." , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/collections/{coluuid}/commit", produces = { "application/json" })
    default Single<HttpResponse<String>> collectionsColuuidCommitPost(@Parameter(description = "coluuid") @PathVariable("coluuid") String coluuid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Deletes a content from a collection", operationId = "collectionsColuuidContentsDelete", description = "This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path" , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Delete(value = "/collections/{coluuid}/contents", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<String>> collectionsColuuidContentsDelete(@Parameter(description = "Variable to use when filtering for files (must be either 'path' or 'content_id')") @Valid @Body ApiDeleteContentFromCollectionBody body
,@Parameter(description = "Collection ID") @PathVariable("coluuid") String coluuid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Deletes a collection", operationId = "collectionsColuuidDelete", description = "This endpoint is used to delete an existing collection." , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Delete(value = "/collections/{coluuid}", produces = { "*/*" })
    default Single<HttpResponse<String>> collectionsColuuidDelete(@Parameter(description = "Collection ID") @PathVariable("coluuid") String coluuid
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get contents in a collection", operationId = "collectionsColuuidGet", description = "This endpoint is used to get contents in a collection. If no colpath query param is passed" , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/collections/{coluuid}", produces = { "application/json" })
    default Single<HttpResponse<List<CollectionsCollectionListResponse>>> collectionsColuuidGet(@Parameter(description = "coluuid") @PathVariable("coluuid") String coluuid
,@Nullable @Parameter(description = "Directory") @Valid @QueryValue(value = "dir") String dir
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add contents to a collection", operationId = "collectionsColuuidPost", description = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection." , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/collections/{coluuid}", produces = { "application/json" }, consumes = {"application/json"})
    default Single<HttpResponse<String>> collectionsColuuidPost(@Parameter(description = "Content IDs to add to collection") @Valid @Body List<Integer> body
,@Parameter(description = "Collection UUID") @PathVariable("coluuid") String coluuid
,@Nullable @Parameter(description = "Directory") @Valid @QueryValue(value = "dir") String dir
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Add a file to a collection", operationId = "collectionsFsAddPost", description = "This endpoint adds a file to a collection" , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/collections/fs/add", produces = { "application/json" })
    default Single<HttpResponse<String>> collectionsFsAddPost(@NotNull @Parameter(description = "Collection ID") @Valid @QueryValue(value = "coluuid") String coluuid
,@NotNull @Parameter(description = "Content") @Valid @QueryValue(value = "content") String content
,@NotNull @Parameter(description = "Path to file") @Valid @QueryValue(value = "path") String path
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "List all collections", operationId = "collectionsGet", description = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user." , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "404", description = "Not Found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/collections/", produces = { "application/json" })
    default Single<HttpResponse<List<CollectionsCollection>>> collectionsGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Create a new collection", operationId = "collectionsPost", description = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection." , tags = {"collections"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "404", description = "Not Found")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/collections/", produces = { "application/json" }, consumes = {"*/*"})
    default Single<HttpResponse<CollectionsCollection>> collectionsPost(@Parameter(description = "Collection name and description") @Valid @Body ApiCreateCollectionBody body
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
