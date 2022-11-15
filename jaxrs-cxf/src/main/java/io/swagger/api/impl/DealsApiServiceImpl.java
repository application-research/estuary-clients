package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
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
public class DealsApiServiceImpl implements DealsApi {
    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     *
     */
    public String dealEstimatePost(MainEstimateDealBody body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     *
     */
    public String dealInfoDealidGet(Integer dealid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     *
     */
    public String dealProposalPropcidGet(String propcid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    public String dealQueryMinerGet(String miner) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     *
     */
    public String dealStatusByProposalPropcidGet(String propcid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    public String dealStatusMinerPropcidGet(String miner, String propcid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     *
     */
    public String dealTransferInProgressGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     *
     */
    public String dealTransferStatusPost(MainChannelIDParam body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     *
     */
    public String dealsFailuresGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     *
     */
    public String dealsMakeMinerPost(String body, String miner) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    public String dealsStatusDealGet(Integer deal) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     *
     */
    public String publicDealsFailuresGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    public String publicMinersStorageQueryMinerGet(String miner) {
        // TODO: Implement...
        
        return null;
    }
    
}

