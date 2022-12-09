package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-12-09T03:38:43.852Z[GMT]")public interface AdminApiService {
    public Response adminAutoretrieveInitPost(String addresses,String pubKey,SecurityContext securityContext);
    public Response adminAutoretrieveListGet(SecurityContext securityContext);
    public Response adminInvitesCodePost(String code,SecurityContext securityContext);
    public Response adminInvitesGet(SecurityContext securityContext);
    public Response adminPeeringPeersDelete(List<Boolean> body,SecurityContext securityContext);
    public Response adminPeeringPeersGet(SecurityContext securityContext);
    public Response adminPeeringPeersPost(SecurityContext securityContext);
    public Response adminPeeringStartPost(SecurityContext securityContext);
    public Response adminPeeringStatusGet(SecurityContext securityContext);
    public Response adminPeeringStopPost(SecurityContext securityContext);
    public Response adminSystemConfigGet(SecurityContext securityContext);
    public Response adminUsersGet(SecurityContext securityContext);
}
