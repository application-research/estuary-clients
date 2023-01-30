package io.swagger.api.impl;

import io.swagger.api.*;
import java.io.File;
import io.swagger.model.PinnerIpfsPin;
import io.swagger.model.UtilContentAddResponse;
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
     * Add Car object
     *
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     *
     */
    public UtilContentAddResponse contentAddCarPost(String body, String ignoreDupes, String filename) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add IPFS object
     *
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     *
     */
    public String contentAddIpfsPost(PinnerIpfsPin body, String ignoreDupes, String overwrite) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add new content
     *
     * This endpoint is used to upload new content.
     *
     */
    public UtilContentAddResponse contentAddPost( Attachment dataDetail, String filename, String coluuid, Integer replication, String ignoreDupes, String overwrite, String lazyProvide, String dir) {
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
     * Get user contents
     *
     * This endpoint is used to get user contents
     *
     */
    public String contentContentsGet(String limit, String offset) {
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
     * Get staging zone for user, excluding its contents
     *
     * This endpoint is used to get staging zone for user, excluding its contents.
     *
     */
    public String contentStagingZonesGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get contents for a staging zone
     *
     * This endpoint is used to get the contents for a staging zone
     *
     */
    public String contentStagingZonesStagingZoneContentsGet(Integer stagingZone, String limit, String offset) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get staging zone without its contents field populated
     *
     * This endpoint is used to get a staging zone, excluding its contents.
     *
     */
    public String contentStagingZonesStagingZoneGet(Integer stagingZone) {
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

