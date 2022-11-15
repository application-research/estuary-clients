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

import io.swagger.model.MainChannelIDParam;
import io.swagger.model.MainEstimateDealBody;
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
 * API tests for DealsApi 
 */
public class DealsApiTest {


    private DealsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("//api.estuary.tech/", DealsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Estimate the cost of a deal
     *
     * This endpoint estimates the cost of a deal
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealEstimatePostTest() {
        MainEstimateDealBody body = null;
        //String response = api.dealEstimatePost(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get Deal Info
     *
     * This endpoint returns the deal info for a deal
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealInfoDealidGetTest() {
        Integer dealid = null;
        //String response = api.dealInfoDealidGet(dealid);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get Proposal
     *
     * This endpoint returns the proposal for a deal
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealProposalPropcidGetTest() {
        String propcid = null;
        //String response = api.dealProposalPropcidGet(propcid);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealQueryMinerGetTest() {
        String miner = null;
        //String response = api.dealQueryMinerGet(miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get Deal Status by PropCid
     *
     * Get Deal Status by PropCid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealStatusByProposalPropcidGetTest() {
        String propcid = null;
        //String response = api.dealStatusByProposalPropcidGet(propcid);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Deal Status
     *
     * This endpoint returns the status of a deal
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealStatusMinerPropcidGetTest() {
        String miner = null;
        String propcid = null;
        //String response = api.dealStatusMinerPropcidGet(miner, propcid);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Transfer In Progress
     *
     * This endpoint returns the in-progress transfers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealTransferInProgressGetTest() {
        //String response = api.dealTransferInProgressGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Transfer Status
     *
     * This endpoint returns the status of a transfer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealTransferStatusPostTest() {
        MainChannelIDParam body = null;
        //String response = api.dealTransferStatusPost(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get storage failures for user
     *
     * This endpoint returns a list of storage failures for user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealsFailuresGetTest() {
        //String response = api.dealsFailuresGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Make Deal
     *
     * This endpoint makes a deal for a given content and miner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealsMakeMinerPostTest() {
        String body = null;
        String miner = null;
        //String response = api.dealsMakeMinerPost(body, miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get Deal Status
     *
     * This endpoint returns the status of a deal
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealsStatusDealGetTest() {
        Integer deal = null;
        //String response = api.dealsStatusDealGet(deal);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get storage failures
     *
     * This endpoint returns a list of storage failures
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicDealsFailuresGetTest() {
        //String response = api.publicDealsFailuresGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Query Ask
     *
     * This endpoint returns the ask for a given CID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicMinersStorageQueryMinerGetTest() {
        String miner = null;
        //String response = api.publicMinersStorageQueryMinerGet(miner);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
