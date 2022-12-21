package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-12-21T01:22:09.414Z[GMT]")public interface StorageProvidersApiService {
      Response storageProvidersClaimPost(MinerClaimMinerBody body,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersClaimSpGet(String sp,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersDealsSpGet(String sp,String ignoreFailed,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersFailuresSpGet(String sp,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersGet(SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersSetInfoSpPut(MinerMinerSetInfoParams body,String sp,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersStatsSpGet(String sp,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersStorageQueryCidGet(String cid,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersSuspendSpPost(MinerSuspendMinerBody body,String sp,SecurityContext securityContext)
      throws NotFoundException;
      Response storageProvidersUnsuspendSpPut(String sp,SecurityContext securityContext)
      throws NotFoundException;
}
