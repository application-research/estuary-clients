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
import { PinnerIpfsPin } from './pinnerIpfsPin';
import { StatusPinningStatus } from './statusPinningStatus';
import { UtilContent } from './utilContent';

export interface PinnerIpfsPinStatusResponse { 
    content?: UtilContent;
    created?: string;
    delegates?: Array<string>;
    info?: { [key: string]: any; };
    pin?: PinnerIpfsPin;
    requestid?: string;
    status?: StatusPinningStatus;
}