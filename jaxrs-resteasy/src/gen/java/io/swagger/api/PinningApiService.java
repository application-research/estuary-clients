package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public interface PinningApiService {
      Response pinningPinsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidDelete(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidGet(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidPost(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPost(TypesIpfsPin pin,SecurityContext securityContext)
      throws NotFoundException;
}
