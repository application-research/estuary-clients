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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.EstuaryClient) {
      root.EstuaryClient = {};
    }
    root.EstuaryClient.MainUserStatsResponse = factory(root.EstuaryClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The MainUserStatsResponse model module.
   * @module model/MainUserStatsResponse
   * @version 0.0.0
   */

  /**
   * Constructs a new <code>MainUserStatsResponse</code>.
   * @alias module:model/MainUserStatsResponse
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>MainUserStatsResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MainUserStatsResponse} obj Optional instance to populate.
   * @return {module:model/MainUserStatsResponse} The populated <code>MainUserStatsResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('numPins'))
        obj.numPins = ApiClient.convertToType(data['numPins'], 'Number');
      if (data.hasOwnProperty('totalSize'))
        obj.totalSize = ApiClient.convertToType(data['totalSize'], 'Number');
    }
    return obj;
  }

  /**
   * @member {Number} numPins
   */
  exports.prototype.numPins = undefined;

  /**
   * @member {Number} totalSize
   */
  exports.prototype.totalSize = undefined;


  return exports;

}));
