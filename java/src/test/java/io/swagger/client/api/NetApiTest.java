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

import io.swagger.client.model.ApiMinerResp;
import io.swagger.client.model.UtilHttpError;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for NetApi
 */
@Ignore
public class NetApiTest {

    private final NetApi api = new NetApi();

    /**
     * Get all miners
     *
     * This endpoint returns all miners. Note: value may be cached
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void adminMinersGetTest() throws Exception {
        ApiMinerResp response = api.adminMinersGet();

        // TODO: test validations
    }
    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicMinersFailuresMinerGetTest() throws Exception {
        String miner = null;
        String response = api.publicMinersFailuresMinerGet(miner);

        // TODO: test validations
    }
    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicNetAddrsGetTest() throws Exception {
        List<String> response = api.publicNetAddrsGet();

        // TODO: test validations
    }
    /**
     * Net Peers
     *
     * This endpoint is used to get net peers
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicNetPeersGetTest() throws Exception {
        List<String> response = api.publicNetPeersGet();

        // TODO: test validations
    }
}
