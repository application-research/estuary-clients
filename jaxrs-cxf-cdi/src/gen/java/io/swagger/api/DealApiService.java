package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-11-07T20:05:55.877Z")
public interface DealApiService {
      public Response dealEstimatePost(MainEstimateDealBody body, SecurityContext securityContext);
      public Response dealInfoDealidGet(Integer dealid, SecurityContext securityContext);
      public Response dealProposalPropcidGet(String propcid, SecurityContext securityContext);
      public Response dealQueryMinerGet(String miner, SecurityContext securityContext);
      public Response dealStatusByProposalPropcidGet(String propcid, SecurityContext securityContext);
      public Response dealStatusMinerPropcidGet(String miner, String propcid, SecurityContext securityContext);
      public Response dealTransferInProgressGet(SecurityContext securityContext);
      public Response dealTransferStatusPost(MainChannelIDParam chanid, SecurityContext securityContext);
}
