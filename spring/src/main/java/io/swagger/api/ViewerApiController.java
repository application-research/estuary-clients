package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.model.UtilViewerResponse;
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
public class ViewerApiController implements ViewerApi {

    private static final Logger log = LoggerFactory.getLogger(ViewerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ViewerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UtilViewerResponse> viewerGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UtilViewerResponse>(objectMapper.readValue("{\n  \"settings\" : {\n    \"dealDuration\" : 1,\n    \"replication\" : 2,\n    \"dealMakingDisabled\" : true,\n    \"flags\" : 5,\n    \"verified\" : true,\n    \"fileStagingThreshold\" : 5,\n    \"uploadEndpoints\" : [ \"uploadEndpoints\", \"uploadEndpoints\" ],\n    \"contentAddingDisabled\" : true\n  },\n  \"address\" : \"address\",\n  \"auth_expiry\" : \"auth_expiry\",\n  \"perms\" : 6,\n  \"id\" : 0,\n  \"miners\" : [ \"miners\", \"miners\" ],\n  \"username\" : \"username\"\n}", UtilViewerResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UtilViewerResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UtilViewerResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
