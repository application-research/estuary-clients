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
        /// <returns>GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse</returns>
        GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse MinerClaimMinerGet (string miner);
        /// <summary>
        /// Claim Miner This endpoint lets a user claim a miner
        /// </summary>
        /// <param name="body">Claim Miner Body</param>
        /// <returns>GithubComApplicationResearchEstuaryApiV1ClaimResponse</returns>
        GithubComApplicationResearchEstuaryApiV1ClaimResponse MinerClaimPost (MinerClaimMinerBody body);
        /// <summary>
        /// Set Miner Info This endpoint lets a user set miner info.
        /// </summary>
        /// <param name="body">Miner set info params</param>
        /// <param name="miner">Miner to set info for</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        Dictionary<string, string> MinerSetInfoMinerPut (MinerMinerSetInfoParams body, string miner);
        /// <summary>
        /// Suspend Miner This endpoint lets a user suspend a miner.
        /// </summary>
        /// <param name="body">Suspend Miner Body</param>
        /// <param name="miner">Miner to suspend</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        Dictionary<string, string> MinerSuspendMinerPost (MinerSuspendMinerBody body, string miner);
        /// <summary>
        /// Unuspend Miner This endpoint lets a user unsuspend a miner.
        /// </summary>
        /// <param name="miner">Miner to unsuspend</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        Dictionary<string, string> MinerUnsuspendMinerPut (string miner);
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
        /// <returns>GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse</returns>
        public GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse MinerClaimMinerGet (string miner)
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
    
            return (GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse) ApiClient.Deserialize(response.Content, typeof(GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse), response.Headers);
        }
    
        /// <summary>
        /// Claim Miner This endpoint lets a user claim a miner
        /// </summary>
        /// <param name="body">Claim Miner Body</param>
        /// <returns>GithubComApplicationResearchEstuaryApiV1ClaimResponse</returns>
        public GithubComApplicationResearchEstuaryApiV1ClaimResponse MinerClaimPost (MinerClaimMinerBody body)
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
    
            return (GithubComApplicationResearchEstuaryApiV1ClaimResponse) ApiClient.Deserialize(response.Content, typeof(GithubComApplicationResearchEstuaryApiV1ClaimResponse), response.Headers);
        }
    
        /// <summary>
        /// Set Miner Info This endpoint lets a user set miner info.
        /// </summary>
        /// <param name="body">Miner set info params</param>
        /// <param name="miner">Miner to set info for</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        public Dictionary<string, string> MinerSetInfoMinerPut (MinerMinerSetInfoParams body, string miner)
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
    
            return (Dictionary<string, string>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, string>), response.Headers);
        }
    
        /// <summary>
        /// Suspend Miner This endpoint lets a user suspend a miner.
        /// </summary>
        /// <param name="body">Suspend Miner Body</param>
        /// <param name="miner">Miner to suspend</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        public Dictionary<string, string> MinerSuspendMinerPost (MinerSuspendMinerBody body, string miner)
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
    
            return (Dictionary<string, string>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, string>), response.Headers);
        }
    
        /// <summary>
        /// Unuspend Miner This endpoint lets a user unsuspend a miner.
        /// </summary>
        /// <param name="miner">Miner to unsuspend</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        public Dictionary<string, string> MinerUnsuspendMinerPut (string miner)
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
    
            return (Dictionary<string, string>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, string>), response.Headers);
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
