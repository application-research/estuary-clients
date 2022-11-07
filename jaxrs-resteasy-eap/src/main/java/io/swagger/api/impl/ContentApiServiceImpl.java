package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-11-07T20:06:03.798Z")
public class ContentApiServiceImpl implements ContentApi {
      public Response contentAddCarPost(String body,String ignoreDupes,String filename,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentAddIpfsPost(UtilContentAddIpfsBody body,String ignoreDupes,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentAddPost(MultipartFormDataInput input,String coluuid,Integer replication,String ignoreDupes,String lazyProvide,String dir,SecurityContext securityContext) {
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
      public Response contentCreatePost(UtilContentCreateBody req,String ignoreDupes,SecurityContext securityContext) {
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
      public Response contentImportdealPost(MainImportDealBody body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentListGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentReadContGet(String cont,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contentStagingZonesGet(SecurityContext securityContext) {
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
