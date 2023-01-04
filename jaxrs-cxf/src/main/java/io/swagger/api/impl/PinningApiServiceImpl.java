package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.TypesIpfsListPinStatusResponse;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.TypesIpfsPinStatusResponse;
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
public class PinningApiServiceImpl implements PinningApi {
    /**
     * List all pin status objects
     *
     * This endpoint lists all pin status objects
     *
     */
    public TypesIpfsListPinStatusResponse pinningPinsGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Delete a pinned object
     *
     * This endpoint deletes a pinned object.
     *
     */
    public void pinningPinsPinidDelete(String pinid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get a pin status object
     *
     * This endpoint returns a pin status object.
     *
     */
    public TypesIpfsPinStatusResponse pinningPinsPinidGet(String pinid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Replace a pinned object
     *
     * This endpoint replaces a pinned object.
     *
     */
    public TypesIpfsPinStatusResponse pinningPinsPinidPost(TypesIpfsPin body, String pinid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add and pin object
     *
     * This endpoint adds a pin to the IPFS daemon.
     *
     */
    public TypesIpfsPinStatusResponse pinningPinsPost(TypesIpfsPin body, String ignoreDupes, String overwrite) {
        // TODO: Implement...
        
        return null;
    }
    
}

