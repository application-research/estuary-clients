package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-21T15:23:19.266Z[GMT]")public interface UserApiService {
    public Response userApiKeysGet(SecurityContext securityContext);
    public Response userApiKeysKeyOrHashDelete(String keyOrHash,SecurityContext securityContext);
    public Response userApiKeysPost( String expiry, String perms,SecurityContext securityContext);
    public Response userExportGet(SecurityContext securityContext);
    public Response userStatsGet(SecurityContext securityContext);
}
