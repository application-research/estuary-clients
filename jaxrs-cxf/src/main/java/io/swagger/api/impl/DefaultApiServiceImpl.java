package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.UtilHttpError;
import io.swagger.model.UtilViewerResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * Fetch viewer details
     *
     * This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
     *
     */
    public UtilViewerResponse viewerGet() {
        // TODO: Implement...
        
        return null;
    }
    
}

