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
import {UtilUserSettings} from './UtilUserSettings';

/**
 * The UtilViewerResponse model module.
 * @module model/UtilViewerResponse
 * @version 1.0.6
 */
export class UtilViewerResponse {
  /**
   * Constructs a new <code>UtilViewerResponse</code>.
   * @alias module:model/UtilViewerResponse
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>UtilViewerResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilViewerResponse} obj Optional instance to populate.
   * @return {module:model/UtilViewerResponse} The populated <code>UtilViewerResponse</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UtilViewerResponse();
      if (data.hasOwnProperty('address'))
        obj.address = ApiClient.convertToType(data['address'], 'String');
      if (data.hasOwnProperty('auth_expiry'))
        obj.authExpiry = ApiClient.convertToType(data['auth_expiry'], 'String');
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('miners'))
        obj.miners = ApiClient.convertToType(data['miners'], ['String']);
      if (data.hasOwnProperty('perms'))
        obj.perms = ApiClient.convertToType(data['perms'], 'Number');
      if (data.hasOwnProperty('settings'))
        obj.settings = UtilUserSettings.constructFromObject(data['settings']);
      if (data.hasOwnProperty('username'))
        obj.username = ApiClient.convertToType(data['username'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} address
 */
UtilViewerResponse.prototype.address = undefined;

/**
 * @member {String} authExpiry
 */
UtilViewerResponse.prototype.authExpiry = undefined;

/**
 * @member {Number} id
 */
UtilViewerResponse.prototype.id = undefined;

/**
 * @member {Array.<String>} miners
 */
UtilViewerResponse.prototype.miners = undefined;

/**
 * @member {Number} perms
 */
UtilViewerResponse.prototype.perms = undefined;

/**
 * @member {module:model/UtilUserSettings} settings
 */
UtilViewerResponse.prototype.settings = undefined;

/**
 * @member {String} username
 */
UtilViewerResponse.prototype.username = undefined;

