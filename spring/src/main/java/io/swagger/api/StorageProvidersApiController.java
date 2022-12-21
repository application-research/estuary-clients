package io.swagger.api;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-21T01:22:11.956Z[GMT]")
@RestController
public class StorageProvidersApiController implements StorageProvidersApi {

    private static final Logger log = LoggerFactory.getLogger(StorageProvidersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StorageProvidersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimResponse> storageProvidersClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Storage Provider Body", required=true, schema=@Schema()) @Valid @RequestBody MinerClaimMinerBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimResponse>(objectMapper.readValue("{\n  \"success\" : true\n}", GithubComApplicationResearchEstuaryApiV2ClaimResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> storageProvidersClaimSpGet(@Parameter(in = ParameterIn.PATH, description = "Storage Provider claim message", required=true, schema=@Schema()) @PathVariable("sp") String sp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>(objectMapper.readValue("{\n  \"hexmsg\" : \"hexmsg\"\n}", GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> storageProvidersDealsSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider", required=true, schema=@Schema()) @PathVariable("sp") String sp,@Parameter(in = ParameterIn.QUERY, description = "Ignore Failed" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-failed", required = false) String ignoreFailed) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> storageProvidersFailuresSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider", required=true, schema=@Schema()) @PathVariable("sp") String sp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ApiStorageProviderResp>> storageProvidersGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ApiStorageProviderResp>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"suspendedReason\" : \"suspendedReason\",\n  \"addr\" : { },\n  \"version\" : \"version\",\n  \"suspended\" : true\n}, {\n  \"name\" : \"name\",\n  \"suspendedReason\" : \"suspendedReason\",\n  \"addr\" : { },\n  \"version\" : \"version\",\n  \"suspended\" : true\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ApiStorageProviderResp>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ApiStorageProviderResp>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> storageProvidersSetInfoSpPut(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to set info for", required=true, schema=@Schema()) @PathVariable("sp") String sp,@Parameter(in = ParameterIn.DEFAULT, description = "Storage Provider set info params", required=true, schema=@Schema()) @Valid @RequestBody MinerMinerSetInfoParams body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> storageProvidersStatsSpGet(@Parameter(in = ParameterIn.PATH, description = "Filter by storage provider", required=true, schema=@Schema()) @PathVariable("sp") String sp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> storageProvidersStorageQueryCidGet(@Parameter(in = ParameterIn.PATH, description = "CID", required=true, schema=@Schema()) @PathVariable("cid") String cid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Map<String, String>> storageProvidersSuspendSpPost(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to suspend", required=true, schema=@Schema()) @PathVariable("sp") String sp,@Parameter(in = ParameterIn.DEFAULT, description = "Suspend Storage Provider Body", required=true, schema=@Schema()) @Valid @RequestBody MinerSuspendMinerBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, String>>(objectMapper.readValue("{\n  \"key\" : \"\"\n}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> storageProvidersUnsuspendSpPut(@Parameter(in = ParameterIn.PATH, description = "Storage Provider to unsuspend", required=true, schema=@Schema()) @PathVariable("sp") String sp) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
