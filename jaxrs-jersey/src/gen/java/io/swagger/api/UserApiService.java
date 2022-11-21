package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-21T16:22:17.074Z[GMT]")public abstract class UserApiService {
    public abstract Response userApiKeysGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userApiKeysKeyOrHashDelete(String keyOrHash,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userApiKeysPost( String expiry, String perms,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userExportGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userStatsGet(SecurityContext securityContext) throws NotFoundException;
}
