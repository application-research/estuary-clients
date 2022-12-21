package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ApiStorageProviderResp;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import java.util.Map;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
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
public class SpApiServiceImpl implements SpApi {
    /**
     * Claim Storage Provider
     *
     * This endpoint lets a user claim a storage provider
     *
     */
    public GithubComApplicationResearchEstuaryApiV2ClaimResponse storageProvidersClaimPost(MinerClaimMinerBody body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Claim Storage Provider
     *
     * This endpoint lets a user get the message in order to claim a storage provider
     *
     */
    public GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storageProvidersClaimSpGet(String sp) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all storage providers deals
     *
     * This endpoint returns all storage providers deals
     *
     */
    public String storageProvidersDealsSpGet(String sp, String ignoreFailed) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all storage providers
     *
     * This endpoint returns all storage providers
     *
     */
    public String storageProvidersFailuresSpGet(String sp) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all storage providers
     *
     * This endpoint returns all storage providers
     *
     */
    public List<ApiStorageProviderResp> storageProvidersGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Set Storage Provider Info
     *
     * This endpoint lets a user set storage provider info.
     *
     */
    public void storageProvidersSetInfoSpPut(MinerMinerSetInfoParams body, String sp) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get storage provider stats
     *
     * This endpoint returns storage provider stats
     *
     */
    public String storageProvidersStatsSpGet(String sp) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Suspend Storage Provider
     *
     * This endpoint lets a user suspend a storage provider.
     *
     */
    public Map<String, String> storageProvidersSuspendSpPost(MinerSuspendMinerBody body, String sp) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Unuspend Storage Provider
     *
     * This endpoint lets a user unsuspend a Storage Provider.
     *
     */
    public void storageProvidersUnsuspendSpPut(String sp) {
        // TODO: Implement...
        
        
    }
    
}

