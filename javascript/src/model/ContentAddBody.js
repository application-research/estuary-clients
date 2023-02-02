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
 * The ContentAddBody model module.
 * @module model/ContentAddBody
 * @version 1.0.6
 */
export class ContentAddBody {
  /**
   * Constructs a new <code>ContentAddBody</code>.
   * @alias module:model/ContentAddBody
   * @class
   * @param data {Blob} File to upload
   */
  constructor(data) {
    this.data = data;
  }

  /**
   * Constructs a <code>ContentAddBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ContentAddBody} obj Optional instance to populate.
   * @return {module:model/ContentAddBody} The populated <code>ContentAddBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new ContentAddBody();
      if (data.hasOwnProperty('data'))
        obj.data = ApiClient.convertToType(data['data'], 'Blob');
      if (data.hasOwnProperty('filename'))
        obj.filename = ApiClient.convertToType(data['filename'], 'String');
    }
    return obj;
  }
}

/**
 * File to upload
 * @member {Blob} data
 */
ContentAddBody.prototype.data = undefined;

/**
 * Filename to use for upload
 * @member {String} filename
 */
ContentAddBody.prototype.filename = undefined;

