package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-07T20:06:01.579Z")
public interface DealApiService {
      Response dealEstimatePost(MainEstimateDealBody body,SecurityContext securityContext)
      throws NotFoundException;
      Response dealInfoDealidGet(Integer dealid,SecurityContext securityContext)
      throws NotFoundException;
      Response dealProposalPropcidGet(String propcid,SecurityContext securityContext)
      throws NotFoundException;
      Response dealQueryMinerGet(String miner,SecurityContext securityContext)
      throws NotFoundException;
      Response dealStatusByProposalPropcidGet(String propcid,SecurityContext securityContext)
      throws NotFoundException;
      Response dealStatusMinerPropcidGet(String miner,String propcid,SecurityContext securityContext)
      throws NotFoundException;
      Response dealTransferInProgressGet(SecurityContext securityContext)
      throws NotFoundException;
      Response dealTransferStatusPost(MainChannelIDParam chanid,SecurityContext securityContext)
      throws NotFoundException;
}
