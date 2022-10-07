# AutoretrieveApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAutoretrieveInitPost**](AutoretrieveApi.md#adminAutoretrieveInitPost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
[**adminAutoretrieveListGet**](AutoretrieveApi.md#adminAutoretrieveListGet) | **GET** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieveHeartbeatPost**](AutoretrieveApi.md#autoretrieveHeartbeatPost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up


<a name="adminAutoretrieveInitPost"></a>
# **adminAutoretrieveInitPost**
> adminAutoretrieveInitPost(addresses, pubKey)

Register autoretrieve server

This endpoint registers a new autoretrieve server

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AutoretrieveApi()
val addresses : kotlin.String = addresses_example // kotlin.String | Autoretrieve's comma-separated list of addresses
val pubKey : kotlin.String = pubKey_example // kotlin.String | Autoretrieve's public key
try {
    apiInstance.adminAutoretrieveInitPost(addresses, pubKey)
} catch (e: ClientException) {
    println("4xx response calling AutoretrieveApi#adminAutoretrieveInitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoretrieveApi#adminAutoretrieveInitPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addresses** | **kotlin.String**| Autoretrieve&#39;s comma-separated list of addresses |
 **pubKey** | **kotlin.String**| Autoretrieve&#39;s public key |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminAutoretrieveListGet"></a>
# **adminAutoretrieveListGet**
> adminAutoretrieveListGet()

List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AutoretrieveApi()
try {
    apiInstance.adminAutoretrieveListGet()
} catch (e: ClientException) {
    println("4xx response calling AutoretrieveApi#adminAutoretrieveListGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoretrieveApi#adminAutoretrieveListGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="autoretrieveHeartbeatPost"></a>
# **autoretrieveHeartbeatPost**
> autoretrieveHeartbeatPost(token)

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AutoretrieveApi()
val token : kotlin.String = token_example // kotlin.String | Autoretrieve's auth token
try {
    apiInstance.autoretrieveHeartbeatPost(token)
} catch (e: ClientException) {
    println("4xx response calling AutoretrieveApi#autoretrieveHeartbeatPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoretrieveApi#autoretrieveHeartbeatPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Autoretrieve&#39;s auth token |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

