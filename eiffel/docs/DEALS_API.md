# DEALS_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**deal_estimate_post**](DEALS_API.md#deal_estimate_post) | **Post** /deal/estimate | Estimate the cost of a deal
[**deal_info_dealid_get**](DEALS_API.md#deal_info_dealid_get) | **Get** /deal/info/{dealid} | Get Deal Info
[**deal_proposal_propcid_get**](DEALS_API.md#deal_proposal_propcid_get) | **Get** /deal/proposal/{propcid} | Get Proposal
[**deal_query_miner_get**](DEALS_API.md#deal_query_miner_get) | **Get** /deal/query/{miner} | Query Ask
[**deal_status_by_proposal_propcid_get**](DEALS_API.md#deal_status_by_proposal_propcid_get) | **Get** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**deal_status_miner_propcid_get**](DEALS_API.md#deal_status_miner_propcid_get) | **Get** /deal/status/{miner}/{propcid} | Deal Status
[**deal_transfer_in_progress_get**](DEALS_API.md#deal_transfer_in_progress_get) | **Get** /deal/transfer/in-progress | Transfer In Progress
[**deal_transfer_status_post**](DEALS_API.md#deal_transfer_status_post) | **Post** /deal/transfer/status | Transfer Status
[**deals_failures_get**](DEALS_API.md#deals_failures_get) | **Get** /deals/failures | Get storage failures for user
[**deals_make_miner_post**](DEALS_API.md#deals_make_miner_post) | **Post** /deals/make/{miner} | Make Deal
[**deals_status_deal_get**](DEALS_API.md#deals_status_deal_get) | **Get** /deals/status/{deal} | Get Deal Status
[**public_deals_failures_get**](DEALS_API.md#public_deals_failures_get) | **Get** /public/deals/failures | Get storage failures
[**public_miners_storage_query_miner_get**](DEALS_API.md#public_miners_storage_query_miner_get) | **Get** /public/miners/storage/query/{miner} | Query Ask


# **deal_estimate_post**
> deal_estimate_post (body: MAIN_ESTIMATE_DEAL_BODY ): detachable STRING_32
	

Estimate the cost of a deal

This endpoint estimates the cost of a deal


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MAIN_ESTIMATE_DEAL_BODY**](MAIN_ESTIMATE_DEAL_BODY.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_info_dealid_get**
> deal_info_dealid_get (dealid: INTEGER_32 ): detachable STRING_32
	

Get Deal Info

This endpoint returns the deal info for a deal


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealid** | **INTEGER_32**| Deal ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_proposal_propcid_get**
> deal_proposal_propcid_get (propcid: STRING_32 ): detachable STRING_32
	

Get Proposal

This endpoint returns the proposal for a deal


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **STRING_32**| Proposal CID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_query_miner_get**
> deal_query_miner_get (miner: STRING_32 ): detachable STRING_32
	

Query Ask

This endpoint returns the ask for a given CID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **STRING_32**| CID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_status_by_proposal_propcid_get**
> deal_status_by_proposal_propcid_get (propcid: STRING_32 ): detachable STRING_32
	

Get Deal Status by PropCid

Get Deal Status by PropCid


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **STRING_32**| PropCid | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_status_miner_propcid_get**
> deal_status_miner_propcid_get (miner: STRING_32 ; propcid: STRING_32 ): detachable STRING_32
	

Deal Status

This endpoint returns the status of a deal


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **STRING_32**| Miner | 
 **propcid** | **STRING_32**| Proposal CID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_transfer_in_progress_get**
> deal_transfer_in_progress_get : detachable STRING_32
	

Transfer In Progress

This endpoint returns the in-progress transfers


### Parameters
This endpoint does not need any parameter.

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deal_transfer_status_post**
> deal_transfer_status_post (chanid: MAIN_CHANNEL_ID_PARAM ): detachable STRING_32
	

Transfer Status

This endpoint returns the status of a transfer


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chanid** | [**MAIN_CHANNEL_ID_PARAM**](MAIN_CHANNEL_ID_PARAM.md)| Channel ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deals_failures_get**
> deals_failures_get : detachable STRING_32
	

Get storage failures for user

This endpoint returns a list of storage failures for user


### Parameters
This endpoint does not need any parameter.

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deals_make_miner_post**
> deals_make_miner_post (miner: STRING_32 ; deal_request: STRING_32 ): detachable STRING_32
	

Make Deal

This endpoint makes a deal for a given content and miner


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **STRING_32**| Miner | 
 **deal_request** | **STRING_32**| Deal Request | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deals_status_deal_get**
> deals_status_deal_get (deal: INTEGER_32 ): detachable STRING_32
	

Get Deal Status

This endpoint returns the status of a deal


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deal** | **INTEGER_32**| Deal ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_deals_failures_get**
> public_deals_failures_get : detachable STRING_32
	

Get storage failures

This endpoint returns a list of storage failures


### Parameters
This endpoint does not need any parameter.

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_miners_storage_query_miner_get**
> public_miners_storage_query_miner_get (miner: STRING_32 ): detachable STRING_32
	

Query Ask

This endpoint returns the ask for a given CID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **STRING_32**| CID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

