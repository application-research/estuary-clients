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

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class CollectionsApi {
    protected basePath = 'https://api.estuary.tech';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     * @summary Produce a CID of the collection contents
     * @param coluuid coluuid
     */
    public collectionsColuuidCommitPost (coluuid: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
        const localVarPath = this.basePath + '/collections/{coluuid}/commit'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidCommitPost.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     * @summary Deletes a content from a collection
     * @param coluuid Collection ID
     * @param contentid Content ID
     * @param body Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;)
     */
    public collectionsColuuidContentsDelete (coluuid: string, contentid: string, body: models.MainDeleteContentFromCollectionBody, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
        const localVarPath = this.basePath + '/collections/{coluuid}/contents'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)))
            .replace('{' + 'contentid' + '}', encodeURIComponent(String(contentid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidContentsDelete.');
        }

        // verify required parameter 'contentid' is not null or undefined
        if (contentid === null || contentid === undefined) {
            throw new Error('Required parameter contentid was null or undefined when calling collectionsColuuidContentsDelete.');
        }

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsColuuidContentsDelete.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            data: body,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to delete an existing collection.
     * @summary Deletes a collection
     * @param coluuid Collection ID
     */
    public collectionsColuuidDelete (coluuid: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/collections/{coluuid}'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidDelete.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to get contents in a collection. If no colpath query param is passed
     * @summary Get contents in a collection
     * @param coluuid coluuid
     * @param dir Directory
     */
    public collectionsColuuidGet (coluuid: string, dir?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
        const localVarPath = this.basePath + '/collections/{coluuid}'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidGet.');
        }

        if (dir !== undefined) {
            queryParameters['dir'] = dir;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     * @summary Add contents to a collection
     * @param coluuid coluuid
     * @param contentIDs Content IDs to add to collection
     */
    public collectionsColuuidPost (coluuid: string, contentIDs: Array<number>, extraHttpRequestParams?: any ) : ng.IHttpPromise<{ [key: string]: string; }> {
        const localVarPath = this.basePath + '/collections/{coluuid}'
            .replace('{' + 'coluuid' + '}', encodeURIComponent(String(coluuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsColuuidPost.');
        }

        // verify required parameter 'contentIDs' is not null or undefined
        if (contentIDs === null || contentIDs === undefined) {
            throw new Error('Required parameter contentIDs was null or undefined when calling collectionsColuuidPost.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: contentIDs,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint adds a file to a collection
     * @summary Add a file to a collection
     * @param coluuid Collection ID
     * @param content Content
     * @param path Path to file
     */
    public collectionsFsAddPost (coluuid: string, content: string, path: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/collections/fs/add';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'coluuid' is not null or undefined
        if (coluuid === null || coluuid === undefined) {
            throw new Error('Required parameter coluuid was null or undefined when calling collectionsFsAddPost.');
        }

        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new Error('Required parameter content was null or undefined when calling collectionsFsAddPost.');
        }

        // verify required parameter 'path' is not null or undefined
        if (path === null || path === undefined) {
            throw new Error('Required parameter path was null or undefined when calling collectionsFsAddPost.');
        }

        if (coluuid !== undefined) {
            queryParameters['coluuid'] = coluuid;
        }

        if (content !== undefined) {
            queryParameters['content'] = content;
        }

        if (path !== undefined) {
            queryParameters['path'] = path;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     * @summary List all collections
     */
    public collectionsGet (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<models.CollectionsCollection>> {
        const localVarPath = this.basePath + '/collections/';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     * @summary Create a new collection
     * @param body Collection name and description
     */
    public collectionsPost (body: models.MainCreateCollectionBody, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.CollectionsCollection> {
        const localVarPath = this.basePath + '/collections/';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling collectionsPost.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: body,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}
