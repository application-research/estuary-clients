package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CollectionsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;
import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T23:21:59.224Z")
public class CollectionsApi  {

    @Inject CollectionsApiService service;

    @POST
    @Path("/{coluuid}/commit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Produce a CID of the collection contents", notes = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response collectionsColuuidCommitPost( @PathParam("coluuid") String coluuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidCommitPost(coluuid,securityContext);
    }
    @DELETE
    @Path("/{coluuid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a collection", notes = "This endpoint is used to delete an existing collection.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = {  })
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response collectionsColuuidGet( @NotNull  @QueryParam("coluuid") String coluuid,  @QueryParam("dir") String dir,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidGet(coluuid,dir,securityContext);
    }
    @POST
    @Path("/{coluuid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add contents to a collection", notes = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", response = String.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Map.class, responseContainer = "Map") })
    public Response collectionsColuuidPost(@ApiParam(value = "Content IDs to add to collection" ,required=true) List<Integer> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsColuuidPost(body,securityContext);
    }
    @POST
    @Path("/fs/add")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a file to a collection", notes = "This endpoint adds a file to a collection", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response collectionsFsAddPost( @NotNull  @QueryParam("coluuid") String coluuid, @NotNull  @QueryParam("content") String content, @NotNull  @QueryParam("path") String path,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsFsAddPost(coluuid,content,path,securityContext);
    }
    @GET
    @Path("/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List all collections", notes = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", response = MainCollection.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MainCollection.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsGet( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsGet(id,securityContext);
    }
    @POST
    @Path("/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a new collection", notes = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", response = MainCollection.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MainCollection.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    public Response collectionsPost(@ApiParam(value = "Collection name and description" ,required=true) MainCreateCollectionBody body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.collectionsPost(body,securityContext);
    }
}
