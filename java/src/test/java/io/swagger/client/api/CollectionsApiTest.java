/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.CollectionsCollection;
import io.swagger.client.model.MainCreateCollectionBody;
import io.swagger.client.model.MainDeleteContentFromCollectionBody;
import io.swagger.client.model.UtilHttpError;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionsApi
 */
@Ignore
public class CollectionsApiTest {

    private final CollectionsApi api = new CollectionsApi();

    
    /**
     * Produce a CID of the collection contents
     *
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidCommitPostTest() throws Exception {
        String coluuid = null;
        String response = api.collectionsColuuidCommitPost(coluuid);

        // TODO: test validations
    }
    
    /**
     * Deletes a content from a collection
     *
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidContentsDeleteTest() throws Exception {
        String coluuid = null;
        String contentid = null;
        MainDeleteContentFromCollectionBody body = null;
        String response = api.collectionsColuuidContentsDelete(coluuid, contentid, body);

        // TODO: test validations
    }
    
    /**
     * Deletes a collection
     *
     * This endpoint is used to delete an existing collection.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidDeleteTest() throws Exception {
        String coluuid = null;
        api.collectionsColuuidDelete(coluuid);

        // TODO: test validations
    }
    
    /**
     * Get contents in a collection
     *
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidGetTest() throws Exception {
        String coluuid = null;
        String dir = null;
        String response = api.collectionsColuuidGet(coluuid, dir);

        // TODO: test validations
    }
    
    /**
     * Add contents to a collection
     *
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsColuuidPostTest() throws Exception {
        String coluuid = null;
        List<Integer> contentIDs = null;
        Map<String, String> response = api.collectionsColuuidPost(coluuid, contentIDs);

        // TODO: test validations
    }
    
    /**
     * Add a file to a collection
     *
     * This endpoint adds a file to a collection
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsFsAddPostTest() throws Exception {
        String coluuid = null;
        String content = null;
        String path = null;
        api.collectionsFsAddPost(coluuid, content, path);

        // TODO: test validations
    }
    
    /**
     * List all collections
     *
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsGetTest() throws Exception {
        List<CollectionsCollection> response = api.collectionsGet();

        // TODO: test validations
    }
    
    /**
     * Create a new collection
     *
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void collectionsPostTest() throws Exception {
        MainCreateCollectionBody body = null;
        CollectionsCollection response = api.collectionsPost(body);

        // TODO: test validations
    }
    
}
