/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.39
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';
import {CollectionsCidType} from './CollectionsCidType';
import {UtilDbCID} from './UtilDbCID';

/**
 * The CollectionsCollectionListResponse model module.
 * @module model/CollectionsCollectionListResponse
 * @version 1.0.6
 */
export class CollectionsCollectionListResponse {
  /**
   * Constructs a new <code>CollectionsCollectionListResponse</code>.
   * @alias module:model/CollectionsCollectionListResponse
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CollectionsCollectionListResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CollectionsCollectionListResponse} obj Optional instance to populate.
   * @return {module:model/CollectionsCollectionListResponse} The populated <code>CollectionsCollectionListResponse</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CollectionsCollectionListResponse();
      if (data.hasOwnProperty('cid'))
        obj.cid = UtilDbCID.constructFromObject(data['cid']);
      if (data.hasOwnProperty('coluuid'))
        obj.coluuid = ApiClient.convertToType(data['coluuid'], 'String');
      if (data.hasOwnProperty('contId'))
        obj.contId = ApiClient.convertToType(data['contId'], 'Number');
      if (data.hasOwnProperty('dir'))
        obj.dir = ApiClient.convertToType(data['dir'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('size'))
        obj.size = ApiClient.convertToType(data['size'], 'Number');
      if (data.hasOwnProperty('type'))
        obj.type = CollectionsCidType.constructFromObject(data['type']);
      if (data.hasOwnProperty('updatedAt'))
        obj.updatedAt = ApiClient.convertToType(data['updatedAt'], 'String');
    }
    return obj;
  }
}

/**
 * @member {module:model/UtilDbCID} cid
 */
CollectionsCollectionListResponse.prototype.cid = undefined;

/**
 * @member {String} coluuid
 */
CollectionsCollectionListResponse.prototype.coluuid = undefined;

/**
 * @member {Number} contId
 */
CollectionsCollectionListResponse.prototype.contId = undefined;

/**
 * @member {String} dir
 */
CollectionsCollectionListResponse.prototype.dir = undefined;

/**
 * @member {String} name
 */
CollectionsCollectionListResponse.prototype.name = undefined;

/**
 * @member {Number} size
 */
CollectionsCollectionListResponse.prototype.size = undefined;

/**
 * @member {module:model/CollectionsCidType} type
 */
CollectionsCollectionListResponse.prototype.type = undefined;

/**
 * @member {String} updatedAt
 */
CollectionsCollectionListResponse.prototype.updatedAt = undefined;

