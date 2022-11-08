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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
} from './models';

/**
 * publicByCidCidGet - parameters interface
 */
export interface IPublicByCidCidGetParams {
  cid: string;
}

/**
 * publicInfoGet - parameters interface
 */
export interface IPublicInfoGetParams {
}

/**
 * publicMetricsDealsOnChainGet - parameters interface
 */
export interface IPublicMetricsDealsOnChainGetParams {
}

/**
 * publicMinersDealsMinerGet - parameters interface
 */
export interface IPublicMinersDealsMinerGetParams {
  miner: string;
  ignoreFailed?: string;
}

/**
 * publicMinersFailuresMinerGet - parameters interface
 */
export interface IPublicMinersFailuresMinerGetParams {
  miner: string;
}

/**
 * publicMinersGet - parameters interface
 */
export interface IPublicMinersGetParams {
}

/**
 * publicMinersStatsMinerGet - parameters interface
 */
export interface IPublicMinersStatsMinerGetParams {
  miner: string;
}

/**
 * publicNetAddrsGet - parameters interface
 */
export interface IPublicNetAddrsGetParams {
}

/**
 * publicNetPeersGet - parameters interface
 */
export interface IPublicNetPeersGetParams {
}

/**
 * publicStatsGet - parameters interface
 */
export interface IPublicStatsGetParams {
}

/**
 * PublicApi - API class
 */
@autoinject()
export class PublicApi extends Api {

  /**
   * Creates a new PublicApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get Content by Cid
   * This endpoint returns the content associated with a CID
   * @param params.cid Cid
   */
  async publicByCidCidGet(params: IPublicByCidCidGetParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('publicByCidCidGet', params, 'cid');

    // Create URL to call
    const url = `${this.basePath}/public/by-cid/{cid}`
      .replace(`{${'cid'}}`, encodeURIComponent(`${params['cid']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get public node info
   * This endpoint returns information about the node
   */
  async publicInfoGet(): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/info`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get deal metrics
   * This endpoint is used to get deal metrics
   */
  async publicMetricsDealsOnChainGet(): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/metrics/deals-on-chain`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get all miners deals
   * This endpoint returns all miners deals
   * @param params.miner Filter by miner
   * @param params.ignoreFailed Ignore Failed
   */
  async publicMinersDealsMinerGet(params: IPublicMinersDealsMinerGetParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('publicMinersDealsMinerGet', params, 'miner');

    // Create URL to call
    const url = `${this.basePath}/public/miners/deals/{miner}`
      .replace(`{${'miner'}}`, encodeURIComponent(`${params['miner']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'ignore-failed': params['ignoreFailed'],
      })

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get all miners
   * This endpoint returns all miners
   * @param params.miner Filter by miner
   */
  async publicMinersFailuresMinerGet(params: IPublicMinersFailuresMinerGetParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('publicMinersFailuresMinerGet', params, 'miner');

    // Create URL to call
    const url = `${this.basePath}/public/miners/failures/{miner}`
      .replace(`{${'miner'}}`, encodeURIComponent(`${params['miner']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get all miners
   * This endpoint returns all miners
   */
  async publicMinersGet(): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/miners`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get miner stats
   * This endpoint returns miner stats
   * @param params.miner Filter by miner
   */
  async publicMinersStatsMinerGet(params: IPublicMinersStatsMinerGetParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('publicMinersStatsMinerGet', params, 'miner');

    // Create URL to call
    const url = `${this.basePath}/public/miners/stats/{miner}`
      .replace(`{${'miner'}}`, encodeURIComponent(`${params['miner']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Net Addrs
   * This endpoint is used to get net addrs
   */
  async publicNetAddrsGet(): Promise<Array<string>> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/net/addrs`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Net Peers
   * This endpoint is used to get net peers
   */
  async publicNetPeersGet(): Promise<Array<string>> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/net/peers`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Public stats
   * This endpoint is used to get public stats.
   */
  async publicStatsGet(): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/public/stats`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'bearerAuth' required
      .withHeader('Authorization', this.authStorage.getbearerAuth())
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

