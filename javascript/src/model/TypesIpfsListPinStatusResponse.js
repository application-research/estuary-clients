/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.29
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/TypesIpfsPinStatusResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TypesIpfsPinStatusResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryClient) {
      root.EstuaryClient = {};
    }
    root.EstuaryClient.TypesIpfsListPinStatusResponse = factory(root.EstuaryClient.ApiClient, root.EstuaryClient.TypesIpfsPinStatusResponse);
  }
}(this, function(ApiClient, TypesIpfsPinStatusResponse) {
  'use strict';

  /**
   * The TypesIpfsListPinStatusResponse model module.
   * @module model/TypesIpfsListPinStatusResponse
   * @version 1.0.3
   */

  /**
   * Constructs a new <code>TypesIpfsListPinStatusResponse</code>.
   * @alias module:model/TypesIpfsListPinStatusResponse
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>TypesIpfsListPinStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TypesIpfsListPinStatusResponse} obj Optional instance to populate.
   * @return {module:model/TypesIpfsListPinStatusResponse} The populated <code>TypesIpfsListPinStatusResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('count'))
        obj.count = ApiClient.convertToType(data['count'], 'Number');
      if (data.hasOwnProperty('results'))
        obj.results = ApiClient.convertToType(data['results'], [TypesIpfsPinStatusResponse]);
    }
    return obj;
  }

  /**
   * @member {Number} count
   */
  exports.prototype.count = undefined;

  /**
   * @member {Array.<module:model/TypesIpfsPinStatusResponse>} results
   */
  exports.prototype.results = undefined;


  return exports;

}));
