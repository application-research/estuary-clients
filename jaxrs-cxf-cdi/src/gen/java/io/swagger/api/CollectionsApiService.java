package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-04T12:55:54.251Z[GMT]")public interface CollectionsApiService {
      public Response collectionsColuuidCommitPost(String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidContentsDelete(ApiDeleteContentFromCollectionBody body, String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidDelete(String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidGet(String coluuid, String dir, SecurityContext securityContext);
      public Response collectionsColuuidPost(List<Integer> body, String coluuid, String dir, String overwrite, SecurityContext securityContext);
      public Response collectionsFsAddPost(String coluuid, String content, String dir, String overwrite, SecurityContext securityContext);
      public Response collectionsGet(SecurityContext securityContext);
      public Response collectionsPost(ApiCreateCollectionBody body, SecurityContext securityContext);
}
