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

import io.swagger.client.model.ApiClaimMsgResponse;
import io.swagger.client.model.ApiClaimResponse;
import io.swagger.client.model.ApiEmptyResp;
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
 * API tests for MinerApi
 */
@Ignore
public class MinerApiTest {

    private final MinerApi api = new MinerApi();

    /**
     * Get Claim Miner Message
     *
     * This endpoint lets a user get the message in order to claim a miner
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void minerClaimMinerGetTest() throws Exception {
        String miner = null;
        ApiClaimMsgResponse response = api.minerClaimMinerGet(miner);

        // TODO: test validations
    }
    /**
     * Claim Miner
     *
     * This endpoint lets a user claim a miner
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void minerClaimPostTest() throws Exception {
        MinerClaimMinerBody body = null;
        ApiClaimResponse response = api.minerClaimPost(body);

        // TODO: test validations
    }
    /**
     * Set Miner Info
     *
     * This endpoint lets a user set miner info.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void minerSetInfoMinerPutTest() throws Exception {
        MinerMinerSetInfoParams body = null;
        String miner = null;
        ApiEmptyResp response = api.minerSetInfoMinerPut(body, miner);

        // TODO: test validations
    }
    /**
     * Suspend Miner
     *
     * This endpoint lets a user suspend a miner.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void minerSuspendMinerPostTest() throws Exception {
        MinerSuspendMinerBody body = null;
        String miner = null;
        ApiEmptyResp response = api.minerSuspendMinerPost(body, miner);

        // TODO: test validations
    }
    /**
     * Unuspend Miner
     *
     * This endpoint lets a user unsuspend a miner.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void minerUnsuspendMinerPutTest() throws Exception {
        String miner = null;
        ApiEmptyResp response = api.minerUnsuspendMinerPut(miner);

        // TODO: test validations
    }
    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicMinersDealsMinerGetTest() throws Exception {
        String miner = null;
        String ignoreFailed = null;
        String response = api.publicMinersDealsMinerGet(miner, ignoreFailed);

        // TODO: test validations
    }
    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void publicMinersStatsMinerGetTest() throws Exception {
        String miner = null;
        String response = api.publicMinersStatsMinerGet(miner);

        // TODO: test validations
    }
}
