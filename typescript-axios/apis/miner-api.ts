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
import { GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse } from '../models';
import { GithubComApplicationResearchEstuaryApiV1ClaimResponse } from '../models';
import { MinerClaimMinerBody } from '../models';
import { MinerMinerSetInfoParams } from '../models';
import { MinerSuspendMinerBody } from '../models';
import { UtilHttpError } from '../models';
/**
 * MinerApi - axios parameter creator
 * @export
 */
export const MinerApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * This endpoint lets a user get the message in order to claim a miner
         * @summary Get Claim Miner Message
         * @param {string} miner Miner claim message
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        minerClaimMinerGet: async (miner: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling minerClaimMinerGet.');
            }
            const localVarPath = `/miner/claim/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
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
         * This endpoint lets a user claim a miner
         * @summary Claim Miner
         * @param {MinerClaimMinerBody} body Claim Miner Body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        minerClaimPost: async (body: MinerClaimMinerBody, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new RequiredError('body','Required parameter body was null or undefined when calling minerClaimPost.');
            }
            const localVarPath = `/miner/claim`;
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

            localVarHeaderParameter['Content-Type'] = '*/*';

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
         * This endpoint lets a user set miner info.
         * @summary Set Miner Info
         * @param {MinerMinerSetInfoParams} body Miner set info params
         * @param {string} miner Miner to set info for
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        minerSetInfoMinerPut: async (body: MinerMinerSetInfoParams, miner: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new RequiredError('body','Required parameter body was null or undefined when calling minerSetInfoMinerPut.');
            }
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling minerSetInfoMinerPut.');
            }
            const localVarPath = `/miner/set-info/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'PUT', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("Authorization")
                    : await configuration.apiKey;
                localVarHeaderParameter["Authorization"] = localVarApiKeyValue;
            }

            localVarHeaderParameter['Content-Type'] = '*/*';

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
         * This endpoint lets a user suspend a miner.
         * @summary Suspend Miner
         * @param {MinerSuspendMinerBody} body Suspend Miner Body
         * @param {string} miner Miner to suspend
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        minerSuspendMinerPost: async (body: MinerSuspendMinerBody, miner: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new RequiredError('body','Required parameter body was null or undefined when calling minerSuspendMinerPost.');
            }
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling minerSuspendMinerPost.');
            }
            const localVarPath = `/miner/suspend/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
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

            localVarHeaderParameter['Content-Type'] = '*/*';

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
         * This endpoint lets a user unsuspend a miner.
         * @summary Unuspend Miner
         * @param {string} miner Miner to unsuspend
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        minerUnsuspendMinerPut: async (miner: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling minerUnsuspendMinerPut.');
            }
            const localVarPath = `/miner/unsuspend/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'PUT', ...baseOptions, ...options};
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
         * This endpoint returns all miners deals
         * @summary Get all miners deals
         * @param {string} miner Filter by miner
         * @param {string} [ignoreFailed] Ignore Failed
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        publicMinersDealsMinerGet: async (miner: string, ignoreFailed?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling publicMinersDealsMinerGet.');
            }
            const localVarPath = `/public/miners/deals/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
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

            if (ignoreFailed !== undefined) {
                localVarQueryParameter['ignore-failed'] = ignoreFailed;
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
         * This endpoint returns miner stats
         * @summary Get miner stats
         * @param {string} miner Filter by miner
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        publicMinersStatsMinerGet: async (miner: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'miner' is not null or undefined
            if (miner === null || miner === undefined) {
                throw new RequiredError('miner','Required parameter miner was null or undefined when calling publicMinersStatsMinerGet.');
            }
            const localVarPath = `/public/miners/stats/{miner}`
                .replace(`{${"miner"}}`, encodeURIComponent(String(miner)));
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
    }
};

/**
 * MinerApi - functional programming interface
 * @export
 */
export const MinerApiFp = function(configuration?: Configuration) {
    return {
        /**
         * This endpoint lets a user get the message in order to claim a miner
         * @summary Get Claim Miner Message
         * @param {string} miner Miner claim message
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerClaimMinerGet(miner: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).minerClaimMinerGet(miner, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint lets a user claim a miner
         * @summary Claim Miner
         * @param {MinerClaimMinerBody} body Claim Miner Body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerClaimPost(body: MinerClaimMinerBody, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<GithubComApplicationResearchEstuaryApiV1ClaimResponse>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).minerClaimPost(body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint lets a user set miner info.
         * @summary Set Miner Info
         * @param {MinerMinerSetInfoParams} body Miner set info params
         * @param {string} miner Miner to set info for
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerSetInfoMinerPut(body: MinerMinerSetInfoParams, miner: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<{ [key: string]: string; }>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).minerSetInfoMinerPut(body, miner, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint lets a user suspend a miner.
         * @summary Suspend Miner
         * @param {MinerSuspendMinerBody} body Suspend Miner Body
         * @param {string} miner Miner to suspend
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerSuspendMinerPost(body: MinerSuspendMinerBody, miner: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<{ [key: string]: string; }>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).minerSuspendMinerPost(body, miner, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint lets a user unsuspend a miner.
         * @summary Unuspend Miner
         * @param {string} miner Miner to unsuspend
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerUnsuspendMinerPut(miner: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<{ [key: string]: string; }>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).minerUnsuspendMinerPut(miner, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint returns all miners deals
         * @summary Get all miners deals
         * @param {string} miner Filter by miner
         * @param {string} [ignoreFailed] Ignore Failed
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<string>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).publicMinersDealsMinerGet(miner, ignoreFailed, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * This endpoint returns miner stats
         * @summary Get miner stats
         * @param {string} miner Filter by miner
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersStatsMinerGet(miner: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<string>>> {
            const localVarAxiosArgs = await MinerApiAxiosParamCreator(configuration).publicMinersStatsMinerGet(miner, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * MinerApi - factory interface
 * @export
 */
export const MinerApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * This endpoint lets a user get the message in order to claim a miner
         * @summary Get Claim Miner Message
         * @param {string} miner Miner claim message
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerClaimMinerGet(miner: string, options?: AxiosRequestConfig): Promise<AxiosResponse<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>> {
            return MinerApiFp(configuration).minerClaimMinerGet(miner, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint lets a user claim a miner
         * @summary Claim Miner
         * @param {MinerClaimMinerBody} body Claim Miner Body
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerClaimPost(body: MinerClaimMinerBody, options?: AxiosRequestConfig): Promise<AxiosResponse<GithubComApplicationResearchEstuaryApiV1ClaimResponse>> {
            return MinerApiFp(configuration).minerClaimPost(body, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint lets a user set miner info.
         * @summary Set Miner Info
         * @param {MinerMinerSetInfoParams} body Miner set info params
         * @param {string} miner Miner to set info for
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerSetInfoMinerPut(body: MinerMinerSetInfoParams, miner: string, options?: AxiosRequestConfig): Promise<AxiosResponse<{ [key: string]: string; }>> {
            return MinerApiFp(configuration).minerSetInfoMinerPut(body, miner, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint lets a user suspend a miner.
         * @summary Suspend Miner
         * @param {MinerSuspendMinerBody} body Suspend Miner Body
         * @param {string} miner Miner to suspend
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerSuspendMinerPost(body: MinerSuspendMinerBody, miner: string, options?: AxiosRequestConfig): Promise<AxiosResponse<{ [key: string]: string; }>> {
            return MinerApiFp(configuration).minerSuspendMinerPost(body, miner, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint lets a user unsuspend a miner.
         * @summary Unuspend Miner
         * @param {string} miner Miner to unsuspend
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async minerUnsuspendMinerPut(miner: string, options?: AxiosRequestConfig): Promise<AxiosResponse<{ [key: string]: string; }>> {
            return MinerApiFp(configuration).minerUnsuspendMinerPut(miner, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint returns all miners deals
         * @summary Get all miners deals
         * @param {string} miner Filter by miner
         * @param {string} [ignoreFailed] Ignore Failed
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, options?: AxiosRequestConfig): Promise<AxiosResponse<string>> {
            return MinerApiFp(configuration).publicMinersDealsMinerGet(miner, ignoreFailed, options).then((request) => request(axios, basePath));
        },
        /**
         * This endpoint returns miner stats
         * @summary Get miner stats
         * @param {string} miner Filter by miner
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async publicMinersStatsMinerGet(miner: string, options?: AxiosRequestConfig): Promise<AxiosResponse<string>> {
            return MinerApiFp(configuration).publicMinersStatsMinerGet(miner, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * MinerApi - object-oriented interface
 * @export
 * @class MinerApi
 * @extends {BaseAPI}
 */
export class MinerApi extends BaseAPI {
    /**
     * This endpoint lets a user get the message in order to claim a miner
     * @summary Get Claim Miner Message
     * @param {string} miner Miner claim message
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async minerClaimMinerGet(miner: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse>> {
        return MinerApiFp(this.configuration).minerClaimMinerGet(miner, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint lets a user claim a miner
     * @summary Claim Miner
     * @param {MinerClaimMinerBody} body Claim Miner Body
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async minerClaimPost(body: MinerClaimMinerBody, options?: AxiosRequestConfig) : Promise<AxiosResponse<GithubComApplicationResearchEstuaryApiV1ClaimResponse>> {
        return MinerApiFp(this.configuration).minerClaimPost(body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint lets a user set miner info.
     * @summary Set Miner Info
     * @param {MinerMinerSetInfoParams} body Miner set info params
     * @param {string} miner Miner to set info for
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async minerSetInfoMinerPut(body: MinerMinerSetInfoParams, miner: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<{ [key: string]: string; }>> {
        return MinerApiFp(this.configuration).minerSetInfoMinerPut(body, miner, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint lets a user suspend a miner.
     * @summary Suspend Miner
     * @param {MinerSuspendMinerBody} body Suspend Miner Body
     * @param {string} miner Miner to suspend
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async minerSuspendMinerPost(body: MinerSuspendMinerBody, miner: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<{ [key: string]: string; }>> {
        return MinerApiFp(this.configuration).minerSuspendMinerPost(body, miner, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint lets a user unsuspend a miner.
     * @summary Unuspend Miner
     * @param {string} miner Miner to unsuspend
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async minerUnsuspendMinerPut(miner: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<{ [key: string]: string; }>> {
        return MinerApiFp(this.configuration).minerUnsuspendMinerPut(miner, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint returns all miners deals
     * @summary Get all miners deals
     * @param {string} miner Filter by miner
     * @param {string} [ignoreFailed] Ignore Failed
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async publicMinersDealsMinerGet(miner: string, ignoreFailed?: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<string>> {
        return MinerApiFp(this.configuration).publicMinersDealsMinerGet(miner, ignoreFailed, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * This endpoint returns miner stats
     * @summary Get miner stats
     * @param {string} miner Filter by miner
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof MinerApi
     */
    public async publicMinersStatsMinerGet(miner: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<string>> {
        return MinerApiFp(this.configuration).publicMinersStatsMinerGet(miner, options).then((request) => request(this.axios, this.basePath));
    }
}
