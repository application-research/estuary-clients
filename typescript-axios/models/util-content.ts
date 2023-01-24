/* tslint:disable */
/* eslint-disable */
/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { UtilContentType } from './util-content-type';
import { UtilDbCID } from './util-db-cid';
/**
 * 
 * @export
 * @interface UtilContent
 */
export interface UtilContent {
    /**
     * 
     * @type {boolean}
     * @memberof UtilContent
     */
    active?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof UtilContent
     */
    aggregate?: boolean;
    /**
     * TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
     * @type {number}
     * @memberof UtilContent
     */
    aggregatedIn?: number;
    /**
     * 
     * @type {UtilDbCID}
     * @memberof UtilContent
     */
    cid?: UtilDbCID;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    createdAt?: string;
    /**
     * If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
     * @type {boolean}
     * @memberof UtilContent
     */
    dagSplit?: boolean;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    dealStatus?: string;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    description?: string;
    /**
     * 
     * @type {boolean}
     * @memberof UtilContent
     */
    failed?: boolean;
    /**
     * 
     * @type {number}
     * @memberof UtilContent
     */
    id?: number;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    location?: string;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    name?: string;
    /**
     * 
     * @type {boolean}
     * @memberof UtilContent
     */
    offloaded?: boolean;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    origins?: string;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    pinMeta?: string;
    /**
     * 
     * @type {boolean}
     * @memberof UtilContent
     */
    pinning?: boolean;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    pinningStatus?: string;
    /**
     * 
     * @type {boolean}
     * @memberof UtilContent
     */
    replace?: boolean;
    /**
     * 
     * @type {number}
     * @memberof UtilContent
     */
    replication?: number;
    /**
     * 
     * @type {number}
     * @memberof UtilContent
     */
    size?: number;
    /**
     * 
     * @type {number}
     * @memberof UtilContent
     */
    splitFrom?: number;
    /**
     * 
     * @type {UtilContentType}
     * @memberof UtilContent
     */
    type?: UtilContentType;
    /**
     * 
     * @type {string}
     * @memberof UtilContent
     */
    updatedAt?: string;
    /**
     * 
     * @type {number}
     * @memberof UtilContent
     */
    userId?: number;
}
