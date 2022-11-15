package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.MainGetApiKeysResp;
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
public class UserApiServiceImpl implements UserApi {
    /**
     * Get API keys for a user
     *
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     *
     */
    public List<List<MainGetApiKeysResp>> userApiKeysGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Revoke a User API Key.
     *
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#x27;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.
     *
     */
    public String userApiKeysKeyOrHashDelete(String keyOrHash) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     *
     */
    public MainGetApiKeysResp userApiKeysPost(String expiry, String perms) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Export user data
     *
     * This endpoint is used to get API keys for a user.
     *
     */
    public String userExportGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create API keys for a user
     *
     * This endpoint is used to create API keys for a user.
     *
     */
    public String userStatsGet() {
        // TODO: Implement...
        
        return null;
    }
    
}

