package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.MainGetApiKeysResp;
import io.swagger.model.MainUserStatsResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T23:21:59.224Z")
public interface UserApiService {
      Response userApiKeysGet(SecurityContext securityContext)
      throws NotFoundException;
      Response userApiKeysKeyDelete(String key,SecurityContext securityContext)
      throws NotFoundException;
      Response userApiKeysPost(SecurityContext securityContext)
      throws NotFoundException;
      Response userExportGet(SecurityContext securityContext)
      throws NotFoundException;
      Response userStatsGet(SecurityContext securityContext)
      throws NotFoundException;
}
