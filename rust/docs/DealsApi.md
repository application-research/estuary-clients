# \DealsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deal_estimate_post**](DealsApi.md#deal_estimate_post) | **Post** /deal/estimate | Estimate the cost of a deal
[**deal_info_dealid_get**](DealsApi.md#deal_info_dealid_get) | **Get** /deal/info/{dealid} | Get Deal Info
[**deal_proposal_propcid_get**](DealsApi.md#deal_proposal_propcid_get) | **Get** /deal/proposal/{propcid} | Get Proposal
[**deal_query_miner_get**](DealsApi.md#deal_query_miner_get) | **Get** /deal/query/{miner} | Query Ask
[**deal_status_by_proposal_propcid_get**](DealsApi.md#deal_status_by_proposal_propcid_get) | **Get** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**deal_status_miner_propcid_get**](DealsApi.md#deal_status_miner_propcid_get) | **Get** /deal/status/{miner}/{propcid} | Deal Status
[**deal_transfer_in_progress_get**](DealsApi.md#deal_transfer_in_progress_get) | **Get** /deal/transfer/in-progress | Transfer In Progress
[**deals_failures_get**](DealsApi.md#deals_failures_get) | **Get** /deals/failures | Get storage failures for user
[**deals_make_miner_post**](DealsApi.md#deals_make_miner_post) | **Post** /deals/make/{miner} | Make Deal
[**deals_status_deal_get**](DealsApi.md#deals_status_deal_get) | **Get** /deals/status/{deal} | Get Deal Status
[**public_deals_failures_get**](DealsApi.md#public_deals_failures_get) | **Get** /public/deals/failures | Get storage failures
[**public_miners_storage_query_miner_get**](DealsApi.md#public_miners_storage_query_miner_get) | **Get** /public/miners/storage/query/{miner} | Query Ask


# **deal_estimate_post**
> deal_estimate_post(ctx, body)
Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **body** | [**MainEstimateDealBody**](MainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_info_dealid_get**
> deal_info_dealid_get(ctx, dealid)
Get Deal Info

This endpoint returns the deal info for a deal

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **dealid** | **i32**| Deal ID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_proposal_propcid_get**
> deal_proposal_propcid_get(ctx, propcid)
Get Proposal

This endpoint returns the proposal for a deal

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **propcid** | **String**| Proposal CID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_query_miner_get**
> deal_query_miner_get(ctx, miner)
Query Ask

This endpoint returns the ask for a given CID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **miner** | **String**| CID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_status_by_proposal_propcid_get**
> deal_status_by_proposal_propcid_get(ctx, propcid)
Get Deal Status by PropCid

Get Deal Status by PropCid

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **propcid** | **String**| PropCid | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_status_miner_propcid_get**
> deal_status_miner_propcid_get(ctx, miner, propcid)
Deal Status

This endpoint returns the status of a deal

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **miner** | **String**| Miner | 
  **propcid** | **String**| Proposal CID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_transfer_in_progress_get**
> deal_transfer_in_progress_get(ctx, )
Transfer In Progress

This endpoint returns the in-progress transfers

### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deals_failures_get**
> deals_failures_get(ctx, )
Get storage failures for user

This endpoint returns a list of storage failures for user

### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deals_make_miner_post**
> deals_make_miner_post(ctx, miner, deal_request)
Make Deal

This endpoint makes a deal for a given content and miner

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **miner** | **String**| Miner | 
  **deal_request** | **String**| Deal Request | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deals_status_deal_get**
> deals_status_deal_get(ctx, deal)
Get Deal Status

This endpoint returns the status of a deal

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **deal** | **i32**| Deal ID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_deals_failures_get**
> public_deals_failures_get(ctx, )
Get storage failures

This endpoint returns a list of storage failures

### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_miners_storage_query_miner_get**
> public_miners_storage_query_miner_get(ctx, miner)
Query Ask

This endpoint returns the ask for a given CID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **miner** | **String**| CID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

