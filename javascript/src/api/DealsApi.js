/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.36
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {MainChannelIDParam} from '../model/MainChannelIDParam';
import {MainEstimateDealBody} from '../model/MainEstimateDealBody';
import {UtilHttpError} from '../model/UtilHttpError';

/**
* Deals service.
* @module api/DealsApi
* @version 1.0.6
*/
export class DealsApi {

    /**
    * Constructs a new DealsApi. 
    * @alias module:api/DealsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the dealEstimatePost operation.
     * @callback moduleapi/DealsApi~dealEstimatePostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Estimate the cost of a deal
     * This endpoint estimates the cost of a deal
     * @param {module:model/MainEstimateDealBody} body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
     * @param {module:api/DealsApi~dealEstimatePostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealEstimatePost(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dealEstimatePost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['*/*'];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/estimate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealInfoDealidGet operation.
     * @callback moduleapi/DealsApi~dealInfoDealidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Deal Info
     * This endpoint returns the deal info for a deal
     * @param {Number} dealid Deal ID
     * @param {module:api/DealsApi~dealInfoDealidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealInfoDealidGet(dealid, callback) {
      
      let postBody = null;
      // verify the required parameter 'dealid' is set
      if (dealid === undefined || dealid === null) {
        throw new Error("Missing the required parameter 'dealid' when calling dealInfoDealidGet");
      }

      let pathParams = {
        'dealid': dealid
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/info/{dealid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealProposalPropcidGet operation.
     * @callback moduleapi/DealsApi~dealProposalPropcidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Proposal
     * This endpoint returns the proposal for a deal
     * @param {String} propcid Proposal CID
     * @param {module:api/DealsApi~dealProposalPropcidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealProposalPropcidGet(propcid, callback) {
      
      let postBody = null;
      // verify the required parameter 'propcid' is set
      if (propcid === undefined || propcid === null) {
        throw new Error("Missing the required parameter 'propcid' when calling dealProposalPropcidGet");
      }

      let pathParams = {
        'propcid': propcid
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/proposal/{propcid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealQueryMinerGet operation.
     * @callback moduleapi/DealsApi~dealQueryMinerGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param {String} miner CID
     * @param {module:api/DealsApi~dealQueryMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealQueryMinerGet(miner, callback) {
      
      let postBody = null;
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling dealQueryMinerGet");
      }

      let pathParams = {
        'miner': miner
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/query/{miner}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealStatusByProposalPropcidGet operation.
     * @callback moduleapi/DealsApi~dealStatusByProposalPropcidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Deal Status by PropCid
     * Get Deal Status by PropCid
     * @param {String} propcid PropCid
     * @param {module:api/DealsApi~dealStatusByProposalPropcidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealStatusByProposalPropcidGet(propcid, callback) {
      
      let postBody = null;
      // verify the required parameter 'propcid' is set
      if (propcid === undefined || propcid === null) {
        throw new Error("Missing the required parameter 'propcid' when calling dealStatusByProposalPropcidGet");
      }

      let pathParams = {
        'propcid': propcid
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/status-by-proposal/{propcid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealStatusMinerPropcidGet operation.
     * @callback moduleapi/DealsApi~dealStatusMinerPropcidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deal Status
     * This endpoint returns the status of a deal
     * @param {String} miner Miner
     * @param {String} propcid Proposal CID
     * @param {module:api/DealsApi~dealStatusMinerPropcidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealStatusMinerPropcidGet(miner, propcid, callback) {
      
      let postBody = null;
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling dealStatusMinerPropcidGet");
      }
      // verify the required parameter 'propcid' is set
      if (propcid === undefined || propcid === null) {
        throw new Error("Missing the required parameter 'propcid' when calling dealStatusMinerPropcidGet");
      }

      let pathParams = {
        'miner': miner,'propcid': propcid
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/status/{miner}/{propcid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealTransferInProgressGet operation.
     * @callback moduleapi/DealsApi~dealTransferInProgressGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Transfer In Progress
     * This endpoint returns the in-progress transfers
     * @param {module:api/DealsApi~dealTransferInProgressGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealTransferInProgressGet(callback) {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/transfer/in-progress', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealTransferStatusPost operation.
     * @callback moduleapi/DealsApi~dealTransferStatusPostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Transfer Status
     * This endpoint returns the status of a transfer
     * @param {module:model/MainChannelIDParam} body Channel ID
     * @param {module:api/DealsApi~dealTransferStatusPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealTransferStatusPost(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dealTransferStatusPost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['*/*'];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deal/transfer/status', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealsFailuresGet operation.
     * @callback moduleapi/DealsApi~dealsFailuresGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get storage failures for user
     * This endpoint returns a list of storage failures for user
     * @param {module:api/DealsApi~dealsFailuresGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealsFailuresGet(callback) {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deals/failures', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealsMakeMinerPost operation.
     * @callback moduleapi/DealsApi~dealsMakeMinerPostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Make Deal
     * This endpoint makes a deal for a given content and miner
     * @param {String} body Deal Request
     * @param {String} miner Miner
     * @param {module:api/DealsApi~dealsMakeMinerPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealsMakeMinerPost(body, miner, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dealsMakeMinerPost");
      }
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling dealsMakeMinerPost");
      }

      let pathParams = {
        'miner': miner
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['*/*'];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deals/make/{miner}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the dealsStatusDealGet operation.
     * @callback moduleapi/DealsApi~dealsStatusDealGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Deal Status
     * This endpoint returns the status of a deal
     * @param {Number} deal Deal ID
     * @param {module:api/DealsApi~dealsStatusDealGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    dealsStatusDealGet(deal, callback) {
      
      let postBody = null;
      // verify the required parameter 'deal' is set
      if (deal === undefined || deal === null) {
        throw new Error("Missing the required parameter 'deal' when calling dealsStatusDealGet");
      }

      let pathParams = {
        'deal': deal
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/deals/status/{deal}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicDealsFailuresGet operation.
     * @callback moduleapi/DealsApi~publicDealsFailuresGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get storage failures
     * This endpoint returns a list of storage failures
     * @param {module:api/DealsApi~publicDealsFailuresGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicDealsFailuresGet(callback) {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/public/deals/failures', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicMinersStorageQueryMinerGet operation.
     * @callback moduleapi/DealsApi~publicMinersStorageQueryMinerGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Query Ask
     * This endpoint returns the ask for a given CID
     * @param {String} miner CID
     * @param {module:api/DealsApi~publicMinersStorageQueryMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicMinersStorageQueryMinerGet(miner, callback) {
      
      let postBody = null;
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersStorageQueryMinerGet");
      }

      let pathParams = {
        'miner': miner
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/public/miners/storage/query/{miner}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}