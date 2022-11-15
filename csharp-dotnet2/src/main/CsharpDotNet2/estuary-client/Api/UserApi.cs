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
    public interface IUserApi
    {
        /// <summary>
        /// Get API keys for a user This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
        /// </summary>
        /// <returns>List&lt;List&lt;MainGetApiKeysResp&gt;&gt;</returns>
        List<List<MainGetApiKeysResp>> UserApiKeysGet ();
        /// <summary>
        /// Revoke a User API Key. This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#x27;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.
        /// </summary>
        /// <param name="keyOrHash">Key or Hash</param>
        /// <returns>string</returns>
        string UserApiKeysKeyOrHashDelete (string keyOrHash);
        /// <summary>
        /// Create API keys for a user This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
        /// </summary>
        /// <param name="expiry">Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h</param>
        /// <param name="perms">Permissions - - currently unused</param>
        /// <returns>MainGetApiKeysResp</returns>
        MainGetApiKeysResp UserApiKeysPost (string expiry, string perms);
        /// <summary>
        /// Export user data This endpoint is used to get API keys for a user.
        /// </summary>
        /// <returns>string</returns>
        string UserExportGet ();
        /// <summary>
        /// Create API keys for a user This endpoint is used to create API keys for a user.
        /// </summary>
        /// <returns>string</returns>
        string UserStatsGet ();
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class UserApi : IUserApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public UserApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="UserApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserApi(String basePath)
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
        /// Get API keys for a user This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
        /// </summary>
        /// <returns>List&lt;List&lt;MainGetApiKeysResp&gt;&gt;</returns>
        public List<List<MainGetApiKeysResp>> UserApiKeysGet ()
        {
    
            var path = "/user/api-keys";
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
                throw new ApiException ((int)response.StatusCode, "Error calling UserApiKeysGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserApiKeysGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<List<MainGetApiKeysResp>>) ApiClient.Deserialize(response.Content, typeof(List<List<MainGetApiKeysResp>>), response.Headers);
        }
    
        /// <summary>
        /// Revoke a User API Key. This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#x27;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.
        /// </summary>
        /// <param name="keyOrHash">Key or Hash</param>
        /// <returns>string</returns>
        public string UserApiKeysKeyOrHashDelete (string keyOrHash)
        {
            // verify the required parameter 'keyOrHash' is set
            if (keyOrHash == null) throw new ApiException(400, "Missing required parameter 'keyOrHash' when calling UserApiKeysKeyOrHashDelete");
    
            var path = "/user/api-keys/{key_or_hash}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "key_or_hash" + "}", ApiClient.ParameterToString(keyOrHash));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserApiKeysKeyOrHashDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserApiKeysKeyOrHashDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Create API keys for a user This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
        /// </summary>
        /// <param name="expiry">Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h</param>
        /// <param name="perms">Permissions - - currently unused</param>
        /// <returns>MainGetApiKeysResp</returns>
        public MainGetApiKeysResp UserApiKeysPost (string expiry, string perms)
        {
    
            var path = "/user/api-keys";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (expiry != null) queryParams.Add("expiry", ApiClient.ParameterToString(expiry)); // query parameter
 if (perms != null) queryParams.Add("perms", ApiClient.ParameterToString(perms)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserApiKeysPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserApiKeysPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (MainGetApiKeysResp) ApiClient.Deserialize(response.Content, typeof(MainGetApiKeysResp), response.Headers);
        }
    
        /// <summary>
        /// Export user data This endpoint is used to get API keys for a user.
        /// </summary>
        /// <returns>string</returns>
        public string UserExportGet ()
        {
    
            var path = "/user/export";
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
                throw new ApiException ((int)response.StatusCode, "Error calling UserExportGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserExportGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Create API keys for a user This endpoint is used to create API keys for a user.
        /// </summary>
        /// <returns>string</returns>
        public string UserStatsGet ()
        {
    
            var path = "/user/stats";
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
                throw new ApiException ((int)response.StatusCode, "Error calling UserStatsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserStatsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
