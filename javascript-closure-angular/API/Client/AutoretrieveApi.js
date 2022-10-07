/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.AutoretrieveApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This is the API for the Estuary application.
 * Version: 0.0.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache 2.0 Apache-2.0 OR MIT
 * https://github.com/application-research/estuary/blob/master/LICENSE.md
 */

goog.provide('API.Client.AutoretrieveApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.AutoretrieveApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('AutoretrieveApiBasePath') ?
                   /** @type {!string} */ ($injector.get('AutoretrieveApiBasePath')) :
                   'https://api.estuary.tech';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('AutoretrieveApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('AutoretrieveApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.AutoretrieveApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Register autoretrieve server
 * This endpoint registers a new autoretrieve server
 * @param {!string} addresses Autoretrieve&#39;s comma-separated list of addresses
 * @param {!string} pubKey Autoretrieve&#39;s public key
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.AutoretrieveApi.prototype.adminAutoretrieveInitPost = function(addresses, pubKey, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/admin/autoretrieve/init';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'addresses' is set
  if (!addresses) {
    throw new Error('Missing required parameter addresses when calling adminAutoretrieveInitPost');
  }
  // verify required parameter 'pubKey' is set
  if (!pubKey) {
    throw new Error('Missing required parameter pubKey when calling adminAutoretrieveInitPost');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: pubKey,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * List autoretrieve servers
 * This endpoint lists all registered autoretrieve servers
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.AutoretrieveApi.prototype.adminAutoretrieveListGet = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/admin/autoretrieve/list';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Marks autoretrieve server as up
 * This endpoint updates the lastConnection field for autoretrieve
 * @param {!string} token Autoretrieve&#39;s auth token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.AutoretrieveApi.prototype.autoretrieveHeartbeatPost = function(token, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/autoretrieve/heartbeat';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'token' is set
  if (!token) {
    throw new Error('Missing required parameter token when calling autoretrieveHeartbeatPost');
  }
  headerParams['token'] = token;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}