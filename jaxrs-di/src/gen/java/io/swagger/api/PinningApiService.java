package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2022-11-15T21:05:25.450Z[GMT]")public interface PinningApiService {
    public Response pinningPinsGet(SecurityContext securityContext);
    public Response pinningPinsPinidDelete(String pinid,SecurityContext securityContext);
    public Response pinningPinsPinidGet(String pinid,SecurityContext securityContext);
    public Response pinningPinsPinidPost(String pinid,String body,SecurityContext securityContext);
    public Response pinningPinsPost(TypesIpfsPin body,SecurityContext securityContext);
}
