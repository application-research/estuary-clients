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
public class PublicApiServiceImpl implements PublicApi {
    /**
     * Get Content by Cid
     *
     * This endpoint returns the content associated with a CID
     *
     */
    public String publicByCidCidGet(String cid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get public node info
     *
     * This endpoint returns information about the node
     *
     */
    public String publicInfoGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get deal metrics
     *
     * This endpoint is used to get deal metrics
     *
     */
    public String publicMetricsDealsOnChainGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     */
    public String publicMinersDealsMinerGet(String miner, String ignoreFailed) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    public String publicMinersFailuresMinerGet(String miner) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     */
    public String publicMinersGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     */
    public String publicMinersStatsMinerGet(String miner) {
        // TODO: Implement...
        
        return null;
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
    public String publicStatsGet() {
        // TODO: Implement...
        
        return null;
    }
    
}

