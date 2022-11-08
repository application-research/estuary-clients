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
    root.EstuaryClient.UtilContentCreateBody = factory(root.EstuaryClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The UtilContentCreateBody model module.
   * @module model/UtilContentCreateBody
   * @version 1.0.3
   */

  /**
   * Constructs a new <code>UtilContentCreateBody</code>.
   * @alias module:model/UtilContentCreateBody
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>UtilContentCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilContentCreateBody} obj Optional instance to populate.
   * @return {module:model/UtilContentCreateBody} The populated <code>UtilContentCreateBody</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('coluuid'))
        obj.coluuid = ApiClient.convertToType(data['coluuid'], 'String');
      if (data.hasOwnProperty('dir'))
        obj.dir = ApiClient.convertToType(data['dir'], 'String');
      if (data.hasOwnProperty('location'))
        obj.location = ApiClient.convertToType(data['location'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('root'))
        obj.root = ApiClient.convertToType(data['root'], 'String');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'Number');
    }
    return obj;
  }

  /**
   * @member {String} coluuid
   */
  exports.prototype.coluuid = undefined;

  /**
   * @member {String} dir
   */
  exports.prototype.dir = undefined;

  /**
   * @member {String} location
   */
  exports.prototype.location = undefined;

  /**
   * @member {String} name
   */
  exports.prototype.name = undefined;

  /**
   * @member {String} root
   */
  exports.prototype.root = undefined;

  /**
   * @member {Number} type
   */
  exports.prototype.type = undefined;


  return exports;

}));
