/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.ApiClaimMsgResponse;
import io.swagger.model.ApiClaimResponse;
import io.swagger.model.ApiEmptyResp;
import io.swagger.model.MinerClaimMinerBody;
import io.swagger.model.MinerMinerSetInfoParams;
import io.swagger.model.MinerSuspendMinerBody;
import io.swagger.model.UtilHttpError;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Estuary API
 *
 * <p>This is the API for the Estuary application.
 *
 * API tests for MinerApi 
 */
public class MinerApiTest {


    private MinerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("//api.estuary.tech/", MinerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Get Claim Miner Message
     *
     * This endpoint lets a user get the message in order to claim a miner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void minerClaimMinerGetTest() {
        String miner = null;
        //ApiClaimMsgResponse response = api.minerClaimMinerGet(miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Claim Miner
     *
     * This endpoint lets a user claim a miner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void minerClaimPostTest() {
        MinerClaimMinerBody body = null;
        //ApiClaimResponse response = api.minerClaimPost(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Set Miner Info
     *
     * This endpoint lets a user set miner info.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void minerSetInfoMinerPutTest() {
        MinerMinerSetInfoParams body = null;
        String miner = null;
        //ApiEmptyResp response = api.minerSetInfoMinerPut(body, miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Suspend Miner
     *
     * This endpoint lets a user suspend a miner.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void minerSuspendMinerPostTest() {
        MinerSuspendMinerBody body = null;
        String miner = null;
        //ApiEmptyResp response = api.minerSuspendMinerPost(body, miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Unuspend Miner
     *
     * This endpoint lets a user unsuspend a miner.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void minerUnsuspendMinerPutTest() {
        String miner = null;
        //ApiEmptyResp response = api.minerUnsuspendMinerPut(miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
