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
 * The MinerMinerSetInfoParams model module.
 * @module model/MinerMinerSetInfoParams
 * @version 1.0.6
 */
export class MinerMinerSetInfoParams {
  /**
   * Constructs a new <code>MinerMinerSetInfoParams</code>.
   * @alias module:model/MinerMinerSetInfoParams
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MinerMinerSetInfoParams</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MinerMinerSetInfoParams} obj Optional instance to populate.
   * @return {module:model/MinerMinerSetInfoParams} The populated <code>MinerMinerSetInfoParams</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MinerMinerSetInfoParams();
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} name
 */
MinerMinerSetInfoParams.prototype.name = undefined;

