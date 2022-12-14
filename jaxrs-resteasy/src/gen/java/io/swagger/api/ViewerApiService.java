package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.UtilHttpError;
import io.swagger.model.UtilViewerResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2022-12-14T06:22:39.433Z[GMT]")public interface ViewerApiService {
      Response viewerGet(SecurityContext securityContext)
      throws NotFoundException;
}
