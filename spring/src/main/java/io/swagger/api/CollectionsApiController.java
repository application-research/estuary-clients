package io.swagger.api;

import io.swagger.model.CollectionsCollection;
import java.util.List;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-07T20:06:52.777Z")

@Controller
public class CollectionsApiController implements CollectionsApi {

    private static final Logger log = LoggerFactory.getLogger(CollectionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CollectionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> collectionsColuuidCommitPost(@ApiParam(value = "coluuid",required=true) @PathVariable("coluuid") String coluuid) {
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

    public ResponseEntity<String> collectionsColuuidContentsDelete(@ApiParam(value = "Collection ID",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Content ID",required=true) @PathVariable("contentid") String contentid,@ApiParam(value = "Variable to use when filtering for files (must be either 'path' or 'content_id')" ,required=true )  @Valid @RequestBody MainDeleteContentFromCollectionBody body) {
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

    public ResponseEntity<String> collectionsColuuidDelete(@ApiParam(value = "Collection ID",required=true) @PathVariable("coluuid") String coluuid) {
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

    public ResponseEntity<String> collectionsColuuidGet(@ApiParam(value = "coluuid",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Directory") @Valid @RequestParam(value = "dir", required = false) String dir) {
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

    public ResponseEntity<String> collectionsColuuidPost(@ApiParam(value = "coluuid",required=true) @PathVariable("coluuid") String coluuid,@ApiParam(value = "Content IDs to add to collection" ,required=true )  @Valid @RequestBody List<Integer> contentIDs) {
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

    public ResponseEntity<String> collectionsFsAddPost(@NotNull @ApiParam(value = "Collection ID", required = true) @Valid @RequestParam(value = "coluuid", required = true) String coluuid,@NotNull @ApiParam(value = "Content", required = true) @Valid @RequestParam(value = "content", required = true) String content,@NotNull @ApiParam(value = "Path to file", required = true) @Valid @RequestParam(value = "path", required = true) String path) {
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

    public ResponseEntity<List<List<CollectionsCollection>>> collectionsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<List<CollectionsCollection>>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<List<CollectionsCollection>>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<List<CollectionsCollection>>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CollectionsCollection> collectionsPost(@ApiParam(value = "Collection name and description" ,required=true )  @Valid @RequestBody MainCreateCollectionBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CollectionsCollection>(objectMapper.readValue("{\"empty\": false}", CollectionsCollection.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CollectionsCollection>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CollectionsCollection>(HttpStatus.NOT_IMPLEMENTED);
    }

}
