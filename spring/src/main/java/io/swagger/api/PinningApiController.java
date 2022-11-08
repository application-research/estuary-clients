package io.swagger.api;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-08T19:38:28.201Z")

@Controller
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
                return new ResponseEntity<TypesIpfsListPinStatusResponse>(objectMapper.readValue("{\"empty\": false}", TypesIpfsListPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsListPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsListPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pinningPinsPinidDelete(@ApiParam(value = "Pin ID",required=true) @PathVariable("pinid") String pinid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TypesIpfsPinStatusResponse> pinningPinsPinidGet(@ApiParam(value = "cid",required=true) @PathVariable("pinid") String pinid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsPinStatusResponse>(objectMapper.readValue("{\"empty\": false}", TypesIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TypesIpfsPinStatusResponse> pinningPinsPinidPost(@ApiParam(value = "Pin ID",required=true) @PathVariable("pinid") String pinid,@ApiParam(value = "CID of new pin" ,required=true )  @Valid @RequestBody String cid,@ApiParam(value = "Name (filename) of new pin"  )  @Valid @RequestBody String name,@ApiParam(value = "Origins of new pin"  )  @Valid @RequestBody String origins,@ApiParam(value = "Meta information of new pin"  )  @Valid @RequestBody String meta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsPinStatusResponse>(objectMapper.readValue("{\"empty\": false}", TypesIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TypesIpfsPinStatusResponse> pinningPinsPost(@ApiParam(value = "Pin Body {cid:cid, name:name}" ,required=true )  @Valid @RequestBody TypesIpfsPin pin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TypesIpfsPinStatusResponse>(objectMapper.readValue("{\"empty\": false}", TypesIpfsPinStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TypesIpfsPinStatusResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
