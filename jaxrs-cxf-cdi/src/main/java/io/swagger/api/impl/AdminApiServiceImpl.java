package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.ApiMinerResp;
import io.swagger.model.PeeringPeeringPeer;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-13T19:43:17.065Z[GMT]")public class AdminApiServiceImpl implements AdminApiService {
      @Override
      public Response adminAutoretrieveInitPost(String addresses, String pubKey, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminAutoretrieveListGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminInvitesCodePost(String code, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminInvitesGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminMinersGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminPeeringPeersDelete(List<String> body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminPeeringPeersGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminPeeringPeersPost(List<PeeringPeeringPeer> body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminPeeringStartPost(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminPeeringStatusGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminPeeringStopPost(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminSystemConfigGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response adminUsersGet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
