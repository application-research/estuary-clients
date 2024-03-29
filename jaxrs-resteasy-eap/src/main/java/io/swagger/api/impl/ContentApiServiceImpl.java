package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import java.io.File;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-02-02T18:38:36.268Z[GMT]")public class ContentApiServiceImpl implements ContentApi {
      public Response contentAddCarPost(String body,String ignoreDupes,String filename,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentAddIpfsPost(PinnerIpfsPin body,String ignoreDupes,String overwrite,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentAddPost(MultipartFormDataInput input,String coluuid,Integer replication,String ignoreDupes,String overwrite,String lazyProvide,String dir,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentAggregatedContentGet(String content,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentAllDealsGet(String begin,String duration,String all,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentBwUsageContentGet(String content,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentContentsGet(String limit,String offset,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentCreatePost(UtilContentCreateBody body,String ignoreDupes,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentDealsGet(Integer limit,Integer offset,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentEnsureReplicationDatacidGet(String datacid,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentFailuresContentGet(String content,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentIdGet(Integer id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentListGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentStagingZonesGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentStagingZonesStagingZoneContentsGet(Integer stagingZone,String limit,String offset,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentStagingZonesStagingZoneGet(Integer stagingZone,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentStatsGet(String limit,String offset,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentStatusIdGet(Integer id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
