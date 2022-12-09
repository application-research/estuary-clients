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
import {AddressAddress} from './AddressAddress';

/**
 * The MinerClaimMinerBody model module.
 * @module model/MinerClaimMinerBody
 * @version 1.0.6
 */
export class MinerClaimMinerBody {
  /**
   * Constructs a new <code>MinerClaimMinerBody</code>.
   * @alias module:model/MinerClaimMinerBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MinerClaimMinerBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MinerClaimMinerBody} obj Optional instance to populate.
   * @return {module:model/MinerClaimMinerBody} The populated <code>MinerClaimMinerBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MinerClaimMinerBody();
      if (data.hasOwnProperty('claim'))
        obj.claim = ApiClient.convertToType(data['claim'], 'String');
      if (data.hasOwnProperty('miner'))
        obj.miner = AddressAddress.constructFromObject(data['miner']);
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} claim
 */
MinerClaimMinerBody.prototype.claim = undefined;

/**
 * @member {module:model/AddressAddress} miner
 */
MinerClaimMinerBody.prototype.miner = undefined;

/**
 * @member {String} name
 */
MinerClaimMinerBody.prototype.name = undefined;

