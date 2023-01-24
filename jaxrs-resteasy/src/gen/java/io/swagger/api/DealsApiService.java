package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-24T07:25:42.644Z[GMT]")public interface DealsApiService {
      Response dealsFailuresGet(SecurityContext securityContext)
      throws NotFoundException;
      Response dealsMakeMinerPost(String body,String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response dealsStatusDealGet(Integer deal,SecurityContext securityContext)
      throws NotFoundException;
}
