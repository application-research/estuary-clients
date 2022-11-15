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
    public interface IAutoretrieveApi
    {
        /// <summary>
        /// Register autoretrieve server This endpoint registers a new autoretrieve server
        /// </summary>
        /// <param name="addresses"></param>
        /// <param name="pubKey"></param>
        /// <returns>string</returns>
        string AdminAutoretrieveInitPost (string addresses, string pubKey);
        /// <summary>
        /// List autoretrieve servers This endpoint lists all registered autoretrieve servers
        /// </summary>
        /// <returns>string</returns>
        string AdminAutoretrieveListGet ();
        /// <summary>
        /// Marks autoretrieve server as up This endpoint updates the lastConnection field for autoretrieve
        /// </summary>
        /// <param name="token">Autoretrieve&#x27;s auth token</param>
        /// <returns>string</returns>
        string AutoretrieveHeartbeatPost (string token);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AutoretrieveApi : IAutoretrieveApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AutoretrieveApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AutoretrieveApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AutoretrieveApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AutoretrieveApi(String basePath)
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
        /// Register autoretrieve server This endpoint registers a new autoretrieve server
        /// </summary>
        /// <param name="addresses"></param>
        /// <param name="pubKey"></param>
        /// <returns>string</returns>
        public string AdminAutoretrieveInitPost (string addresses, string pubKey)
        {
            // verify the required parameter 'addresses' is set
            if (addresses == null) throw new ApiException(400, "Missing required parameter 'addresses' when calling AdminAutoretrieveInitPost");
            // verify the required parameter 'pubKey' is set
            if (pubKey == null) throw new ApiException(400, "Missing required parameter 'pubKey' when calling AdminAutoretrieveInitPost");
    
            var path = "/admin/autoretrieve/init";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (addresses != null) formParams.Add("addresses", ApiClient.ParameterToString(addresses)); // form parameter
if (pubKey != null) formParams.Add("pubKey", ApiClient.ParameterToString(pubKey)); // form parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminAutoretrieveInitPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminAutoretrieveInitPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// List autoretrieve servers This endpoint lists all registered autoretrieve servers
        /// </summary>
        /// <returns>string</returns>
        public string AdminAutoretrieveListGet ()
        {
    
            var path = "/admin/autoretrieve/list";
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
                throw new ApiException ((int)response.StatusCode, "Error calling AdminAutoretrieveListGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminAutoretrieveListGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Marks autoretrieve server as up This endpoint updates the lastConnection field for autoretrieve
        /// </summary>
        /// <param name="token">Autoretrieve&#x27;s auth token</param>
        /// <returns>string</returns>
        public string AutoretrieveHeartbeatPost (string token)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling AutoretrieveHeartbeatPost");
    
            var path = "/autoretrieve/heartbeat";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (token != null) headerParams.Add("token", ApiClient.ParameterToString(token)); // header parameter
            
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AutoretrieveHeartbeatPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AutoretrieveHeartbeatPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
