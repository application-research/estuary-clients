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

import { CollectionsCollection } from '../model/collectionsCollection';
import { MainCreateCollectionBody } from '../model/mainCreateCollectionBody';
import { MainDeleteContentFromCollectionBody } from '../model/mainDeleteContentFromCollectionBody';
import { UtilHttpError } from '../model/utilHttpError';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class CollectionsService {

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
     * Produce a CID of the collection contents
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     * @param coluuid coluuid
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsColuuidCommitPost(coluuid: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public collectionsColuuidCommitPost(coluuid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public collectionsColuuidCommitPost(coluuid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public collectionsColuuidCommitPost(coluuid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidCommitPost.');
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

        return this.httpClient.request<string>('post',`${this.basePath}/collections/${encodeURIComponent(String(coluuid))}/commit`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Deletes a content from a collection
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     * @param body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;)
     * @param coluuid Collection ID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsColuuidContentsDelete(body: MainDeleteContentFromCollectionBody, coluuid: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public collectionsColuuidContentsDelete(body: MainDeleteContentFromCollectionBody, coluuid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public collectionsColuuidContentsDelete(body: MainDeleteContentFromCollectionBody, coluuid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public collectionsColuuidContentsDelete(body: MainDeleteContentFromCollectionBody, coluuid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsColuuidContentsDelete.');
        }

        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidContentsDelete.');
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
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<string>('delete',`${this.basePath}/collections/${encodeURIComponent(String(coluuid))}/contents`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Deletes a collection
     * This endpoint is used to delete an existing collection.
     * @param coluuid Collection ID
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsColuuidDelete(coluuid: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public collectionsColuuidDelete(coluuid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public collectionsColuuidDelete(coluuid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public collectionsColuuidDelete(coluuid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidDelete.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.apiKeys && this.configuration.apiKeys["Authorization"]) {
            headers = headers.set('Authorization', this.configuration.apiKeys["Authorization"]);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<string>('delete',`${this.basePath}/collections/${encodeURIComponent(String(coluuid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get contents in a collection
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     * @param coluuid coluuid
     * @param dir Directory
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsColuuidGet(coluuid: string, dir?: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public collectionsColuuidGet(coluuid: string, dir?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public collectionsColuuidGet(coluuid: string, dir?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public collectionsColuuidGet(coluuid: string, dir?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidGet.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (dir !== undefined && dir !== null) {
            queryParameters = queryParameters.set('dir', <any>dir);
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

        return this.httpClient.request<string>('get',`${this.basePath}/collections/${encodeURIComponent(String(coluuid))}`,
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
     * Add contents to a collection
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     * @param body Content IDs to add to collection
     * @param coluuid Collection UUID
     * @param dir Directory
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsColuuidPost(body: Array<number>, coluuid: string, dir?: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public collectionsColuuidPost(body: Array<number>, coluuid: string, dir?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public collectionsColuuidPost(body: Array<number>, coluuid: string, dir?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public collectionsColuuidPost(body: Array<number>, coluuid: string, dir?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsColuuidPost.');
        }

        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidPost.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (dir !== undefined && dir !== null) {
            queryParameters = queryParameters.set('dir', <any>dir);
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
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<string>('post',`${this.basePath}/collections/${encodeURIComponent(String(coluuid))}`,
            {
                body: body,
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Add a file to a collection
     * This endpoint adds a file to a collection
     * @param coluuid Collection ID
     * @param content Content
     * @param path Path to file
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsFsAddPost(coluuid: string, content: string, path: string, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public collectionsFsAddPost(coluuid: string, content: string, path: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public collectionsFsAddPost(coluuid: string, content: string, path: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public collectionsFsAddPost(coluuid: string, content: string, path: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsFsAddPost.');
        }

        if (content === null || content === undefined) {
            throw new Error('Required parameter content was null or undefined when calling collectionsFsAddPost.');
        }

        if (path === null || path === undefined) {
            throw new Error('Required parameter path was null or undefined when calling collectionsFsAddPost.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (coluuid !== undefined && coluuid !== null) {
            queryParameters = queryParameters.set('coluuid', <any>coluuid);
        }
        if (content !== undefined && content !== null) {
            queryParameters = queryParameters.set('content', <any>content);
        }
        if (path !== undefined && path !== null) {
            queryParameters = queryParameters.set('path', <any>path);
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

        return this.httpClient.request<string>('post',`${this.basePath}/collections/fs/add`,
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
     * List all collections
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsGet(observe?: 'body', reportProgress?: boolean): Observable<Array<CollectionsCollection>>;
    public collectionsGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<CollectionsCollection>>>;
    public collectionsGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<CollectionsCollection>>>;
    public collectionsGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

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

        return this.httpClient.request<Array<CollectionsCollection>>('get',`${this.basePath}/collections/`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Create a new collection
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     * @param body Collection name and description
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public collectionsPost(body: MainCreateCollectionBody, observe?: 'body', reportProgress?: boolean): Observable<CollectionsCollection>;
    public collectionsPost(body: MainCreateCollectionBody, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<CollectionsCollection>>;
    public collectionsPost(body: MainCreateCollectionBody, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<CollectionsCollection>>;
    public collectionsPost(body: MainCreateCollectionBody, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsPost.');
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
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<CollectionsCollection>('post',`${this.basePath}/collections/`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
