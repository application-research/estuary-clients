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
 * The UtilContentAddResponse model module.
 * @module model/UtilContentAddResponse
 * @version 1.0.6
 */
export class UtilContentAddResponse {
  /**
   * Constructs a new <code>UtilContentAddResponse</code>.
   * @alias module:model/UtilContentAddResponse
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>UtilContentAddResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilContentAddResponse} obj Optional instance to populate.
   * @return {module:model/UtilContentAddResponse} The populated <code>UtilContentAddResponse</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UtilContentAddResponse();
      if (data.hasOwnProperty('cid'))
        obj.cid = ApiClient.convertToType(data['cid'], 'String');
      if (data.hasOwnProperty('estuaryId'))
        obj.estuaryId = ApiClient.convertToType(data['estuaryId'], 'Number');
      if (data.hasOwnProperty('estuary_retrieval_url'))
        obj.estuaryRetrievalUrl = ApiClient.convertToType(data['estuary_retrieval_url'], 'String');
      if (data.hasOwnProperty('providers'))
        obj.providers = ApiClient.convertToType(data['providers'], ['String']);
      if (data.hasOwnProperty('retrieval_url'))
        obj.retrievalUrl = ApiClient.convertToType(data['retrieval_url'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} cid
 */
UtilContentAddResponse.prototype.cid = undefined;

/**
 * @member {Number} estuaryId
 */
UtilContentAddResponse.prototype.estuaryId = undefined;

/**
 * @member {String} estuaryRetrievalUrl
 */
UtilContentAddResponse.prototype.estuaryRetrievalUrl = undefined;

/**
 * @member {Array.<String>} providers
 */
UtilContentAddResponse.prototype.providers = undefined;

/**
 * @member {String} retrievalUrl
 */
UtilContentAddResponse.prototype.retrievalUrl = undefined;

