/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.40).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-02T18:38:36.904Z[GMT]")
@Validated
public interface MinerApi {

    @Operation(summary = "Get Claim Miner Message", description = "This endpoint lets a user get the message in order to claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClaimMsgResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/miner/claim/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ApiClaimMsgResponse> minerClaimMinerGet(@Parameter(in = ParameterIn.PATH, description = "Miner claim message", required=true, schema=@Schema()) @PathVariable("miner") String miner);


    @Operation(summary = "Claim Miner", description = "This endpoint lets a user claim a miner", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiClaimResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/miner/claim",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<ApiClaimResponse> minerClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Miner Body", required=true, schema=@Schema()) @Valid @RequestBody MinerClaimMinerBody body);


    @Operation(summary = "Set Miner Info", description = "This endpoint lets a user set miner info.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/miner/set-info/{miner}",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ApiEmptyResp> minerSetInfoMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to set info for", required=true, schema=@Schema()) @PathVariable("miner") String miner, @Parameter(in = ParameterIn.DEFAULT, description = "Miner set info params", required=true, schema=@Schema()) @Valid @RequestBody MinerMinerSetInfoParams body);


    @Operation(summary = "Suspend Miner", description = "This endpoint lets a user suspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/miner/suspend/{miner}",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<ApiEmptyResp> minerSuspendMinerPost(@Parameter(in = ParameterIn.PATH, description = "Miner to suspend", required=true, schema=@Schema()) @PathVariable("miner") String miner, @Parameter(in = ParameterIn.DEFAULT, description = "Suspend Miner Body", required=true, schema=@Schema()) @Valid @RequestBody MinerSuspendMinerBody body);


    @Operation(summary = "Unuspend Miner", description = "This endpoint lets a user unsuspend a miner.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "miner" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApiEmptyResp.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    @RequestMapping(value = "/miner/unsuspend/{miner}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ApiEmptyResp> minerUnsuspendMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to unsuspend", required=true, schema=@Schema()) @PathVariable("miner") String miner);

}

