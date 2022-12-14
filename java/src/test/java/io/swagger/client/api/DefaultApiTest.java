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
import io.swagger.client.model.UtilViewerResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Fetch viewer details
     *
     * This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void viewerGetTest() throws Exception {
        UtilViewerResponse response = api.viewerGet();

        // TODO: test validations
    }
}