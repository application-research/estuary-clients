package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import java.io.InputStream;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")
public interface ContentApiService {
      public Response contentAddCarPost(String body, String ignoreDupes, String filename, SecurityContext securityContext);
      public Response contentAddIpfsPost(UtilContentAddIpfsBody body, String ignoreDupes, SecurityContext securityContext);
      public Response contentAddPost(InputStream dataInputStream, Attachment dataDetail, String filename, String coluuid, Integer replication, String ignoreDupes, String lazyProvide, String dir, SecurityContext securityContext);
      public Response contentAggregatedContentGet(String content, SecurityContext securityContext);
      public Response contentAllDealsGet(String begin, String duration, String all, SecurityContext securityContext);
      public Response contentBwUsageContentGet(String content, SecurityContext securityContext);
      public Response contentCreatePost(UtilContentCreateBody req, String ignoreDupes, SecurityContext securityContext);
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
