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
import {ApiClient} from '../ApiClient';

/**
 * The ApiDeleteContentFromCollectionBody model module.
 * @module model/ApiDeleteContentFromCollectionBody
 * @version 1.0.6
 */
export class ApiDeleteContentFromCollectionBody {
  /**
   * Constructs a new <code>ApiDeleteContentFromCollectionBody</code>.
   * @alias module:model/ApiDeleteContentFromCollectionBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ApiDeleteContentFromCollectionBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ApiDeleteContentFromCollectionBody} obj Optional instance to populate.
   * @return {module:model/ApiDeleteContentFromCollectionBody} The populated <code>ApiDeleteContentFromCollectionBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ApiDeleteContentFromCollectionBody();
      if (data.hasOwnProperty('by'))
        obj.by = ApiClient.convertToType(data['by'], 'String');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} by
 */
ApiDeleteContentFromCollectionBody.prototype.by = undefined;

/**
 * @member {String} value
 */
ApiDeleteContentFromCollectionBody.prototype.value = undefined;

