# swagger.api.NetApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**netAddrsGet**](NetApi.md#netAddrsGet) | **Get** /net/addrs | Net Addrs
[**publicMinersFailuresMinerGet**](NetApi.md#publicMinersFailuresMinerGet) | **Get** /public/miners/failures/:miner | Get all miners
[**publicMinersGet**](NetApi.md#publicMinersGet) | **Get** /public/miners | Get all miners
[**publicNetAddrsGet**](NetApi.md#publicNetAddrsGet) | **Get** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](NetApi.md#publicNetPeersGet) | **Get** /public/net/peers | Net Peers


# **netAddrsGet**
> List<String> netAddrsGet()

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

**List<String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersFailuresMinerGet**
> publicMinersFailuresMinerGet(miner)

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
    api_instance.publicMinersFailuresMinerGet(miner);
} catch (e) {
    print("Exception when calling NetApi->publicMinersFailuresMinerGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersGet**
> publicMinersGet()

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
    api_instance.publicMinersGet();
} catch (e) {
    print("Exception when calling NetApi->publicMinersGet: $e\n");
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

