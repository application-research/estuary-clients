package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CollectionsApiService;
import io.swagger.api.factories.CollectionsApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/collections")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-19T16:30:00.833Z[GMT]")public class CollectionsApi  {
   private final CollectionsApiService delegate;

   public CollectionsApi(@Context ServletConfig servletContext) {
      CollectionsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CollectionsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CollectionsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CollectionsApiServiceFactory.getCollectionsApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{coluuid}/commit")
    
    @Produces({ "application/json" })
    @Operation(summary = "Produce a CID of the collection contents", description = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsColuuidCommitPost(@Parameter(in = ParameterIn.PATH, description = "coluuid",required=true) @PathParam("coluuid") String coluuid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsColuuidCommitPost(coluuid,securityContext);
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
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsColuuidContentsDelete(@Parameter(in = ParameterIn.DEFAULT, description = "Variable to use when filtering for files (must be either 'path' or 'content_id')" ,required=true) ApiDeleteContentFromCollectionBody body

,@Parameter(in = ParameterIn.PATH, description = "Collection ID",required=true) @PathParam("coluuid") String coluuid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsColuuidContentsDelete(body,coluuid,securityContext);
    }
    @DELETE
    @Path("/{coluuid}")
    
    @Produces({ "*/*" })
    @Operation(summary = "Deletes a collection", description = "This endpoint is used to delete an existing collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsColuuidDelete(@Parameter(in = ParameterIn.PATH, description = "Collection ID",required=true) @PathParam("coluuid") String coluuid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsColuuidDelete(coluuid,securityContext);
    }
    @GET
    @Path("/{coluuid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get contents in a collection", description = "This endpoint is used to get contents in a collection. If no colpath query param is passed", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsCollectionListResponse.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsColuuidGet(@Parameter(in = ParameterIn.PATH, description = "coluuid",required=true) @PathParam("coluuid") String coluuid
,@Parameter(in = ParameterIn.QUERY, description = "Directory") @QueryParam("dir") String dir
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsColuuidGet(coluuid,dir,securityContext);
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
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsColuuidPost(@Parameter(in = ParameterIn.DEFAULT, description = "Content IDs to add to collection" ,required=true) List<Integer> body

,@Parameter(in = ParameterIn.PATH, description = "Collection UUID",required=true) @PathParam("coluuid") String coluuid
,@Parameter(in = ParameterIn.QUERY, description = "Directory") @QueryParam("dir") String dir
,@Parameter(in = ParameterIn.QUERY, description = "Overwrite conflicting files") @QueryParam("overwrite") String overwrite
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsColuuidPost(body,coluuid,dir,overwrite,securityContext);
    }
    @POST
    @Path("/fs/add")
    
    @Produces({ "application/json" })
    @Operation(summary = "Add a file to a collection", description = "This endpoint adds a file to a collection", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsFsAddPost(@Parameter(in = ParameterIn.QUERY, description = "Collection ID",required=true) @QueryParam("coluuid") String coluuid
,@Parameter(in = ParameterIn.QUERY, description = "Content",required=true) @QueryParam("content") String content
,@Parameter(in = ParameterIn.QUERY, description = "Directory inside collection") @QueryParam("dir") String dir
,@Parameter(in = ParameterIn.QUERY, description = "Overwrite file if already exists in path") @QueryParam("overwrite") String overwrite
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsFsAddPost(coluuid,content,dir,overwrite,securityContext);
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
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsGet(securityContext);
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
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response collectionsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Collection name and description" ,required=true) ApiCreateCollectionBody body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionsPost(body,securityContext);
    }
}
