package io.swagger.api;

import java.util.List;
import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-10-08T00:00:16.548Z")

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

    public ResponseEntity<Void> collectionsColuuidDelete(@ApiParam(value = "Collection ID",required=true) @PathVariable("coluuid") String coluuid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> collectionsColuuidGet(@NotNull @ApiParam(value = "Collection UUID", required = true) @Valid @RequestParam(value = "coluuid", required = true) String coluuid,@ApiParam(value = "Directory") @Valid @RequestParam(value = "dir", required = false) String dir) {
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

    public ResponseEntity<Map<String, String>> collectionsColuuidPost(@ApiParam(value = "Content IDs to add to collection" ,required=true )  @Valid @RequestBody List<Integer> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, String>>(objectMapper.readValue("{\"empty\": false}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> collectionsFsAddPost(@NotNull @ApiParam(value = "Collection ID", required = true) @Valid @RequestParam(value = "coluuid", required = true) String coluuid,@NotNull @ApiParam(value = "Content", required = true) @Valid @RequestParam(value = "content", required = true) String content,@NotNull @ApiParam(value = "Path to file", required = true) @Valid @RequestParam(value = "path", required = true) String path) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<MainCollection>> collectionsGet(@ApiParam(value = "User ID",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<MainCollection>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<MainCollection>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<MainCollection>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MainCollection> collectionsPost(@ApiParam(value = "Collection name and description" ,required=true )  @Valid @RequestBody MainCreateCollectionBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MainCollection>(objectMapper.readValue("{\"empty\": false}", MainCollection.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MainCollection>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MainCollection>(HttpStatus.NOT_IMPLEMENTED);
    }

}
