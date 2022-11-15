package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.CollectionsCollection;
import io.swagger.model.MainCreateCollectionBody;
import io.swagger.model.MainDeleteContentFromCollectionBody;
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
     * Deletes a content from a collection
     *
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     *
     */
    public String collectionsColuuidContentsDelete(MainDeleteContentFromCollectionBody body, String coluuid, String contentid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     *
     */
    public String collectionsColuuidDelete(String coluuid) {
        // TODO: Implement...
        
        return null;
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
    public String collectionsColuuidPost(List<Integer> body, String coluuid) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     *
     */
    public String collectionsFsAddPost(String coluuid, String content, String path) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     *
     */
    public List<List<CollectionsCollection>> collectionsGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     *
     */
    public CollectionsCollection collectionsPost(MainCreateCollectionBody body) {
        // TODO: Implement...
        
        return null;
    }
    
}

