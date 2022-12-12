/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.UtilHttpError;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2022-12-12T11:11:32.220Z[GMT]")
@Controller
public interface AutoretrieveApi {


    @Operation(summary = "Marks autoretrieve server as up", operationId = "autoretrieveHeartbeatPost", description = "This endpoint updates the lastConnection field for autoretrieve" , tags = {"autoretrieve"})
    @ApiResponse(responseCode = "200", description = "OK")
    @ApiResponse(responseCode = "400", description = "Bad Request")
    @ApiResponse(responseCode = "500", description = "Internal Server Error")
    @Post(value = "/autoretrieve/heartbeat", produces = { "application/json" })
    default Single<HttpResponse<String>> autoretrieveHeartbeatPost(@NotNull @Parameter(description = "Autoretrieve's auth token") @Valid @Header(value = "token") String token
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
