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
import { CollectionsCidType } from './collectionsCidType';
import { UtilDbCID } from './utilDbCID';

export interface CollectionsCollectionListResponse { 
    cid?: UtilDbCID;
    coluuid?: string;
    contId?: number;
    dir?: string;
    name?: string;
    size?: number;
    type?: CollectionsCidType;
    updatedAt?: string;
}