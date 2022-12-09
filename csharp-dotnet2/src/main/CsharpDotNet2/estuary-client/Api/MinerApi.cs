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
    public interface IMinerApi
    {
        /// <summary>
        /// Get Claim Miner Message This endpoint lets a user get the message in order to claim a miner
        /// </summary>
        /// <param name="miner">Miner claim message</param>
        /// <returns>ApiClaimMsgResponse</returns>
        ApiClaimMsgResponse MinerClaimMinerGet (string miner);
        /// <summary>
        /// Claim Miner This endpoint lets a user claim a miner
        /// </summary>
        /// <param name="body">Claim Miner Body</param>
        /// <returns>ApiClaimResponse</returns>
        ApiClaimResponse MinerClaimPost (MinerClaimMinerBody body);
        /// <summary>
        /// Set Miner Info This endpoint lets a user set miner info.
        /// </summary>
        /// <param name="body">Miner set info params</param>
        /// <param name="miner">Miner to set info for</param>
        /// <returns>ApiEmptyResp</returns>
        ApiEmptyResp MinerSetInfoMinerPut (MinerMinerSetInfoParams body, string miner);
        /// <summary>
        /// Suspend Miner This endpoint lets a user suspend a miner.
        /// </summary>
        /// <param name="body">Suspend Miner Body</param>
        /// <param name="miner">Miner to suspend</param>
        /// <returns>ApiEmptyResp</returns>
        ApiEmptyResp MinerSuspendMinerPost (MinerSuspendMinerBody body, string miner);
        /// <summary>
        /// Unuspend Miner This endpoint lets a user unsuspend a miner.
        /// </summary>
        /// <param name="miner">Miner to unsuspend</param>
        /// <returns>ApiEmptyResp</returns>
        ApiEmptyResp MinerUnsuspendMinerPut (string miner);
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
        /// Get Claim Miner Message This endpoint lets a user get the message in order to claim a miner
        /// </summary>
        /// <param name="miner">Miner claim message</param>
        /// <returns>ApiClaimMsgResponse</returns>
        public ApiClaimMsgResponse MinerClaimMinerGet (string miner)
        {
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling MinerClaimMinerGet");
    
            var path = "/miner/claim/{miner}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling MinerClaimMinerGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerClaimMinerGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiClaimMsgResponse) ApiClient.Deserialize(response.Content, typeof(ApiClaimMsgResponse), response.Headers);
        }
    
        /// <summary>
        /// Claim Miner This endpoint lets a user claim a miner
        /// </summary>
        /// <param name="body">Claim Miner Body</param>
        /// <returns>ApiClaimResponse</returns>
        public ApiClaimResponse MinerClaimPost (MinerClaimMinerBody body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling MinerClaimPost");
    
            var path = "/miner/claim";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerClaimPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerClaimPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiClaimResponse) ApiClient.Deserialize(response.Content, typeof(ApiClaimResponse), response.Headers);
        }
    
        /// <summary>
        /// Set Miner Info This endpoint lets a user set miner info.
        /// </summary>
        /// <param name="body">Miner set info params</param>
        /// <param name="miner">Miner to set info for</param>
        /// <returns>ApiEmptyResp</returns>
        public ApiEmptyResp MinerSetInfoMinerPut (MinerMinerSetInfoParams body, string miner)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling MinerSetInfoMinerPut");
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling MinerSetInfoMinerPut");
    
            var path = "/miner/set-info/{miner}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "miner" + "}", ApiClient.ParameterToString(miner));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerSetInfoMinerPut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerSetInfoMinerPut: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiEmptyResp) ApiClient.Deserialize(response.Content, typeof(ApiEmptyResp), response.Headers);
        }
    
        /// <summary>
        /// Suspend Miner This endpoint lets a user suspend a miner.
        /// </summary>
        /// <param name="body">Suspend Miner Body</param>
        /// <param name="miner">Miner to suspend</param>
        /// <returns>ApiEmptyResp</returns>
        public ApiEmptyResp MinerSuspendMinerPost (MinerSuspendMinerBody body, string miner)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling MinerSuspendMinerPost");
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling MinerSuspendMinerPost");
    
            var path = "/miner/suspend/{miner}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "miner" + "}", ApiClient.ParameterToString(miner));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerSuspendMinerPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerSuspendMinerPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiEmptyResp) ApiClient.Deserialize(response.Content, typeof(ApiEmptyResp), response.Headers);
        }
    
        /// <summary>
        /// Unuspend Miner This endpoint lets a user unsuspend a miner.
        /// </summary>
        /// <param name="miner">Miner to unsuspend</param>
        /// <returns>ApiEmptyResp</returns>
        public ApiEmptyResp MinerUnsuspendMinerPut (string miner)
        {
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling MinerUnsuspendMinerPut");
    
            var path = "/miner/unsuspend/{miner}";
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerUnsuspendMinerPut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling MinerUnsuspendMinerPut: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiEmptyResp) ApiClient.Deserialize(response.Content, typeof(ApiEmptyResp), response.Headers);
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
