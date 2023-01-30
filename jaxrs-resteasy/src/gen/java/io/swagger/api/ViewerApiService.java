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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-30T18:30:33.651Z[GMT]")public interface ViewerApiService {
      Response viewerGet(SecurityContext securityContext)
      throws NotFoundException;
}
