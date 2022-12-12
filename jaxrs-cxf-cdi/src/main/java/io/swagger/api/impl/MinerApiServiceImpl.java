package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-12-12T11:11:35.311Z[GMT]")public class MinerApiServiceImpl implements MinerApiService {
      @Override
      public Response minerClaimMinerGet(String miner, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response minerClaimPost(MinerClaimMinerBody body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response minerSetInfoMinerPut(MinerMinerSetInfoParams body, String miner, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response minerSuspendMinerPost(MinerSuspendMinerBody body, String miner, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response minerUnsuspendMinerPut(String miner, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
