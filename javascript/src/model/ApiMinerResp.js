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
import {AddressAddress} from './AddressAddress';
import {MinerMinerChainInfo} from './MinerMinerChainInfo';

/**
 * The ApiMinerResp model module.
 * @module model/ApiMinerResp
 * @version 1.0.6
 */
export class ApiMinerResp {
  /**
   * Constructs a new <code>ApiMinerResp</code>.
   * @alias module:model/ApiMinerResp
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>ApiMinerResp</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ApiMinerResp} obj Optional instance to populate.
   * @return {module:model/ApiMinerResp} The populated <code>ApiMinerResp</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ApiMinerResp();
      if (data.hasOwnProperty('addr'))
        obj.addr = AddressAddress.constructFromObject(data['addr']);
      if (data.hasOwnProperty('chain_info'))
        obj.chainInfo = MinerMinerChainInfo.constructFromObject(data['chain_info']);
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('suspended'))
        obj.suspended = ApiClient.convertToType(data['suspended'], 'Boolean');
      if (data.hasOwnProperty('suspendedReason'))
        obj.suspendedReason = ApiClient.convertToType(data['suspendedReason'], 'String');
      if (data.hasOwnProperty('version'))
        obj.version = ApiClient.convertToType(data['version'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/AddressAddress} addr
 */
ApiMinerResp.prototype.addr = undefined;

/**
 * @member {module:model/MinerMinerChainInfo} chainInfo
 */
ApiMinerResp.prototype.chainInfo = undefined;

/**
 * @member {String} name
 */
ApiMinerResp.prototype.name = undefined;

/**
 * @member {Boolean} suspended
 */
ApiMinerResp.prototype.suspended = undefined;

/**
 * @member {String} suspendedReason
 */
ApiMinerResp.prototype.suspendedReason = undefined;

/**
 * @member {String} version
 */
ApiMinerResp.prototype.version = undefined;

