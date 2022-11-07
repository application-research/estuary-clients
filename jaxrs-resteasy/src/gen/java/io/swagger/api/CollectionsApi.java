package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CollectionsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CollectionsCollection;
import java.util.List;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/collections")


@io.swagger.annotations.Api(description = "the collections API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class CollectionsApi  {

    @Inject CollectionsApiService service;

    @POST
    @Path("/{coluuid}/commit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Produce a CID of the collection contents", notes = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidCommitPost( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidCommitPost(coluuid,securityContext);
    }
    @DELETE
    @Path("/{coluuid}/contents")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a content from a collection", notes = "This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidContentsDelete( @PathParam("coluuid") String coluuid, @PathParam("contentid") String contentid,@ApiParam(value = "Variable to use when filtering for files (must be either 'path' or 'content_id')" ,required=true) MainDeleteContentFromCollectionBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidContentsDelete(coluuid,contentid,body,securityContext);
    }
    @DELETE
    @Path("/{coluuid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a collection", notes = "This endpoint is used to delete an existing collection.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidDelete( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidDelete(coluuid,securityContext);
    }
    @GET
    @Path("/{coluuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get contents in a collection", notes = "This endpoint is used to get contents in a collection. If no colpath query param is passed", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidGet( @PathParam("coluuid") String coluuid,  @QueryParam("dir") String dir,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidGet(coluuid,dir,securityContext);
    }
    @POST
    @Path("/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add contents to a collection", notes = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsColuuidPost( @PathParam("coluuid") String coluuid,@ApiParam(value = "Content IDs to add to collection" ,required=true) List<Integer> contentIDs,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidPost(coluuid,contentIDs,securityContext);
    }
    @POST
    @Path("/fs/add")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a file to a collection", notes = "This endpoint adds a file to a collection", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsFsAddPost( @NotNull  @QueryParam("coluuid") String coluuid, @NotNull  @QueryParam("content") String content, @NotNull  @QueryParam("path") String path,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsFsAddPost(coluuid,content,path,securityContext);
    }
    @GET
    @Path("/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all collections", notes = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", response = List.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = List.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsGet(securityContext);
    }
    @POST
    @Path("/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a new collection", notes = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", response = CollectionsCollection.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CollectionsCollection.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsPost(@ApiParam(value = "Collection name and description" ,required=true) MainCreateCollectionBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsPost(body,securityContext);
    }
}
