# PinningApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object

<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> PinnerIpfsListPinStatusResponse pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PinningApi()
try {
    val result : PinnerIpfsListPinStatusResponse = apiInstance.pinningPinsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinningApi#pinningPinsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinningApi#pinningPinsGet")
    e.printStackTrace()
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

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PinningApi()
val pinid : kotlin.String = pinid_example // kotlin.String | Pin ID
try {
    apiInstance.pinningPinsPinidDelete(pinid)
} catch (e: ClientException) {
    println("4xx response calling PinningApi#pinningPinsPinidDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinningApi#pinningPinsPinidDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **kotlin.String**| Pin ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> PinnerIpfsPinStatusResponse pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PinningApi()
val pinid : kotlin.String = pinid_example // kotlin.String | cid
try {
    val result : PinnerIpfsPinStatusResponse = apiInstance.pinningPinsPinidGet(pinid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinningApi#pinningPinsPinidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinningApi#pinningPinsPinidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **kotlin.String**| cid |

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> PinnerIpfsPinStatusResponse pinningPinsPinidPost(body, pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PinningApi()
val body : PinnerIpfsPin =  // PinnerIpfsPin | New pin
val pinid : kotlin.String = pinid_example // kotlin.String | Pin ID to be replaced
try {
    val result : PinnerIpfsPinStatusResponse = apiInstance.pinningPinsPinidPost(body, pinid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinningApi#pinningPinsPinidPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinningApi#pinningPinsPinidPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| New pin |
 **pinid** | **kotlin.String**| Pin ID to be replaced |

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> PinnerIpfsPinStatusResponse pinningPinsPost(body, ignoreDupes, overwrite)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PinningApi()
val body : PinnerIpfsPin =  // PinnerIpfsPin | Pin Body {cid:cid, name:name}
val ignoreDupes : kotlin.String = ignoreDupes_example // kotlin.String | Ignore Dupes
val overwrite : kotlin.String = overwrite_example // kotlin.String | Overwrite conflicting files in collections
try {
    val result : PinnerIpfsPinStatusResponse = apiInstance.pinningPinsPost(body, ignoreDupes, overwrite)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinningApi#pinningPinsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinningApi#pinningPinsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| Pin Body {cid:cid, name:name} |
 **ignoreDupes** | **kotlin.String**| Ignore Dupes | [optional]
 **overwrite** | **kotlin.String**| Overwrite conflicting files in collections | [optional]

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

