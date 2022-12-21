/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-21T01:22:11.956Z[GMT]")
@Validated
public interface StorageProvidersApi {

    @Operation(summary = "Claim Storage Provider", description = "This endpoint lets a user claim a storage provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/claim",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimResponse> storageProvidersClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Storage Provider Body", required=true, schema=@Schema()) @Valid @RequestBody MinerClaimMinerBody body);


    @Operation(summary = "Get Claim Storage Provider", description = "This endpoint lets a user get the message in order to claim a storage provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/claim/{sp}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> storageProvidersClaimSpGet(@Parameter(in = ParameterIn.PATH, description = "Storage Provider claim message", required=true, schema=@Schema()) @PathVariable("sp") String sp);


    @Operation(summary = "Get all storage providers deals", description = "This endpoint returns all storage providers deals", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/deals/{sp}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> storageProvidersDealsSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider", required=true, schema=@Schema()) @PathVariable("sp") String sp, @Parameter(in = ParameterIn.QUERY, description = "Ignore Failed" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-failed", required = false) String ignoreFailed);


    @Operation(summary = "Get all storage providers", description = "This endpoint returns all storage providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/failures/{sp}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> storageProvidersFailuresSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider", required=true, schema=@Schema()) @PathVariable("sp") String sp);


    @Operation(summary = "Get all storage providers", description = "This endpoint returns all storage providers", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ApiStorageProviderResp.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ApiStorageProviderResp>> storageProvidersGet();


    @Operation(summary = "Set Storage Provider Info", description = "This endpoint lets a user set storage provider info.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/set-info/{sp}",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> storageProvidersSetInfoSpPut(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to set info for", required=true, schema=@Schema()) @PathVariable("sp") String sp, @Parameter(in = ParameterIn.DEFAULT, description = "Storage Provider set info params", required=true, schema=@Schema()) @Valid @RequestBody MinerMinerSetInfoParams body);


    @Operation(summary = "Get storage provider stats", description = "This endpoint returns storage provider stats", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/stats/{sp}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> storageProvidersStatsSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider", required=true, schema=@Schema()) @PathVariable("sp") String sp);


    @Operation(summary = "Query Ask", description = "This endpoint returns the ask for a given CID", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "deals" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/storage/query/{cid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> storageProvidersStorageQueryCidGet(@Parameter(in = ParameterIn.PATH, description = "CID", required=true, schema=@Schema()) @PathVariable("cid") String cid);


    @Operation(summary = "Suspend Storage Provider", description = "This endpoint lets a user suspend a storage provider.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/suspend/{sp}",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<Map<String, String>> storageProvidersSuspendSpPost(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to suspend", required=true, schema=@Schema()) @PathVariable("sp") String sp, @Parameter(in = ParameterIn.DEFAULT, description = "Suspend Storage Provider Body", required=true, schema=@Schema()) @Valid @RequestBody MinerSuspendMinerBody body);


    @Operation(summary = "Unuspend Storage Provider", description = "This endpoint lets a user unsuspend a Storage Provider.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "sp" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/storage-providers/unsuspend/{sp}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> storageProvidersUnsuspendSpPut(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to unsuspend", required=true, schema=@Schema()) @PathVariable("sp") String sp);

}

