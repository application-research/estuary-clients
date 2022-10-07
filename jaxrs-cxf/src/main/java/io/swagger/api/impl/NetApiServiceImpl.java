package io.swagger.api.impl;

import io.swagger.api.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
public class NetApiServiceImpl implements NetApi {
    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     */
    public List<String> netAddrsGet() {
        // TODO: Implement...
        
        return null;
    }
    
}

