using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface INetApi
    {
        /// <summary>
        /// Get all miners This endpoint returns all miners. Note: value may be cached
        /// </summary>
        /// <returns>ApiMinerResp</returns>
        ApiMinerResp AdminMinersGet ();
        /// <summary>
        /// Get all miners This endpoint returns all miners
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <returns>string</returns>
        string PublicMinersFailuresMinerGet (string miner);
        /// <summary>
        /// Net Addrs This endpoint is used to get net addrs
        /// </summary>
        /// <returns>List&lt;string&gt;</returns>
        List<string> PublicNetAddrsGet ();
        /// <summary>
        /// Net Peers This endpoint is used to get net peers
        /// </summary>
        /// <returns>List&lt;string&gt;</returns>
        List<string> PublicNetPeersGet ();
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class NetApi : INetApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NetApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public NetApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="NetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public NetApi(String basePath)
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
        /// Get all miners This endpoint returns all miners. Note: value may be cached
        /// </summary>
        /// <returns>ApiMinerResp</returns>
        public ApiMinerResp AdminMinersGet ()
        {
    
            var path = "/admin/miners/";
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
                throw new ApiException ((int)response.StatusCode, "Error calling AdminMinersGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminMinersGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiMinerResp) ApiClient.Deserialize(response.Content, typeof(ApiMinerResp), response.Headers);
        }
    
        /// <summary>
        /// Get all miners This endpoint returns all miners
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <returns>string</returns>
        public string PublicMinersFailuresMinerGet (string miner)
        {
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling PublicMinersFailuresMinerGet");
    
            var path = "/public/miners/failures/{miner}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersFailuresMinerGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersFailuresMinerGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Net Addrs This endpoint is used to get net addrs
        /// </summary>
        /// <returns>List&lt;string&gt;</returns>
        public List<string> PublicNetAddrsGet ()
        {
    
            var path = "/public/net/addrs";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicNetAddrsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicNetAddrsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<string>) ApiClient.Deserialize(response.Content, typeof(List<string>), response.Headers);
        }
    
        /// <summary>
        /// Net Peers This endpoint is used to get net peers
        /// </summary>
        /// <returns>List&lt;string&gt;</returns>
        public List<string> PublicNetPeersGet ()
        {
    
            var path = "/public/net/peers";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicNetPeersGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicNetPeersGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<string>) ApiClient.Deserialize(response.Content, typeof(List<string>), response.Headers);
        }
    
    }
}
