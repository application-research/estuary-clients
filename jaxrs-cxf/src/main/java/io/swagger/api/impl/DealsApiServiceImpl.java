package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.MainEstimateDealBody;

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
public class DealsApiServiceImpl implements DealsApi {
    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     *
     */
    public void dealEstimatePost(MainEstimateDealBody body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     *
     */
    public void dealInfoDealidGet(Integer dealid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     *
     */
    public void dealProposalPropcidGet(String propcid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    public void dealQueryMinerGet(String miner) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     *
     */
    public void dealStatusByProposalPropcidGet(String propcid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    public void dealStatusMinerPropcidGet(String miner, String propcid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     *
     */
    public void dealTransferInProgressGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     *
     */
    public void dealTransferStatusPost() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     *
     */
    public void dealsFailuresGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     *
     */
    public void dealsMakeMinerPost(String miner, String dealRequest) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     *
     */
    public void dealsStatusDealGet(Integer deal) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     *
     */
    public void publicDealsFailuresGet() {
        // TODO: Implement...
        
        
    }
    
    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     */
    public void publicMinersStorageQueryMinerGet(String miner) {
        // TODO: Implement...
        
        
    }
    
}

