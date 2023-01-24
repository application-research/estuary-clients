/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.38
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The UtilHttpError model module.
 * @module model/UtilHttpError
 * @version 1.0.6
 */
export class UtilHttpError {
  /**
   * Constructs a new <code>UtilHttpError</code>.
   * @alias module:model/UtilHttpError
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>UtilHttpError</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilHttpError} obj Optional instance to populate.
   * @return {module:model/UtilHttpError} The populated <code>UtilHttpError</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UtilHttpError();
      if (data.hasOwnProperty('code'))
        obj.code = ApiClient.convertToType(data['code'], 'Number');
      if (data.hasOwnProperty('details'))
        obj.details = ApiClient.convertToType(data['details'], 'String');
      if (data.hasOwnProperty('reason'))
        obj.reason = ApiClient.convertToType(data['reason'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} code
 */
UtilHttpError.prototype.code = undefined;

/**
 * @member {String} details
 */
UtilHttpError.prototype.details = undefined;

/**
 * @member {String} reason
 */
UtilHttpError.prototype.reason = undefined;

