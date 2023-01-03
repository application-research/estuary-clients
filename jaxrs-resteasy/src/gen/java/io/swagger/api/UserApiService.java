package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ApiGetApiKeysResp;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-03T16:17:31.923Z[GMT]")public interface UserApiService {
      Response userApiKeysGet(SecurityContext securityContext)
      throws NotFoundException;
      Response userApiKeysKeyOrHashDelete(String keyOrHash,SecurityContext securityContext)
      throws NotFoundException;
      Response userApiKeysPost(String expiry,String perms,SecurityContext securityContext)
      throws NotFoundException;
      Response userExportGet(SecurityContext securityContext)
      throws NotFoundException;
      Response userStatsGet(SecurityContext securityContext)
      throws NotFoundException;
}
