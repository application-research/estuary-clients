package io.swagger.api;

import io.swagger.model.PinnerIpfsListPinStatusResponse;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.PinnerIpfsPinStatusResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-02T18:38:36.904Z[GMT]")
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

    public ResponseEntity<PinnerIpfsListPinStatusResponse> pinningPinsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PinnerIpfsListPinStatusResponse>(objectMapper.readValue("{\n  \"count\" : 0,\n  \"results\" : [ {\n    \"pin\" : {\n      \"meta\" : \"\",\n      \"name\" : \"name\",\n      \"origins\" : [ \"origins\", \"origins\" ],\n      \"cid\" : \"cid\"\n    },\n    \"created\" : \"created\",\n    \"requestid\" : \"requestid\",\n    \"delegates\" : [ \"delegates\", \"delegates\" ],\n    \"content\" : {\n      \"aggregatedIn\" : 6,\n      \"offloaded\" : true,\n      \"replication\" : 5,\n      \"pinning\" : true,\n      \"pinMeta\" : \"pinMeta\",\n      \"replace\" : true,\n      \"active\" : true,\n      \"description\" : \"description\",\n      \"dagSplit\" : true,\n      \"dealStatus\" : \"dealStatus\",\n      \"failed\" : true,\n      \"type\" : 7,\n      \"userId\" : 9,\n      \"aggregate\" : true,\n      \"createdAt\" : \"createdAt\",\n      \"pinningStatus\" : \"pinningStatus\",\n      \"size\" : 5,\n      \"splitFrom\" : 2,\n      \"name\" : \"name\",\n      \"origins\" : \"origins\",\n      \"location\" : \"location\",\n      \"id\" : 1,\n      \"cid\" : {\n        \"cid\" : { }\n      },\n      \"updatedAt\" : \"updatedAt\"\n    },\n    \"info\" : \"\",\n    \"status\" : \"pinning\"\n  }, {\n    \"pin\" : {\n      \"meta\" : \"\",\n      \"name\" : \"name\",\n      \"origins\" : [ \"origins\", \"origins\" ],\n      \"cid\" : \"cid\"\n    },\n    \"created\" : \"created\",\n    \"requestid\" : \"requestid\",\n    \"delegates\" : [ \"delegates\", \"delegates\" ],\n    \"content\" : {\n      \"aggregatedIn\" : 6,\n      \"offloaded\" : true,\n      \"replication\" : 5,\n      \"pinning\" : true,\n      \"pinMeta\" : \"pinMeta\",\n      \"replace\" : true,\n      \"active\" : true,\n      \"description\" : \"description\",\n      \"dagSplit\" : true,\n      \"dealStatus\" : \"dealStatus\",\n      \"failed\" : true,\n      \"type\" : 7,\n      \"userId\" : 9,\n      \"aggregate\" : true,\n      \"createdAt\" : \"createdAt\",\n      \"pinningStatus\" : \"pinningStatus\",\n      \"size\" : 5,\n      \"splitFrom\" : 2,\n      \"name\" : \"name\",\n      \"origins\" : \"origins\",\n      \"location\" : \"location\",\n      \"id\" : 1,\n      \"cid\" : {\n        \"cid\" : { }\n      },\n      \"updatedAt\" : \"updatedAt\"\n    },\n    \"info\" : \"\",\n    \"status\" : \"pinning\"\n  } ]\n}", PinnerIpfsListPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PinnerIpfsListPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PinnerIpfsListPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pinningPinsPinidDelete(@Parameter(in = ParameterIn.PATH, description = "Pin ID", required=true, schema=@Schema()) @PathVariable("pinid") String pinid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PinnerIpfsPinStatusResponse> pinningPinsPinidGet(@Parameter(in = ParameterIn.PATH, description = "cid", required=true, schema=@Schema()) @PathVariable("pinid") String pinid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PinnerIpfsPinStatusResponse>(objectMapper.readValue("{\n  \"pin\" : {\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"content\" : {\n    \"aggregatedIn\" : 6,\n    \"offloaded\" : true,\n    \"replication\" : 5,\n    \"pinning\" : true,\n    \"pinMeta\" : \"pinMeta\",\n    \"replace\" : true,\n    \"active\" : true,\n    \"description\" : \"description\",\n    \"dagSplit\" : true,\n    \"dealStatus\" : \"dealStatus\",\n    \"failed\" : true,\n    \"type\" : 7,\n    \"userId\" : 9,\n    \"aggregate\" : true,\n    \"createdAt\" : \"createdAt\",\n    \"pinningStatus\" : \"pinningStatus\",\n    \"size\" : 5,\n    \"splitFrom\" : 2,\n    \"name\" : \"name\",\n    \"origins\" : \"origins\",\n    \"location\" : \"location\",\n    \"id\" : 1,\n    \"cid\" : {\n      \"cid\" : { }\n    },\n    \"updatedAt\" : \"updatedAt\"\n  },\n  \"info\" : \"\",\n  \"status\" : \"pinning\"\n}", PinnerIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PinnerIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PinnerIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PinnerIpfsPinStatusResponse> pinningPinsPinidPost(@Parameter(in = ParameterIn.PATH, description = "Pin ID to be replaced", required=true, schema=@Schema()) @PathVariable("pinid") String pinid,@Parameter(in = ParameterIn.DEFAULT, description = "New pin", required=true, schema=@Schema()) @Valid @RequestBody PinnerIpfsPin body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PinnerIpfsPinStatusResponse>(objectMapper.readValue("{\n  \"pin\" : {\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"content\" : {\n    \"aggregatedIn\" : 6,\n    \"offloaded\" : true,\n    \"replication\" : 5,\n    \"pinning\" : true,\n    \"pinMeta\" : \"pinMeta\",\n    \"replace\" : true,\n    \"active\" : true,\n    \"description\" : \"description\",\n    \"dagSplit\" : true,\n    \"dealStatus\" : \"dealStatus\",\n    \"failed\" : true,\n    \"type\" : 7,\n    \"userId\" : 9,\n    \"aggregate\" : true,\n    \"createdAt\" : \"createdAt\",\n    \"pinningStatus\" : \"pinningStatus\",\n    \"size\" : 5,\n    \"splitFrom\" : 2,\n    \"name\" : \"name\",\n    \"origins\" : \"origins\",\n    \"location\" : \"location\",\n    \"id\" : 1,\n    \"cid\" : {\n      \"cid\" : { }\n    },\n    \"updatedAt\" : \"updatedAt\"\n  },\n  \"info\" : \"\",\n  \"status\" : \"pinning\"\n}", PinnerIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PinnerIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PinnerIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PinnerIpfsPinStatusResponse> pinningPinsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Pin Body {cid:cid, name:name}", required=true, schema=@Schema()) @Valid @RequestBody PinnerIpfsPin body,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-dupes", required = false) String ignoreDupes,@Parameter(in = ParameterIn.QUERY, description = "Overwrite conflicting files in collections" ,schema=@Schema()) @Valid @RequestParam(value = "overwrite", required = false) String overwrite) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PinnerIpfsPinStatusResponse>(objectMapper.readValue("{\n  \"pin\" : {\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"origins\" : [ \"origins\", \"origins\" ],\n    \"cid\" : \"cid\"\n  },\n  \"created\" : \"created\",\n  \"requestid\" : \"requestid\",\n  \"delegates\" : [ \"delegates\", \"delegates\" ],\n  \"content\" : {\n    \"aggregatedIn\" : 6,\n    \"offloaded\" : true,\n    \"replication\" : 5,\n    \"pinning\" : true,\n    \"pinMeta\" : \"pinMeta\",\n    \"replace\" : true,\n    \"active\" : true,\n    \"description\" : \"description\",\n    \"dagSplit\" : true,\n    \"dealStatus\" : \"dealStatus\",\n    \"failed\" : true,\n    \"type\" : 7,\n    \"userId\" : 9,\n    \"aggregate\" : true,\n    \"createdAt\" : \"createdAt\",\n    \"pinningStatus\" : \"pinningStatus\",\n    \"size\" : 5,\n    \"splitFrom\" : 2,\n    \"name\" : \"name\",\n    \"origins\" : \"origins\",\n    \"location\" : \"location\",\n    \"id\" : 1,\n    \"cid\" : {\n      \"cid\" : { }\n    },\n    \"updatedAt\" : \"updatedAt\"\n  },\n  \"info\" : \"\",\n  \"status\" : \"pinning\"\n}", PinnerIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PinnerIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PinnerIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
