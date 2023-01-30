/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.39
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {ApiPublicNodeInfo} from '../model/ApiPublicNodeInfo';
import {UtilHttpError} from '../model/UtilHttpError';

/**
* Public service.
* @module api/PublicApi
* @version 1.0.6
*/
export class PublicApi {

    /**
    * Constructs a new PublicApi. 
    * @alias module:api/PublicApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getCidGet operation.
     * @callback moduleapi/PublicApi~getCidGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Full Content by Cid
     * This endpoint returns the content associated with a CID
     * @param {String} cid Cid
     * @param {module:api/PublicApi~getCidGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getCidGet(cid, callback) {
      
      let postBody = null;
      // verify the required parameter 'cid' is set
      if (cid === undefined || cid === null) {
        throw new Error("Missing the required parameter 'cid' when calling getCidGet");
      }

      let pathParams = {
        'cid': cid
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
      let returnType = null;

      return this.apiClient.callApi(
        '/get/{cid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicByCidCidGet operation.
     * @callback moduleapi/PublicApi~publicByCidCidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Content by Cid
     * This endpoint returns the content record associated with a CID
     * @param {String} cid Cid
     * @param {module:api/PublicApi~publicByCidCidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicByCidCidGet(cid, callback) {
      
      let postBody = null;
      // verify the required parameter 'cid' is set
      if (cid === undefined || cid === null) {
        throw new Error("Missing the required parameter 'cid' when calling publicByCidCidGet");
      }

      let pathParams = {
        'cid': cid
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
        '/public/by-cid/{cid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicInfoGet operation.
     * @callback moduleapi/PublicApi~publicInfoGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ApiPublicNodeInfo{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get public node info
     * This endpoint returns information about the node
     * @param {module:api/PublicApi~publicInfoGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicInfoGet(callback) {
      
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
      let returnType = ApiPublicNodeInfo;

      return this.apiClient.callApi(
        '/public/info', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicMetricsDealsOnChainGet operation.
     * @callback moduleapi/PublicApi~publicMetricsDealsOnChainGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     * @param {module:api/PublicApi~publicMetricsDealsOnChainGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicMetricsDealsOnChainGet(callback) {
      
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
        '/public/metrics/deals-on-chain', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicMinersDealsMinerGet operation.
     * @callback moduleapi/PublicApi~publicMinersDealsMinerGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners deals
     * This endpoint returns all miners deals
     * @param {String} miner Filter by miner
     * @param {Object} opts Optional parameters
     * @param {String} opts.ignoreFailed Ignore Failed
     * @param {module:api/PublicApi~publicMinersDealsMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicMinersDealsMinerGet(miner, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersDealsMinerGet");
      }

      let pathParams = {
        'miner': miner
      };
      let queryParams = {
        'ignore-failed': opts['ignoreFailed']
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
        '/public/miners/deals/{miner}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicMinersFailuresMinerGet operation.
     * @callback moduleapi/PublicApi~publicMinersFailuresMinerGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param {String} miner Filter by miner
     * @param {module:api/PublicApi~publicMinersFailuresMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicMinersFailuresMinerGet(miner, callback) {
      
      let postBody = null;
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersFailuresMinerGet");
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
        '/public/miners/failures/{miner}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicMinersStatsMinerGet operation.
     * @callback moduleapi/PublicApi~publicMinersStatsMinerGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get miner stats
     * This endpoint returns miner stats
     * @param {String} miner Filter by miner
     * @param {module:api/PublicApi~publicMinersStatsMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicMinersStatsMinerGet(miner, callback) {
      
      let postBody = null;
      // verify the required parameter 'miner' is set
      if (miner === undefined || miner === null) {
        throw new Error("Missing the required parameter 'miner' when calling publicMinersStatsMinerGet");
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
        '/public/miners/stats/{miner}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicNetAddrsGet operation.
     * @callback moduleapi/PublicApi~publicNetAddrsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Net Addrs
     * This endpoint is used to get net addrs
     * @param {module:api/PublicApi~publicNetAddrsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicNetAddrsGet(callback) {
      
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
      let returnType = ['String'];

      return this.apiClient.callApi(
        '/public/net/addrs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicNetPeersGet operation.
     * @callback moduleapi/PublicApi~publicNetPeersGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Net Peers
     * This endpoint is used to get net peers
     * @param {module:api/PublicApi~publicNetPeersGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicNetPeersGet(callback) {
      
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
      let returnType = ['String'];

      return this.apiClient.callApi(
        '/public/net/peers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicStatsGet operation.
     * @callback moduleapi/PublicApi~publicStatsGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Public stats
     * This endpoint is used to get public stats.
     * @param {module:api/PublicApi~publicStatsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    publicStatsGet(callback) {
      
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
        '/public/stats', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}