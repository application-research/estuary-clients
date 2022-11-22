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
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { MainGetApiKeysResp } from '../model/mainGetApiKeysResp';
import { UtilHttpError } from '../model/utilHttpError';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class UserService {

    protected basePath = '//api.estuary.tech/';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * Get API keys for a user
     * This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public userApiKeysGet(observe?: 'body', reportProgress?: boolean): Observable<Array<MainGetApiKeysResp>>;
    public userApiKeysGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<MainGetApiKeysResp>>>;
    public userApiKeysGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<MainGetApiKeysResp>>>;
    public userApiKeysGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<MainGetApiKeysResp>>('get',`${this.basePath}/user/api-keys`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Revoke a User API Key.
     * This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#x27;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.
     * @param keyOrHash Key or Hash
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public userApiKeysKeyOrHashDelete(keyOrHash: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public userApiKeysKeyOrHashDelete(keyOrHash: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public userApiKeysKeyOrHashDelete(keyOrHash: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public userApiKeysKeyOrHashDelete(keyOrHash: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (keyOrHash === null || keyOrHash === undefined) {
            throw new Error('Required parameter keyOrHash was null or undefined when calling userApiKeysKeyOrHashDelete.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<string>('delete',`${this.basePath}/user/api-keys/${encodeURIComponent(String(keyOrHash))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Create API keys for a user
     * This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.
     * @param expiry Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
     * @param perms Permissions -- currently unused
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public userApiKeysPost(expiry?: string, perms?: string, observe?: 'body', reportProgress?: boolean): Observable<MainGetApiKeysResp>;
    public userApiKeysPost(expiry?: string, perms?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<MainGetApiKeysResp>>;
    public userApiKeysPost(expiry?: string, perms?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<MainGetApiKeysResp>>;
    public userApiKeysPost(expiry?: string, perms?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (expiry !== undefined && expiry !== null) {
            queryParameters = queryParameters.set('expiry', <any>expiry);
        }
        if (perms !== undefined && perms !== null) {
            queryParameters = queryParameters.set('perms', <any>perms);
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<MainGetApiKeysResp>('post',`${this.basePath}/user/api-keys`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Export user data
     * This endpoint is used to get API keys for a user.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public userExportGet(observe?: 'body', reportProgress?: boolean): Observable<string>;
    public userExportGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public userExportGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public userExportGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<string>('get',`${this.basePath}/user/export`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get stats for the current user
     * This endpoint is used to geet stats for the current user.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public userStatsGet(observe?: 'body', reportProgress?: boolean): Observable<string>;
    public userStatsGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public userStatsGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public userStatsGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<string>('get',`${this.basePath}/user/stats`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
