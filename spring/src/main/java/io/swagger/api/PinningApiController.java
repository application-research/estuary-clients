package io.swagger.api;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-03T16:17:32.784Z[GMT]")
@RestController
public class PinningApiController implements PinningApi {

    private static final Logger log = LoggerFactory.getLogger(PinningApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PinningApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TypesIpfsListPinStatusResponse> pinningPinsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsListPinStatusResponse>(objectMapper.readValue("{\n  \"count\" : 0,\n  \"results\" : [ {\n    \"pin\" : {\n      \"meta\" : { },\n      \"name\" : \"name\",\n      \"origins\" : [ \"origins\", \"origins\" ],\n      \"cid\" : \"cid\"\n    },\n    \"created\" : \"created\",\n    \"requestid\" : \"requestid\",\n    \"delegates\" : [ \"delegates\", \"delegates\" ],\n    \"info\" : { },\n    \"status\" : \"pinning\"\n  }, {\n    \"pin\" : {\n      \"meta\" : { },\n      \"name\" : \"name\",\n      \"origins\" : [ \"origins\", \"origins\" ],\n      \"cid\" : \"cid\"\n    },\n    \"created\" : \"created\",\n    \"requestid\" : \"requestid\",\n    \"delegates\" : [ \"delegates\", \"delegates\" ],\n    \"info\" : { },\n    \"status\" : \"pinning\"\n  } ]\n}", TypesIpfsListPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsListPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsListPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pinningPinsPinidDelete(@Parameter(in = ParameterIn.PATH, description = "Pin ID", required=true, schema=@Schema()) @PathVariable("pinid") String pinid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TypesIpfsPinStatusResponse> pinningPinsPinidGet(@Parameter(in = ParameterIn.PATH, description = "cid", required=true, schema=@Schema()) @PathVariable("pinid") String pinid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsPinStatusResponse>(objectMapper.readValue("{\n  \"pin\" : {\n    \"meta\" : { },\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"info\" : { },\n  \"status\" : \"pinning\"\n}", TypesIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TypesIpfsPinStatusResponse> pinningPinsPinidPost(@Parameter(in = ParameterIn.PATH, description = "Pin ID to be replaced", required=true, schema=@Schema()) @PathVariable("pinid") String pinid,@Parameter(in = ParameterIn.DEFAULT, description = "New pin", required=true, schema=@Schema()) @Valid @RequestBody TypesIpfsPin body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsPinStatusResponse>(objectMapper.readValue("{\n  \"pin\" : {\n    \"meta\" : { },\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"info\" : { },\n  \"status\" : \"pinning\"\n}", TypesIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TypesIpfsPinStatusResponse> pinningPinsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Pin Body {cid:cid, name:name}", required=true, schema=@Schema()) @Valid @RequestBody TypesIpfsPin body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsPinStatusResponse>(objectMapper.readValue("{\n  \"pin\" : {\n    \"meta\" : { },\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"info\" : { },\n  \"status\" : \"pinning\"\n}", TypesIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
