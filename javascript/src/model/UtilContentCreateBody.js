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
 * The UtilContentCreateBody model module.
 * @module model/UtilContentCreateBody
 * @version 1.0.3
 */
export class UtilContentCreateBody {
  /**
   * Constructs a new <code>UtilContentCreateBody</code>.
   * @alias module:model/UtilContentCreateBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>UtilContentCreateBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilContentCreateBody} obj Optional instance to populate.
   * @return {module:model/UtilContentCreateBody} The populated <code>UtilContentCreateBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UtilContentCreateBody();
      if (data.hasOwnProperty('coluuid'))
        obj.coluuid = ApiClient.convertToType(data['coluuid'], 'String');
      if (data.hasOwnProperty('dir'))
        obj.dir = ApiClient.convertToType(data['dir'], 'String');
      if (data.hasOwnProperty('location'))
        obj.location = ApiClient.convertToType(data['location'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('root'))
        obj.root = ApiClient.convertToType(data['root'], 'String');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {String} coluuid
 */
UtilContentCreateBody.prototype.coluuid = undefined;

/**
 * @member {String} dir
 */
UtilContentCreateBody.prototype.dir = undefined;

/**
 * @member {String} location
 */
UtilContentCreateBody.prototype.location = undefined;

/**
 * @member {String} name
 */
UtilContentCreateBody.prototype.name = undefined;

/**
 * @member {String} root
 */
UtilContentCreateBody.prototype.root = undefined;

/**
 * @member {Number} type
 */
UtilContentCreateBody.prototype.type = undefined;

