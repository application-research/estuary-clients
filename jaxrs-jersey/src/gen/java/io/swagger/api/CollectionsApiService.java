package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-13T19:43:16.543Z[GMT]")public abstract class CollectionsApiService {
    public abstract Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidContentsDelete(ApiDeleteContentFromCollectionBody body,String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidGet(String coluuid, String dir,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidPost(List<Integer> body,String coluuid, String dir, String overwrite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsFsAddPost( @NotNull String coluuid, @NotNull String content, String dir, String overwrite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsPost(ApiCreateCollectionBody body,SecurityContext securityContext) throws NotFoundException;
}
