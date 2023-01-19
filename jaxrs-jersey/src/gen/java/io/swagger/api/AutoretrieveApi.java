package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AutoretrieveApiService;
import io.swagger.api.factories.AutoretrieveApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/autoretrieve")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-19T16:30:00.833Z[GMT]")public class AutoretrieveApi  {
   private final AutoretrieveApiService delegate;

   public AutoretrieveApi(@Context ServletConfig servletContext) {
      AutoretrieveApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AutoretrieveApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AutoretrieveApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AutoretrieveApiServiceFactory.getAutoretrieveApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/heartbeat")
    
    @Produces({ "application/json" })
    @Operation(summary = "Marks autoretrieve server as up", description = "This endpoint updates the lastConnection field for autoretrieve", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "autoretrieve" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UtilHttpError.class))) })
    public Response autoretrieveHeartbeatPost(
@Parameter(in = ParameterIn.HEADER, description = "Autoretrieve's auth token" ,required=true)@HeaderParam("token") String token

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.autoretrieveHeartbeatPost(token,securityContext);
    }
}
