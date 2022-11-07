package io.swagger.api;

import io.swagger.model.CollectionsCollection;
import java.util.List;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;
import io.swagger.api.CollectionsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/collections")
@RequestScoped

@Api(description = "the collections API")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")

public class CollectionsApi  {

  @Context SecurityContext securityContext;

  @Inject CollectionsApiService delegate;


    @POST
    @Path("/{coluuid}/commit")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Produce a CID of the collection contents", notes = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidCommitPost(@ApiParam(value = "coluuid",required=true) @PathParam("coluuid") String coluuid) {
        return delegate.collectionsColuuidCommitPost(coluuid, securityContext);
    }

    @DELETE
    @Path("/{coluuid}/contents")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a content from a collection", notes = "This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidContentsDelete(@ApiParam(value = "Collection ID",required=true) @PathParam("coluuid") String coluuid, @ApiParam(value = "Content ID",required=true) @PathParam("contentid") String contentid, @ApiParam(value = "Variable to use when filtering for files (must be either 'path' or 'content_id')" ,required=true) MainDeleteContentFromCollectionBody body) {
        return delegate.collectionsColuuidContentsDelete(coluuid, contentid, body, securityContext);
    }

    @DELETE
    @Path("/{coluuid}")
    
    
    @ApiOperation(value = "Deletes a collection", notes = "This endpoint is used to delete an existing collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidDelete(@ApiParam(value = "Collection ID",required=true) @PathParam("coluuid") String coluuid) {
        return delegate.collectionsColuuidDelete(coluuid, securityContext);
    }

    @GET
    @Path("/{coluuid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contents in a collection", notes = "This endpoint is used to get contents in a collection. If no colpath query param is passed", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidGet(@ApiParam(value = "coluuid",required=true) @PathParam("coluuid") String coluuid,  @ApiParam(value = "Directory")  @QueryParam("dir") String dir) {
        return delegate.collectionsColuuidGet(coluuid, dir, securityContext);
    }

    @POST
    @Path("/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add contents to a collection", notes = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidPost(@ApiParam(value = "coluuid",required=true) @PathParam("coluuid") String coluuid, @ApiParam(value = "Content IDs to add to collection" ,required=true) List<Integer> contentIDs) {
        return delegate.collectionsColuuidPost(coluuid, contentIDs, securityContext);
    }

    @POST
    @Path("/fs/add")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a file to a collection", notes = "This endpoint adds a file to a collection", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsFsAddPost( @NotNull @ApiParam(value = "Collection ID",required=true)  @QueryParam("coluuid") String coluuid,  @NotNull @ApiParam(value = "Content",required=true)  @QueryParam("content") String content,  @NotNull @ApiParam(value = "Path to file",required=true)  @QueryParam("path") String path) {
        return delegate.collectionsFsAddPost(coluuid, content, path, securityContext);
    }

    @GET
    @Path("/")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List all collections", notes = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", response = List.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = List.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsGet() {
        return delegate.collectionsGet(securityContext);
    }

    @POST
    @Path("/")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new collection", notes = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", response = CollectionsCollection.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CollectionsCollection.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsPost(@ApiParam(value = "Collection name and description" ,required=true) MainCreateCollectionBody body) {
        return delegate.collectionsPost(body, securityContext);
    }
}
