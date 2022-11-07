# swagger.api.MinerApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMinersDealsMinerGet**](MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersStatsMinerGet**](MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats


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

