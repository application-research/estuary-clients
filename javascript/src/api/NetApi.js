/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.40
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {ApiMinerResp} from '../model/ApiMinerResp';
import {UtilHttpError} from '../model/UtilHttpError';

/**
* Net service.
* @module api/NetApi
* @version 1.0.6
*/
export class NetApi {

    /**
    * Constructs a new NetApi. 
    * @alias module:api/NetApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the adminMinersGet operation.
     * @callback moduleapi/NetApi~adminMinersGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ApiMinerResp{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners
     * This endpoint returns all miners. Note: value may be cached
     * @param {module:api/NetApi~adminMinersGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminMinersGet(callback) {
      
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
      let returnType = ApiMinerResp;

      return this.apiClient.callApi(
        '/admin/miners/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the publicMinersFailuresMinerGet operation.
     * @callback moduleapi/NetApi~publicMinersFailuresMinerGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param {String} miner Filter by miner
     * @param {module:api/NetApi~publicMinersFailuresMinerGetCallback} callback The callback function, accepting three arguments: error, data, response
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
     * Callback function to receive the result of the publicNetAddrsGet operation.
     * @callback moduleapi/NetApi~publicNetAddrsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Net Addrs
     * This endpoint is used to get net addrs
     * @param {module:api/NetApi~publicNetAddrsGetCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback moduleapi/NetApi~publicNetPeersGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Net Peers
     * This endpoint is used to get net peers
     * @param {module:api/NetApi~publicNetPeersGetCallback} callback The callback function, accepting three arguments: error, data, response
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

}