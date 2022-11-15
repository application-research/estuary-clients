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
import {CollectionsCollection} from '../model/CollectionsCollection';
import {MainCreateCollectionBody} from '../model/MainCreateCollectionBody';
import {MainDeleteContentFromCollectionBody} from '../model/MainDeleteContentFromCollectionBody';
import {UtilHttpError} from '../model/UtilHttpError';

/**
* Collections service.
* @module api/CollectionsApi
* @version 1.0.3
*/
export class CollectionsApi {

    /**
    * Constructs a new CollectionsApi. 
    * @alias module:api/CollectionsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the collectionsColuuidCommitPost operation.
     * @callback moduleapi/CollectionsApi~collectionsColuuidCommitPostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Produce a CID of the collection contents
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     * @param {String} coluuid coluuid
     * @param {module:api/CollectionsApi~collectionsColuuidCommitPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsColuuidCommitPost(coluuid, callback) {
      
      let postBody = null;
      // verify the required parameter 'coluuid' is set
      if (coluuid === undefined || coluuid === null) {
        throw new Error("Missing the required parameter 'coluuid' when calling collectionsColuuidCommitPost");
      }

      let pathParams = {
        'coluuid': coluuid
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
        '/collections/{coluuid}/commit', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsColuuidContentsDelete operation.
     * @callback moduleapi/CollectionsApi~collectionsColuuidContentsDeleteCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a content from a collection
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     * @param {module:model/MainDeleteContentFromCollectionBody} body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;)
     * @param {String} coluuid Collection ID
     * @param {String} contentid Content ID
     * @param {module:api/CollectionsApi~collectionsColuuidContentsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsColuuidContentsDelete(body, coluuid, contentid, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling collectionsColuuidContentsDelete");
      }
      // verify the required parameter 'coluuid' is set
      if (coluuid === undefined || coluuid === null) {
        throw new Error("Missing the required parameter 'coluuid' when calling collectionsColuuidContentsDelete");
      }
      // verify the required parameter 'contentid' is set
      if (contentid === undefined || contentid === null) {
        throw new Error("Missing the required parameter 'contentid' when calling collectionsColuuidContentsDelete");
      }

      let pathParams = {
        'coluuid': coluuid,'contentid': contentid
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
        '/collections/{coluuid}/contents', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsColuuidDelete operation.
     * @callback moduleapi/CollectionsApi~collectionsColuuidDeleteCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a collection
     * This endpoint is used to delete an existing collection.
     * @param {String} coluuid Collection ID
     * @param {module:api/CollectionsApi~collectionsColuuidDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsColuuidDelete(coluuid, callback) {
      
      let postBody = null;
      // verify the required parameter 'coluuid' is set
      if (coluuid === undefined || coluuid === null) {
        throw new Error("Missing the required parameter 'coluuid' when calling collectionsColuuidDelete");
      }

      let pathParams = {
        'coluuid': coluuid
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/collections/{coluuid}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsColuuidGet operation.
     * @callback moduleapi/CollectionsApi~collectionsColuuidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get contents in a collection
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     * @param {String} coluuid coluuid
     * @param {Object} opts Optional parameters
     * @param {String} opts.dir Directory
     * @param {module:api/CollectionsApi~collectionsColuuidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsColuuidGet(coluuid, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'coluuid' is set
      if (coluuid === undefined || coluuid === null) {
        throw new Error("Missing the required parameter 'coluuid' when calling collectionsColuuidGet");
      }

      let pathParams = {
        'coluuid': coluuid
      };
      let queryParams = {
        'dir': opts['dir']
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
        '/collections/{coluuid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsColuuidPost operation.
     * @callback moduleapi/CollectionsApi~collectionsColuuidPostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add contents to a collection
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     * @param {Array.<Number>} body Content IDs to add to collection
     * @param {String} coluuid Collection UUID
     * @param {module:api/CollectionsApi~collectionsColuuidPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsColuuidPost(body, coluuid, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling collectionsColuuidPost");
      }
      // verify the required parameter 'coluuid' is set
      if (coluuid === undefined || coluuid === null) {
        throw new Error("Missing the required parameter 'coluuid' when calling collectionsColuuidPost");
      }

      let pathParams = {
        'coluuid': coluuid
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
      let returnType = 'String';

      return this.apiClient.callApi(
        '/collections/{coluuid}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsFsAddPost operation.
     * @callback moduleapi/CollectionsApi~collectionsFsAddPostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a file to a collection
     * This endpoint adds a file to a collection
     * @param {String} coluuid Collection ID
     * @param {String} content Content
     * @param {String} path Path to file
     * @param {module:api/CollectionsApi~collectionsFsAddPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsFsAddPost(coluuid, content, path, callback) {
      
      let postBody = null;
      // verify the required parameter 'coluuid' is set
      if (coluuid === undefined || coluuid === null) {
        throw new Error("Missing the required parameter 'coluuid' when calling collectionsFsAddPost");
      }
      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling collectionsFsAddPost");
      }
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling collectionsFsAddPost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'coluuid': coluuid,'content': content,'path': path
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
        '/collections/fs/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsGet operation.
     * @callback moduleapi/CollectionsApi~collectionsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<[CollectionsCollection]>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all collections
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     * @param {module:api/CollectionsApi~collectionsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsGet(callback) {
      
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
      let returnType = [[CollectionsCollection]];

      return this.apiClient.callApi(
        '/collections/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the collectionsPost operation.
     * @callback moduleapi/CollectionsApi~collectionsPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CollectionsCollection{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new collection
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     * @param {module:model/MainCreateCollectionBody} body Collection name and description
     * @param {module:api/CollectionsApi~collectionsPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    collectionsPost(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling collectionsPost");
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
      let returnType = CollectionsCollection;

      return this.apiClient.callApi(
        '/collections/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}