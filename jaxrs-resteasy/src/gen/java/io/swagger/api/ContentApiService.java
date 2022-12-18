package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import java.io.File;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-12-18T07:30:24.829Z[GMT]")public interface ContentApiService {
      Response contentAddCarPost(String body,String ignoreDupes,String filename,SecurityContext securityContext)
      throws NotFoundException;
      Response contentAddIpfsPost(TypesIpfsPin body,String ignoreDupes,SecurityContext securityContext)
      throws NotFoundException;
      Response contentAddPost(MultipartFormDataInput input,String coluuid,Integer replication,String ignoreDupes,String lazyProvide,String dir,SecurityContext securityContext)
      throws NotFoundException;
      Response contentAggregatedContentGet(String content,SecurityContext securityContext)
      throws NotFoundException;
      Response contentAllDealsGet(String begin,String duration,String all,SecurityContext securityContext)
      throws NotFoundException;
      Response contentBwUsageContentGet(String content,SecurityContext securityContext)
      throws NotFoundException;
      Response contentContentsGet(String limit,String offset,SecurityContext securityContext)
      throws NotFoundException;
      Response contentCreatePost(UtilContentCreateBody body,String ignoreDupes,SecurityContext securityContext)
      throws NotFoundException;
      Response contentDealsGet(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response contentEnsureReplicationDatacidGet(String datacid,SecurityContext securityContext)
      throws NotFoundException;
      Response contentFailuresContentGet(String content,SecurityContext securityContext)
      throws NotFoundException;
      Response contentIdGet(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response contentListGet(SecurityContext securityContext)
      throws NotFoundException;
      Response contentStagingZonesGet(SecurityContext securityContext)
      throws NotFoundException;
      Response contentStagingZonesStagingZoneContentsGet(Integer stagingZone,String limit,String offset,SecurityContext securityContext)
      throws NotFoundException;
      Response contentStagingZonesStagingZoneGet(Integer stagingZone,SecurityContext securityContext)
      throws NotFoundException;
      Response contentStatsGet(String limit,String offset,SecurityContext securityContext)
      throws NotFoundException;
      Response contentStatusIdGet(Integer id,SecurityContext securityContext)
      throws NotFoundException;
}
