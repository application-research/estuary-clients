package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-30T18:30:35.818Z[GMT]")public interface ContentApiService {
      public Response contentAddCarPost(String body, String ignoreDupes, String filename, SecurityContext securityContext);
      public Response contentAddIpfsPost(PinnerIpfsPin body, String ignoreDupes, String overwrite, SecurityContext securityContext);
      public Response contentAddPost(InputStream dataInputStream, Attachment dataDetail, String filename, String coluuid, Integer replication, String ignoreDupes, String overwrite, String lazyProvide, String dir, SecurityContext securityContext);
      public Response contentAggregatedContentGet(String content, SecurityContext securityContext);
      public Response contentAllDealsGet(String begin, String duration, String all, SecurityContext securityContext);
      public Response contentBwUsageContentGet(String content, SecurityContext securityContext);
      public Response contentContentsGet(String limit, String offset, SecurityContext securityContext);
      public Response contentCreatePost(UtilContentCreateBody body, String ignoreDupes, SecurityContext securityContext);
      public Response contentDealsGet(Integer limit, Integer offset, SecurityContext securityContext);
      public Response contentEnsureReplicationDatacidGet(String datacid, SecurityContext securityContext);
      public Response contentFailuresContentGet(String content, SecurityContext securityContext);
      public Response contentIdGet(Integer id, SecurityContext securityContext);
      public Response contentListGet(SecurityContext securityContext);
      public Response contentStagingZonesGet(SecurityContext securityContext);
      public Response contentStagingZonesStagingZoneContentsGet(Integer stagingZone, String limit, String offset, SecurityContext securityContext);
      public Response contentStagingZonesStagingZoneGet(Integer stagingZone, SecurityContext securityContext);
      public Response contentStatsGet(String limit, String offset, SecurityContext securityContext);
      public Response contentStatusIdGet(Integer id, SecurityContext securityContext);
}
