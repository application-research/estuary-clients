# swagger.api.AutoretrieveApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAutoretrieveInitPost**](AutoretrieveApi.md#adminAutoretrieveInitPost) | **Post** /admin/autoretrieve/init | Register autoretrieve server
[**adminAutoretrieveListGet**](AutoretrieveApi.md#adminAutoretrieveListGet) | **Get** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieveHeartbeatPost**](AutoretrieveApi.md#autoretrieveHeartbeatPost) | **Post** /autoretrieve/heartbeat | Marks autoretrieve server as up


# **adminAutoretrieveInitPost**
> adminAutoretrieveInitPost(addresses, pubKey)

Register autoretrieve server

This endpoint registers a new autoretrieve server

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new AutoretrieveApi();
var addresses = new String(); // String | Autoretrieve's comma-separated list of addresses
var pubKey = new String(); // String | Autoretrieve's public key

try { 
    api_instance.adminAutoretrieveInitPost(addresses, pubKey);
} catch (e) {
    print("Exception when calling AutoretrieveApi->adminAutoretrieveInitPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addresses** | **String**| Autoretrieve&#39;s comma-separated list of addresses | 
 **pubKey** | **String**| Autoretrieve&#39;s public key | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminAutoretrieveListGet**
> adminAutoretrieveListGet()

List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new AutoretrieveApi();

try { 
    api_instance.adminAutoretrieveListGet();
} catch (e) {
    print("Exception when calling AutoretrieveApi->adminAutoretrieveListGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **autoretrieveHeartbeatPost**
> autoretrieveHeartbeatPost(token)

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new AutoretrieveApi();
var token = token_example; // String | Autoretrieve's auth token

try { 
    api_instance.autoretrieveHeartbeatPost(token);
} catch (e) {
    print("Exception when calling AutoretrieveApi->autoretrieveHeartbeatPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Autoretrieve&#39;s auth token | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

