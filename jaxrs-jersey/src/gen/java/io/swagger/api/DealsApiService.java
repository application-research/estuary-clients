package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-11-15T21:05:26.107Z[GMT]")public abstract class DealsApiService {
    public abstract Response dealsFailuresGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealsMakeMinerPost(String body,String miner,SecurityContext securityContext) throws NotFoundException;
    public abstract Response dealsStatusDealGet(Integer deal,SecurityContext securityContext) throws NotFoundException;
}
