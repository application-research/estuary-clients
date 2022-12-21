package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-12-21T01:22:11.285Z[GMT]")public interface StorageProvidersApiService {
      public Response storageProvidersClaimPost(MinerClaimMinerBody body, SecurityContext securityContext);
      public Response storageProvidersClaimSpGet(String sp, SecurityContext securityContext);
      public Response storageProvidersDealsSpGet(String sp, String ignoreFailed, SecurityContext securityContext);
      public Response storageProvidersFailuresSpGet(String sp, SecurityContext securityContext);
      public Response storageProvidersGet(SecurityContext securityContext);
      public Response storageProvidersSetInfoSpPut(MinerMinerSetInfoParams body, String sp, SecurityContext securityContext);
      public Response storageProvidersStatsSpGet(String sp, SecurityContext securityContext);
      public Response storageProvidersStorageQueryCidGet(String cid, SecurityContext securityContext);
      public Response storageProvidersSuspendSpPost(MinerSuspendMinerBody body, String sp, SecurityContext securityContext);
      public Response storageProvidersUnsuspendSpPut(String sp, SecurityContext securityContext);
}
