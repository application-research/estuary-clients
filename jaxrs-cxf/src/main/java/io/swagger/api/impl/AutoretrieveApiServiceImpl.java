package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.UtilHttpError;

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
public class AutoretrieveApiServiceImpl implements AutoretrieveApi {
    /**
     * Register autoretrieve server
     *
     * This endpoint registers a new autoretrieve server
     *
     */
    public String adminAutoretrieveInitPost(String addresses, String pubKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List autoretrieve servers
     *
     * This endpoint lists all registered autoretrieve servers
     *
     */
    public String adminAutoretrieveListGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Marks autoretrieve server as up
     *
     * This endpoint updates the lastConnection field for autoretrieve
     *
     */
    public String autoretrieveHeartbeatPost(String token) {
        // TODO: Implement...
        
        return null;
    }
    
}

