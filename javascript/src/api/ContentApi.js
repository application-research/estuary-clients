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
import {PinnerIpfsPin} from '../model/PinnerIpfsPin';
import {UtilContentAddResponse} from '../model/UtilContentAddResponse';
import {UtilContentCreateBody} from '../model/UtilContentCreateBody';
import {UtilHttpError} from '../model/UtilHttpError';

/**
* Content service.
* @module api/ContentApi
* @version 1.0.6
*/
export class ContentApi {

    /**
    * Constructs a new ContentApi. 
    * @alias module:api/ContentApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the adminInvitesCodePost operation.
     * @callback moduleapi/ContentApi~adminInvitesCodePostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an Estuary invite
     * This endpoint is used to create an estuary invite.
     * @param {String} code Invite code to be created
     * @param {module:api/ContentApi~adminInvitesCodePostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminInvitesCodePost(code, callback) {
      
      let postBody = null;
      // verify the required parameter 'code' is set
      if (code === undefined || code === null) {
        throw new Error("Missing the required parameter 'code' when calling adminInvitesCodePost");
      }

      let pathParams = {
        'code': code
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
        '/admin/invites/{code}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the adminInvitesGet operation.
     * @callback moduleapi/ContentApi~adminInvitesGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Estuary invites
     * This endpoint is used to list all estuary invites.
     * @param {module:api/ContentApi~adminInvitesGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    adminInvitesGet(callback) {
      
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
        '/admin/invites', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentAddCarPost operation.
     * @callback moduleapi/ContentApi~contentAddCarPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UtilContentAddResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add Car object
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     * @param {String} body Car
     * @param {Object} opts Optional parameters
     * @param {String} opts.ignoreDupes Ignore Dupes
     * @param {String} opts.filename Filename
     * @param {module:api/ContentApi~contentAddCarPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentAddCarPost(body, opts, callback) {
      opts = opts || {};
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentAddCarPost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'ignore-dupes': opts['ignoreDupes'],'filename': opts['filename']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['*/*'];
      let accepts = ['application/json'];
      let returnType = UtilContentAddResponse;

