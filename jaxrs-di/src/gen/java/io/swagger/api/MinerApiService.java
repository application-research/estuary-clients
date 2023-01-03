package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2023-01-03T16:17:31.348Z[GMT]")public interface MinerApiService {
    public Response minerClaimMinerGet(String miner,SecurityContext securityContext);
    public Response minerClaimPost(MinerClaimMinerBody body,SecurityContext securityContext);
    public Response minerSetInfoMinerPut(MinerMinerSetInfoParams body,String miner,SecurityContext securityContext);
    public Response minerSuspendMinerPost(MinerSuspendMinerBody body,String miner,SecurityContext securityContext);
    public Response minerUnsuspendMinerPut(String miner,SecurityContext securityContext);
}
