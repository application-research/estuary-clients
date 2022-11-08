# swagger.api.PublicApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicByCidCidGet**](PublicApi.md#publicByCidCidGet) | **Get** /public/by-cid/:cid | Get Content by Cid
[**publicInfoGet**](PublicApi.md#publicInfoGet) | **Get** /public/info | Get public node info
[**publicMetricsDealsOnChainGet**](PublicApi.md#publicMetricsDealsOnChainGet) | **Get** /public/metrics/deals-on-chain | Get deal metrics
[**publicMinersDealsMinerGet**](PublicApi.md#publicMinersDealsMinerGet) | **Get** /public/miners/deals/:miner | Get all miners deals
[**publicMinersFailuresMinerGet**](PublicApi.md#publicMinersFailuresMinerGet) | **Get** /public/miners/failures/:miner | Get all miners
[**publicMinersGet**](PublicApi.md#publicMinersGet) | **Get** /public/miners | Get all miners
[**publicMinersStatsMinerGet**](PublicApi.md#publicMinersStatsMinerGet) | **Get** /public/miners/stats/:miner | Get miner stats
[**publicNetAddrsGet**](PublicApi.md#publicNetAddrsGet) | **Get** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](PublicApi.md#publicNetPeersGet) | **Get** /public/net/peers | Net Peers
[**publicStatsGet**](PublicApi.md#publicStatsGet) | **Get** /public/stats | Public stats


# **publicByCidCidGet**
> String publicByCidCidGet(cid)

Get Content by Cid

This endpoint returns the content associated with a CID

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PublicApi();
var cid = cid_example; // String | Cid

try { 
    var result = api_instance.publicByCidCidGet(cid);
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicByCidCidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **String**| Cid | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicInfoGet**
> String publicInfoGet()

Get public node info

This endpoint returns information about the node

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PublicApi();

try { 
    var result = api_instance.publicInfoGet();
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicInfoGet: $e\n");
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

# **publicMetricsDealsOnChainGet**
> String publicMetricsDealsOnChainGet()

Get deal metrics

This endpoint is used to get deal metrics

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PublicApi();

try { 
    var result = api_instance.publicMetricsDealsOnChainGet();
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicMetricsDealsOnChainGet: $e\n");
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

var api_instance = new PublicApi();
var miner = miner_example; // String | Filter by miner
var ignoreFailed = ignoreFailed_example; // String | Ignore Failed

try { 
    var result = api_instance.publicMinersDealsMinerGet(miner, ignoreFailed);
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicMinersDealsMinerGet: $e\n");
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

var api_instance = new PublicApi();
var miner = miner_example; // String | Filter by miner

try { 
    var result = api_instance.publicMinersFailuresMinerGet(miner);
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicMinersFailuresMinerGet: $e\n");
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

var api_instance = new PublicApi();

try { 
    var result = api_instance.publicMinersGet();
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicMinersGet: $e\n");
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

var api_instance = new PublicApi();
var miner = miner_example; // String | Filter by miner

try { 
    var result = api_instance.publicMinersStatsMinerGet(miner);
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicMinersStatsMinerGet: $e\n");
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

var api_instance = new PublicApi();

try { 
    var result = api_instance.publicNetAddrsGet();
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicNetAddrsGet: $e\n");
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

var api_instance = new PublicApi();

try { 
    var result = api_instance.publicNetPeersGet();
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicNetPeersGet: $e\n");
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

# **publicStatsGet**
> String publicStatsGet()

Public stats

This endpoint is used to get public stats.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PublicApi();

try { 
    var result = api_instance.publicStatsGet();
    print(result);
} catch (e) {
    print("Exception when calling PublicApi->publicStatsGet: $e\n");
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

