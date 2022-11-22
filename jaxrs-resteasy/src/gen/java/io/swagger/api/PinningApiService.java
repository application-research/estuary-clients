package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-11-22T22:05:01.608Z[GMT]")public interface PinningApiService {
      Response pinningPinsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidDelete(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidGet(String pinid,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPinidPost(String pinid,String body,SecurityContext securityContext)
      throws NotFoundException;
      Response pinningPinsPost(TypesIpfsPin body,SecurityContext securityContext)
      throws NotFoundException;
}
