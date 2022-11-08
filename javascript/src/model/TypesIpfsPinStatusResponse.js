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
    define(['ApiClient', 'model/TypesIpfsPin'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TypesIpfsPin'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryClient) {
      root.EstuaryClient = {};
    }
    root.EstuaryClient.TypesIpfsPinStatusResponse = factory(root.EstuaryClient.ApiClient, root.EstuaryClient.TypesIpfsPin);
  }
}(this, function(ApiClient, TypesIpfsPin) {
  'use strict';

  /**
   * The TypesIpfsPinStatusResponse model module.
   * @module model/TypesIpfsPinStatusResponse
   * @version 1.0.3
   */

  /**
   * Constructs a new <code>TypesIpfsPinStatusResponse</code>.
   * @alias module:model/TypesIpfsPinStatusResponse
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>TypesIpfsPinStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TypesIpfsPinStatusResponse} obj Optional instance to populate.
   * @return {module:model/TypesIpfsPinStatusResponse} The populated <code>TypesIpfsPinStatusResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('created'))
        obj.created = ApiClient.convertToType(data['created'], 'String');
      if (data.hasOwnProperty('delegates'))
        obj.delegates = ApiClient.convertToType(data['delegates'], ['String']);
      if (data.hasOwnProperty('info'))
        obj.info = ApiClient.convertToType(data['info'], Object);
      if (data.hasOwnProperty('pin'))
        obj.pin = TypesIpfsPin.constructFromObject(data['pin']);
      if (data.hasOwnProperty('requestid'))
        obj.requestid = ApiClient.convertToType(data['requestid'], 'String');
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} created
   */
  exports.prototype.created = undefined;

  /**
   * @member {Array.<String>} delegates
   */
  exports.prototype.delegates = undefined;

  /**
   * @member {Object} info
   */
  exports.prototype.info = undefined;

  /**
   * @member {module:model/TypesIpfsPin} pin
   */
  exports.prototype.pin = undefined;

  /**
   * @member {String} requestid
   */
  exports.prototype.requestid = undefined;

  /**
   * @member {String} status
   */
  exports.prototype.status = undefined;


  return exports;

}));
