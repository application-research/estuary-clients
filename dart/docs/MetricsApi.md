# swagger.api.MetricsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMetricsDealsOnChainGet**](MetricsApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics

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

var api_instance = new MetricsApi();

try {
    var result = api_instance.publicMetricsDealsOnChainGet();
    print(result);
} catch (e) {
    print("Exception when calling MetricsApi->publicMetricsDealsOnChainGet: $e\n");
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

