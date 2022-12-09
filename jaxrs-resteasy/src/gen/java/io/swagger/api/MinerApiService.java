package io.swagger.api;

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
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-12-09T03:38:45.256Z[GMT]")public interface MinerApiService {
      Response minerClaimMinerGet(String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response minerClaimPost(MinerClaimMinerBody body,SecurityContext securityContext)
      throws NotFoundException;
      Response minerSetInfoMinerPut(MinerMinerSetInfoParams body,String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response minerSuspendMinerPost(MinerSuspendMinerBody body,String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response minerUnsuspendMinerPut(String miner,SecurityContext securityContext)
      throws NotFoundException;
}
