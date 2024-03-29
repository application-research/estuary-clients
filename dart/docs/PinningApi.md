# swagger.api.PinningApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object

# **pinningPinsGet**
> PinnerIpfsListPinStatusResponse pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PinningApi();

try {
    var result = api_instance.pinningPinsGet();
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PinnerIpfsListPinStatusResponse**](PinnerIpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidDelete**
> pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PinningApi();
var pinid = pinid_example; // String | Pin ID

try {
    api_instance.pinningPinsPinidDelete(pinid);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPinidDelete: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidGet**
> PinnerIpfsPinStatusResponse pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PinningApi();
var pinid = pinid_example; // String | cid

try {
    var result = api_instance.pinningPinsPinidGet(pinid);
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPinidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| cid | 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidPost**
> PinnerIpfsPinStatusResponse pinningPinsPinidPost(body, pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PinningApi();
var body = new PinnerIpfsPin(); // PinnerIpfsPin | New pin
var pinid = pinid_example; // String | Pin ID to be replaced

try {
    var result = api_instance.pinningPinsPinidPost(body, pinid);
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPinidPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| New pin | 
 **pinid** | **String**| Pin ID to be replaced | 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPost**
> PinnerIpfsPinStatusResponse pinningPinsPost(body, ignoreDupes, overwrite)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new PinningApi();
var body = new PinnerIpfsPin(); // PinnerIpfsPin | Pin Body {cid:cid, name:name}
var ignoreDupes = ignoreDupes_example; // String | Ignore Dupes
var overwrite = overwrite_example; // String | Overwrite conflicting files in collections

try {
    var result = api_instance.pinningPinsPost(body, ignoreDupes, overwrite);
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| Pin Body {cid:cid, name:name} | 
 **ignoreDupes** | **String**| Ignore Dupes | [optional] 
 **overwrite** | **String**| Overwrite conflicting files in collections | [optional] 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

