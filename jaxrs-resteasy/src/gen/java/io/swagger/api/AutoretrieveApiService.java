package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-25T22:53:11.261Z")
public interface AutoretrieveApiService {
      Response autoretrieveHeartbeatPost(String token,SecurityContext securityContext)
      throws NotFoundException;
}
