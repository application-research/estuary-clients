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
import {PinnerIpfsPinStatusResponse} from './PinnerIpfsPinStatusResponse';

/**
 * The PinnerIpfsListPinStatusResponse model module.
 * @module model/PinnerIpfsListPinStatusResponse
 * @version 1.0.6
 */
export class PinnerIpfsListPinStatusResponse {
  /**
   * Constructs a new <code>PinnerIpfsListPinStatusResponse</code>.
   * @alias module:model/PinnerIpfsListPinStatusResponse
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PinnerIpfsListPinStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PinnerIpfsListPinStatusResponse} obj Optional instance to populate.
   * @return {module:model/PinnerIpfsListPinStatusResponse} The populated <code>PinnerIpfsListPinStatusResponse</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PinnerIpfsListPinStatusResponse();
      if (data.hasOwnProperty('count'))
        obj.count = ApiClient.convertToType(data['count'], 'Number');
      if (data.hasOwnProperty('results'))
        obj.results = ApiClient.convertToType(data['results'], [PinnerIpfsPinStatusResponse]);
    }
    return obj;
  }
}

/**
 * @member {Number} count
 */
PinnerIpfsListPinStatusResponse.prototype.count = undefined;

/**
 * @member {Array.<module:model/PinnerIpfsPinStatusResponse>} results
 */
PinnerIpfsListPinStatusResponse.prototype.results = undefined;

