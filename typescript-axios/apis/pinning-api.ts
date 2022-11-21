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
import globalAxios, { AxiosResponse, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
import { TypesIpfsListPinStatusResponse } from '../models';
import { TypesIpfsPin } from '../models';
import { TypesIpfsPinStatusResponse } from '../models';
import { UtilHttpError } from '../models';
/**
 * PinningApi - axios parameter creator
 * @export
 */
export const PinningApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This endpoint lists all pin status objects
         * @summary List all pin status objects
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        pinningPinsGet: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/pinning/pins`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint deletes a pinned object.
         * @summary Delete a pinned object
         * @param {string} pinid Pin ID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        pinningPinsPinidDelete: async (pinid: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'pinid' is not null or undefined
            if (pinid === null || pinid === undefined) {
                throw new RequiredError('pinid','Required parameter pinid was null or undefined when calling pinningPinsPinidDelete.');
            }
            const localVarPath = `/pinning/pins/{pinid}`
                .replace(`{${"pinid"}}`, encodeURIComponent(String(pinid)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint returns a pin status object.
         * @summary Get a pin status object
         * @param {string} pinid cid
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        pinningPinsPinidGet: async (pinid: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'pinid' is not null or undefined
            if (pinid === null || pinid === undefined) {
                throw new RequiredError('pinid','Required parameter pinid was null or undefined when calling pinningPinsPinidGet.');
            }
            const localVarPath = `/pinning/pins/{pinid}`
                .replace(`{${"pinid"}}`, encodeURIComponent(String(pinid)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint replaces a pinned object.
         * @summary Replace a pinned object
         * @param {string} pinid Pin ID
         * @param {string} [body] Meta information of new pin
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        pinningPinsPinidPost: async (pinid: string, body?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'pinid' is not null or undefined
            if (pinid === null || pinid === undefined) {
                throw new RequiredError('pinid','Required parameter pinid was null or undefined when calling pinningPinsPinidPost.');
            }
            const localVarPath = `/pinning/pins/{pinid}`
                .replace(`{${"pinid"}}`, encodeURIComponent(String(pinid)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            const needsSerialization = (typeof body !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(body !== undefined ? body : {}) : (body || "");

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * This endpoint adds a pin to the IPFS daemon.
         * @summary Add and pin object
         * @param {TypesIpfsPin} body Pin Body {cid:cid, name:name}
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        pinningPinsPost: async (body: TypesIpfsPin, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new RequiredError('body','Required parameter body was null or undefined when calling pinningPinsPost.');
            }
            const localVarPath = `/pinning/pins`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            const needsSerialization = (typeof body !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(body !== undefined ? body : {}) : (body || "");

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * PinningApi - functional programming interface
 * @export
 */
export const PinningApiFp = function(configuration?: Configuration) {
    return {
        /**
         * This endpoint lists all pin status objects
         * @summary List all pin status objects
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsGet(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<TypesIpfsListPinStatusResponse>>> {
            const localVarAxiosArgs = await PinningApiAxiosParamCreator(configuration).pinningPinsGet(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint deletes a pinned object.
         * @summary Delete a pinned object
         * @param {string} pinid Pin ID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPinidDelete(pinid: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await PinningApiAxiosParamCreator(configuration).pinningPinsPinidDelete(pinid, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint returns a pin status object.
         * @summary Get a pin status object
         * @param {string} pinid cid
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPinidGet(pinid: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<TypesIpfsPinStatusResponse>>> {
            const localVarAxiosArgs = await PinningApiAxiosParamCreator(configuration).pinningPinsPinidGet(pinid, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint replaces a pinned object.
         * @summary Replace a pinned object
         * @param {string} pinid Pin ID
         * @param {string} [body] Meta information of new pin
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPinidPost(pinid: string, body?: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<TypesIpfsPinStatusResponse>>> {
            const localVarAxiosArgs = await PinningApiAxiosParamCreator(configuration).pinningPinsPinidPost(pinid, body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint adds a pin to the IPFS daemon.
         * @summary Add and pin object
         * @param {TypesIpfsPin} body Pin Body {cid:cid, name:name}
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPost(body: TypesIpfsPin, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<TypesIpfsPinStatusResponse>>> {
            const localVarAxiosArgs = await PinningApiAxiosParamCreator(configuration).pinningPinsPost(body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * PinningApi - factory interface
 * @export
 */
export const PinningApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * This endpoint lists all pin status objects
         * @summary List all pin status objects
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsGet(options?: AxiosRequestConfig): Promise<AxiosResponse<TypesIpfsListPinStatusResponse>> {
            return PinningApiFp(configuration).pinningPinsGet(options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint deletes a pinned object.
         * @summary Delete a pinned object
         * @param {string} pinid Pin ID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPinidDelete(pinid: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return PinningApiFp(configuration).pinningPinsPinidDelete(pinid, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint returns a pin status object.
         * @summary Get a pin status object
         * @param {string} pinid cid
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPinidGet(pinid: string, options?: AxiosRequestConfig): Promise<AxiosResponse<TypesIpfsPinStatusResponse>> {
            return PinningApiFp(configuration).pinningPinsPinidGet(pinid, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint replaces a pinned object.
         * @summary Replace a pinned object
         * @param {string} pinid Pin ID
         * @param {string} [body] Meta information of new pin
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPinidPost(pinid: string, body?: string, options?: AxiosRequestConfig): Promise<AxiosResponse<TypesIpfsPinStatusResponse>> {
            return PinningApiFp(configuration).pinningPinsPinidPost(pinid, body, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint adds a pin to the IPFS daemon.
         * @summary Add and pin object
         * @param {TypesIpfsPin} body Pin Body {cid:cid, name:name}
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async pinningPinsPost(body: TypesIpfsPin, options?: AxiosRequestConfig): Promise<AxiosResponse<TypesIpfsPinStatusResponse>> {
            return PinningApiFp(configuration).pinningPinsPost(body, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * PinningApi - object-oriented interface
 * @export
 * @class PinningApi
 * @extends {BaseAPI}
 */
export class PinningApi extends BaseAPI {
    /**
     * This endpoint lists all pin status objects
     * @summary List all pin status objects
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PinningApi
     */
    public async pinningPinsGet(options?: AxiosRequestConfig) : Promise<AxiosResponse<TypesIpfsListPinStatusResponse>> {
        return PinningApiFp(this.configuration).pinningPinsGet(options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint deletes a pinned object.
     * @summary Delete a pinned object
     * @param {string} pinid Pin ID
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PinningApi
     */
    public async pinningPinsPinidDelete(pinid: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return PinningApiFp(this.configuration).pinningPinsPinidDelete(pinid, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint returns a pin status object.
     * @summary Get a pin status object
     * @param {string} pinid cid
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PinningApi
     */
    public async pinningPinsPinidGet(pinid: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<TypesIpfsPinStatusResponse>> {
        return PinningApiFp(this.configuration).pinningPinsPinidGet(pinid, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint replaces a pinned object.
     * @summary Replace a pinned object
     * @param {string} pinid Pin ID
     * @param {string} [body] Meta information of new pin
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PinningApi
     */
    public async pinningPinsPinidPost(pinid: string, body?: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<TypesIpfsPinStatusResponse>> {
        return PinningApiFp(this.configuration).pinningPinsPinidPost(pinid, body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint adds a pin to the IPFS daemon.
     * @summary Add and pin object
     * @param {TypesIpfsPin} body Pin Body {cid:cid, name:name}
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PinningApi
     */
    public async pinningPinsPost(body: TypesIpfsPin, options?: AxiosRequestConfig) : Promise<AxiosResponse<TypesIpfsPinStatusResponse>> {
        return PinningApiFp(this.configuration).pinningPinsPost(body, options).then((request) => request(this.axios, this.basePath));
    }
}