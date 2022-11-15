package io.swagger.api;

import io.swagger.model.CollectionsCollection;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
public interface CollectionsApi  {

    /**
     * Produce a CID of the collection contents
     *
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     *
     */
    @POST
    @Path("/collections/{coluuid}/commit")
    @Produces({ "application/json" })
    @Operation(summary = "Produce a CID of the collection contents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String collectionsColuuidCommitPost(@PathParam("coluuid") String coluuid);

    /**
     * Deletes a content from a collection
     *
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     *
     */
    @DELETE
    @Path("/collections/{coluuid}/contents")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Deletes a content from a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String collectionsColuuidContentsDelete(MainDeleteContentFromCollectionBody body, @PathParam("coluuid") String coluuid, @PathParam("contentid") String contentid);

    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     *
     */
    @DELETE
    @Path("/collections/{coluuid}")
    @Produces({ "*/*" })
    @Operation(summary = "Deletes a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))) })
    public String collectionsColuuidDelete(@PathParam("coluuid") String coluuid);

    /**
     * Get contents in a collection
     *
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     *
     */
    @GET
    @Path("/collections/{coluuid}")
    @Produces({ "application/json" })
    @Operation(summary = "Get contents in a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String collectionsColuuidGet(@PathParam("coluuid") String coluuid, @QueryParam("dir")String dir);

    /**
     * Add contents to a collection
     *
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     *
     */
    @POST
    @Path("/collections/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add contents to a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String collectionsColuuidPost(List<Integer> body, @PathParam("coluuid") String coluuid);

    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     *
     */
    @POST
    @Path("/collections/fs/add")
    @Produces({ "application/json" })
    @Operation(summary = "Add a file to a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public String collectionsFsAddPost(@QueryParam("coluuid")String coluuid, @QueryParam("content")String content, @QueryParam("path")String path);

    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     *
     */
    @GET
    @Path("/collections/")
    @Produces({ "application/json" })
    @Operation(summary = "List all collections", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsCollection.class)))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public List<List<CollectionsCollection>> collectionsGet();

    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     *
     */
    @POST
    @Path("/collections/")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @Operation(summary = "Create a new collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionsCollection.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public CollectionsCollection collectionsPost(MainCreateCollectionBody body);
}
