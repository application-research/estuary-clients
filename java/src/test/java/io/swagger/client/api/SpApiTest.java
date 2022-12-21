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

import io.swagger.client.model.ApiStorageProviderResp;
import io.swagger.client.model.GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse;
import io.swagger.client.model.GithubComApplicationResearchEstuaryApiV2ClaimResponse;
import io.swagger.client.model.MinerClaimMinerBody;
import io.swagger.client.model.MinerMinerSetInfoParams;
import io.swagger.client.model.MinerSuspendMinerBody;
import io.swagger.client.model.UtilHttpError;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SpApi
 */
@Ignore
public class SpApiTest {

    private final SpApi api = new SpApi();

    /**
     * Claim Storage Provider
     *
     * This endpoint lets a user claim a storage provider
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersClaimPostTest() throws Exception {
        MinerClaimMinerBody body = null;
        GithubComApplicationResearchEstuaryApiV2ClaimResponse response = api.storageProvidersClaimPost(body);

        // TODO: test validations
    }
    /**
     * Get Claim Storage Provider
     *
     * This endpoint lets a user get the message in order to claim a storage provider
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersClaimSpGetTest() throws Exception {
        String sp = null;
        GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse response = api.storageProvidersClaimSpGet(sp);

        // TODO: test validations
    }
    /**
     * Get all storage providers deals
     *
     * This endpoint returns all storage providers deals
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersDealsSpGetTest() throws Exception {
        String sp = null;
        String ignoreFailed = null;
        String response = api.storageProvidersDealsSpGet(sp, ignoreFailed);

        // TODO: test validations
    }
    /**
     * Get all storage providers
     *
     * This endpoint returns all storage providers
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersFailuresSpGetTest() throws Exception {
        String sp = null;
        String response = api.storageProvidersFailuresSpGet(sp);

        // TODO: test validations
    }
    /**
     * Get all storage providers
     *
     * This endpoint returns all storage providers
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersGetTest() throws Exception {
        List<ApiStorageProviderResp> response = api.storageProvidersGet();

        // TODO: test validations
    }
    /**
     * Set Storage Provider Info
     *
     * This endpoint lets a user set storage provider info.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersSetInfoSpPutTest() throws Exception {
        MinerMinerSetInfoParams body = null;
        String sp = null;
        api.storageProvidersSetInfoSpPut(body, sp);

        // TODO: test validations
    }
    /**
     * Get storage provider stats
     *
     * This endpoint returns storage provider stats
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersStatsSpGetTest() throws Exception {
        String sp = null;
        String response = api.storageProvidersStatsSpGet(sp);

        // TODO: test validations
    }
    /**
     * Suspend Storage Provider
     *
     * This endpoint lets a user suspend a storage provider.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersSuspendSpPostTest() throws Exception {
        MinerSuspendMinerBody body = null;
        String sp = null;
        Map<String, String> response = api.storageProvidersSuspendSpPost(body, sp);

        // TODO: test validations
    }
    /**
     * Unuspend Storage Provider
     *
     * This endpoint lets a user unsuspend a Storage Provider.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void storageProvidersUnsuspendSpPutTest() throws Exception {
        String sp = null;
        api.storageProvidersUnsuspendSpPut(sp);

        // TODO: test validations
    }
}
