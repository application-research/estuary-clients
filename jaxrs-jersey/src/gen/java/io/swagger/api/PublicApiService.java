package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ApiPublicNodeInfo;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-21T01:22:10.613Z[GMT]")public abstract class PublicApiService {
    public abstract Response publicByCidCidGet(String cid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicDealsFailuresGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicInfoGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicMetricsDealsOnChainGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicMinersDealsMinerGet(String miner, String ignoreFailed,SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicMinersFailuresMinerGet(String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicMinersGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicMinersStatsMinerGet(String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicMinersStorageQueryMinerGet(String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicNetAddrsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicNetPeersGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response publicStatsGet(SecurityContext securityContext) throws NotFoundException;
}
