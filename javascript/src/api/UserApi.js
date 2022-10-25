/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.28
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/MainGetApiKeysResp', 'model/MainUserStatsResponse', 'model/UtilHttpError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/MainGetApiKeysResp'), require('../model/MainUserStatsResponse'), require('../model/UtilHttpError'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryClient) {
      root.EstuaryClient = {};
    }
    root.EstuaryClient.UserApi = factory(root.EstuaryClient.ApiClient, root.EstuaryClient.MainGetApiKeysResp, root.EstuaryClient.MainUserStatsResponse, root.EstuaryClient.UtilHttpError);
  }
}(this, function(ApiClient, MainGetApiKeysResp, MainUserStatsResponse, UtilHttpError) {
  'use strict';

  /**
   * User service.
   * @module api/UserApi
   * @version 0.0.0
   */

  /**
   * Constructs a new UserApi. 
   * @alias module:api/UserApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the userApiKeysGet operation.
     * @callback module:api/UserApi~userApiKeysGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/MainGetApiKeysResp>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get API keys for a user
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     * @param {module:api/UserApi~userApiKeysGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/MainGetApiKeysResp>}
     */
    this.userApiKeysGet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [MainGetApiKeysResp];

      return this.apiClient.callApi(
        '/user/api-keys', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the userApiKeysKeyDelete operation.
     * @callback module:api/UserApi~userApiKeysKeyDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Revoke a User API Key.
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
     * @param {String} key Key
     * @param {module:api/UserApi~userApiKeysKeyDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.userApiKeysKeyDelete = function(key, callback) {
      var postBody = null;

      // verify the required parameter 'key' is set
      if (key === undefined || key === null) {
        throw new Error("Missing the required parameter 'key' when calling userApiKeysKeyDelete");
      }


      var pathParams = {
        'key': key
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/user/api-keys/{key}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the userApiKeysPost operation.
     * @callback module:api/UserApi~userApiKeysPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MainGetApiKeysResp} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create API keys for a user
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     * @param {Object} opts Optional parameters
     * @param {String} opts.expiry Expiration - Expiration - Valid time units are ns, us (or µs), ms, s, m, h. for example 300h
     * @param {String} opts.perms Permissions -- currently unused
     * @param {module:api/UserApi~userApiKeysPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MainGetApiKeysResp}
     */
    this.userApiKeysPost = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'expiry': opts['expiry'],
        'perms': opts['perms'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = MainGetApiKeysResp;

      return this.apiClient.callApi(
        '/user/api-keys', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the userExportGet operation.
     * @callback module:api/UserApi~userExportGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Export user data
     * This endpoint is used to get API keys for a user.
     * @param {module:api/UserApi~userExportGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    this.userExportGet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/user/export', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the userStatsGet operation.
     * @callback module:api/UserApi~userStatsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MainUserStatsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create API keys for a user
     * This endpoint is used to create API keys for a user.
     * @param {module:api/UserApi~userStatsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MainUserStatsResponse}
     */
    this.userStatsGet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearerAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = MainUserStatsResponse;

      return this.apiClient.callApi(
        '/user/stats', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
