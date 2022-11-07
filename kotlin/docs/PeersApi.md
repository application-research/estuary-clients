# PeersApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](PeersApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](PeersApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](PeersApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](PeersApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](PeersApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](PeersApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering


<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> kotlin.String adminPeeringPeersDelete(peerIds)

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PeersApi()
val peerIds : kotlin.Array<kotlin.Boolean> =  // kotlin.Array<kotlin.Boolean> | Peer ids
try {
    val result : kotlin.String = apiInstance.adminPeeringPeersDelete(peerIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PeersApi#adminPeeringPeersDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeersApi#adminPeeringPeersDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peerIds** | **kotlin.Array&lt;kotlin.Boolean&gt;**| Peer ids |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringPeersGet"></a>
# **adminPeeringPeersGet**
> kotlin.String adminPeeringPeersGet()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PeersApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringPeersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PeersApi#adminPeeringPeersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeersApi#adminPeeringPeersGet")
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

<a name="adminPeeringPeersPost"></a>
# **adminPeeringPeersPost**
> kotlin.String adminPeeringPeersPost()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PeersApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringPeersPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PeersApi#adminPeeringPeersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeersApi#adminPeeringPeersPost")
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

<a name="adminPeeringStartPost"></a>
# **adminPeeringStartPost**
> kotlin.String adminPeeringStartPost()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PeersApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringStartPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PeersApi#adminPeeringStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeersApi#adminPeeringStartPost")
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

<a name="adminPeeringStatusGet"></a>
# **adminPeeringStatusGet**
> kotlin.String adminPeeringStatusGet()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PeersApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringStatusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PeersApi#adminPeeringStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeersApi#adminPeeringStatusGet")
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

<a name="adminPeeringStopPost"></a>
# **adminPeeringStopPost**
> kotlin.String adminPeeringStopPost()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = PeersApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringStopPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PeersApi#adminPeeringStopPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeersApi#adminPeeringStopPost")
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

