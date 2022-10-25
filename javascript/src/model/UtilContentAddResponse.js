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
    root.EstuaryClient.UtilContentAddResponse = factory(root.EstuaryClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The UtilContentAddResponse model module.
   * @module model/UtilContentAddResponse
   * @version 0.0.0
   */

  /**
   * Constructs a new <code>UtilContentAddResponse</code>.
   * @alias module:model/UtilContentAddResponse
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>UtilContentAddResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilContentAddResponse} obj Optional instance to populate.
   * @return {module:model/UtilContentAddResponse} The populated <code>UtilContentAddResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('cid'))
        obj.cid = ApiClient.convertToType(data['cid'], 'String');
      if (data.hasOwnProperty('estuaryId'))
        obj.estuaryId = ApiClient.convertToType(data['estuaryId'], 'Number');
      if (data.hasOwnProperty('providers'))
        obj.providers = ApiClient.convertToType(data['providers'], ['String']);
      if (data.hasOwnProperty('retrieval_url'))
        obj.retrievalUrl = ApiClient.convertToType(data['retrieval_url'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} cid
   */
  exports.prototype.cid = undefined;

  /**
   * @member {Number} estuaryId
   */
  exports.prototype.estuaryId = undefined;

  /**
   * @member {Array.<String>} providers
   */
  exports.prototype.providers = undefined;

  /**
   * @member {String} retrievalUrl
   */
  exports.prototype.retrievalUrl = undefined;


  return exports;

}));
