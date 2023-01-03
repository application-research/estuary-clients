/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.36
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The ApiEmptyResp model module.
 * @module model/ApiEmptyResp
 * @version 1.0.6
 */
export class ApiEmptyResp {
  /**
   * Constructs a new <code>ApiEmptyResp</code>.
   * @alias module:model/ApiEmptyResp
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ApiEmptyResp</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ApiEmptyResp} obj Optional instance to populate.
   * @return {module:model/ApiEmptyResp} The populated <code>ApiEmptyResp</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ApiEmptyResp();
    }
    return obj;
  }
}
