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
    public interface IDealsApi
    {
        /// <summary>
        /// Estimate the cost of a deal This endpoint estimates the cost of a deal
        /// </summary>
        /// <param name="body">The size of the deal in bytes, the replication factor, and the duration of the deal in blocks</param>
        /// <returns></returns>
        void DealEstimatePost (MainEstimateDealBody body);
        /// <summary>
        /// Get Deal Info This endpoint returns the deal info for a deal
        /// </summary>
        /// <param name="dealid">Deal ID</param>
        /// <returns></returns>
        void DealInfoDealidGet (int? dealid);
        /// <summary>
        /// Get Proposal This endpoint returns the proposal for a deal
        /// </summary>
        /// <param name="propcid">Proposal CID</param>
        /// <returns></returns>
        void DealProposalPropcidGet (string propcid);
        /// <summary>
        /// Query Ask This endpoint returns the ask for a given CID
        /// </summary>
        /// <param name="miner">CID</param>
        /// <returns></returns>
        void DealQueryMinerGet (string miner);
        /// <summary>
        /// Get Deal Status by PropCid Get Deal Status by PropCid
        /// </summary>
        /// <param name="propcid">PropCid</param>
        /// <returns></returns>
        void DealStatusByProposalPropcidGet (string propcid);
        /// <summary>
        /// Deal Status This endpoint returns the status of a deal
        /// </summary>
        /// <param name="miner">Miner</param>
        /// <param name="propcid">Proposal CID</param>
        /// <returns></returns>
        void DealStatusMinerPropcidGet (string miner, string propcid);
        /// <summary>
        /// Transfer In Progress This endpoint returns the in-progress transfers
        /// </summary>
        /// <returns></returns>
        void DealTransferInProgressGet ();
        /// <summary>
        /// Transfer Status This endpoint returns the status of a transfer
        /// </summary>
        /// <returns></returns>
        void DealTransferStatusPost ();
        /// <summary>
        /// Get storage failures for user This endpoint returns a list of storage failures for user
        /// </summary>
        /// <returns></returns>
        void DealsFailuresGet ();
        /// <summary>
        /// Make Deal This endpoint makes a deal for a given content and miner
        /// </summary>
        /// <param name="miner">Miner</param>
        /// <param name="dealRequest">Deal Request</param>
        /// <returns></returns>
        void DealsMakeMinerPost (string miner, string dealRequest);
        /// <summary>
        /// Get Deal Status This endpoint returns the status of a deal
        /// </summary>
        /// <param name="deal">Deal ID</param>
        /// <returns></returns>
        void DealsStatusDealGet (int? deal);
        /// <summary>
        /// Get storage failures This endpoint returns a list of storage failures
        /// </summary>
        /// <returns></returns>
        void PublicDealsFailuresGet ();
        /// <summary>
        /// Query Ask This endpoint returns the ask for a given CID
        /// </summary>
        /// <param name="miner">CID</param>
        /// <returns></returns>
        void PublicMinersStorageQueryMinerGet (string miner);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DealsApi : IDealsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DealsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DealsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DealsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DealsApi(String basePath)
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
        /// Estimate the cost of a deal This endpoint estimates the cost of a deal
        /// </summary>
        /// <param name="body">The size of the deal in bytes, the replication factor, and the duration of the deal in blocks</param> 
        /// <returns></returns>            
        public void DealEstimatePost (MainEstimateDealBody body)
        {
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling DealEstimatePost");
            
    
            var path = "/deal/estimate";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealEstimatePost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealEstimatePost: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get Deal Info This endpoint returns the deal info for a deal
        /// </summary>
        /// <param name="dealid">Deal ID</param> 
        /// <returns></returns>            
        public void DealInfoDealidGet (int? dealid)
        {
            
            // verify the required parameter 'dealid' is set
            if (dealid == null) throw new ApiException(400, "Missing required parameter 'dealid' when calling DealInfoDealidGet");
            
    
            var path = "/deal/info/{dealid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "dealid" + "}", ApiClient.ParameterToString(dealid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealInfoDealidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealInfoDealidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get Proposal This endpoint returns the proposal for a deal
        /// </summary>
        /// <param name="propcid">Proposal CID</param> 
        /// <returns></returns>            
        public void DealProposalPropcidGet (string propcid)
        {
            
            // verify the required parameter 'propcid' is set
            if (propcid == null) throw new ApiException(400, "Missing required parameter 'propcid' when calling DealProposalPropcidGet");
            
    
            var path = "/deal/proposal/{propcid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "propcid" + "}", ApiClient.ParameterToString(propcid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealProposalPropcidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealProposalPropcidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Query Ask This endpoint returns the ask for a given CID
        /// </summary>
        /// <param name="miner">CID</param> 
        /// <returns></returns>            
        public void DealQueryMinerGet (string miner)
        {
            
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling DealQueryMinerGet");
            
    
            var path = "/deal/query/{miner}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealQueryMinerGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealQueryMinerGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get Deal Status by PropCid Get Deal Status by PropCid
        /// </summary>
        /// <param name="propcid">PropCid</param> 
        /// <returns></returns>            
        public void DealStatusByProposalPropcidGet (string propcid)
        {
            
            // verify the required parameter 'propcid' is set
            if (propcid == null) throw new ApiException(400, "Missing required parameter 'propcid' when calling DealStatusByProposalPropcidGet");
            
    
            var path = "/deal/status-by-proposal/{propcid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "propcid" + "}", ApiClient.ParameterToString(propcid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealStatusByProposalPropcidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealStatusByProposalPropcidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Deal Status This endpoint returns the status of a deal
        /// </summary>
        /// <param name="miner">Miner</param> 
        /// <param name="propcid">Proposal CID</param> 
        /// <returns></returns>            
        public void DealStatusMinerPropcidGet (string miner, string propcid)
        {
            
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling DealStatusMinerPropcidGet");
            
            // verify the required parameter 'propcid' is set
            if (propcid == null) throw new ApiException(400, "Missing required parameter 'propcid' when calling DealStatusMinerPropcidGet");
            
    
            var path = "/deal/status/{miner}/{propcid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "miner" + "}", ApiClient.ParameterToString(miner));
path = path.Replace("{" + "propcid" + "}", ApiClient.ParameterToString(propcid));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealStatusMinerPropcidGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealStatusMinerPropcidGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Transfer In Progress This endpoint returns the in-progress transfers
        /// </summary>
        /// <returns></returns>            
        public void DealTransferInProgressGet ()
        {
            
    
            var path = "/deal/transfer/in-progress";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealTransferInProgressGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealTransferInProgressGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Transfer Status This endpoint returns the status of a transfer
        /// </summary>
        /// <returns></returns>            
        public void DealTransferStatusPost ()
        {
            
    
            var path = "/deal/transfer/status";
            path = path.Replace("{format}", "json");
                
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealTransferStatusPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealTransferStatusPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get storage failures for user This endpoint returns a list of storage failures for user
        /// </summary>
        /// <returns></returns>            
        public void DealsFailuresGet ()
        {
            
    
            var path = "/deals/failures";
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealsFailuresGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealsFailuresGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Make Deal This endpoint makes a deal for a given content and miner
        /// </summary>
        /// <param name="miner">Miner</param> 
        /// <param name="dealRequest">Deal Request</param> 
        /// <returns></returns>            
        public void DealsMakeMinerPost (string miner, string dealRequest)
        {
            
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling DealsMakeMinerPost");
            
            // verify the required parameter 'dealRequest' is set
            if (dealRequest == null) throw new ApiException(400, "Missing required parameter 'dealRequest' when calling DealsMakeMinerPost");
            
    
            var path = "/deals/make/{miner}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "miner" + "}", ApiClient.ParameterToString(miner));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(dealRequest); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "bearerAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DealsMakeMinerPost: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealsMakeMinerPost: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get Deal Status This endpoint returns the status of a deal
        /// </summary>
        /// <param name="deal">Deal ID</param> 
        /// <returns></returns>            
        public void DealsStatusDealGet (int? deal)
        {
            
            // verify the required parameter 'deal' is set
            if (deal == null) throw new ApiException(400, "Missing required parameter 'deal' when calling DealsStatusDealGet");
            
    
            var path = "/deals/status/{deal}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "deal" + "}", ApiClient.ParameterToString(deal));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DealsStatusDealGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DealsStatusDealGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get storage failures This endpoint returns a list of storage failures
        /// </summary>
        /// <returns></returns>            
        public void PublicDealsFailuresGet ()
        {
            
    
            var path = "/public/deals/failures";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicDealsFailuresGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicDealsFailuresGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Query Ask This endpoint returns the ask for a given CID
        /// </summary>
        /// <param name="miner">CID</param> 
        /// <returns></returns>            
        public void PublicMinersStorageQueryMinerGet (string miner)
        {
            
            // verify the required parameter 'miner' is set
            if (miner == null) throw new ApiException(400, "Missing required parameter 'miner' when calling PublicMinersStorageQueryMinerGet");
            
    
            var path = "/public/miners/storage/query/{miner}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersStorageQueryMinerGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PublicMinersStorageQueryMinerGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
