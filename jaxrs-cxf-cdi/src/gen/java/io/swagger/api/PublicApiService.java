package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.ApiPublicNodeInfo;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-19T16:30:02.104Z[GMT]")public interface PublicApiService {
      public Response publicByCidCidGet(String cid, SecurityContext securityContext);
      public Response publicDealsFailuresGet(SecurityContext securityContext);
      public Response publicInfoGet(SecurityContext securityContext);
      public Response publicMetricsDealsOnChainGet(SecurityContext securityContext);
      public Response publicMinersDealsMinerGet(String miner, String ignoreFailed, SecurityContext securityContext);
      public Response publicMinersFailuresMinerGet(String miner, SecurityContext securityContext);
      public Response publicMinersStatsMinerGet(String miner, SecurityContext securityContext);
      public Response publicMinersStorageQueryMinerGet(String miner, SecurityContext securityContext);
      public Response publicNetAddrsGet(SecurityContext securityContext);
      public Response publicNetPeersGet(SecurityContext securityContext);
      public Response publicStatsGet(SecurityContext securityContext);
}
