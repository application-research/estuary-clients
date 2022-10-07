package io.swagger.api;

import io.swagger.model.MainImportDealBody;
import org.springframework.core.io.Resource;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-10-07T23:22:34.385Z")

@Controller
public class ContentApiController implements ContentApi {

    private static final Logger log = LoggerFactory.getLogger(ContentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> contentAddCarPost(@ApiParam(value = "Car" ,required=true )  @Valid @RequestBody String body,@ApiParam(value = "Filename") @Valid @RequestParam(value = "filename", required = false) String filename,@ApiParam(value = "Commp") @Valid @RequestParam(value = "commp", required = false) String commp,@ApiParam(value = "Size") @Valid @RequestParam(value = "size", required = false) String size) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentAddIpfsPost(@ApiParam(value = "IPFS Body" ,required=true )  @Valid @RequestBody UtilContentAddIpfsBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UtilContentAddResponse> contentAddPost(@ApiParam(value = "File to upload") @Valid @RequestPart(value="file", required=true) MultipartFile file,@ApiParam(value = "Collection UUID",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Directory",required=true) @PathVariable("dir") String dir) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UtilContentAddResponse>(objectMapper.readValue("{\"empty\": false}", UtilContentAddResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UtilContentAddResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UtilContentAddResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> contentAggregatedContentGet(@ApiParam(value = "Content ID",required=true) @PathVariable("content") String content) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentAllDealsGet(@NotNull @ApiParam(value = "Begin", required = true) @Valid @RequestParam(value = "begin", required = true) String begin,@NotNull @ApiParam(value = "Duration", required = true) @Valid @RequestParam(value = "duration", required = true) String duration,@NotNull @ApiParam(value = "All", required = true) @Valid @RequestParam(value = "all", required = true) String all) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentBwUsageContentGet(@ApiParam(value = "Content ID",required=true) @PathVariable("content") String content) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentCreatePost(@ApiParam(value = "Content" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentDealsGet(@ApiParam(value = "Limit") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Offset") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentEnsureReplicationDatacidGet(@ApiParam(value = "Data CID",required=true) @PathVariable("datacid") String datacid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> contentFailuresContentGet(@ApiParam(value = "Content ID",required=true) @PathVariable("content") String content) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("{  \"bytes\": [],  \"empty\": true}", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentImportdealPost(@ApiParam(value = "Import a deal" ,required=true )  @Valid @RequestBody MainImportDealBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<String>> contentListGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentReadContGet(@ApiParam(value = "CID",required=true) @PathVariable("cont") String cont) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentStagingZonesGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentStatsGet(@ApiParam(value = "limit",required=true) @PathVariable("limit") String limit) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contentStatusIdGet(@ApiParam(value = "Content ID",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
