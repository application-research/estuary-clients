# swagger.api.MinerApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**minerClaimMinerGet**](MinerApi.md#minerClaimMinerGet) | **GET** /miner/claim/{miner} | Get Claim Miner Message
[**minerClaimPost**](MinerApi.md#minerClaimPost) | **POST** /miner/claim | Claim Miner
[**minerSetInfoMinerPut**](MinerApi.md#minerSetInfoMinerPut) | **PUT** /miner/set-info/{miner} | Set Miner Info
[**minerSuspendMinerPost**](MinerApi.md#minerSuspendMinerPost) | **POST** /miner/suspend/{miner} | Suspend Miner
[**minerUnsuspendMinerPut**](MinerApi.md#minerUnsuspendMinerPut) | **PUT** /miner/unsuspend/{miner} | Unuspend Miner
[**publicMinersDealsMinerGet**](MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersStatsMinerGet**](MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats

# **minerClaimMinerGet**
> ApiClaimMsgResponse minerClaimMinerGet(miner)

Get Claim Miner Message

This endpoint lets a user get the message in order to claim a miner

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var miner = miner_example; // String | Miner claim message

try {
    var result = api_instance.minerClaimMinerGet(miner);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->minerClaimMinerGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner claim message | 

### Return type

[**ApiClaimMsgResponse**](ApiClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **minerClaimPost**
> ApiClaimResponse minerClaimPost(body)

Claim Miner

This endpoint lets a user claim a miner

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var body = new MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Miner Body

try {
    var result = api_instance.minerClaimPost(body);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->minerClaimPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Miner Body | 

### Return type

[**ApiClaimResponse**](ApiClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **minerSetInfoMinerPut**
> ApiEmptyResp minerSetInfoMinerPut(body, miner)

Set Miner Info

This endpoint lets a user set miner info.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var body = new MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Miner set info params
var miner = miner_example; // String | Miner to set info for

try {
    var result = api_instance.minerSetInfoMinerPut(body, miner);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->minerSetInfoMinerPut: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Miner set info params | 
 **miner** | **String**| Miner to set info for | 

### Return type

[**ApiEmptyResp**](ApiEmptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **minerSuspendMinerPost**
> ApiEmptyResp minerSuspendMinerPost(body, miner)

Suspend Miner

This endpoint lets a user suspend a miner.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var body = new MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Miner Body
var miner = miner_example; // String | Miner to suspend

try {
    var result = api_instance.minerSuspendMinerPost(body, miner);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->minerSuspendMinerPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Miner Body | 
 **miner** | **String**| Miner to suspend | 

### Return type

[**ApiEmptyResp**](ApiEmptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **minerUnsuspendMinerPut**
> ApiEmptyResp minerUnsuspendMinerPut(miner)

Unuspend Miner

This endpoint lets a user unsuspend a miner.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var miner = miner_example; // String | Miner to unsuspend

try {
    var result = api_instance.minerUnsuspendMinerPut(miner);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->minerUnsuspendMinerPut: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner to unsuspend | 

### Return type

[**ApiEmptyResp**](ApiEmptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersDealsMinerGet**
> String publicMinersDealsMinerGet(miner, ignoreFailed)

Get all miners deals

This endpoint returns all miners deals

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var miner = miner_example; // String | Filter by miner
var ignoreFailed = ignoreFailed_example; // String | Ignore Failed

try {
    var result = api_instance.publicMinersDealsMinerGet(miner, ignoreFailed);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->publicMinersDealsMinerGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 
 **ignoreFailed** | **String**| Ignore Failed | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersStatsMinerGet**
> String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new MinerApi();
var miner = miner_example; // String | Filter by miner

try {
    var result = api_instance.publicMinersStatsMinerGet(miner);
    print(result);
} catch (e) {
    print("Exception when calling MinerApi->publicMinersStatsMinerGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

