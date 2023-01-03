package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.PeeringPeeringPeer;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-03T16:17:33.393Z[GMT]")public interface AdminApiService {
      public Response adminAutoretrieveInitPost(String addresses, String pubKey, SecurityContext securityContext);
      public Response adminAutoretrieveListGet(SecurityContext securityContext);
      public Response adminInvitesCodePost(String code, SecurityContext securityContext);
      public Response adminInvitesGet(SecurityContext securityContext);
      public Response adminPeeringPeersDelete(List<String> body, SecurityContext securityContext);
      public Response adminPeeringPeersGet(SecurityContext securityContext);
      public Response adminPeeringPeersPost(List<PeeringPeeringPeer> body, SecurityContext securityContext);
      public Response adminPeeringStartPost(SecurityContext securityContext);
      public Response adminPeeringStatusGet(SecurityContext securityContext);
      public Response adminPeeringStopPost(SecurityContext securityContext);
      public Response adminSystemConfigGet(SecurityContext securityContext);
      public Response adminUsersGet(SecurityContext securityContext);
}
