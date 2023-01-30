package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.PinnerIpfsListPinStatusResponse;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.PinnerIpfsPinStatusResponse;
import io.swagger.model.UtilHttpError;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2023-01-30T18:30:35.620Z[GMT]")public abstract class PinningApiService {
    public abstract Response pinningPinsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinningPinsPinidDelete(String pinid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinningPinsPinidGet(String pinid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinningPinsPinidPost(PinnerIpfsPin body,String pinid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinningPinsPost(PinnerIpfsPin body, String ignoreDupes, String overwrite,SecurityContext securityContext) throws NotFoundException;
}
