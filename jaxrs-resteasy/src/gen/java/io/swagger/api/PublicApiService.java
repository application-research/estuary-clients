package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public interface PublicApiService {
      Response publicByCidCidGet(String cid,SecurityContext securityContext)
      throws NotFoundException;
      Response publicDealsFailuresGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicInfoGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicMetricsDealsOnChainGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicMinersDealsMinerGet(String miner,String ignoreFailed,SecurityContext securityContext)
      throws NotFoundException;
      Response publicMinersFailuresMinerGet(String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response publicMinersGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicMinersStatsMinerGet(String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response publicMinersStorageQueryMinerGet(String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response publicNetAddrsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicNetPeersGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicStatsGet(SecurityContext securityContext)
      throws NotFoundException;
}
