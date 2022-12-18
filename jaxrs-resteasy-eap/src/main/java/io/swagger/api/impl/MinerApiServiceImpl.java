package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2022-12-18T07:30:24.278Z[GMT]")public class MinerApiServiceImpl implements MinerApi {
      public Response minerClaimMinerGet(String miner,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response minerClaimPost(MinerClaimMinerBody body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response minerSetInfoMinerPut(MinerMinerSetInfoParams body,String miner,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response minerSuspendMinerPost(MinerSuspendMinerBody body,String miner,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response minerUnsuspendMinerPut(String miner,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
