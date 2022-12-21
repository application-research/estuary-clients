# swagger.api.SpApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storageProvidersClaimPost**](SpApi.md#storageProvidersClaimPost) | **POST** /storage-providers/claim | Claim Storage Provider
[**storageProvidersClaimSpGet**](SpApi.md#storageProvidersClaimSpGet) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**storageProvidersDealsSpGet**](SpApi.md#storageProvidersDealsSpGet) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
[**storageProvidersFailuresSpGet**](SpApi.md#storageProvidersFailuresSpGet) | **GET** /storage-providers/failures/{sp} | Get all storage providers
[**storageProvidersGet**](SpApi.md#storageProvidersGet) | **GET** /storage-providers | Get all storage providers
[**storageProvidersSetInfoSpPut**](SpApi.md#storageProvidersSetInfoSpPut) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**storageProvidersStatsSpGet**](SpApi.md#storageProvidersStatsSpGet) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
[**storageProvidersSuspendSpPost**](SpApi.md#storageProvidersSuspendSpPost) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**storageProvidersUnsuspendSpPut**](SpApi.md#storageProvidersUnsuspendSpPut) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

# **storageProvidersClaimPost**
> GithubComApplicationResearchEstuaryApiV2ClaimResponse storageProvidersClaimPost(body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var body = new MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Storage Provider Body

try {
    var result = api_instance.storageProvidersClaimPost(body);
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersClaimPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersClaimSpGet**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storageProvidersClaimSpGet(sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var sp = sp_example; // String | Storage Provider claim message

try {
    var result = api_instance.storageProvidersClaimSpGet(sp);
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersClaimSpGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Storage Provider claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersDealsSpGet**
> String storageProvidersDealsSpGet(sp, ignoreFailed)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var sp = sp_example; // String | Filter by storage provider
var ignoreFailed = ignoreFailed_example; // String | Ignore Failed

try {
    var result = api_instance.storageProvidersDealsSpGet(sp, ignoreFailed);
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersDealsSpGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider | 
 **ignoreFailed** | **String**| Ignore Failed | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersFailuresSpGet**
> String storageProvidersFailuresSpGet(sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var sp = sp_example; // String | Filter by storage provider

try {
    var result = api_instance.storageProvidersFailuresSpGet(sp);
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersFailuresSpGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersGet**
> List<ApiStorageProviderResp> storageProvidersGet()

Get all storage providers

This endpoint returns all storage providers

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();

try {
    var result = api_instance.storageProvidersGet();
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ApiStorageProviderResp>**](ApiStorageProviderResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersSetInfoSpPut**
> storageProvidersSetInfoSpPut(body, sp)

Set Storage Provider Info

This endpoint lets a user set storage provider info.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var body = new MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Storage Provider set info params
var sp = sp_example; // String | Storage Provider to set info for

try {
    api_instance.storageProvidersSetInfoSpPut(body, sp);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersSetInfoSpPut: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params | 
 **sp** | **String**| Storage Provider to set info for | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersStatsSpGet**
> String storageProvidersStatsSpGet(sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var sp = sp_example; // String | Filter by storage provider

try {
    var result = api_instance.storageProvidersStatsSpGet(sp);
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersStatsSpGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersSuspendSpPost**
> Map<String, String> storageProvidersSuspendSpPost(body, sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var body = new MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Storage Provider Body
var sp = sp_example; // String | Storage Provider to suspend

try {
    var result = api_instance.storageProvidersSuspendSpPost(body, sp);
    print(result);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersSuspendSpPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body | 
 **sp** | **String**| Storage Provider to suspend | 

### Return type

**Map<String, String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **storageProvidersUnsuspendSpPut**
> storageProvidersUnsuspendSpPut(sp)

Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new SpApi();
var sp = sp_example; // String | Storage Provider to unsuspend

try {
    api_instance.storageProvidersUnsuspendSpPut(sp);
} catch (e) {
    print("Exception when calling SpApi->storageProvidersUnsuspendSpPut: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Storage Provider to unsuspend | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

