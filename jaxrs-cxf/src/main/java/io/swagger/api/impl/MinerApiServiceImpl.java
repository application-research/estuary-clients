package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
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
public class MinerApiServiceImpl implements MinerApi {
    /**
     * Get Claim Miner Message
     *
     * This endpoint lets a user get the message in order to claim a miner
     *
     */
    public ApiClaimMsgResponse minerClaimMinerGet(String miner) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Claim Miner
     *
     * This endpoint lets a user claim a miner
     *
     */
    public ApiClaimResponse minerClaimPost(MinerClaimMinerBody body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Set Miner Info
     *
     * This endpoint lets a user set miner info.
     *
     */
    public ApiEmptyResp minerSetInfoMinerPut(MinerMinerSetInfoParams body, String miner) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Suspend Miner
     *
     * This endpoint lets a user suspend a miner.
     *
     */
    public ApiEmptyResp minerSuspendMinerPost(MinerSuspendMinerBody body, String miner) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Unuspend Miner
     *
     * This endpoint lets a user unsuspend a miner.
     *
     */
    public ApiEmptyResp minerUnsuspendMinerPut(String miner) {
        // TODO: Implement...
        
        return null;
    }
    
}

