# {{classname}}

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StorageProvidersClaimPost**](SpApi.md#StorageProvidersClaimPost) | **Post** /storage-providers/claim | Claim Storage Provider
[**StorageProvidersClaimSpGet**](SpApi.md#StorageProvidersClaimSpGet) | **Get** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**StorageProvidersDealsSpGet**](SpApi.md#StorageProvidersDealsSpGet) | **Get** /storage-providers/deals/{sp} | Get all storage providers deals
[**StorageProvidersFailuresSpGet**](SpApi.md#StorageProvidersFailuresSpGet) | **Get** /storage-providers/failures/{sp} | Get all storage providers
[**StorageProvidersGet**](SpApi.md#StorageProvidersGet) | **Get** /storage-providers | Get all storage providers
[**StorageProvidersSetInfoSpPut**](SpApi.md#StorageProvidersSetInfoSpPut) | **Put** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**StorageProvidersStatsSpGet**](SpApi.md#StorageProvidersStatsSpGet) | **Get** /storage-providers/stats/{sp} | Get storage provider stats
[**StorageProvidersSuspendSpPost**](SpApi.md#StorageProvidersSuspendSpPost) | **Post** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**StorageProvidersUnsuspendSpPut**](SpApi.md#StorageProvidersUnsuspendSpPut) | **Put** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

# **StorageProvidersClaimPost**
> GithubComApplicationResearchEstuaryApiV2ClaimResponse StorageProvidersClaimPost(ctx, body)
Claim Storage Provider

This endpoint lets a user claim a storage provider

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](github_com_application-research_estuary_api_v2.claimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersClaimSpGet**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse StorageProvidersClaimSpGet(ctx, sp)
Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **sp** | **string**| Storage Provider claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](github_com_application-research_estuary_api_v2.claimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersDealsSpGet**
> string StorageProvidersDealsSpGet(ctx, sp, optional)
Get all storage providers deals

This endpoint returns all storage providers deals

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **sp** | **string**| Filter by storage provider | 
 **optional** | ***SpApiStorageProvidersDealsSpGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SpApiStorageProvidersDealsSpGetOpts struct
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

# **StorageProvidersFailuresSpGet**
> string StorageProvidersFailuresSpGet(ctx, sp)
Get all storage providers

This endpoint returns all storage providers

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **sp** | **string**| Filter by storage provider | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersGet**
> []ApiStorageProviderResp StorageProvidersGet(ctx, )
Get all storage providers

This endpoint returns all storage providers

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]ApiStorageProviderResp**](api.storageProviderResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersSetInfoSpPut**
> StorageProvidersSetInfoSpPut(ctx, body, sp)
Set Storage Provider Info

This endpoint lets a user set storage provider info.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params | 
  **sp** | **string**| Storage Provider to set info for | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersStatsSpGet**
> string StorageProvidersStatsSpGet(ctx, sp)
Get storage provider stats

This endpoint returns storage provider stats

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **sp** | **string**| Filter by storage provider | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersSuspendSpPost**
> map[string]string StorageProvidersSuspendSpPost(ctx, body, sp)
Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body | 
  **sp** | **string**| Storage Provider to suspend | 

### Return type

**map[string]string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StorageProvidersUnsuspendSpPut**
> StorageProvidersUnsuspendSpPut(ctx, sp)
Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **sp** | **string**| Storage Provider to unsuspend | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

