package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.MainImportDealBody;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2022-12-12T11:11:35.311Z[GMT]")public interface ContentApiService {
      public Response contentAddCarPost(SecurityContext securityContext);
      public Response contentAddIpfsPost(TypesIpfsPin body, String ignoreDupes, SecurityContext securityContext);
      public Response contentAddPost(SecurityContext securityContext);
      public Response contentAggregatedContentGet(String content, SecurityContext securityContext);
      public Response contentAllDealsGet(String begin, String duration, String all, SecurityContext securityContext);
      public Response contentBwUsageContentGet(String content, SecurityContext securityContext);
      public Response contentCreatePost(UtilContentCreateBody body, String ignoreDupes, SecurityContext securityContext);
      public Response contentDealsGet(Integer limit, Integer offset, SecurityContext securityContext);
      public Response contentEnsureReplicationDatacidGet(String datacid, SecurityContext securityContext);
      public Response contentFailuresContentGet(String content, SecurityContext securityContext);
      public Response contentIdGet(Integer id, SecurityContext securityContext);
      public Response contentImportdealPost(MainImportDealBody body, SecurityContext securityContext);
      public Response contentListGet(SecurityContext securityContext);
      public Response contentReadContGet(String cont, SecurityContext securityContext);
      public Response contentStagingZonesGet(SecurityContext securityContext);
      public Response contentStatsGet(String limit, String offset, SecurityContext securityContext);
      public Response contentStatusIdGet(Integer id, SecurityContext securityContext);
}
