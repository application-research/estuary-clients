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
    public interface IContentApi
    {
        /// <summary>
        /// Create an Estuary invite This endpoint is used to create an estuary invite.
        /// </summary>
        /// <param name="code">Invite code to be created</param>
        /// <returns>string</returns>
        string AdminInvitesCodePost (string code);
        /// <summary>
        /// Get Estuary invites This endpoint is used to list all estuary invites.
        /// </summary>
        /// <returns>string</returns>
        string AdminInvitesGet ();
        /// <summary>
        /// Add Car object This endpoint is used to add a car object to the network. The object can be a file or a directory.
        /// </summary>
        /// <param name="body">Car</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <param name="filename">Filename</param>
        /// <returns>UtilContentAddResponse</returns>
        UtilContentAddResponse ContentAddCarPost (string body, string ignoreDupes, string filename);
        /// <summary>
        /// Add IPFS object This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
        /// </summary>
        /// <param name="body">IPFS Body</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <param name="overwrite">Overwrite conflicting files in collections</param>
        /// <returns>string</returns>
        string ContentAddIpfsPost (PinnerIpfsPin body, string ignoreDupes, string overwrite);
        /// <summary>
        /// Add new content This endpoint is used to upload new content.
        /// </summary>
        /// <param name="data"></param>
        /// <param name="filename"></param>
        /// <param name="coluuid">Collection UUID</param>
        /// <param name="replication">Replication value</param>
        /// <param name="ignoreDupes">Ignore Dupes true/false</param>
        /// <param name="overwrite">Overwrite files with the same path on same collection</param>
        /// <param name="lazyProvide">Lazy Provide true/false</param>
        /// <param name="dir">Directory</param>
        /// <returns>UtilContentAddResponse</returns>
        UtilContentAddResponse ContentAddPost (byte[] data, string filename, string coluuid, int? replication, string ignoreDupes, string overwrite, string lazyProvide, string dir);
        /// <summary>
        /// Get aggregated content stats This endpoint returns aggregated content stats
        /// </summary>
        /// <param name="content">Content ID</param>
        /// <returns>string</returns>
        string ContentAggregatedContentGet (string content);
        /// <summary>
        /// Get all deals for a user This endpoint is used to get all deals for a user
        /// </summary>
        /// <param name="begin">Begin</param>
        /// <param name="duration">Duration</param>
        /// <param name="all">All</param>
        /// <returns>string</returns>
        string ContentAllDealsGet (string begin, string duration, string all);
        /// <summary>
        /// Get content bandwidth This endpoint returns content bandwidth
        /// </summary>
        /// <param name="content">Content ID</param>
        /// <returns>string</returns>
        string ContentBwUsageContentGet (string content);
        /// <summary>
        /// Get user contents This endpoint is used to get user contents
        /// </summary>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <returns>string</returns>
        string ContentContentsGet (string limit, string offset);
        /// <summary>
        /// Add a new content This endpoint adds a new content
        /// </summary>
        /// <param name="body">Content</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <returns>string</returns>
        string ContentCreatePost (UtilContentCreateBody body, string ignoreDupes);
        /// <summary>
        /// Content with deals This endpoint lists all content with deals
        /// </summary>
        /// <param name="limit">Limit</param>
        /// <param name="offset">Offset</param>
        /// <returns>string</returns>
        string ContentDealsGet (int? limit, int? offset);
        /// <summary>
        /// Ensure Replication This endpoint ensures that the content is replicated to the specified number of providers
        /// </summary>
        /// <param name="datacid">Data CID</param>
        /// <returns>string</returns>
        string ContentEnsureReplicationDatacidGet (string datacid);
        /// <summary>
        /// List all failures for a content This endpoint returns all failures for a content
        /// </summary>
        /// <param name="content">Content ID</param>
        /// <returns>string</returns>
        string ContentFailuresContentGet (string content);
        /// <summary>
        /// Content This endpoint returns a content by its ID
        /// </summary>
        /// <param name="id">Content ID</param>
        /// <returns>string</returns>
        string ContentIdGet (int? id);
        /// <summary>
        /// List all pinned content This endpoint lists all content
        /// </summary>
        /// <returns>string</returns>
        string ContentListGet ();
        /// <summary>
        /// Get staging zone for user, excluding its contents This endpoint is used to get staging zone for user, excluding its contents.
        /// </summary>
        /// <returns>string</returns>
        string ContentStagingZonesGet ();
        /// <summary>
        /// Get contents for a staging zone This endpoint is used to get the contents for a staging zone
        /// </summary>
        /// <param name="stagingZone">Staging Zone Content ID</param>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <returns>string</returns>
        string ContentStagingZonesStagingZoneContentsGet (int? stagingZone, string limit, string offset);
        /// <summary>
        /// Get staging zone without its contents field populated This endpoint is used to get a staging zone, excluding its contents.
        /// </summary>
        /// <param name="stagingZone">Staging Zone Content ID</param>
        /// <returns>string</returns>
        string ContentStagingZonesStagingZoneGet (int? stagingZone);
        /// <summary>
        /// Get content statistics This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
        /// </summary>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <returns>string</returns>
        string ContentStatsGet (string limit, string offset);
        /// <summary>
        /// Content Status This endpoint returns the status of a content
        /// </summary>
        /// <param name="id">Content ID</param>
        /// <returns>string</returns>
        string ContentStatusIdGet (int? id);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ContentApi : IContentApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContentApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ContentApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ContentApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ContentApi(String basePath)
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
        /// Create an Estuary invite This endpoint is used to create an estuary invite.
        /// </summary>
        /// <param name="code">Invite code to be created</param>
        /// <returns>string</returns>
        public string AdminInvitesCodePost (string code)
        {
            // verify the required parameter 'code' is set
            if (code == null) throw new ApiException(400, "Missing required parameter 'code' when calling AdminInvitesCodePost");
    
            var path = "/admin/invites/{code}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "code" + "}", ApiClient.ParameterToString(code));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling AdminInvitesCodePost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminInvitesCodePost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get Estuary invites This endpoint is used to list all estuary invites.
        /// </summary>
        /// <returns>string</returns>
        public string AdminInvitesGet ()
        {
    
            var path = "/admin/invites";
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
                throw new ApiException ((int)response.StatusCode, "Error calling AdminInvitesGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdminInvitesGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Add Car object This endpoint is used to add a car object to the network. The object can be a file or a directory.
        /// </summary>
        /// <param name="body">Car</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <param name="filename">Filename</param>
        /// <returns>UtilContentAddResponse</returns>
        public UtilContentAddResponse ContentAddCarPost (string body, string ignoreDupes, string filename)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling ContentAddCarPost");
    
            var path = "/content/add-car";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (ignoreDupes != null) queryParams.Add("ignore-dupes", ApiClient.ParameterToString(ignoreDupes)); // query parameter
 if (filename != null) queryParams.Add("filename", ApiClient.ParameterToString(filename)); // query parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAddCarPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAddCarPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (UtilContentAddResponse) ApiClient.Deserialize(response.Content, typeof(UtilContentAddResponse), response.Headers);
        }
    
        /// <summary>
        /// Add IPFS object This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
        /// </summary>
        /// <param name="body">IPFS Body</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <param name="overwrite">Overwrite conflicting files in collections</param>
        /// <returns>string</returns>
        public string ContentAddIpfsPost (PinnerIpfsPin body, string ignoreDupes, string overwrite)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling ContentAddIpfsPost");
    
            var path = "/content/add-ipfs";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (ignoreDupes != null) queryParams.Add("ignore-dupes", ApiClient.ParameterToString(ignoreDupes)); // query parameter
 if (overwrite != null) queryParams.Add("overwrite", ApiClient.ParameterToString(overwrite)); // query parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAddIpfsPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAddIpfsPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Add new content This endpoint is used to upload new content.
        /// </summary>
        /// <param name="data"></param>
        /// <param name="filename"></param>
        /// <param name="coluuid">Collection UUID</param>
        /// <param name="replication">Replication value</param>
        /// <param name="ignoreDupes">Ignore Dupes true/false</param>
        /// <param name="overwrite">Overwrite files with the same path on same collection</param>
        /// <param name="lazyProvide">Lazy Provide true/false</param>
        /// <param name="dir">Directory</param>
        /// <returns>UtilContentAddResponse</returns>
        public UtilContentAddResponse ContentAddPost (byte[] data, string filename, string coluuid, int? replication, string ignoreDupes, string overwrite, string lazyProvide, string dir)
        {
            // verify the required parameter 'data' is set
            if (data == null) throw new ApiException(400, "Missing required parameter 'data' when calling ContentAddPost");
            // verify the required parameter 'filename' is set
            if (filename == null) throw new ApiException(400, "Missing required parameter 'filename' when calling ContentAddPost");
    
            var path = "/content/add";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (coluuid != null) queryParams.Add("coluuid", ApiClient.ParameterToString(coluuid)); // query parameter
 if (replication != null) queryParams.Add("replication", ApiClient.ParameterToString(replication)); // query parameter
 if (ignoreDupes != null) queryParams.Add("ignore-dupes", ApiClient.ParameterToString(ignoreDupes)); // query parameter
 if (overwrite != null) queryParams.Add("overwrite", ApiClient.ParameterToString(overwrite)); // query parameter
 if (lazyProvide != null) queryParams.Add("lazy-provide", ApiClient.ParameterToString(lazyProvide)); // query parameter
 if (dir != null) queryParams.Add("dir", ApiClient.ParameterToString(dir)); // query parameter
                        if (data != null) fileParams.Add("data", ApiClient.ParameterToFile("data", data));
if (filename != null) formParams.Add("filename", ApiClient.ParameterToString(filename)); // form parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAddPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAddPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (UtilContentAddResponse) ApiClient.Deserialize(response.Content, typeof(UtilContentAddResponse), response.Headers);
        }
    
        /// <summary>
        /// Get aggregated content stats This endpoint returns aggregated content stats
        /// </summary>
        /// <param name="content">Content ID</param>
        /// <returns>string</returns>
        public string ContentAggregatedContentGet (string content)
        {
            // verify the required parameter 'content' is set
            if (content == null) throw new ApiException(400, "Missing required parameter 'content' when calling ContentAggregatedContentGet");
    
            var path = "/content/aggregated/{content}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "content" + "}", ApiClient.ParameterToString(content));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAggregatedContentGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAggregatedContentGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get all deals for a user This endpoint is used to get all deals for a user
        /// </summary>
        /// <param name="begin">Begin</param>
        /// <param name="duration">Duration</param>
        /// <param name="all">All</param>
        /// <returns>string</returns>
        public string ContentAllDealsGet (string begin, string duration, string all)
        {
            // verify the required parameter 'begin' is set
            if (begin == null) throw new ApiException(400, "Missing required parameter 'begin' when calling ContentAllDealsGet");
            // verify the required parameter 'duration' is set
            if (duration == null) throw new ApiException(400, "Missing required parameter 'duration' when calling ContentAllDealsGet");
            // verify the required parameter 'all' is set
            if (all == null) throw new ApiException(400, "Missing required parameter 'all' when calling ContentAllDealsGet");
    
            var path = "/content/all-deals";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (begin != null) queryParams.Add("begin", ApiClient.ParameterToString(begin)); // query parameter
 if (duration != null) queryParams.Add("duration", ApiClient.ParameterToString(duration)); // query parameter
 if (all != null) queryParams.Add("all", ApiClient.ParameterToString(all)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAllDealsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentAllDealsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get content bandwidth This endpoint returns content bandwidth
        /// </summary>
        /// <param name="content">Content ID</param>
        /// <returns>string</returns>
        public string ContentBwUsageContentGet (string content)
        {
            // verify the required parameter 'content' is set
            if (content == null) throw new ApiException(400, "Missing required parameter 'content' when calling ContentBwUsageContentGet");
    
            var path = "/content/bw-usage/{content}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "content" + "}", ApiClient.ParameterToString(content));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentBwUsageContentGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentBwUsageContentGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get user contents This endpoint is used to get user contents
        /// </summary>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <returns>string</returns>
        public string ContentContentsGet (string limit, string offset)
        {
            // verify the required parameter 'limit' is set
            if (limit == null) throw new ApiException(400, "Missing required parameter 'limit' when calling ContentContentsGet");
            // verify the required parameter 'offset' is set
            if (offset == null) throw new ApiException(400, "Missing required parameter 'offset' when calling ContentContentsGet");
    
            var path = "/content/contents";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
 if (offset != null) queryParams.Add("offset", ApiClient.ParameterToString(offset)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentContentsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentContentsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Add a new content This endpoint adds a new content
        /// </summary>
        /// <param name="body">Content</param>
        /// <param name="ignoreDupes">Ignore Dupes</param>
        /// <returns>string</returns>
        public string ContentCreatePost (UtilContentCreateBody body, string ignoreDupes)
        {
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling ContentCreatePost");
    
            var path = "/content/create";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (ignoreDupes != null) queryParams.Add("ignore-dupes", ApiClient.ParameterToString(ignoreDupes)); // query parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentCreatePost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentCreatePost: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Content with deals This endpoint lists all content with deals
        /// </summary>
        /// <param name="limit">Limit</param>
        /// <param name="offset">Offset</param>
        /// <returns>string</returns>
        public string ContentDealsGet (int? limit, int? offset)
        {
    
            var path = "/content/deals";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
 if (offset != null) queryParams.Add("offset", ApiClient.ParameterToString(offset)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentDealsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentDealsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Ensure Replication This endpoint ensures that the content is replicated to the specified number of providers
        /// </summary>
        /// <param name="datacid">Data CID</param>
        /// <returns>string</returns>
        public string ContentEnsureReplicationDatacidGet (string datacid)
        {
            // verify the required parameter 'datacid' is set
            if (datacid == null) throw new ApiException(400, "Missing required parameter 'datacid' when calling ContentEnsureReplicationDatacidGet");
    
            var path = "/content/ensure-replication/{datacid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "datacid" + "}", ApiClient.ParameterToString(datacid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentEnsureReplicationDatacidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentEnsureReplicationDatacidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// List all failures for a content This endpoint returns all failures for a content
        /// </summary>
        /// <param name="content">Content ID</param>
        /// <returns>string</returns>
        public string ContentFailuresContentGet (string content)
        {
            // verify the required parameter 'content' is set
            if (content == null) throw new ApiException(400, "Missing required parameter 'content' when calling ContentFailuresContentGet");
    
            var path = "/content/failures/{content}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "content" + "}", ApiClient.ParameterToString(content));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentFailuresContentGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentFailuresContentGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Content This endpoint returns a content by its ID
        /// </summary>
        /// <param name="id">Content ID</param>
        /// <returns>string</returns>
        public string ContentIdGet (int? id)
        {
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling ContentIdGet");
    
            var path = "/content/{id}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentIdGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentIdGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// List all pinned content This endpoint lists all content
        /// </summary>
        /// <returns>string</returns>
        public string ContentListGet ()
        {
    
            var path = "/content/list";
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentListGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentListGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get staging zone for user, excluding its contents This endpoint is used to get staging zone for user, excluding its contents.
        /// </summary>
        /// <returns>string</returns>
        public string ContentStagingZonesGet ()
        {
    
            var path = "/content/staging-zones";
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStagingZonesGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStagingZonesGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get contents for a staging zone This endpoint is used to get the contents for a staging zone
        /// </summary>
        /// <param name="stagingZone">Staging Zone Content ID</param>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <returns>string</returns>
        public string ContentStagingZonesStagingZoneContentsGet (int? stagingZone, string limit, string offset)
        {
            // verify the required parameter 'stagingZone' is set
            if (stagingZone == null) throw new ApiException(400, "Missing required parameter 'stagingZone' when calling ContentStagingZonesStagingZoneContentsGet");
            // verify the required parameter 'limit' is set
            if (limit == null) throw new ApiException(400, "Missing required parameter 'limit' when calling ContentStagingZonesStagingZoneContentsGet");
            // verify the required parameter 'offset' is set
            if (offset == null) throw new ApiException(400, "Missing required parameter 'offset' when calling ContentStagingZonesStagingZoneContentsGet");
    
            var path = "/content/staging-zones/{staging_zone}/contents";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "staging_zone" + "}", ApiClient.ParameterToString(stagingZone));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
 if (offset != null) queryParams.Add("offset", ApiClient.ParameterToString(offset)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStagingZonesStagingZoneContentsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStagingZonesStagingZoneContentsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get staging zone without its contents field populated This endpoint is used to get a staging zone, excluding its contents.
        /// </summary>
        /// <param name="stagingZone">Staging Zone Content ID</param>
        /// <returns>string</returns>
        public string ContentStagingZonesStagingZoneGet (int? stagingZone)
        {
            // verify the required parameter 'stagingZone' is set
            if (stagingZone == null) throw new ApiException(400, "Missing required parameter 'stagingZone' when calling ContentStagingZonesStagingZoneGet");
    
            var path = "/content/staging-zones/{staging_zone}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "staging_zone" + "}", ApiClient.ParameterToString(stagingZone));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStagingZonesStagingZoneGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStagingZonesStagingZoneGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Get content statistics This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
        /// </summary>
        /// <param name="limit">limit</param>
        /// <param name="offset">offset</param>
        /// <returns>string</returns>
        public string ContentStatsGet (string limit, string offset)
        {
            // verify the required parameter 'limit' is set
            if (limit == null) throw new ApiException(400, "Missing required parameter 'limit' when calling ContentStatsGet");
            // verify the required parameter 'offset' is set
            if (offset == null) throw new ApiException(400, "Missing required parameter 'offset' when calling ContentStatsGet");
    
            var path = "/content/stats";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
 if (offset != null) queryParams.Add("offset", ApiClient.ParameterToString(offset)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStatsGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStatsGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        /// Content Status This endpoint returns the status of a content
        /// </summary>
        /// <param name="id">Content ID</param>
        /// <returns>string</returns>
        public string ContentStatusIdGet (int? id)
        {
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling ContentStatusIdGet");
    
            var path = "/content/status/{id}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStatusIdGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ContentStatusIdGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
