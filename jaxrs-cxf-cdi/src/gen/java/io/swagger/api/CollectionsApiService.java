package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.CollectionsCollection;
import java.util.List;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")
public interface CollectionsApiService {
      public Response collectionsColuuidCommitPost(String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidContentsDelete(String coluuid, String contentid, MainDeleteContentFromCollectionBody body, SecurityContext securityContext);
      public Response collectionsColuuidDelete(String coluuid, SecurityContext securityContext);
      public Response collectionsColuuidGet(String coluuid, String dir, SecurityContext securityContext);
      public Response collectionsColuuidPost(String coluuid, List<Integer> contentIDs, SecurityContext securityContext);
      public Response collectionsFsAddPost(String coluuid, String content, String path, SecurityContext securityContext);
      public Response collectionsGet(SecurityContext securityContext);
      public Response collectionsPost(MainCreateCollectionBody body, SecurityContext securityContext);
}
