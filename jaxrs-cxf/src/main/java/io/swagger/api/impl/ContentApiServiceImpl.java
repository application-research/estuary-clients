package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.MainImportDealBody;
import io.swagger.model.TypesIpfsPin;
import io.swagger.model.UtilContentCreateBody;
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
public class ContentApiServiceImpl implements ContentApi {
    /**
     * Create an Estuary invite
     *
     * This endpoint is used to create an estuary invite.
     *
     */
    public String adminInvitesCodePost(String code) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Estuary invites
     *
     * This endpoint is used to list all estuary invites.
     *
     */
    public String adminInvitesGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Upload content via a car file
     *
     * This endpoint uploads content via a car file
     *
     */
    public String contentAddCarPost() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     *
     */
    public String contentAddIpfsPost(TypesIpfsPin body, String ignoreDupes) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Upload a file
     *
     * This endpoint uploads a file.
     *
     */
    public String contentAddPost() {
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
    public String contentAllDealsGet(String begin, String duration, String all) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get content bandwidth
     *
     * This endpoint returns content bandwidth
     *
     */
    public String contentBwUsageContentGet(String content) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add a new content
     *
     * This endpoint adds a new content
     *
     */
    public String contentCreatePost(UtilContentCreateBody body, String ignoreDupes) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Content with deals
     *
     * This endpoint lists all content with deals
     *
     */
    public String contentDealsGet(Integer limit, Integer offset) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Ensure Replication
     *
     * This endpoint ensures that the content is replicated to the specified number of providers
     *
     */
    public String contentEnsureReplicationDatacidGet(String datacid) {
        // TODO: Implement...
        
        return null;
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
     * Content
     *
     * This endpoint returns a content by its ID
     *
     */
    public String contentIdGet(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Import a deal
     *
     * This endpoint imports a deal into the shuttle.
     *
     */
    public String contentImportdealPost(MainImportDealBody body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List all pinned content
     *
     * This endpoint lists all content
     *
     */
    public String contentListGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Read content
     *
     * This endpoint reads content from the blockstore
     *
     */
    public String contentReadContGet(String cont) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get staging zone for user
     *
     * This endpoint is used to get staging zone for user.
     *
     */
    public String contentStagingZonesGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get content statistics
     *
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
     *
     */
    public String contentStatsGet(String limit, String offset) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Content Status
     *
     * This endpoint returns the status of a content
     *
     */
    public String contentStatusIdGet(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
}

