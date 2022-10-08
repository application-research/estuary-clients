using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using estuary_client.Model;

namespace estuary_client.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICollectionsApi
    {
        /// <summary>
        /// Produce a CID of the collection contents This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
        /// </summary>
        /// <param name="coluuid">coluuid</param>
        /// <returns>string</returns>
        string CollectionsColuuidCommitPost (string coluuid);
        /// <summary>
        /// Deletes a collection This endpoint is used to delete an existing collection.
        /// </summary>
        /// <param name="coluuid">Collection ID</param>
        /// <returns></returns>
        void CollectionsColuuidDelete (string coluuid);
        /// <summary>
        /// Get contents in a collection This endpoint is used to get contents in a collection. If no colpath query param is passed
        /// </summary>
        /// <param name="coluuid">Collection UUID</param>
        /// <param name="dir">Directory</param>
        /// <returns>string</returns>
        string CollectionsColuuidGet (string coluuid, string dir);
        /// <summary>
        /// Add contents to a collection This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
        /// </summary>
        /// <param name="body">Content IDs to add to collection</param>
        /// <returns>Dictionary&lt;string, string&gt;</returns>
        Dictionary<string, string> CollectionsColuuidPost (List<int?> body);
        /// <summary>
        /// Add a file to a collection This endpoint adds a file to a collection
        /// </summary>
        /// <param name="coluuid">Collection ID</param>
        /// <param name="content">Content</param>
        /// <param name="path">Path to file</param>
        /// <returns></returns>
        void CollectionsFsAddPost (string coluuid, string content, string path);
        /// <summary>
        /// List all collections This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
        /// </summary>
        /// <param name="id">User ID</param>
        /// <returns>List&lt;MainCollection&gt;</returns>
        List<MainCollection> CollectionsGet (int? id);
        /// <summary>
        /// Create a new collection This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
        /// </summary>
        /// <param name="body">Collection name and description</param>
        /// <returns>MainCollection</returns>
        MainCollection CollectionsPost (MainCreateCollectionBody body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CollectionsApi : ICollectionsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CollectionsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CollectionsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CollectionsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CollectionsApi(String basePath)
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
        /// Produce a CID of the collection contents This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
        /// </summary>
        /// <param name="coluuid">coluuid</param> 
        /// <returns>string</returns>            
        public string CollectionsColuuidCommitPost (string coluuid)
        {
            
            // verify the required parameter 'coluuid' is set
            if (coluuid == null) throw new ApiException(400, "Missing required parameter 'coluuid' when calling CollectionsColuuidCommitPost");
            
    
            var path = "/collections/{coluuid}/commit";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "coluuid" + "}", ApiClient.ParameterToString(coluuid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidCommitPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidCommitPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Deletes a collection This endpoint is used to delete an existing collection.
        /// </summary>
        /// <param name="coluuid">Collection ID</param> 
        /// <returns></returns>            
        public void CollectionsColuuidDelete (string coluuid)
        {
            
            // verify the required parameter 'coluuid' is set
            if (coluuid == null) throw new ApiException(400, "Missing required parameter 'coluuid' when calling CollectionsColuuidDelete");
            
    
            var path = "/collections/{coluuid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "coluuid" + "}", ApiClient.ParameterToString(coluuid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidDelete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidDelete: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get contents in a collection This endpoint is used to get contents in a collection. If no colpath query param is passed
        /// </summary>
        /// <param name="coluuid">Collection UUID</param> 
        /// <param name="dir">Directory</param> 
        /// <returns>string</returns>            
        public string CollectionsColuuidGet (string coluuid, string dir)
        {
            
            // verify the required parameter 'coluuid' is set
            if (coluuid == null) throw new ApiException(400, "Missing required parameter 'coluuid' when calling CollectionsColuuidGet");
            
    
            var path = "/collections/{coluuid}";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (coluuid != null) queryParams.Add("coluuid", ApiClient.ParameterToString(coluuid)); // query parameter
 if (dir != null) queryParams.Add("dir", ApiClient.ParameterToString(dir)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Add contents to a collection This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
        /// </summary>
        /// <param name="body">Content IDs to add to collection</param> 
        /// <returns>Dictionary&lt;string, string&gt;</returns>            
        public Dictionary<string, string> CollectionsColuuidPost (List<int?> body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CollectionsColuuidPost");
            
    
            var path = "/collections/{coluuid}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsColuuidPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Dictionary<string, string>) ApiClient.Deserialize(response.Content, typeof(Dictionary<string, string>), response.Headers);
        }
    
        /// <summary>
        /// Add a file to a collection This endpoint adds a file to a collection
        /// </summary>
        /// <param name="coluuid">Collection ID</param> 
        /// <param name="content">Content</param> 
        /// <param name="path">Path to file</param> 
        /// <returns></returns>            
        public void CollectionsFsAddPost (string coluuid, string content, string path)
        {
            
            // verify the required parameter 'coluuid' is set
            if (coluuid == null) throw new ApiException(400, "Missing required parameter 'coluuid' when calling CollectionsFsAddPost");
            
            // verify the required parameter 'content' is set
            if (content == null) throw new ApiException(400, "Missing required parameter 'content' when calling CollectionsFsAddPost");
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling CollectionsFsAddPost");
            
    
            var path = "/collections/fs/add";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (coluuid != null) queryParams.Add("coluuid", ApiClient.ParameterToString(coluuid)); // query parameter
 if (content != null) queryParams.Add("content", ApiClient.ParameterToString(content)); // query parameter
 if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsFsAddPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsFsAddPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// List all collections This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
        /// </summary>
        /// <param name="id">User ID</param> 
        /// <returns>List&lt;MainCollection&gt;</returns>            
        public List<MainCollection> CollectionsGet (int? id)
        {
            
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling CollectionsGet");
            
    
            var path = "/collections/";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "id" + "}", ApiClient.ParameterToString(id));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<MainCollection>) ApiClient.Deserialize(response.Content, typeof(List<MainCollection>), response.Headers);
        }
    
        /// <summary>
        /// Create a new collection This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
        /// </summary>
        /// <param name="body">Collection name and description</param> 
        /// <returns>MainCollection</returns>            
        public MainCollection CollectionsPost (MainCreateCollectionBody body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CollectionsPost");
            
    
            var path = "/collections/";
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
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CollectionsPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (MainCollection) ApiClient.Deserialize(response.Content, typeof(MainCollection), response.Headers);
        }
    
    }
}
