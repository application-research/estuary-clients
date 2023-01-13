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

import io.swagger.model.ApiMinerResp;
import io.swagger.model.PeeringPeeringPeer;
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
 * API tests for AdminApi 
 */
public class AdminApiTest {


    private AdminApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("//api.estuary.tech/", AdminApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Get all miners
     *
     * This endpoint returns all miners. Note: value may be cached
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminMinersGetTest() {
        //ApiMinerResp response = api.adminMinersGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Remove peers on Peering Service
     *
     * This endpoint can be used to remove a Peer from the Peering Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminPeeringPeersDeleteTest() {
        List<String> body = null;
        //String response = api.adminPeeringPeersDelete(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * List all Peering peers
     *
     * This endpoint can be used to list all peers on Peering Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminPeeringPeersGetTest() {
        //String response = api.adminPeeringPeersGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Add peers on Peering Service
     *
     * This endpoint can be used to add a Peer from the Peering Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminPeeringPeersPostTest() {
        List<PeeringPeeringPeer> body = null;
        //String response = api.adminPeeringPeersPost(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Start Peering
     *
     * This endpoint can be used to start the Peering Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminPeeringStartPostTest() {
        //String response = api.adminPeeringStartPost();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Check Peering Status
     *
     * This endpoint can be used to check the Peering status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminPeeringStatusGetTest() {
        //String response = api.adminPeeringStatusGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Stop Peering
     *
     * This endpoint can be used to stop the Peering Service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminPeeringStopPostTest() {
        //String response = api.adminPeeringStopPost();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get systems(estuary/shuttle) config
     *
     * This endpoint is used to get system configs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminSystemConfigGetTest() {
        //String response = api.adminSystemConfigGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get all users
     *
     * This endpoint is used to get all users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminUsersGetTest() {
        //String response = api.adminUsersGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
