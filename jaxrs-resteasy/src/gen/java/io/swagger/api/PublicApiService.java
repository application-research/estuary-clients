package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-10-07T23:59:37.480Z")
public interface PublicApiService {
      Response publicByCidCidGet(String cid,SecurityContext securityContext)
      throws NotFoundException;
      Response publicDealsFailuresGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicInfoGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicMetricsDealsOnChainGet(SecurityContext securityContext)
      throws NotFoundException;
      Response publicMinersDealsMinerGet(String miner,SecurityContext securityContext)
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
