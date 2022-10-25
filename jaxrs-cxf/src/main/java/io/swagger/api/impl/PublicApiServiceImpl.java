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
public class PublicApiServiceImpl implements PublicApi {
    /**
     * Get Content by Cid
     *
     * This endpoint returns the content associated with a CID
     *
     */
    public void publicByCidCidGet(String cid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get public node info
     *
     * This endpoint returns information about the node
     *
     */
    public void publicInfoGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get deal metrics
     *
     * This endpoint is used to get deal metrics
     *
     */
    public void publicMetricsDealsOnChainGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     */
    public void publicMinersDealsMinerGet(String miner, String ignoreFailed) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    public void publicMinersFailuresMinerGet(String miner) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    public void publicMinersGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     */
    public void publicMinersStatsMinerGet(String miner) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     */
    public List<String> publicNetAddrsGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Net Peers
     *
     * This endpoint is used to get net peers
     *
     */
    public List<String> publicNetPeersGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Public stats
     *
     * This endpoint is used to get public stats.
     *
     */
    public void publicStatsGet() {
        // TODO: Implement...
        
        
    }
    
}

