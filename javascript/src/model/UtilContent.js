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
import {UtilContentType} from './UtilContentType';
import {UtilDbCID} from './UtilDbCID';

/**
 * The UtilContent model module.
 * @module model/UtilContent
 * @version 1.0.6
 */
export class UtilContent {
  /**
   * Constructs a new <code>UtilContent</code>.
   * @alias module:model/UtilContent
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>UtilContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UtilContent} obj Optional instance to populate.
   * @return {module:model/UtilContent} The populated <code>UtilContent</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new UtilContent();
      if (data.hasOwnProperty('active'))
        obj.active = ApiClient.convertToType(data['active'], 'Boolean');
      if (data.hasOwnProperty('aggregate'))
        obj.aggregate = ApiClient.convertToType(data['aggregate'], 'Boolean');
      if (data.hasOwnProperty('aggregatedIn'))
        obj.aggregatedIn = ApiClient.convertToType(data['aggregatedIn'], 'Number');
      if (data.hasOwnProperty('cid'))
        obj.cid = UtilDbCID.constructFromObject(data['cid']);
      if (data.hasOwnProperty('createdAt'))
        obj.createdAt = ApiClient.convertToType(data['createdAt'], 'String');
      if (data.hasOwnProperty('dagSplit'))
        obj.dagSplit = ApiClient.convertToType(data['dagSplit'], 'Boolean');
      if (data.hasOwnProperty('dealStatus'))
        obj.dealStatus = ApiClient.convertToType(data['dealStatus'], 'String');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('failed'))
        obj.failed = ApiClient.convertToType(data['failed'], 'Boolean');
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('location'))
        obj.location = ApiClient.convertToType(data['location'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('offloaded'))
        obj.offloaded = ApiClient.convertToType(data['offloaded'], 'Boolean');
      if (data.hasOwnProperty('origins'))
        obj.origins = ApiClient.convertToType(data['origins'], 'String');
      if (data.hasOwnProperty('pinMeta'))
        obj.pinMeta = ApiClient.convertToType(data['pinMeta'], 'String');
      if (data.hasOwnProperty('pinning'))
        obj.pinning = ApiClient.convertToType(data['pinning'], 'Boolean');
      if (data.hasOwnProperty('pinningStatus'))
        obj.pinningStatus = ApiClient.convertToType(data['pinningStatus'], 'String');
      if (data.hasOwnProperty('replace'))
        obj.replace = ApiClient.convertToType(data['replace'], 'Boolean');
      if (data.hasOwnProperty('replication'))
        obj.replication = ApiClient.convertToType(data['replication'], 'Number');
      if (data.hasOwnProperty('size'))
        obj.size = ApiClient.convertToType(data['size'], 'Number');
      if (data.hasOwnProperty('splitFrom'))
        obj.splitFrom = ApiClient.convertToType(data['splitFrom'], 'Number');
      if (data.hasOwnProperty('type'))
        obj.type = UtilContentType.constructFromObject(data['type']);
      if (data.hasOwnProperty('updatedAt'))
        obj.updatedAt = ApiClient.convertToType(data['updatedAt'], 'String');
      if (data.hasOwnProperty('userId'))
        obj.userId = ApiClient.convertToType(data['userId'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {Boolean} active
 */
UtilContent.prototype.active = undefined;

/**
 * @member {Boolean} aggregate
 */
UtilContent.prototype.aggregate = undefined;

/**
 * TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
 * @member {Number} aggregatedIn
 */
UtilContent.prototype.aggregatedIn = undefined;

/**
 * @member {module:model/UtilDbCID} cid
 */
UtilContent.prototype.cid = undefined;

/**
 * @member {String} createdAt
 */
UtilContent.prototype.createdAt = undefined;

/**
 * If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
 * @member {Boolean} dagSplit
 */
UtilContent.prototype.dagSplit = undefined;

/**
 * @member {String} dealStatus
 */
UtilContent.prototype.dealStatus = undefined;

/**
 * @member {String} description
 */
UtilContent.prototype.description = undefined;

/**
 * @member {Boolean} failed
 */
UtilContent.prototype.failed = undefined;

/**
 * @member {Number} id
 */
UtilContent.prototype.id = undefined;

/**
 * @member {String} location
 */
UtilContent.prototype.location = undefined;

/**
 * @member {String} name
 */
UtilContent.prototype.name = undefined;

/**
 * @member {Boolean} offloaded
 */
UtilContent.prototype.offloaded = undefined;

/**
 * @member {String} origins
 */
UtilContent.prototype.origins = undefined;

/**
 * @member {String} pinMeta
 */
UtilContent.prototype.pinMeta = undefined;

/**
 * @member {Boolean} pinning
 */
UtilContent.prototype.pinning = undefined;

/**
 * @member {String} pinningStatus
 */
UtilContent.prototype.pinningStatus = undefined;

/**
 * @member {Boolean} replace
 */
UtilContent.prototype.replace = undefined;

/**
 * @member {Number} replication
 */
UtilContent.prototype.replication = undefined;

/**
 * @member {Number} size
 */
UtilContent.prototype.size = undefined;

/**
 * @member {Number} splitFrom
 */
UtilContent.prototype.splitFrom = undefined;

/**
 * @member {module:model/UtilContentType} type
 */
UtilContent.prototype.type = undefined;

/**
 * @member {String} updatedAt
 */
UtilContent.prototype.updatedAt = undefined;

/**
 * @member {Number} userId
 */
UtilContent.prototype.userId = undefined;

