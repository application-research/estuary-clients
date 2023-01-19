package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/collections")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-19T16:30:02.672Z[GMT]")public interface CollectionsApi  {
   
    @POST
    @Path("/{coluuid}/commit")
    
    @Produces({ "application/json" })
    @Operation(summary = "Produce a CID of the collection contents", description = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsColuuidCommitPost( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext);

    @DELETE
    @Path("/{coluuid}/contents")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a content from a collection", description = "This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsColuuidContentsDelete(@Parameter(description = "Variable to use when filtering for files (must be either 'path' or 'content_id')" ,required=true) ApiDeleteContentFromCollectionBody body, @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext);

    @DELETE
    @Path("/{coluuid}")
    
    @Produces({ "*/*" })
    @Operation(summary = "Deletes a collection", description = "This endpoint is used to delete an existing collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsColuuidDelete( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext);

    @GET
    @Path("/{coluuid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get contents in a collection", description = "This endpoint is used to get contents in a collection. If no colpath query param is passed", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsCollectionListResponse.class)))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsColuuidGet( @PathParam("coluuid") String coluuid, @QueryParam("dir") String dir,@Context SecurityContext securityContext);

    @POST
    @Path("/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add contents to a collection", description = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsColuuidPost(@Parameter(description = "Content IDs to add to collection" ,required=true) List<Integer> body, @PathParam("coluuid") String coluuid, @QueryParam("dir") String dir, @QueryParam("overwrite") String overwrite,@Context SecurityContext securityContext);

    @POST
    @Path("/fs/add")
    
    @Produces({ "application/json" })
    @Operation(summary = "Add a file to a collection", description = "This endpoint adds a file to a collection", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsFsAddPost( @NotNull @QueryParam("coluuid") String coluuid, @NotNull @QueryParam("content") String content, @QueryParam("dir") String dir, @QueryParam("overwrite") String overwrite,@Context SecurityContext securityContext);

    @GET
    @Path("/")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all collections", description = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsCollection.class)))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsGet(@Context SecurityContext securityContext);

    @POST
    @Path("/")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Create a new collection", description = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionsCollection.class))),
                @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
                @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class)))
         })
    Response collectionsPost(@Parameter(description = "Collection name and description" ,required=true) ApiCreateCollectionBody body,@Context SecurityContext securityContext);

}
