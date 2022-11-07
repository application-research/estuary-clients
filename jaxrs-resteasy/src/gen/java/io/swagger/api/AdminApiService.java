package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.List;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public interface AdminApiService {
      Response adminAutoretrieveInitPost(String addresses,String pubKey,SecurityContext securityContext)
      throws NotFoundException;
      Response adminAutoretrieveListGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersDelete(List<Boolean> peerIds,SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersPost(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringStartPost(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringStatusGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringStopPost(SecurityContext securityContext)
      throws NotFoundException;
      Response adminSystemConfigGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminUsersGet(SecurityContext securityContext)
      throws NotFoundException;
}
