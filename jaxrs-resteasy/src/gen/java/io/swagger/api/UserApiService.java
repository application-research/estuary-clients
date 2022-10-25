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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-25T22:53:11.261Z")
public interface UserApiService {
      Response userApiKeysGet(SecurityContext securityContext)
      throws NotFoundException;
      Response userApiKeysKeyDelete(String key,SecurityContext securityContext)
      throws NotFoundException;
      Response userApiKeysPost(String expiry,String perms,SecurityContext securityContext)
      throws NotFoundException;
      Response userExportGet(SecurityContext securityContext)
      throws NotFoundException;
      Response userStatsGet(SecurityContext securityContext)
      throws NotFoundException;
}
