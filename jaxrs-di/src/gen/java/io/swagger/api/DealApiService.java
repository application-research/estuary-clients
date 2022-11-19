package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-19T20:28:52.988Z[GMT]")public interface DealApiService {
    public Response dealEstimatePost(MainEstimateDealBody body,SecurityContext securityContext);
    public Response dealInfoDealidGet(Integer dealid,SecurityContext securityContext);
    public Response dealProposalPropcidGet(String propcid,SecurityContext securityContext);
    public Response dealQueryMinerGet(String miner,SecurityContext securityContext);
    public Response dealStatusByProposalPropcidGet(String propcid,SecurityContext securityContext);
    public Response dealStatusMinerPropcidGet(String miner,String propcid,SecurityContext securityContext);
    public Response dealTransferInProgressGet(SecurityContext securityContext);
    public Response dealTransferStatusPost(MainChannelIDParam body,SecurityContext securityContext);
}
