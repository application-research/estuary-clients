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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-22T22:05:02.263Z[GMT]")public interface CollectionsApiService {
    public Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext);
    public Response collectionsColuuidContentsDelete(MainDeleteContentFromCollectionBody body,String coluuid,String contentid,SecurityContext securityContext);
    public Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext);
    public Response collectionsColuuidGet(String coluuid, String dir,SecurityContext securityContext);
    public Response collectionsColuuidPost(List<Integer> body,String coluuid,SecurityContext securityContext);
    public Response collectionsFsAddPost( @NotNull String coluuid, @NotNull String content, @NotNull String path,SecurityContext securityContext);
    public Response collectionsGet(SecurityContext securityContext);
    public Response collectionsPost(MainCreateCollectionBody body,SecurityContext securityContext);
}
