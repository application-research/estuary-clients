package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ApiCreateCollectionBody;
import io.swagger.model.ApiDeleteContentFromCollectionBody;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.CollectionsCollectionListResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-30T18:30:33.651Z[GMT]")public interface CollectionsApiService {
      Response collectionsColuuidCommitPost(String coluuid,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidContentsDelete(ApiDeleteContentFromCollectionBody body,String coluuid,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidDelete(String coluuid,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidGet(String coluuid,String dir,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsColuuidPost(List<Integer> body,String coluuid,String dir,String overwrite,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsFsAddPost(String coluuid,String content,String dir,String overwrite,SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response collectionsPost(ApiCreateCollectionBody body,SecurityContext securityContext)
      throws NotFoundException;
}
