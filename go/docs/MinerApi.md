# {{classname}}

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MinerClaimMinerGet**](MinerApi.md#MinerClaimMinerGet) | **Get** /miner/claim/{miner} | Get Claim Miner Message
[**MinerClaimPost**](MinerApi.md#MinerClaimPost) | **Post** /miner/claim | Claim Miner
[**MinerSetInfoMinerPut**](MinerApi.md#MinerSetInfoMinerPut) | **Put** /miner/set-info/{miner} | Set Miner Info
[**MinerSuspendMinerPost**](MinerApi.md#MinerSuspendMinerPost) | **Post** /miner/suspend/{miner} | Suspend Miner
[**MinerUnsuspendMinerPut**](MinerApi.md#MinerUnsuspendMinerPut) | **Put** /miner/unsuspend/{miner} | Unuspend Miner
[**PublicMinersDealsMinerGet**](MinerApi.md#PublicMinersDealsMinerGet) | **Get** /public/miners/deals/{miner} | Get all miners deals
[**PublicMinersStatsMinerGet**](MinerApi.md#PublicMinersStatsMinerGet) | **Get** /public/miners/stats/{miner} | Get miner stats

# **MinerClaimMinerGet**
> GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse MinerClaimMinerGet(ctx, miner)
Get Claim Miner Message

This endpoint lets a user get the message in order to claim a miner

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **miner** | **string**| Miner claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse**](github_com_application-research_estuary_api_v1.claimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MinerClaimPost**
> GithubComApplicationResearchEstuaryApiV1ClaimResponse MinerClaimPost(ctx, body)
Claim Miner

This endpoint lets a user claim a miner

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Miner Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV1ClaimResponse**](github_com_application-research_estuary_api_v1.claimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MinerSetInfoMinerPut**
> map[string]string MinerSetInfoMinerPut(ctx, body, miner)
Set Miner Info

This endpoint lets a user set miner info.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Miner set info params | 
  **miner** | **string**| Miner to set info for | 

### Return type

**map[string]string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MinerSuspendMinerPost**
> map[string]string MinerSuspendMinerPost(ctx, body, miner)
Suspend Miner

This endpoint lets a user suspend a miner.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Miner Body | 
  **miner** | **string**| Miner to suspend | 

### Return type

**map[string]string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MinerUnsuspendMinerPut**
> map[string]string MinerUnsuspendMinerPut(ctx, miner)
Unuspend Miner

This endpoint lets a user unsuspend a miner.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **miner** | **string**| Miner to unsuspend | 

### Return type

**map[string]string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PublicMinersDealsMinerGet**
> string PublicMinersDealsMinerGet(ctx, miner, optional)
Get all miners deals

This endpoint returns all miners deals

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **miner** | **string**| Filter by miner | 
 **optional** | ***MinerApiPublicMinersDealsMinerGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a MinerApiPublicMinersDealsMinerGetOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ignoreFailed** | **optional.String**| Ignore Failed | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PublicMinersStatsMinerGet**
> string PublicMinersStatsMinerGet(ctx, miner)
Get miner stats

This endpoint returns miner stats

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **miner** | **string**| Filter by miner | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

