package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-18T01:22:42.674Z[GMT]")public interface DealsApiService {
    public Response dealsFailuresGet(SecurityContext securityContext);
    public Response dealsMakeMinerPost(String body,String miner,SecurityContext securityContext);
    public Response dealsStatusDealGet(Integer deal,SecurityContext securityContext);
}
