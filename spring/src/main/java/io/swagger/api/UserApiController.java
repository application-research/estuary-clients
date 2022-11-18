package io.swagger.api;

import io.swagger.model.MainGetApiKeysResp;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-18T01:22:45.212Z[GMT]")
@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<List<MainGetApiKeysResp>>> userApiKeysGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<List<MainGetApiKeysResp>>>(objectMapper.readValue("[ [ {\n  \"expiry\" : \"expiry\",\n  \"label\" : \"label\",\n  \"tokenHash\" : \"tokenHash\",\n  \"token\" : \"token\"\n}, {\n  \"expiry\" : \"expiry\",\n  \"label\" : \"label\",\n  \"tokenHash\" : \"tokenHash\",\n  \"token\" : \"token\"\n} ], [ {\n  \"expiry\" : \"expiry\",\n  \"label\" : \"label\",\n  \"tokenHash\" : \"tokenHash\",\n  \"token\" : \"token\"\n}, {\n  \"expiry\" : \"expiry\",\n  \"label\" : \"label\",\n  \"tokenHash\" : \"tokenHash\",\n  \"token\" : \"token\"\n} ] ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<List<MainGetApiKeysResp>>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<List<MainGetApiKeysResp>>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> userApiKeysKeyOrHashDelete(@Parameter(in = ParameterIn.PATH, description = "Key or Hash", required=true, schema=@Schema()) @PathVariable("key_or_hash") String keyOrHash) {
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

    public ResponseEntity<MainGetApiKeysResp> userApiKeysPost(@Parameter(in = ParameterIn.QUERY, description = "Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h" ,schema=@Schema()) @Valid @RequestParam(value = "expiry", required = false) String expiry,@Parameter(in = ParameterIn.QUERY, description = "Permissions -- currently unused" ,schema=@Schema()) @Valid @RequestParam(value = "perms", required = false) String perms) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MainGetApiKeysResp>(objectMapper.readValue("{\n  \"expiry\" : \"expiry\",\n  \"label\" : \"label\",\n  \"tokenHash\" : \"tokenHash\",\n  \"token\" : \"token\"\n}", MainGetApiKeysResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MainGetApiKeysResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MainGetApiKeysResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> userExportGet() {
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

    public ResponseEntity<String> userStatsGet() {
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

}
