package io.swagger.api;

import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.UtilHttpError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
@Path("/")
@Api(value = "/", description = "")
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
    @ApiOperation(value = "Produce a CID of the collection contents", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String collectionsColuuidCommitPost(@PathParam("coluuid") String coluuid);

    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     *
     */
    @DELETE
    @Path("/collections/{coluuid}")
    @ApiOperation(value = "Deletes a collection", tags={  })
    @ApiResponses(value = {  })
    public void collectionsColuuidDelete(@PathParam("coluuid") String coluuid);

    /**
     * Get contents in a collection
     *
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     *
     */
    @GET
    @Path("/collections/{coluuid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contents in a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String collectionsColuuidGet(@QueryParam("coluuid")String coluuid, @QueryParam("dir")String dir);

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
    @ApiOperation(value = "Add contents to a collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Map.class, responseContainer = "Map") })
    public Map<String, String> collectionsColuuidPost(List<Integer> body);

    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     *
     */
    @POST
    @Path("/collections/fs/add")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a file to a collection", tags={  })
    @ApiResponses(value = {  })
    public void collectionsFsAddPost(@QueryParam("coluuid")String coluuid, @QueryParam("content")String content, @QueryParam("path")String path);

    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     *
     */
    @GET
    @Path("/collections/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List all collections", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainCollection.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public List<MainCollection> collectionsGet(@PathParam("id") Integer id);

    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     *
     */
    @POST
    @Path("/collections/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new collection", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MainCollection.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public MainCollection collectionsPost(MainCreateCollectionBody body);
}

