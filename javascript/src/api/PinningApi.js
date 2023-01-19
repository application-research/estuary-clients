/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.37
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {TypesIpfsListPinStatusResponse} from '../model/TypesIpfsListPinStatusResponse';
import {TypesIpfsPin} from '../model/TypesIpfsPin';
import {TypesIpfsPinStatusResponse} from '../model/TypesIpfsPinStatusResponse';
import {UtilHttpError} from '../model/UtilHttpError';

/**
* Pinning service.
* @module api/PinningApi
* @version 1.0.6
*/
export class PinningApi {

    /**
    * Constructs a new PinningApi. 
    * @alias module:api/PinningApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the pinningPinsGet operation.
     * @callback moduleapi/PinningApi~pinningPinsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TypesIpfsListPinStatusResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all pin status objects
     * This endpoint lists all pin status objects
     * @param {module:api/PinningApi~pinningPinsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    pinningPinsGet(callback) {
      
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
      let returnType = TypesIpfsListPinStatusResponse;

      return this.apiClient.callApi(
        '/pinning/pins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the pinningPinsPinidDelete operation.
     * @callback moduleapi/PinningApi~pinningPinsPinidDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a pinned object
     * This endpoint deletes a pinned object.
     * @param {String} pinid Pin ID
     * @param {module:api/PinningApi~pinningPinsPinidDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    pinningPinsPinidDelete(pinid, callback) {
      
      let postBody = null;
      // verify the required parameter 'pinid' is set
      if (pinid === undefined || pinid === null) {
        throw new Error("Missing the required parameter 'pinid' when calling pinningPinsPinidDelete");
      }

      let pathParams = {
        'pinid': pinid
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
        '/pinning/pins/{pinid}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the pinningPinsPinidGet operation.
     * @callback moduleapi/PinningApi~pinningPinsPinidGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TypesIpfsPinStatusResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a pin status object
     * This endpoint returns a pin status object.
     * @param {String} pinid cid
     * @param {module:api/PinningApi~pinningPinsPinidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    pinningPinsPinidGet(pinid, callback) {
      
      let postBody = null;
      // verify the required parameter 'pinid' is set
      if (pinid === undefined || pinid === null) {
        throw new Error("Missing the required parameter 'pinid' when calling pinningPinsPinidGet");
      }

      let pathParams = {
        'pinid': pinid
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
      let returnType = TypesIpfsPinStatusResponse;

      return this.apiClient.callApi(
        '/pinning/pins/{pinid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the pinningPinsPinidPost operation.
     * @callback moduleapi/PinningApi~pinningPinsPinidPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TypesIpfsPinStatusResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Replace a pinned object
     * This endpoint replaces a pinned object.
     * @param {module:model/TypesIpfsPin} body New pin
     * @param {String} pinid Pin ID to be replaced
     * @param {module:api/PinningApi~pinningPinsPinidPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    pinningPinsPinidPost(body, pinid, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling pinningPinsPinidPost");
      }
      // verify the required parameter 'pinid' is set
      if (pinid === undefined || pinid === null) {
        throw new Error("Missing the required parameter 'pinid' when calling pinningPinsPinidPost");
      }

      let pathParams = {
        'pinid': pinid
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = TypesIpfsPinStatusResponse;

      return this.apiClient.callApi(
        '/pinning/pins/{pinid}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the pinningPinsPost operation.
     * @callback moduleapi/PinningApi~pinningPinsPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TypesIpfsPinStatusResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add and pin object
     * This endpoint adds a pin to the IPFS daemon.
     * @param {module:model/TypesIpfsPin} body Pin Body {cid:cid, name:name}
     * @param {Object} opts Optional parameters
     * @param {String} opts.ignoreDupes Ignore Dupes
     * @param {String} opts.overwrite Overwrite conflicting files in collections
     * @param {module:api/PinningApi~pinningPinsPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    pinningPinsPost(body, opts, callback) {
      opts = opts || {};
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling pinningPinsPost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'ignore-dupes': opts['ignoreDupes'],'overwrite': opts['overwrite']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = TypesIpfsPinStatusResponse;

      return this.apiClient.callApi(
        '/pinning/pins', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}