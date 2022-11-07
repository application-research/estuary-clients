using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using estuary-client.Model;

namespace estuary-client.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPeersApi
    {
        /// <summary>
        /// Remove peers on Peering Service This endpoint can be used to remove a Peer from the Peering Service
        /// </summary>
        /// <param name="peerIds">Peer ids</param>
        /// <returns>string</returns>
        string AdminPeeringPeersDelete (List<bool?> peerIds);
        /// <summary>
        /// List all Peering peers This endpoint can be used to list all peers on Peering Service
        /// </summary>
        /// <returns>string</returns>
        string AdminPeeringPeersGet ();
        /// <summary>
        /// Add peers on Peering Service This endpoint can be used to add a Peer from the Peering Service
        /// </summary>
        /// <returns>string</returns>
        string AdminPeeringPeersPost ();
        /// <summary>
        /// Start Peering This endpoint can be used to start the Peering Service
        /// </summary>
        /// <returns>string</returns>
        string AdminPeeringStartPost ();
        /// <summary>
        /// Check Peering Status This endpoint can be used to check the Peering status
        /// </summary>
        /// <returns>string</returns>
        string AdminPeeringStatusGet ();
        /// <summary>
        /// Stop Peering This endpoint can be used to stop the Peering Service
        /// </summary>
        /// <returns>string</returns>
        string AdminPeeringStopPost ();
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PeersApi : IPeersApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PeersApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PeersApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PeersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PeersApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// Remove peers on Peering Service This endpoint can be used to remove a Peer from the Peering Service
        /// </summary>
        /// <param name="peerIds">Peer ids</param> 
        /// <returns>string</returns>            
        public string AdminPeeringPeersDelete (List<bool?> peerIds)
        {
            
            // verify the required parameter 'peerIds' is set
            if (peerIds == null) throw new ApiException(400, "Missing required parameter 'peerIds' when calling AdminPeeringPeersDelete");
            
    
            var path = "/admin/peering/peers";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(peerIds); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringPeersDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringPeersDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// List all Peering peers This endpoint can be used to list all peers on Peering Service
        /// </summary>
        /// <returns>string</returns>            
        public string AdminPeeringPeersGet ()
        {
            
    
            var path = "/admin/peering/peers";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringPeersGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringPeersGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Add peers on Peering Service This endpoint can be used to add a Peer from the Peering Service
        /// </summary>
        /// <returns>string</returns>            
        public string AdminPeeringPeersPost ()
        {
            
    
            var path = "/admin/peering/peers";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringPeersPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringPeersPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Start Peering This endpoint can be used to start the Peering Service
        /// </summary>
        /// <returns>string</returns>            
        public string AdminPeeringStartPost ()
        {
            
    
            var path = "/admin/peering/start";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringStartPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringStartPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Check Peering Status This endpoint can be used to check the Peering status
        /// </summary>
        /// <returns>string</returns>            
        public string AdminPeeringStatusGet ()
        {
            
    
            var path = "/admin/peering/status";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringStatusGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringStatusGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Stop Peering This endpoint can be used to stop the Peering Service
        /// </summary>
        /// <returns>string</returns>            
        public string AdminPeeringStopPost ()
        {
            
    
            var path = "/admin/peering/stop";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringStopPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminPeeringStopPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
