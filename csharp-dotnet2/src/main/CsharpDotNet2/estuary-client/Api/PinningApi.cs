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
    public interface IPinningApi
    {
        /// <summary>
        /// List all pin status objects This endpoint lists all pin status objects
        /// </summary>
        /// <returns>TypesIpfsListPinStatusResponse</returns>
        TypesIpfsListPinStatusResponse PinningPinsGet ();
        /// <summary>
        /// Delete a pinned object This endpoint deletes a pinned object.
        /// </summary>
        /// <param name="pinid">Pin ID</param>
        /// <returns></returns>
        void PinningPinsPinidDelete (string pinid);
        /// <summary>
        /// Get a pin status object This endpoint returns a pin status object.
        /// </summary>
        /// <param name="pinid">cid</param>
        /// <returns>TypesIpfsPinStatusResponse</returns>
        TypesIpfsPinStatusResponse PinningPinsPinidGet (string pinid);
        /// <summary>
        /// Replace a pinned object This endpoint replaces a pinned object.
        /// </summary>
        /// <param name="pinid">Pin ID</param>
        /// <param name="cid">CID of new pin</param>
        /// <param name="name">Name (filename) of new pin</param>
        /// <param name="origins">Origins of new pin</param>
        /// <param name="meta">Meta information of new pin</param>
        /// <returns>TypesIpfsPinStatusResponse</returns>
        TypesIpfsPinStatusResponse PinningPinsPinidPost (string pinid, string cid, string name, string origins, string meta);
        /// <summary>
        /// Add and pin object This endpoint adds a pin to the IPFS daemon.
        /// </summary>
        /// <param name="pin">Pin Body {cid:cid, name:name}</param>
        /// <returns>TypesIpfsPinStatusResponse</returns>
        TypesIpfsPinStatusResponse PinningPinsPost (TypesIpfsPin pin);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PinningApi : IPinningApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PinningApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PinningApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PinningApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PinningApi(String basePath)
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
        /// List all pin status objects This endpoint lists all pin status objects
        /// </summary>
        /// <returns>TypesIpfsListPinStatusResponse</returns>            
        public TypesIpfsListPinStatusResponse PinningPinsGet ()
        {
            
    
            var path = "/pinning/pins";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TypesIpfsListPinStatusResponse) ApiClient.Deserialize(response.Content, typeof(TypesIpfsListPinStatusResponse), response.Headers);
        }
    
        /// <summary>
        /// Delete a pinned object This endpoint deletes a pinned object.
        /// </summary>
        /// <param name="pinid">Pin ID</param> 
        /// <returns></returns>            
        public void PinningPinsPinidDelete (string pinid)
        {
            
            // verify the required parameter 'pinid' is set
            if (pinid == null) throw new ApiException(400, "Missing required parameter 'pinid' when calling PinningPinsPinidDelete");
            
    
            var path = "/pinning/pins/{pinid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "pinid" + "}", ApiClient.ParameterToString(pinid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPinidDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPinidDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get a pin status object This endpoint returns a pin status object.
        /// </summary>
        /// <param name="pinid">cid</param> 
        /// <returns>TypesIpfsPinStatusResponse</returns>            
        public TypesIpfsPinStatusResponse PinningPinsPinidGet (string pinid)
        {
            
            // verify the required parameter 'pinid' is set
            if (pinid == null) throw new ApiException(400, "Missing required parameter 'pinid' when calling PinningPinsPinidGet");
            
    
            var path = "/pinning/pins/{pinid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "pinid" + "}", ApiClient.ParameterToString(pinid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPinidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPinidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TypesIpfsPinStatusResponse) ApiClient.Deserialize(response.Content, typeof(TypesIpfsPinStatusResponse), response.Headers);
        }
    
        /// <summary>
        /// Replace a pinned object This endpoint replaces a pinned object.
        /// </summary>
        /// <param name="pinid">Pin ID</param> 
        /// <param name="cid">CID of new pin</param> 
        /// <param name="name">Name (filename) of new pin</param> 
        /// <param name="origins">Origins of new pin</param> 
        /// <param name="meta">Meta information of new pin</param> 
        /// <returns>TypesIpfsPinStatusResponse</returns>            
        public TypesIpfsPinStatusResponse PinningPinsPinidPost (string pinid, string cid, string name, string origins, string meta)
        {
            
            // verify the required parameter 'pinid' is set
            if (pinid == null) throw new ApiException(400, "Missing required parameter 'pinid' when calling PinningPinsPinidPost");
            
            // verify the required parameter 'cid' is set
            if (cid == null) throw new ApiException(400, "Missing required parameter 'cid' when calling PinningPinsPinidPost");
            
    
            var path = "/pinning/pins/{pinid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "pinid" + "}", ApiClient.ParameterToString(pinid));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(meta); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPinidPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPinidPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TypesIpfsPinStatusResponse) ApiClient.Deserialize(response.Content, typeof(TypesIpfsPinStatusResponse), response.Headers);
        }
    
        /// <summary>
        /// Add and pin object This endpoint adds a pin to the IPFS daemon.
        /// </summary>
        /// <param name="pin">Pin Body {cid:cid, name:name}</param> 
        /// <returns>TypesIpfsPinStatusResponse</returns>            
        public TypesIpfsPinStatusResponse PinningPinsPost (TypesIpfsPin pin)
        {
            
            // verify the required parameter 'pin' is set
            if (pin == null) throw new ApiException(400, "Missing required parameter 'pin' when calling PinningPinsPost");
            
    
            var path = "/pinning/pins";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(pin); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PinningPinsPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TypesIpfsPinStatusResponse) ApiClient.Deserialize(response.Content, typeof(TypesIpfsPinStatusResponse), response.Headers);
        }
    
    }
}
