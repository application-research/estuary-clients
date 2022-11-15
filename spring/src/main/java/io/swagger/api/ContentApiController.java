package io.swagger.api;

import io.swagger.model.MainImportDealBody;
import org.springframework.core.io.Resource;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-15T21:05:29.208Z[GMT]")
@RestController
public class ContentApiController implements ContentApi {

    private static final Logger log = LoggerFactory.getLogger(ContentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> contentAddCarPost(@Parameter(in = ParameterIn.DEFAULT, description = "Car", required=true, schema=@Schema()) @Valid @RequestBody String body,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-dupes", required = false) String ignoreDupes,@Parameter(in = ParameterIn.QUERY, description = "Filename" ,schema=@Schema()) @Valid @RequestParam(value = "filename", required = false) String filename) {
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

    public ResponseEntity<String> contentAddIpfsPost(@Parameter(in = ParameterIn.DEFAULT, description = "IPFS Body", required=true, schema=@Schema()) @Valid @RequestBody UtilContentAddIpfsBody body,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-dupes", required = false) String ignoreDupes) {
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

    public ResponseEntity<UtilContentAddResponse> contentAddPost(@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile data,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema()) @RequestParam(value="filename", required=true)  String filename,@Parameter(in = ParameterIn.QUERY, description = "Collection UUID" ,schema=@Schema()) @Valid @RequestParam(value = "coluuid", required = false) String coluuid,@Parameter(in = ParameterIn.QUERY, description = "Replication value" ,schema=@Schema()) @Valid @RequestParam(value = "replication", required = false) Integer replication,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes true/false" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-dupes", required = false) String ignoreDupes,@Parameter(in = ParameterIn.QUERY, description = "Lazy Provide true/false" ,schema=@Schema()) @Valid @RequestParam(value = "lazy-provide", required = false) String lazyProvide,@Parameter(in = ParameterIn.QUERY, description = "Directory" ,schema=@Schema()) @Valid @RequestParam(value = "dir", required = false) String dir) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UtilContentAddResponse>(objectMapper.readValue("{\n  \"retrieval_url\" : \"retrieval_url\",\n  \"estuaryId\" : 0,\n  \"providers\" : [ \"providers\", \"providers\" ],\n  \"cid\" : \"cid\"\n}", UtilContentAddResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UtilContentAddResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UtilContentAddResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> contentAggregatedContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("content") String content) {
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

    public ResponseEntity<String> contentAllDealsGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Begin" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "begin", required = true) String begin,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Duration" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "duration", required = true) String duration,@NotNull @Parameter(in = ParameterIn.QUERY, description = "All" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "all", required = true) String all) {
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

    public ResponseEntity<String> contentBwUsageContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("content") String content) {
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

    public ResponseEntity<String> contentCreatePost(@Parameter(in = ParameterIn.DEFAULT, description = "Content", required=true, schema=@Schema()) @Valid @RequestBody UtilContentCreateBody body,@Parameter(in = ParameterIn.QUERY, description = "Ignore Dupes" ,schema=@Schema()) @Valid @RequestParam(value = "ignore-dupes", required = false) String ignoreDupes) {
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

    public ResponseEntity<String> contentDealsGet(@Parameter(in = ParameterIn.QUERY, description = "Limit" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Offset" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
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

    public ResponseEntity<String> contentEnsureReplicationDatacidGet(@Parameter(in = ParameterIn.PATH, description = "Data CID", required=true, schema=@Schema()) @PathVariable("datacid") String datacid) {
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

    public ResponseEntity<String> contentFailuresContentGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("content") String content) {
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

    public ResponseEntity<String> contentIdGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
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

    public ResponseEntity<String> contentImportdealPost(@Parameter(in = ParameterIn.DEFAULT, description = "Import a deal", required=true, schema=@Schema()) @Valid @RequestBody MainImportDealBody body) {
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

    public ResponseEntity<String> contentListGet() {
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

    public ResponseEntity<String> contentReadContGet(@Parameter(in = ParameterIn.PATH, description = "CID", required=true, schema=@Schema()) @PathVariable("cont") String cont) {
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

    public ResponseEntity<String> contentStagingZonesGet() {
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

    public ResponseEntity<String> contentStatsGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "limit" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "limit", required = true) String limit,@NotNull @Parameter(in = ParameterIn.QUERY, description = "offset" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "offset", required = true) String offset) {
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

    public ResponseEntity<String> contentStatusIdGet(@Parameter(in = ParameterIn.PATH, description = "Content ID", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
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
