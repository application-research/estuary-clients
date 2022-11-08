package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-08T02:39:39.878Z")
public interface DealsApiService {
      Response dealsFailuresGet(SecurityContext securityContext)
      throws NotFoundException;
      Response dealsMakeMinerPost(String miner,String dealRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response dealsStatusDealGet(Integer deal,SecurityContext securityContext)
      throws NotFoundException;
}
