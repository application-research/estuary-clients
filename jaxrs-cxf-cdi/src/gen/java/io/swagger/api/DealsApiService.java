package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")
public interface DealsApiService {
      public Response dealsFailuresGet(SecurityContext securityContext);
      public Response dealsMakeMinerPost(String miner, String dealRequest, SecurityContext securityContext);
      public Response dealsStatusDealGet(Integer deal, SecurityContext securityContext);
}
