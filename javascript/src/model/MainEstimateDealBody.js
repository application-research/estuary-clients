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
    root.EstuaryClient.MainEstimateDealBody = factory(root.EstuaryClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The MainEstimateDealBody model module.
   * @module model/MainEstimateDealBody
   * @version 0.0.0
   */

  /**
   * Constructs a new <code>MainEstimateDealBody</code>.
   * @alias module:model/MainEstimateDealBody
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>MainEstimateDealBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MainEstimateDealBody} obj Optional instance to populate.
   * @return {module:model/MainEstimateDealBody} The populated <code>MainEstimateDealBody</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('durationBlks'))
        obj.durationBlks = ApiClient.convertToType(data['durationBlks'], 'Number');
      if (data.hasOwnProperty('replication'))
        obj.replication = ApiClient.convertToType(data['replication'], 'Number');
      if (data.hasOwnProperty('size'))
        obj.size = ApiClient.convertToType(data['size'], 'Number');
      if (data.hasOwnProperty('verified'))
        obj.verified = ApiClient.convertToType(data['verified'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {Number} durationBlks
   */
  exports.prototype.durationBlks = undefined;

  /**
   * @member {Number} replication
   */
  exports.prototype.replication = undefined;

  /**
   * @member {Number} size
   */
  exports.prototype.size = undefined;

  /**
   * @member {Boolean} verified
   */
  exports.prototype.verified = undefined;


  return exports;

}));
