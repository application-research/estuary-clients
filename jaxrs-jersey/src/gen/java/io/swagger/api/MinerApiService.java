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
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-04T12:55:53.153Z[GMT]")public abstract class MinerApiService {
    public abstract Response minerClaimMinerGet(String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response minerClaimPost(MinerClaimMinerBody body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response minerSetInfoMinerPut(MinerMinerSetInfoParams body,String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response minerSuspendMinerPost(MinerSuspendMinerBody body,String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response minerUnsuspendMinerPut(String miner,SecurityContext securityContext) throws NotFoundException;
}
