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
    public interface IPublicApi
    {
        /// <summary>
        /// Get Content by Cid This endpoint returns the content associated with a CID
        /// </summary>
        /// <param name="cid">Cid</param>
        /// <returns>string</returns>
        string PublicByCidCidGet (string cid);
        /// <summary>
        /// Get public node info This endpoint returns information about the node
        /// </summary>
        /// <returns>string</returns>
        string PublicInfoGet ();
        /// <summary>
        /// Get deal metrics This endpoint is used to get deal metrics
        /// </summary>
        /// <returns>string</returns>
        string PublicMetricsDealsOnChainGet ();
        /// <summary>
        /// Get all miners deals This endpoint returns all miners deals
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <param name="ignoreFailed">Ignore Failed</param>
        /// <returns>string</returns>
        string PublicMinersDealsMinerGet (string miner, string ignoreFailed);
        /// <summary>
        /// Get all miners This endpoint returns all miners
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <returns>string</returns>
        string PublicMinersFailuresMinerGet (string miner);
        /// <summary>
        /// Get all miners This endpoint returns all miners
        /// </summary>
        /// <returns>string</returns>
        string PublicMinersGet ();
        /// <summary>
        /// Get miner stats This endpoint returns miner stats
        /// </summary>
        /// <param name="miner">Filter by miner</param>
        /// <returns>string</returns>
        string PublicMinersStatsMinerGet (string miner);
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
        /// <summary>
        /// Public stats This endpoint is used to get public stats.
        /// </summary>
        /// <returns>string</returns>
        string PublicStatsGet ();
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PublicApi : IPublicApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PublicApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PublicApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PublicApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PublicApi(String basePath)
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
        /// Get Content by Cid This endpoint returns the content associated with a CID
        /// </summary>
        /// <param name="cid">Cid</param>
        /// <returns>string</returns>
        public string PublicByCidCidGet (string cid)
        {
            // verify the required parameter 'cid' is set
            if (cid == null) throw new ApiException(400, "Missing required parameter 'cid' when calling PublicByCidCidGet");
    
            var path = "/public/by-cid/{cid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "cid" + "}", ApiClient.ParameterToString(cid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicByCidCidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicByCidCidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get public node info This endpoint returns information about the node
        /// </summary>
        /// <returns>string</returns>
        public string PublicInfoGet ()
        {
    
            var path = "/public/info";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicInfoGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicInfoGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get deal metrics This endpoint is used to get deal metrics
        /// </summary>
        /// <returns>string</returns>
        public string PublicMetricsDealsOnChainGet ()
        {
    
            var path = "/public/metrics/deals-on-chain";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMetricsDealsOnChainGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMetricsDealsOnChainGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
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
        /// Get all miners This endpoint returns all miners
        /// </summary>
        /// <returns>string</returns>
        public string PublicMinersGet ()
        {
    
            var path = "/public/miners";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersGet: " + response.ErrorMessage, response.ErrorMessage);
    
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
    
        /// <summary>
        /// Public stats This endpoint is used to get public stats.
        /// </summary>
        /// <returns>string</returns>
        public string PublicStatsGet ()
        {
    
            var path = "/public/stats";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicStatsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicStatsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
