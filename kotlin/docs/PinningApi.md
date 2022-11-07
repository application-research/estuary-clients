# PinningApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object


<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> kotlin.String pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PinningApi()
try {
    val result : kotlin.String = apiInstance.pinningPinsGet()
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> kotlin.String pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PinningApi()
val pinid : kotlin.String = pinid_example // kotlin.String | Pin ID
try {
    val result : kotlin.String = apiInstance.pinningPinsPinidDelete(pinid)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> kotlin.String pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PinningApi()
val pinid : kotlin.String = pinid_example // kotlin.String | cid
try {
    val result : kotlin.String = apiInstance.pinningPinsPinidGet(pinid)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> kotlin.String pinningPinsPinidPost(pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PinningApi()
val pinid : kotlin.String = pinid_example // kotlin.String | Pin ID
try {
    val result : kotlin.String = apiInstance.pinningPinsPinidPost(pinid)
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
 **pinid** | **kotlin.String**| Pin ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> kotlin.String pinningPinsPost(pin)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PinningApi()
val pin : TypesIpfsPin =  // TypesIpfsPin | Pin Body {cid:cid, name:name}
try {
    val result : kotlin.String = apiInstance.pinningPinsPost(pin)
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
 **pin** | [**TypesIpfsPin**](TypesIpfsPin.md)| Pin Body {cid:cid, name:name} |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

