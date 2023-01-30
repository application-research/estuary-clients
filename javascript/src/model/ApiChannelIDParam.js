/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.39
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The ApiChannelIDParam model module.
 * @module model/ApiChannelIDParam
 * @version 1.0.6
 */
export class ApiChannelIDParam {
  /**
   * Constructs a new <code>ApiChannelIDParam</code>.
   * @alias module:model/ApiChannelIDParam
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ApiChannelIDParam</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ApiChannelIDParam} obj Optional instance to populate.
   * @return {module:model/ApiChannelIDParam} The populated <code>ApiChannelIDParam</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ApiChannelIDParam();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('initiator'))
        obj.initiator = ApiClient.convertToType(data['initiator'], 'String');
      if (data.hasOwnProperty('responder'))
        obj.responder = ApiClient.convertToType(data['responder'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
ApiChannelIDParam.prototype.id = undefined;

/**
 * @member {String} initiator
 */
ApiChannelIDParam.prototype.initiator = undefined;

/**
 * @member {String} responder
 */
ApiChannelIDParam.prototype.responder = undefined;

