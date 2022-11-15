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

import io.swagger.client.model.UtilHttpError;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AutoretrieveApi
 */
@Ignore
public class AutoretrieveApiTest {

    private final AutoretrieveApi api = new AutoretrieveApi();

    /**
     * Register autoretrieve server
     *
     * This endpoint registers a new autoretrieve server
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminAutoretrieveInitPostTest() throws Exception {
        String addresses = null;
        String pubKey = null;
        String response = api.adminAutoretrieveInitPost(addresses, pubKey);

        // TODO: test validations
    }
    /**
     * List autoretrieve servers
     *
     * This endpoint lists all registered autoretrieve servers
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminAutoretrieveListGetTest() throws Exception {
        String response = api.adminAutoretrieveListGet();

        // TODO: test validations
    }
    /**
     * Marks autoretrieve server as up
     *
     * This endpoint updates the lastConnection field for autoretrieve
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void autoretrieveHeartbeatPostTest() throws Exception {
        String token = null;
        String response = api.autoretrieveHeartbeatPost(token);

        // TODO: test validations
    }
}
