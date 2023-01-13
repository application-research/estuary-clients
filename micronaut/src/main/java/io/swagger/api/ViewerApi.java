/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.UtilHttpError;
import io.swagger.model.UtilViewerResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2023-01-13T19:43:16.363Z[GMT]")
@Controller
public interface ViewerApi {


    @Operation(summary = "Fetch viewer details", operationId = "viewerGet", description = "This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc." )
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "401", description = "Unauthorized")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Get(value = "/viewer", produces = { "application/json" })
    default Single<HttpResponse<UtilViewerResponse>> viewerGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
