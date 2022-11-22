package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.CollectionsCollection;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-22T22:05:02.048Z[GMT]")public abstract class CollectionsApiService {
    public abstract Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidContentsDelete(MainDeleteContentFromCollectionBody body,String coluuid,String contentid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidGet(String coluuid, String dir,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsColuuidPost(List<Integer> body,String coluuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsFsAddPost( @NotNull String coluuid, @NotNull String content, @NotNull String path,SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response collectionsPost(MainCreateCollectionBody body,SecurityContext securityContext) throws NotFoundException;
}
