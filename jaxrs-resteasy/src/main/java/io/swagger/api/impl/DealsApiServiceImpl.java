package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public class DealsApiServiceImpl implements DealsApiService {
      public Response dealsFailuresGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response dealsMakeMinerPost(String miner,String dealRequest,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response dealsStatusDealGet(Integer deal,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
