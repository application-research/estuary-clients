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
import { UtilContentType } from './utilContentType';
import { UtilDbCID } from './utilDbCID';

export interface UtilContent { 
    active?: boolean;
    aggregate?: boolean;
    /**
     * TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
     */
    aggregatedIn?: number;
    cid?: UtilDbCID;
    createdAt?: string;
    /**
     * If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
     */
    dagSplit?: boolean;
    dealStatus?: string;
    description?: string;
    failed?: boolean;
    id?: number;
    location?: string;
    name?: string;
    offloaded?: boolean;
    origins?: string;
    pinMeta?: string;
    pinning?: boolean;
    pinningStatus?: string;
    replace?: boolean;
    replication?: number;
    size?: number;
    splitFrom?: number;
    type?: UtilContentType;
    updatedAt?: string;
    userId?: number;
}