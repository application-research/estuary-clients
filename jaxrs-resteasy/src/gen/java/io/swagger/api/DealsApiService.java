package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T23:21:59.224Z")
public interface DealsApiService {
      Response dealsFailuresGet(SecurityContext securityContext)
      throws NotFoundException;
      Response dealsMakeMinerPost(String miner,String dealRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response dealsStatusDealGet(Integer deal,SecurityContext securityContext)
      throws NotFoundException;
}
