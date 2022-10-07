package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.List;
import io.swagger.model.MainCollection;
import io.swagger.model.MainCreateCollectionBody;
import java.util.Map;
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

import io.swagger.annotations.Api;

/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 */
public class CollectionsApiServiceImpl implements CollectionsApi {
    /**
     * Produce a CID of the collection contents
     *
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     *
     */
    public String collectionsColuuidCommitPost(String coluuid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     *
     */
    public void collectionsColuuidDelete(String coluuid) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get contents in a collection
     *
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     *
     */
    public String collectionsColuuidGet(String coluuid, String dir) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add contents to a collection
     *
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     *
     */
    public Map<String, String> collectionsColuuidPost(List<Integer> body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     *
     */
    public void collectionsFsAddPost(String coluuid, String content, String path) {
        // TODO: Implement...
        
        
    }
    
    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     *
     */
    public List<MainCollection> collectionsGet(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     *
     */
    public MainCollection collectionsPost(MainCreateCollectionBody body) {
        // TODO: Implement...
        
        return null;
    }
    
}

