/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.MainGetApiKeysResp;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-21T15:16:51.356Z[GMT]")
@Validated
public interface UserApi {

    @Operation(summary = "Get API keys for a user", description = "This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = MainGetApiKeysResp.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/user/api-keys",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<List<MainGetApiKeysResp>>> userApiKeysGet();


    @Operation(summary = "Revoke a User API Key.", description = "This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/user/api-keys/{key_or_hash}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> userApiKeysKeyOrHashDelete(@Parameter(in = ParameterIn.PATH, description = "Key or Hash", required=true, schema=@Schema()) @PathVariable("key_or_hash") String keyOrHash);


    @Operation(summary = "Create API keys for a user", description = "This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MainGetApiKeysResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/user/api-keys",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<MainGetApiKeysResp> userApiKeysPost(@Parameter(in = ParameterIn.QUERY, description = "Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h" ,schema=@Schema()) @Valid @RequestParam(value = "expiry", required = false) String expiry, @Parameter(in = ParameterIn.QUERY, description = "Permissions -- currently unused" ,schema=@Schema()) @Valid @RequestParam(value = "perms", required = false) String perms);


    @Operation(summary = "Export user data", description = "This endpoint is used to get API keys for a user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/user/export",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> userExportGet();


    @Operation(summary = "Get stats for the current user", description = "This endpoint is used to geet stats for the current user.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/user/stats",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> userStatsGet();

}

