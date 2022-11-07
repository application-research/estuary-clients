# swagger.api.PinningApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object


# **pinningPinsGet**
> String pinningPinsGet()

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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidDelete**
> String pinningPinsPinidDelete(pinid)

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
    var result = api_instance.pinningPinsPinidDelete(pinid);
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPinidDelete: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidGet**
> String pinningPinsPinidGet(pinid)

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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidPost**
> String pinningPinsPinidPost(pinid)

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
var pinid = pinid_example; // String | Pin ID

try { 
    var result = api_instance.pinningPinsPinidPost(pinid);
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPinidPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPost**
> String pinningPinsPost(pin)

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
var pin = new TypesIpfsPin(); // TypesIpfsPin | Pin Body {cid:cid, name:name}

try { 
    var result = api_instance.pinningPinsPost(pin);
    print(result);
} catch (e) {
    print("Exception when calling PinningApi->pinningPinsPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**TypesIpfsPin**](TypesIpfsPin.md)| Pin Body {cid:cid, name:name} | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

