/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.CollectionsCollection;
import java.util.List;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-11T23:35:23.025Z")

@Validated
@Api(value = "collections", description = "the collections API")
@RequestMapping(value = "")
public interface CollectionsApi {

    @ApiOperation(value = "Produce a CID of the collection contents", nickname = "collectionsColuuidCommitPost", notes = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/{coluuid}/commit",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> collectionsColuuidCommitPost(@ApiParam(value = "coluuid",required=true) @PathVariable("coluuid") String coluuid);


    @ApiOperation(value = "Deletes a content from a collection", nickname = "collectionsColuuidContentsDelete", notes = "This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/{coluuid}/contents",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> collectionsColuuidContentsDelete(@ApiParam(value = "Collection ID",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Content ID",required=true) @PathVariable("contentid") String contentid,@ApiParam(value = "Variable to use when filtering for files (must be either 'path' or 'content_id')" ,required=true )  @Valid @RequestBody MainDeleteContentFromCollectionBody body);


    @ApiOperation(value = "Deletes a collection", nickname = "collectionsColuuidDelete", notes = "This endpoint is used to delete an existing collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/{coluuid}",
        method = RequestMethod.DELETE)
    ResponseEntity<String> collectionsColuuidDelete(@ApiParam(value = "Collection ID",required=true) @PathVariable("coluuid") String coluuid);


    @ApiOperation(value = "Get contents in a collection", nickname = "collectionsColuuidGet", notes = "This endpoint is used to get contents in a collection. If no colpath query param is passed", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/{coluuid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> collectionsColuuidGet(@ApiParam(value = "coluuid",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Directory") @Valid @RequestParam(value = "dir", required = false) String dir);


    @ApiOperation(value = "Add contents to a collection", nickname = "collectionsColuuidPost", notes = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/{coluuid}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> collectionsColuuidPost(@ApiParam(value = "coluuid",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Content IDs to add to collection" ,required=true )  @Valid @RequestBody List<Integer> contentIDs);


    @ApiOperation(value = "Add a file to a collection", nickname = "collectionsFsAddPost", notes = "This endpoint adds a file to a collection", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/fs/add",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> collectionsFsAddPost(@NotNull @ApiParam(value = "Collection ID", required = true) @Valid @RequestParam(value = "coluuid", required = true) String coluuid,@NotNull @ApiParam(value = "Content", required = true) @Valid @RequestParam(value = "content", required = true) String content,@NotNull @ApiParam(value = "Path to file", required = true) @Valid @RequestParam(value = "path", required = true) String path);


    @ApiOperation(value = "List all collections", nickname = "collectionsGet", notes = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", response = List.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = List.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<List<CollectionsCollection>>> collectionsGet();


    @ApiOperation(value = "Create a new collection", nickname = "collectionsPost", notes = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", response = CollectionsCollection.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "collections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CollectionsCollection.class),
        @ApiResponse(code = 400, message = "Bad Request", response = UtilHttpError.class),
        @ApiResponse(code = 404, message = "Not Found", response = UtilHttpError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = UtilHttpError.class) })
    @RequestMapping(value = "/collections/",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<CollectionsCollection> collectionsPost(@ApiParam(value = "Collection name and description" ,required=true )  @Valid @RequestBody MainCreateCollectionBody body);

}
