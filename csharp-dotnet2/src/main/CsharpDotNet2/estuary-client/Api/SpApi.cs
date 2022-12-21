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
    public interface ISpApi
    {
        /// <summary>
        /// Claim Storage Provider This endpoint lets a user claim a storage provider
        /// </summary>
        /// <param name="body">Claim Storage Provider Body</param>
        /// <returns>GithubComApplicationResearchEstuaryApiV2ClaimResponse</returns>
        GithubComApplicationResearchEstuaryApiV2ClaimResponse StorageProvidersClaimPost (MinerClaimMinerBody body);
        /// <summary>
        /// Get Claim Storage Provider This endpoint lets a user get the message in order to claim a storage provider
        /// </summary>
        /// <param name="sp">Storage Provider claim message</param>
        /// <returns>GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse</returns>
        GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse StorageProvidersClaimSpGet (string sp);
        /// <summary>
        /// Get all storage providers deals This endpoint returns all storage providers deals
        /// </summary>
        /// <param name="sp">Filter by storage provider</param>
        /// <param name="ignoreFailed">Ignore Failed</param>
        /// <returns>string</returns>
        string StorageProvidersDealsSpGet (string sp, string ignoreFailed);
        /// <summary>
        /// Get all storage providers This endpoint returns all storage providers
        /// </summary>
        /// <param name="sp">Filter by storage provider</param>
        /// <returns>string</returns>
        string StorageProvidersFailuresSpGet (string sp);
        /// <summary>
        /// Get all storage providers This endpoint returns all storage providers
        /// </summary>
        /// <returns>List&lt;ApiStorageProviderResp&gt;</returns>
        List<ApiStorageProviderResp> StorageProvidersGet ();
        /// <summary>
        /// Set Storage Provider Info This endpoint lets a user set storage provider info.
        /// </summary>
        /// <param name="body">Storage Provider set info params</param>
        /// <param name="sp">Storage Provider to set info for</param>
        /// <returns></returns>
        void StorageProvidersSetInfoSpPut (MinerMinerSetInfoParams body, string sp);
        /// <summary>
        /// Get storage provider stats This endpoint returns storage provider stats
        /// </summary>
        /// <param name="sp">Filter by storage provider</param>
        /// <returns>string</returns>
        string StorageProvidersStatsSpGet (string sp);
        /// <summary>
        /// Suspend Storage Provider This endpoint lets a user suspend a storage provider.
        /// </summary>
        /// <param name="body">Suspend Storage Provider Body</param>
        /// <param name="sp">Storage Provider to suspend</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        Dictionary<string, string> StorageProvidersSuspendSpPost (MinerSuspendMinerBody body, string sp);
        /// <summary>
        /// Unuspend Storage Provider This endpoint lets a user unsuspend a Storage Provider.
        /// </summary>
        /// <param name="sp">Storage Provider to unsuspend</param>
        /// <returns></returns>
        void StorageProvidersUnsuspendSpPut (string sp);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SpApi : ISpApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SpApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SpApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SpApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SpApi(String basePath)
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
        /// Claim Storage Provider This endpoint lets a user claim a storage provider
        /// </summary>
        /// <param name="body">Claim Storage Provider Body</param>
        /// <returns>GithubComApplicationResearchEstuaryApiV2ClaimResponse</returns>
        public GithubComApplicationResearchEstuaryApiV2ClaimResponse StorageProvidersClaimPost (MinerClaimMinerBody body)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling StorageProvidersClaimPost");
    
            var path = "/storage-providers/claim";
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersClaimPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersClaimPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (GithubComApplicationResearchEstuaryApiV2ClaimResponse) ApiClient.Deserialize(response.Content, typeof(GithubComApplicationResearchEstuaryApiV2ClaimResponse), response.Headers);
        }
    
        /// <summary>
        /// Get Claim Storage Provider This endpoint lets a user get the message in order to claim a storage provider
        /// </summary>
        /// <param name="sp">Storage Provider claim message</param>
        /// <returns>GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse</returns>
        public GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse StorageProvidersClaimSpGet (string sp)
        {
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersClaimSpGet");
    
            var path = "/storage-providers/claim/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersClaimSpGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersClaimSpGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse) ApiClient.Deserialize(response.Content, typeof(GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse), response.Headers);
        }
    
        /// <summary>
        /// Get all storage providers deals This endpoint returns all storage providers deals
        /// </summary>
        /// <param name="sp">Filter by storage provider</param>
        /// <param name="ignoreFailed">Ignore Failed</param>
        /// <returns>string</returns>
        public string StorageProvidersDealsSpGet (string sp, string ignoreFailed)
        {
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersDealsSpGet");
    
            var path = "/storage-providers/deals/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersDealsSpGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersDealsSpGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get all storage providers This endpoint returns all storage providers
        /// </summary>
        /// <param name="sp">Filter by storage provider</param>
        /// <returns>string</returns>
        public string StorageProvidersFailuresSpGet (string sp)
        {
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersFailuresSpGet");
    
            var path = "/storage-providers/failures/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersFailuresSpGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersFailuresSpGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get all storage providers This endpoint returns all storage providers
        /// </summary>
        /// <returns>List&lt;ApiStorageProviderResp&gt;</returns>
        public List<ApiStorageProviderResp> StorageProvidersGet ()
        {
    
            var path = "/storage-providers";
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<ApiStorageProviderResp>) ApiClient.Deserialize(response.Content, typeof(List<ApiStorageProviderResp>), response.Headers);
        }
    
        /// <summary>
        /// Set Storage Provider Info This endpoint lets a user set storage provider info.
        /// </summary>
        /// <param name="body">Storage Provider set info params</param>
        /// <param name="sp">Storage Provider to set info for</param>
        /// <returns></returns>
        public void StorageProvidersSetInfoSpPut (MinerMinerSetInfoParams body, string sp)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling StorageProvidersSetInfoSpPut");
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersSetInfoSpPut");
    
            var path = "/storage-providers/set-info/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersSetInfoSpPut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersSetInfoSpPut: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get storage provider stats This endpoint returns storage provider stats
        /// </summary>
        /// <param name="sp">Filter by storage provider</param>
        /// <returns>string</returns>
        public string StorageProvidersStatsSpGet (string sp)
        {
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersStatsSpGet");
    
            var path = "/storage-providers/stats/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersStatsSpGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersStatsSpGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Suspend Storage Provider This endpoint lets a user suspend a storage provider.
        /// </summary>
        /// <param name="body">Suspend Storage Provider Body</param>
        /// <param name="sp">Storage Provider to suspend</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        public Dictionary<string, string> StorageProvidersSuspendSpPost (MinerSuspendMinerBody body, string sp)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling StorageProvidersSuspendSpPost");
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersSuspendSpPost");
    
            var path = "/storage-providers/suspend/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersSuspendSpPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersSuspendSpPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Dictionary<string, string>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, string>), response.Headers);
        }
    
        /// <summary>
        /// Unuspend Storage Provider This endpoint lets a user unsuspend a Storage Provider.
        /// </summary>
        /// <param name="sp">Storage Provider to unsuspend</param>
        /// <returns></returns>
        public void StorageProvidersUnsuspendSpPut (string sp)
        {
            // verify the required parameter 'sp' is set
            if (sp == null) throw new ApiException(400, "Missing required parameter 'sp' when calling StorageProvidersUnsuspendSpPut");
    
            var path = "/storage-providers/unsuspend/{sp}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "sp" + "}", ApiClient.ParameterToString(sp));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersUnsuspendSpPut: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StorageProvidersUnsuspendSpPut: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
