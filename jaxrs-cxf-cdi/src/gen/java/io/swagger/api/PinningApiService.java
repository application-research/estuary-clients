package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.PinnerIpfsListPinStatusResponse;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.PinnerIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-02-02T18:38:39.054Z[GMT]")public interface PinningApiService {
      public Response pinningPinsGet(SecurityContext securityContext);
      public Response pinningPinsPinidDelete(String pinid, SecurityContext securityContext);
      public Response pinningPinsPinidGet(String pinid, SecurityContext securityContext);
      public Response pinningPinsPinidPost(PinnerIpfsPin body, String pinid, SecurityContext securityContext);
      public Response pinningPinsPost(PinnerIpfsPin body, String ignoreDupes, String overwrite, SecurityContext securityContext);
}