      return this.apiClient.callApi(
        '/content/add-car', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentAddIpfsPost operation.
     * @callback moduleapi/ContentApi~contentAddIpfsPostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add IPFS object
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     * @param {module:model/PinnerIpfsPin} body IPFS Body
     * @param {Object} opts Optional parameters
     * @param {String} opts.ignoreDupes Ignore Dupes
     * @param {String} opts.overwrite Overwrite conflicting files in collections
     * @param {module:api/ContentApi~contentAddIpfsPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentAddIpfsPost(body, opts, callback) {
      opts = opts || {};
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentAddIpfsPost");
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
      let contentTypes = ['*/*'];
      let accepts = ['application/json'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/content/add-ipfs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentAddPost operation.
     * @callback moduleapi/ContentApi~contentAddPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UtilContentAddResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add new content
     * This endpoint is used to upload new content.
     * @param {Blob} data 
     * @param {String} filename 
     * @param {Object} opts Optional parameters
     * @param {String} opts.coluuid Collection UUID
     * @param {Number} opts.replication Replication value
     * @param {String} opts.ignoreDupes Ignore Dupes true/false
     * @param {String} opts.overwrite Overwrite files with the same path on same collection
     * @param {String} opts.lazyProvide Lazy Provide true/false
     * @param {String} opts.dir Directory
     * @param {module:api/ContentApi~contentAddPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentAddPost(data, filename, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'data' is set
      if (data === undefined || data === null) {
        throw new Error("Missing the required parameter 'data' when calling contentAddPost");
      }
      // verify the required parameter 'filename' is set
      if (filename === undefined || filename === null) {
        throw new Error("Missing the required parameter 'filename' when calling contentAddPost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'coluuid': opts['coluuid'],'replication': opts['replication'],'ignore-dupes': opts['ignoreDupes'],'overwrite': opts['overwrite'],'lazy-provide': opts['lazyProvide'],'dir': opts['dir']
      };
      let headerParams = {
        
      };
      let formParams = {
        'data': data,'filename': filename
      };

      let authNames = ['bearerAuth'];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json'];
      let returnType = UtilContentAddResponse;

      return this.apiClient.callApi(
        '/content/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentAggregatedContentGet operation.
     * @callback moduleapi/ContentApi~contentAggregatedContentGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get aggregated content stats
     * This endpoint returns aggregated content stats
     * @param {String} content Content ID
     * @param {module:api/ContentApi~contentAggregatedContentGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentAggregatedContentGet(content, callback) {
      
      let postBody = null;
      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling contentAggregatedContentGet");
      }

      let pathParams = {
        'content': content
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
        '/content/aggregated/{content}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentAllDealsGet operation.
     * @callback moduleapi/ContentApi~contentAllDealsGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all deals for a user
     * This endpoint is used to get all deals for a user
     * @param {String} begin Begin
     * @param {String} duration Duration
     * @param {String} all All
     * @param {module:api/ContentApi~contentAllDealsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentAllDealsGet(begin, duration, all, callback) {
      
      let postBody = null;
      // verify the required parameter 'begin' is set
      if (begin === undefined || begin === null) {
        throw new Error("Missing the required parameter 'begin' when calling contentAllDealsGet");
      }
      // verify the required parameter 'duration' is set
      if (duration === undefined || duration === null) {
        throw new Error("Missing the required parameter 'duration' when calling contentAllDealsGet");
      }
      // verify the required parameter 'all' is set
      if (all === undefined || all === null) {
        throw new Error("Missing the required parameter 'all' when calling contentAllDealsGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'begin': begin,'duration': duration,'all': all
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
        '/content/all-deals', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentBwUsageContentGet operation.
     * @callback moduleapi/ContentApi~contentBwUsageContentGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get content bandwidth
     * This endpoint returns content bandwidth
     * @param {String} content Content ID
     * @param {module:api/ContentApi~contentBwUsageContentGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentBwUsageContentGet(content, callback) {
      
      let postBody = null;
      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling contentBwUsageContentGet");
      }

      let pathParams = {
        'content': content
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
        '/content/bw-usage/{content}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentContentsGet operation.
     * @callback moduleapi/ContentApi~contentContentsGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get user contents
     * This endpoint is used to get user contents
     * @param {String} limit limit
     * @param {String} offset offset
     * @param {module:api/ContentApi~contentContentsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentContentsGet(limit, offset, callback) {
      
      let postBody = null;
      // verify the required parameter 'limit' is set
      if (limit === undefined || limit === null) {
        throw new Error("Missing the required parameter 'limit' when calling contentContentsGet");
      }
      // verify the required parameter 'offset' is set
      if (offset === undefined || offset === null) {
        throw new Error("Missing the required parameter 'offset' when calling contentContentsGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'limit': limit,'offset': offset
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
        '/content/contents', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentCreatePost operation.
     * @callback moduleapi/ContentApi~contentCreatePostCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a new content
     * This endpoint adds a new content
     * @param {module:model/UtilContentCreateBody} body Content
     * @param {Object} opts Optional parameters
     * @param {String} opts.ignoreDupes Ignore Dupes
     * @param {module:api/ContentApi~contentCreatePostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentCreatePost(body, opts, callback) {
      opts = opts || {};
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling contentCreatePost");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'ignore-dupes': opts['ignoreDupes']
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
        '/content/create', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentDealsGet operation.
     * @callback moduleapi/ContentApi~contentDealsGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Content with deals
     * This endpoint lists all content with deals
     * @param {Object} opts Optional parameters
     * @param {Number} opts.limit Limit
     * @param {Number} opts.offset Offset
     * @param {module:api/ContentApi~contentDealsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentDealsGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        'limit': opts['limit'],'offset': opts['offset']
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
        '/content/deals', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentEnsureReplicationDatacidGet operation.
     * @callback moduleapi/ContentApi~contentEnsureReplicationDatacidGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Ensure Replication
     * This endpoint ensures that the content is replicated to the specified number of providers
     * @param {String} datacid Data CID
     * @param {module:api/ContentApi~contentEnsureReplicationDatacidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentEnsureReplicationDatacidGet(datacid, callback) {
      
      let postBody = null;
      // verify the required parameter 'datacid' is set
      if (datacid === undefined || datacid === null) {
        throw new Error("Missing the required parameter 'datacid' when calling contentEnsureReplicationDatacidGet");
      }

      let pathParams = {
        'datacid': datacid
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
        '/content/ensure-replication/{datacid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentFailuresContentGet operation.
     * @callback moduleapi/ContentApi~contentFailuresContentGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all failures for a content
     * This endpoint returns all failures for a content
     * @param {String} content Content ID
     * @param {module:api/ContentApi~contentFailuresContentGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentFailuresContentGet(content, callback) {
      
      let postBody = null;
      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling contentFailuresContentGet");
      }

      let pathParams = {
        'content': content
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
        '/content/failures/{content}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentIdGet operation.
     * @callback moduleapi/ContentApi~contentIdGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Content
     * This endpoint returns a content by its ID
     * @param {Number} id Content ID
     * @param {module:api/ContentApi~contentIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentIdGet(id, callback) {
      
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling contentIdGet");
      }

      let pathParams = {
        'id': id
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
        '/content/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentListGet operation.
     * @callback moduleapi/ContentApi~contentListGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all pinned content
     * This endpoint lists all content
     * @param {module:api/ContentApi~contentListGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentListGet(callback) {
      
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
        '/content/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentStagingZonesGet operation.
     * @callback moduleapi/ContentApi~contentStagingZonesGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get staging zone for user, excluding its contents
     * This endpoint is used to get staging zone for user, excluding its contents.
     * @param {module:api/ContentApi~contentStagingZonesGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentStagingZonesGet(callback) {
      
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
        '/content/staging-zones', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentStagingZonesStagingZoneContentsGet operation.
     * @callback moduleapi/ContentApi~contentStagingZonesStagingZoneContentsGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get contents for a staging zone
     * This endpoint is used to get the contents for a staging zone
     * @param {Number} stagingZone Staging Zone Content ID
     * @param {String} limit limit
     * @param {String} offset offset
     * @param {module:api/ContentApi~contentStagingZonesStagingZoneContentsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentStagingZonesStagingZoneContentsGet(stagingZone, limit, offset, callback) {
      
      let postBody = null;
      // verify the required parameter 'stagingZone' is set
      if (stagingZone === undefined || stagingZone === null) {
        throw new Error("Missing the required parameter 'stagingZone' when calling contentStagingZonesStagingZoneContentsGet");
      }
      // verify the required parameter 'limit' is set
      if (limit === undefined || limit === null) {
        throw new Error("Missing the required parameter 'limit' when calling contentStagingZonesStagingZoneContentsGet");
      }
      // verify the required parameter 'offset' is set
      if (offset === undefined || offset === null) {
        throw new Error("Missing the required parameter 'offset' when calling contentStagingZonesStagingZoneContentsGet");
      }

      let pathParams = {
        'staging_zone': stagingZone
      };
      let queryParams = {
        'limit': limit,'offset': offset
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
        '/content/staging-zones/{staging_zone}/contents', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentStagingZonesStagingZoneGet operation.
     * @callback moduleapi/ContentApi~contentStagingZonesStagingZoneGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get staging zone without its contents field populated
     * This endpoint is used to get a staging zone, excluding its contents.
     * @param {Number} stagingZone Staging Zone Content ID
     * @param {module:api/ContentApi~contentStagingZonesStagingZoneGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentStagingZonesStagingZoneGet(stagingZone, callback) {
      
      let postBody = null;
      // verify the required parameter 'stagingZone' is set
      if (stagingZone === undefined || stagingZone === null) {
        throw new Error("Missing the required parameter 'stagingZone' when calling contentStagingZonesStagingZoneGet");
      }

      let pathParams = {
        'staging_zone': stagingZone
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
        '/content/staging-zones/{staging_zone}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentStatsGet operation.
     * @callback moduleapi/ContentApi~contentStatsGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get content statistics
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
     * @param {String} limit limit
     * @param {String} offset offset
     * @param {module:api/ContentApi~contentStatsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentStatsGet(limit, offset, callback) {
      
      let postBody = null;
      // verify the required parameter 'limit' is set
      if (limit === undefined || limit === null) {
        throw new Error("Missing the required parameter 'limit' when calling contentStatsGet");
      }
      // verify the required parameter 'offset' is set
      if (offset === undefined || offset === null) {
        throw new Error("Missing the required parameter 'offset' when calling contentStatsGet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'limit': limit,'offset': offset
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
        '/content/stats', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the contentStatusIdGet operation.
     * @callback moduleapi/ContentApi~contentStatusIdGetCallback
     * @param {String} error Error message, if any.
     * @param {'String'{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Content Status
     * This endpoint returns the status of a content
     * @param {Number} id Content ID
     * @param {module:api/ContentApi~contentStatusIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    contentStatusIdGet(id, callback) {
      
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling contentStatusIdGet");
      }

      let pathParams = {
        'id': id
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
        '/content/status/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}