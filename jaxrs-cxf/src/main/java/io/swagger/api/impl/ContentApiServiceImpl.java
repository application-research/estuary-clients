package io.swagger.api.impl;

import io.swagger.api.*;
import java.io.File;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.UtilContentAddIpfsBody;
import io.swagger.model.UtilContentAddResponse;

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
public class ContentApiServiceImpl implements ContentApi {
    /**
     * Add Car object
     *
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     *
     */
    public void contentAddCarPost(String body, String filename, String commp, String size) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     *
     */
    public void contentAddIpfsPost(UtilContentAddIpfsBody body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Add new content
     *
     * This endpoint is used to upload new content.
     *
     */
    public UtilContentAddResponse contentAddPost( Attachment fileDetail, String coluuid, String dir) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get aggregated content stats
     *
     * This endpoint returns aggregated content stats
     *
     */
    public String contentAggregatedContentGet(String content) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all deals for a user
     *
     * This endpoint is used to get all deals for a user
     *
     */
    public void contentAllDealsGet(String begin, String duration, String all) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get content bandwidth
     *
     * This endpoint returns content bandwidth
     *
     */
    public void contentBwUsageContentGet(String content) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Add a new content
     *
     * This endpoint adds a new content
     *
     */
    public void contentCreatePost(String body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Content with deals
     *
     * This endpoint lists all content with deals
     *
     */
    public void contentDealsGet(Integer limit, Integer offset) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Ensure Replication
     *
     * This endpoint ensures that the content is replicated to the specified number of providers
     *
     */
    public void contentEnsureReplicationDatacidGet(String datacid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * List all failures for a content
     *
     * This endpoint returns all failures for a content
     *
     */
    public String contentFailuresContentGet(String content) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Import a deal
     *
     * This endpoint imports a deal into the shuttle.
     *
     */
    public void contentImportdealPost(MainImportDealBody body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * List all pinned content
     *
     * This endpoint lists all content
     *
     */
    public List<String> contentListGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Read content
     *
     * This endpoint reads content from the blockstore
     *
     */
    public void contentReadContGet(String cont) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get staging zone for user
     *
     * This endpoint is used to get staging zone for user.
     *
     */
    public void contentStagingZonesGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get content statistics
     *
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
     *
     */
    public void contentStatsGet(String limit) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Content Status
     *
     * This endpoint returns the status of a content
     *
     */
    public void contentStatusIdGet(Integer id) {
        // TODO: Implement...
        
        
    }
    
}

