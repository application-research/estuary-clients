package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ApiMinerResp;
import io.swagger.model.PeeringPeeringPeer;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-02-02T18:38:37.222Z[GMT]")public abstract class AdminApiService {
    public abstract Response adminAutoretrieveInitPost(String addresses,String pubKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminAutoretrieveListGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminInvitesCodePost(String code,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminInvitesGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminMinersGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminPeeringPeersDelete(List<String> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminPeeringPeersGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminPeeringPeersPost(List<PeeringPeeringPeer> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminPeeringStartPost(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminPeeringStatusGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminPeeringStopPost(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminSystemConfigGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminUsersGet(SecurityContext securityContext) throws NotFoundException;
}
