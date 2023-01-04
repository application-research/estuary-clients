package io.swagger.api;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-04T12:55:54.653Z[GMT]")
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

    public ResponseEntity<ApiClaimMsgResponse> minerClaimMinerGet(@Parameter(in = ParameterIn.PATH, description = "Miner claim message", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiClaimMsgResponse>(objectMapper.readValue("{\n  \"hexmsg\" : \"hexmsg\"\n}", ApiClaimMsgResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiClaimMsgResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiClaimMsgResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ApiClaimResponse> minerClaimPost(@Parameter(in = ParameterIn.DEFAULT, description = "Claim Miner Body", required=true, schema=@Schema()) @Valid @RequestBody MinerClaimMinerBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiClaimResponse>(objectMapper.readValue("{\n  \"success\" : true\n}", ApiClaimResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiClaimResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiClaimResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ApiEmptyResp> minerSetInfoMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to set info for", required=true, schema=@Schema()) @PathVariable("miner") String miner,@Parameter(in = ParameterIn.DEFAULT, description = "Miner set info params", required=true, schema=@Schema()) @Valid @RequestBody MinerMinerSetInfoParams body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiEmptyResp>(objectMapper.readValue("{ }", ApiEmptyResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiEmptyResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiEmptyResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ApiEmptyResp> minerSuspendMinerPost(@Parameter(in = ParameterIn.PATH, description = "Miner to suspend", required=true, schema=@Schema()) @PathVariable("miner") String miner,@Parameter(in = ParameterIn.DEFAULT, description = "Suspend Miner Body", required=true, schema=@Schema()) @Valid @RequestBody MinerSuspendMinerBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiEmptyResp>(objectMapper.readValue("{ }", ApiEmptyResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiEmptyResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiEmptyResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ApiEmptyResp> minerUnsuspendMinerPut(@Parameter(in = ParameterIn.PATH, description = "Miner to unsuspend", required=true, schema=@Schema()) @PathVariable("miner") String miner) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ApiEmptyResp>(objectMapper.readValue("{ }", ApiEmptyResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ApiEmptyResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ApiEmptyResp>(HttpStatus.NOT_IMPLEMENTED);
    }

}
