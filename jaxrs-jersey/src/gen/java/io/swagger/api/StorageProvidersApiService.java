package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-12-21T01:22:10.613Z[GMT]")public abstract class StorageProvidersApiService {
    public abstract Response storageProvidersClaimPost(MinerClaimMinerBody body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersClaimSpGet(String sp,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersDealsSpGet(String sp, String ignoreFailed,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersFailuresSpGet(String sp,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersSetInfoSpPut(MinerMinerSetInfoParams body,String sp,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersStatsSpGet(String sp,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersStorageQueryCidGet(String cid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersSuspendSpPost(MinerSuspendMinerBody body,String sp,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storageProvidersUnsuspendSpPut(String sp,SecurityContext securityContext) throws NotFoundException;
}
