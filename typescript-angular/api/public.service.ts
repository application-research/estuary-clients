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

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs/Observable';


import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class PublicService {

    protected basePath = 'https://api.estuary.tech';
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
     * Get Content by Cid
     * This endpoint returns the content associated with a CID
     * @param cid Cid
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicByCidCidGet(cid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicByCidCidGet(cid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicByCidCidGet(cid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicByCidCidGet(cid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (cid === null || cid === undefined) {
            throw new Error('Required parameter cid was null or undefined when calling publicByCidCidGet.');
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

        return this.httpClient.get<any>(`${this.basePath}/public/by-cid/${encodeURIComponent(String(cid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get public node info
     * This endpoint returns information about the node
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicInfoGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicInfoGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicInfoGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicInfoGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.get<any>(`${this.basePath}/public/info`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get deal metrics
     * This endpoint is used to get deal metrics
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicMetricsDealsOnChainGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicMetricsDealsOnChainGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicMetricsDealsOnChainGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicMetricsDealsOnChainGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.get<any>(`${this.basePath}/public/metrics/deals-on-chain`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get all miners deals
     * This endpoint returns all miners deals
     * @param miner Filter by miner
     * @param ignoreFailed Ignore Failed
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling publicMinersDealsMinerGet.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (ignoreFailed !== undefined && ignoreFailed !== null) {
            queryParameters = queryParameters.set('ignore-failed', <any>ignoreFailed);
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

        return this.httpClient.get<any>(`${this.basePath}/public/miners/deals/${encodeURIComponent(String(miner))}`,
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
     * Get all miners
     * This endpoint returns all miners
     * @param miner Filter by miner
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicMinersFailuresMinerGet(miner: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicMinersFailuresMinerGet(miner: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicMinersFailuresMinerGet(miner: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicMinersFailuresMinerGet(miner: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling publicMinersFailuresMinerGet.');
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

        return this.httpClient.get<any>(`${this.basePath}/public/miners/failures/${encodeURIComponent(String(miner))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get all miners
     * This endpoint returns all miners
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicMinersGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicMinersGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicMinersGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicMinersGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.get<any>(`${this.basePath}/public/miners`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get miner stats
     * This endpoint returns miner stats
     * @param miner Filter by miner
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicMinersStatsMinerGet(miner: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicMinersStatsMinerGet(miner: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicMinersStatsMinerGet(miner: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicMinersStatsMinerGet(miner: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (miner === null || miner === undefined) {
            throw new Error('Required parameter miner was null or undefined when calling publicMinersStatsMinerGet.');
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

        return this.httpClient.get<any>(`${this.basePath}/public/miners/stats/${encodeURIComponent(String(miner))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Net Addrs
     * This endpoint is used to get net addrs
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicNetAddrsGet(observe?: 'body', reportProgress?: boolean): Observable<Array<string>>;
    public publicNetAddrsGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<string>>>;
    public publicNetAddrsGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<string>>>;
    public publicNetAddrsGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.get<Array<string>>(`${this.basePath}/public/net/addrs`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Net Peers
     * This endpoint is used to get net peers
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicNetPeersGet(observe?: 'body', reportProgress?: boolean): Observable<Array<string>>;
    public publicNetPeersGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<string>>>;
    public publicNetPeersGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<string>>>;
    public publicNetPeersGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.get<Array<string>>(`${this.basePath}/public/net/peers`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Public stats
     * This endpoint is used to get public stats.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public publicStatsGet(observe?: 'body', reportProgress?: boolean): Observable<any>;
    public publicStatsGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public publicStatsGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public publicStatsGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.get<any>(`${this.basePath}/public/stats`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
