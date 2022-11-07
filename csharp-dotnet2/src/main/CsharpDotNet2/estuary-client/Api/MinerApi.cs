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
    public interface IMinerApi
    {
        /// <summary>
        /// Get all miners deals This endpoint returns all miners deals
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <param name="ignoreFailed">Ignore Failed</param>
        /// <returns>string</returns>
        string PublicMinersDealsMinerGet (string miner, string ignoreFailed);
        /// <summary>
        /// Get miner stats This endpoint returns miner stats
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <returns>string</returns>
        string PublicMinersStatsMinerGet (string miner);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class MinerApi : IMinerApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MinerApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public MinerApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="MinerApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MinerApi(String basePath)
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
        /// Get all miners deals This endpoint returns all miners deals
        /// </summary>
        /// <param name="miner">Filter by miner</param> 
        /// <param name="ignoreFailed">Ignore Failed</param> 
        /// <returns>string</returns>            
        public string PublicMinersDealsMinerGet (string miner, string ignoreFailed)
        {
            
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling PublicMinersDealsMinerGet");
            
    
            var path = "/public/miners/deals/{miner}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "miner" + "}", ApiClient.ParameterToString(miner));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (ignoreFailed != null) queryParams.Add("ignore-failed", ApiClient.ParameterToString(ignoreFailed)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersDealsMinerGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersDealsMinerGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get miner stats This endpoint returns miner stats
        /// </summary>
        /// <param name="miner">Filter by miner</param> 
        /// <returns>string</returns>            
        public string PublicMinersStatsMinerGet (string miner)
        {
            
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling PublicMinersStatsMinerGet");
            
    
            var path = "/public/miners/stats/{miner}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "miner" + "}", ApiClient.ParameterToString(miner));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersStatsMinerGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersStatsMinerGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
