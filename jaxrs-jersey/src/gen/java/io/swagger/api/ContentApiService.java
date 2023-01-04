package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilContentAddResponse;
import io.swagger.model.UtilContentCreateBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-04T12:55:53.153Z[GMT]")public abstract class ContentApiService {
    public abstract Response contentAddCarPost(String body, String ignoreDupes, String filename,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAddIpfsPost(TypesIpfsPin body, String ignoreDupes, String overwrite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAddPost(InputStream dataInputStream, FormDataContentDisposition dataDetail,String filename, String coluuid, Integer replication, String ignoreDupes, String overwrite, String lazyProvide, String dir,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAggregatedContentGet(String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentAllDealsGet( @NotNull String begin, @NotNull String duration, @NotNull String all,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentBwUsageContentGet(String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentContentsGet( @NotNull String limit, @NotNull String offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentCreatePost(UtilContentCreateBody body, String ignoreDupes,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentDealsGet( Integer limit, Integer offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentEnsureReplicationDatacidGet(String datacid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentFailuresContentGet(String content,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentIdGet(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentListGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStagingZonesGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStagingZonesStagingZoneContentsGet(Integer stagingZone, @NotNull String limit, @NotNull String offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStagingZonesStagingZoneGet(Integer stagingZone,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStatsGet( @NotNull String limit, @NotNull String offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response contentStatusIdGet(Integer id,SecurityContext securityContext) throws NotFoundException;
}
