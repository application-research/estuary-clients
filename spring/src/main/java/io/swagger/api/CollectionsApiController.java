package io.swagger.api;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T06:22:42.275Z[GMT]")
@RestController
public class CollectionsApiController implements CollectionsApi {

    private static final Logger log = LoggerFactory.getLogger(CollectionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CollectionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> collectionsColuuidCommitPost(@Parameter(in = ParameterIn.PATH, description = "coluuid", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid) {
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

    public ResponseEntity<String> collectionsColuuidContentsDelete(@Parameter(in = ParameterIn.PATH, description = "Collection ID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid,@Parameter(in = ParameterIn.DEFAULT, description = "Variable to use when filtering for files (must be either 'path' or 'content_id')", required=true, schema=@Schema()) @Valid @RequestBody ApiDeleteContentFromCollectionBody body) {
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

    public ResponseEntity<String> collectionsColuuidDelete(@Parameter(in = ParameterIn.PATH, description = "Collection ID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid) {
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

    public ResponseEntity<List<CollectionsCollectionListResponse>> collectionsColuuidGet(@Parameter(in = ParameterIn.PATH, description = "coluuid", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid,@Parameter(in = ParameterIn.QUERY, description = "Directory" ,schema=@Schema()) @Valid @RequestParam(value = "dir", required = false) String dir) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CollectionsCollectionListResponse>>(objectMapper.readValue("[ {\n  \"coluuid\" : \"coluuid\",\n  \"contId\" : 0,\n  \"size\" : 6,\n  \"name\" : \"name\",\n  \"dir\" : \"dir\",\n  \"type\" : \"directory\",\n  \"cid\" : {\n    \"cid\" : { }\n  },\n  \"updatedAt\" : \"updatedAt\"\n}, {\n  \"coluuid\" : \"coluuid\",\n  \"contId\" : 0,\n  \"size\" : 6,\n  \"name\" : \"name\",\n  \"dir\" : \"dir\",\n  \"type\" : \"directory\",\n  \"cid\" : {\n    \"cid\" : { }\n  },\n  \"updatedAt\" : \"updatedAt\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CollectionsCollectionListResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CollectionsCollectionListResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> collectionsColuuidPost(@Parameter(in = ParameterIn.PATH, description = "Collection UUID", required=true, schema=@Schema()) @PathVariable("coluuid") String coluuid,@Parameter(in = ParameterIn.DEFAULT, description = "Content IDs to add to collection", required=true, schema=@Schema()) @Valid @RequestBody List<Integer> body,@Parameter(in = ParameterIn.QUERY, description = "Directory" ,schema=@Schema()) @Valid @RequestParam(value = "dir", required = false) String dir) {
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

    public ResponseEntity<String> collectionsFsAddPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Collection ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "coluuid", required = true) String coluuid,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Content" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "content", required = true) String content,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Path to file" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "path", required = true) String path) {
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

    public ResponseEntity<List<CollectionsCollection>> collectionsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CollectionsCollection>>(objectMapper.readValue("[ {\n  \"createdAt\" : \"createdAt\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"userId\" : 0,\n  \"uuid\" : \"uuid\",\n  \"cid\" : \"cid\"\n}, {\n  \"createdAt\" : \"createdAt\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"userId\" : 0,\n  \"uuid\" : \"uuid\",\n  \"cid\" : \"cid\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CollectionsCollection>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CollectionsCollection>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CollectionsCollection> collectionsPost(@Parameter(in = ParameterIn.DEFAULT, description = "Collection name and description", required=true, schema=@Schema()) @Valid @RequestBody ApiCreateCollectionBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CollectionsCollection>(objectMapper.readValue("{\n  \"createdAt\" : \"createdAt\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"userId\" : 0,\n  \"uuid\" : \"uuid\",\n  \"cid\" : \"cid\"\n}", CollectionsCollection.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CollectionsCollection>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CollectionsCollection>(HttpStatus.NOT_IMPLEMENTED);
    }

}
