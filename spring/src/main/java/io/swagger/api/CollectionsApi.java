/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.39).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
import io.swagger.model.UtilHttpError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T18:30:36.664Z[GMT]")
@Validated
public interface CollectionsApi {

    @Operation(summary = "Produce a CID of the collection contents", description = "This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/{coluuid}/commit",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> collectionsColuuidCommitPost(@Parameter(in = ParameterIn.PATH, description = "coluuid", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid);


    @Operation(summary = "Deletes a content from a collection", description = "This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/{coluuid}/contents",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> collectionsColuuidContentsDelete(@Parameter(in = ParameterIn.PATH, description = "Collection ID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid, @Parameter(in = ParameterIn.DEFAULT, description = "Variable to use when filtering for files (must be either 'path' or 'content_id')", required=true, schema=@Schema()) @Valid @RequestBody ApiDeleteContentFromCollectionBody body);


    @Operation(summary = "Deletes a collection", description = "This endpoint is used to delete an existing collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/{coluuid}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> collectionsColuuidDelete(@Parameter(in = ParameterIn.PATH, description = "Collection ID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid);


    @Operation(summary = "Get contents in a collection", description = "This endpoint is used to get contents in a collection. If no colpath query param is passed", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsCollectionListResponse.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/{coluuid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CollectionsCollectionListResponse>> collectionsColuuidGet(@Parameter(in = ParameterIn.PATH, description = "coluuid", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid, @Parameter(in = ParameterIn.QUERY, description = "Directory" ,schema=@Schema()) @Valid @RequestParam(value = "dir", required = false) String dir);


    @Operation(summary = "Add contents to a collection", description = "This endpoint adds already-pinned contents (that have ContentIDs) to a collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/{coluuid}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> collectionsColuuidPost(@Parameter(in = ParameterIn.PATH, description = "Collection UUID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid, @Parameter(in = ParameterIn.DEFAULT, description = "Content IDs to add to collection", required=true, schema=@Schema()) @Valid @RequestBody List<Integer> body, @Parameter(in = ParameterIn.QUERY, description = "Directory" ,schema=@Schema()) @Valid @RequestParam(value = "dir", required = false) String dir, @Parameter(in = ParameterIn.QUERY, description = "Overwrite conflicting files" ,schema=@Schema()) @Valid @RequestParam(value = "overwrite", required = false) String overwrite);


    @Operation(summary = "Add a file to a collection", description = "This endpoint adds a file to a collection", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/fs/add",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<String> collectionsFsAddPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Collection ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "coluuid", required = true) String coluuid, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Content" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "content", required = true) String content, @Parameter(in = ParameterIn.QUERY, description = "Directory inside collection" ,schema=@Schema()) @Valid @RequestParam(value = "dir", required = false) String dir, @Parameter(in = ParameterIn.QUERY, description = "Overwrite file if already exists in path" ,schema=@Schema()) @Valid @RequestParam(value = "overwrite", required = false) String overwrite);


    @Operation(summary = "List all collections", description = "This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsCollection.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CollectionsCollection>> collectionsGet();


    @Operation(summary = "Create a new collection", description = "This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionsCollection.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/collections/",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<CollectionsCollection> collectionsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Collection name and description", required=true, schema=@Schema()) @Valid @RequestBody ApiCreateCollectionBody body);

}

