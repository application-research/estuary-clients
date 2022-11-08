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
    root.EstuaryClient.UtilHttpError = factory(root.EstuaryClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The UtilHttpError model module.
   * @module model/UtilHttpError
   * @version 1.0.3
   */

  /**
   * Constructs a new <code>UtilHttpError</code>.
   * @alias module:model/UtilHttpError
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>UtilHttpError</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilHttpError} obj Optional instance to populate.
   * @return {module:model/UtilHttpError} The populated <code>UtilHttpError</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('code'))
        obj.code = ApiClient.convertToType(data['code'], 'Number');
      if (data.hasOwnProperty('details'))
        obj.details = ApiClient.convertToType(data['details'], 'String');
      if (data.hasOwnProperty('reason'))
        obj.reason = ApiClient.convertToType(data['reason'], 'String');
    }
    return obj;
  }

  /**
   * @member {Number} code
   */
  exports.prototype.code = undefined;

  /**
   * @member {String} details
   */
  exports.prototype.details = undefined;

  /**
   * @member {String} reason
   */
  exports.prototype.reason = undefined;


  return exports;

}));
