# swagger.api.NetApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**netAddrsGet**](NetApi.md#netAddrsGet) | **GET** /net/addrs | Net Addrs
[**publicMinersFailuresMinerGet**](NetApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicMinersGet**](NetApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
[**publicNetAddrsGet**](NetApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](NetApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers

# **netAddrsGet**
> String netAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new NetApi();

try {
    var result = api_instance.netAddrsGet();
    print(result);
} catch (e) {
    print("Exception when calling NetApi->netAddrsGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersFailuresMinerGet**
> String publicMinersFailuresMinerGet(miner)

Get all miners

This endpoint returns all miners

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new NetApi();
var miner = miner_example; // String | Filter by miner

try {
    var result = api_instance.publicMinersFailuresMinerGet(miner);
    print(result);
} catch (e) {
    print("Exception when calling NetApi->publicMinersFailuresMinerGet: $e\n");
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

# **publicMinersGet**
> String publicMinersGet()

Get all miners

This endpoint returns all miners

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new NetApi();

try {
    var result = api_instance.publicMinersGet();
    print(result);
} catch (e) {
    print("Exception when calling NetApi->publicMinersGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicNetAddrsGet**
> List<String> publicNetAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new NetApi();

try {
    var result = api_instance.publicNetAddrsGet();
    print(result);
} catch (e) {
    print("Exception when calling NetApi->publicNetAddrsGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicNetPeersGet**
> List<String> publicNetPeersGet()

Net Peers

This endpoint is used to get net peers

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new NetApi();

try {
    var result = api_instance.publicNetPeersGet();
    print(result);
} catch (e) {
    print("Exception when calling NetApi->publicNetPeersGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

