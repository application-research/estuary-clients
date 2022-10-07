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
public class AdminApiServiceImpl implements AdminApi {
    /**
     * Remove peers on Peering Service
     *
     * This endpoint can be used to remove a Peer from the Peering Service
     *
     */
    public void adminPeeringPeersDelete() {
        // TODO: Implement...
        
        
    }
    
    /**
     * List all Peering peers
     *
     * This endpoint can be used to list all peers on Peering Service
     *
     */
    public void adminPeeringPeersGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Add peers on Peering Service
     *
     * This endpoint can be used to add a Peer from the Peering Service
     *
     */
    public void adminPeeringPeersPost() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Start Peering
     *
     * This endpoint can be used to start the Peering Service
     *
     */
    public void adminPeeringStartPost() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Check Peering Status
     *
     * This endpoint can be used to check the Peering status
     *
     */
    public void adminPeeringStatusGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Stop Peering
     *
     * This endpoint can be used to stop the Peering Service
     *
     */
    public void adminPeeringStopPost() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get systems(estuary/shuttle) config
     *
     * This endpoint is used to get system configs.
     *
     */
    public void adminSystemConfigGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get all users
     *
     * This endpoint is used to get all users.
     *
     */
    public void adminUsersGet() {
        // TODO: Implement...
        
        
    }
    
}

