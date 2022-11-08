package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.List;
import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-08T02:39:47.430Z")
public interface UserApiService {
      public Response userApiKeysGet(SecurityContext securityContext);
      public Response userApiKeysKeyOrHashDelete(String keyOrHash, SecurityContext securityContext);
      public Response userApiKeysPost(String expiry, String perms, SecurityContext securityContext);
      public Response userExportGet(SecurityContext securityContext);
      public Response userStatsGet(SecurityContext securityContext);
}
