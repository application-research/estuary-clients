/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.37
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * Enum class TypesPinningStatus.
 * @enum {String}
 * @readonly
 */
const TypesPinningStatus = {
  /**
   * value: "pinning"
   * @const
   */
  pinning: "pinning",

  /**
   * value: "pinned"
   * @const
   */
  pinned: "pinned",

  /**
   * value: "failed"
   * @const
   */
  failed: "failed",

  /**
   * value: "queued"
   * @const
   */
  queued: "queued",

  /**
   * value: "offloaded"
   * @const
   */
  offloaded: "offloaded",

  /**
   * Returns a <code>TypesPinningStatus</code> enum value from a JavaScript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
  * @return {module:model/TypesPinningStatus} The enum <code>TypesPinningStatus</code> value.
   */
  constructFromObject: function(object) {
    return object;
  }
};

export {TypesPinningStatus};