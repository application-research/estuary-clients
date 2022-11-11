package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-11T23:35:21.555Z")
public interface PinningApiService {
      public Response pinningPinsGet(SecurityContext securityContext);
      public Response pinningPinsPinidDelete(String pinid, SecurityContext securityContext);
      public Response pinningPinsPinidGet(String pinid, SecurityContext securityContext);
      public Response pinningPinsPinidPost(String pinid, String cid, String name, String origins, String meta, SecurityContext securityContext);
      public Response pinningPinsPost(TypesIpfsPin pin, SecurityContext securityContext);
}
