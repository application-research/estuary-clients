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
package io.swagger.client.api

import io.swagger.client.model.MainEstimateDealBody
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DealsApi {

  /**
   * This endpoint estimates the cost of a deal
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param body The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
   */
  def dealEstimatePost(body: MainEstimateDealBody)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/deal/estimate", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withBody(body)
        /**
   * This endpoint returns the deal info for a deal
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param dealid Deal ID
   */
  def dealInfoDealidGet(dealid: Int)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deal/info/{dealid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("dealid", dealid)
        /**
   * This endpoint returns the proposal for a deal
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param propcid Proposal CID
   */
  def dealProposalPropcidGet(propcid: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deal/proposal/{propcid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("propcid", propcid)
        /**
   * This endpoint returns the ask for a given CID
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param miner CID
   */
  def dealQueryMinerGet(miner: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deal/query/{miner}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("miner", miner)
        /**
   * Get Deal Status by PropCid
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param propcid PropCid
   */
  def dealStatusByProposalPropcidGet(propcid: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deal/status-by-proposal/{propcid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("propcid", propcid)
        /**
   * This endpoint returns the status of a deal
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param miner Miner
   * @param propcid Proposal CID
   */
  def dealStatusMinerPropcidGet(miner: String, propcid: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deal/status/{miner}/{propcid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("miner", miner)
      .withPathParam("propcid", propcid)
        /**
   * This endpoint returns the in-progress transfers
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def dealTransferInProgressGet()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deal/transfer/in-progress", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint returns a list of storage failures for user
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def dealsFailuresGet()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deals/failures", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint makes a deal for a given content and miner
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param miner Miner
   * @param dealRequest Deal Request
   */
  def dealsMakeMinerPost(miner: String, dealRequest: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.estuary.tech", "/deals/make/{miner}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withBody(dealRequest)
      .withPathParam("miner", miner)
        /**
   * This endpoint returns the status of a deal
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param deal Deal ID
   */
  def dealsStatusDealGet(deal: Int)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/deals/status/{deal}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("deal", deal)
        /**
   * This endpoint returns a list of storage failures
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def publicDealsFailuresGet()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/public/deals/failures", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
        /**
   * This endpoint returns the ask for a given CID
   * 
   * Expected answers:
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param miner CID
   */
  def publicMinersStorageQueryMinerGet(miner: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.estuary.tech", "/public/miners/storage/query/{miner}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("miner", miner)
      

}

