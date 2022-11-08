package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.List;
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
    public String adminPeeringPeersDelete(List<Boolean> peerIds) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List all Peering peers
     *
     * This endpoint can be used to list all peers on Peering Service
     *
     */
    public String adminPeeringPeersGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add peers on Peering Service
     *
     * This endpoint can be used to add a Peer from the Peering Service
     *
     */
    public String adminPeeringPeersPost() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Start Peering
     *
     * This endpoint can be used to start the Peering Service
     *
     */
    public String adminPeeringStartPost() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Check Peering Status
     *
     * This endpoint can be used to check the Peering status
     *
     */
    public String adminPeeringStatusGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Stop Peering
     *
     * This endpoint can be used to stop the Peering Service
     *
     */
    public String adminPeeringStopPost() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get systems(estuary/shuttle) config
     *
     * This endpoint is used to get system configs.
     *
     */
    public String adminSystemConfigGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all users
     *
     * This endpoint is used to get all users.
     *
     */
    public String adminUsersGet() {
        // TODO: Implement...
        
        return null;
    }
    
}

