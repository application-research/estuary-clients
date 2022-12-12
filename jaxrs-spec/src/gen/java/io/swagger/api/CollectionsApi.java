package io.swagger.api;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
import io.swagger.model.UtilHttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/collections")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2022-12-12T11:11:36.255Z[GMT]")
public class CollectionsApi {

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
    public Response collectionsColuuidCommitPost( @PathParam("coluuid")

 @Parameter(description = "coluuid") String coluuid
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsColuuidContentsDelete(@Valid ApiDeleteContentFromCollectionBody body, @PathParam("coluuid")

 @Parameter(description = "Collection ID") String coluuid
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsColuuidDelete( @PathParam("coluuid")

 @Parameter(description = "Collection ID") String coluuid
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsColuuidGet( @PathParam("coluuid")

 @Parameter(description = "coluuid") String coluuid
,  @QueryParam("dir") 

 @Parameter(description = "Directory")  String dir
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsColuuidPost(@Valid List<Integer> body, @PathParam("coluuid")

 @Parameter(description = "Collection UUID") String coluuid
,  @QueryParam("dir") 

 @Parameter(description = "Directory")  String dir
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsFsAddPost( @NotNull  @QueryParam("coluuid") 

 @Parameter(description = "Collection ID")  String coluuid
, @NotNull  @QueryParam("content") 

 @Parameter(description = "Content")  String content
, @NotNull  @QueryParam("path") 

 @Parameter(description = "Path to file")  String path
) {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsGet() {
        return Response.ok().entity("magic!").build();
    }
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
    public Response collectionsPost(@Valid ApiCreateCollectionBody body) {
        return Response.ok().entity("magic!").build();
    }}
