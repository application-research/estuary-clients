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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { MainGetApiKeysResp } from '../model/mainGetApiKeysResp';
import { UtilHttpError } from '../model/utilHttpError';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class UserService {
    @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration;
    @inject('IApiHttpClient') private httpClient: IHttpClient;



    /**
     * Get API keys for a user
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     
     */
    public userApiKeysGet(observe?: 'body', headers?: Headers): Observable<Array<Array<MainGetApiKeysResp>>>;
    public userApiKeysGet(observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Array<MainGetApiKeysResp>>>>;
    public userApiKeysGet(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (bearerAuth) required
        if (this.APIConfiguration.apiKeys['Authorization']) {
            headers['Authorization'] = this.APIConfiguration.apiKeys['Authorization'];
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<Array<MainGetApiKeysResp>>>> = this.httpClient.get(`${this.APIConfiguration.basePath}/user/api-keys` as any, headers);
        if (observe === 'body') {
               return response.map(httpResponse => httpResponse.response);
        }
        return response;
    }


    /**
     * Revoke a User API Key.
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.
     * @param key Key
     
     */
    public userApiKeysKeyDelete(key: string, observe?: 'body', headers?: Headers): Observable<string>;
    public userApiKeysKeyDelete(key: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public userApiKeysKeyDelete(key: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!key){
            throw new Error('Required parameter key was null or undefined when calling userApiKeysKeyDelete.');
        }

        // authentication (bearerAuth) required
        if (this.APIConfiguration.apiKeys['Authorization']) {
            headers['Authorization'] = this.APIConfiguration.apiKeys['Authorization'];
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<string>> = this.httpClient.delete(`${this.APIConfiguration.basePath}/user/api-keys/${encodeURIComponent(String(key))}` as any, headers);
        if (observe === 'body') {
               return response.map(httpResponse => httpResponse.response);
        }
        return response;
    }


    /**
     * Create API keys for a user
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     * @param expiry Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
     * @param perms Permissions -- currently unused
     
     */
    public userApiKeysPost(expiry?: string, perms?: string, observe?: 'body', headers?: Headers): Observable<MainGetApiKeysResp>;
    public userApiKeysPost(expiry?: string, perms?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<MainGetApiKeysResp>>;
    public userApiKeysPost(expiry?: string, perms?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (expiry !== undefined) {
            queryParameters.push('expiry='+encodeURIComponent(String(expiry)));
        }
        if (perms !== undefined) {
            queryParameters.push('perms='+encodeURIComponent(String(perms)));
        }

        // authentication (bearerAuth) required
        if (this.APIConfiguration.apiKeys['Authorization']) {
            headers['Authorization'] = this.APIConfiguration.apiKeys['Authorization'];
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<MainGetApiKeysResp>> = this.httpClient.post(`${this.APIConfiguration.basePath}/user/api-keys?${queryParameters.join('&')}` as any, headers);
        if (observe === 'body') {
               return response.map(httpResponse => httpResponse.response);
        }
        return response;
    }


    /**
     * Export user data
     * This endpoint is used to get API keys for a user.
     
     */
    public userExportGet(observe?: 'body', headers?: Headers): Observable<string>;
    public userExportGet(observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public userExportGet(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (bearerAuth) required
        if (this.APIConfiguration.apiKeys['Authorization']) {
            headers['Authorization'] = this.APIConfiguration.apiKeys['Authorization'];
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.APIConfiguration.basePath}/user/export` as any, headers);
        if (observe === 'body') {
               return response.map(httpResponse => httpResponse.response);
        }
        return response;
    }


    /**
     * Create API keys for a user
     * This endpoint is used to create API keys for a user.
     
     */
    public userStatsGet(observe?: 'body', headers?: Headers): Observable<string>;
    public userStatsGet(observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public userStatsGet(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (bearerAuth) required
        if (this.APIConfiguration.apiKeys['Authorization']) {
            headers['Authorization'] = this.APIConfiguration.apiKeys['Authorization'];
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.APIConfiguration.basePath}/user/stats` as any, headers);
        if (observe === 'body') {
               return response.map(httpResponse => httpResponse.response);
        }
        return response;
    }

}
