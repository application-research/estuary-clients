package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-11-15T21:05:25.694Z[GMT]")public interface AdminApiService {
      Response adminAutoretrieveInitPost(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException;
      Response adminAutoretrieveListGet(SecurityContext securityContext)
      throws NotFoundException;
      Response adminPeeringPeersDelete(List<Boolean> body,SecurityContext securityContext)
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
