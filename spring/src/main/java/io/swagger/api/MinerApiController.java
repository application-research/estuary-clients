package io.swagger.api;

import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV1ClaimResponse;
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
public class MinerApiController implements MinerApi {

    private static final Logger log = LoggerFactory.getLogger(MinerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MinerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse> minerClaimMinerGet(@Parameter(in = ParameterIn.PATH, description = "Miner claim message", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>(objectMapper.readValue("{\n  \"hexmsg\" : \"hexmsg\"\n}", GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimResponse> minerClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Miner Body", required=true, schema=@Schema()) @Valid @RequestBody MinerClaimMinerBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimResponse>(objectMapper.readValue("{\n  \"success\" : true\n}", GithubComApplicationResearchEstuaryApiV1ClaimResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GithubComApplicationResearchEstuaryApiV1ClaimResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Map<String, String>> minerSetInfoMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to set info for", required=true, schema=@Schema()) @PathVariable("miner") String miner,@Parameter(in = ParameterIn.DEFAULT, description = "Miner set info params", required=true, schema=@Schema()) @Valid @RequestBody MinerMinerSetInfoParams body) {
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

    public ResponseEntity<Map<String, String>> minerSuspendMinerPost(@Parameter(in = ParameterIn.PATH, description = "Miner to suspend", required=true, schema=@Schema()) @PathVariable("miner") String miner,@Parameter(in = ParameterIn.DEFAULT, description = "Suspend Miner Body", required=true, schema=@Schema()) @Valid @RequestBody MinerSuspendMinerBody body) {
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

    public ResponseEntity<Map<String, String>> minerUnsuspendMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to unsuspend", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
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

}
