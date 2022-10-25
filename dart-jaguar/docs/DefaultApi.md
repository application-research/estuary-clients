# swagger.api.DefaultApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealTransferStatusPost**](DefaultApi.md#dealTransferStatusPost) | **Post** /deal/transfer/status | 


# **dealTransferStatusPost**
> dealTransferStatusPost()



### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DefaultApi();

try { 
    api_instance.dealTransferStatusPost();
} catch (e) {
    print("Exception when calling DefaultApi->dealTransferStatusPost: $e\n");
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
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

