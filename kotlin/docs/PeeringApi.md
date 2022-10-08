# PeeringApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](PeeringApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](PeeringApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](PeeringApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](PeeringApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](PeeringApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](PeeringApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering


<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> adminPeeringPeersDelete()

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = PeeringApi()
try {
    apiInstance.adminPeeringPeersDelete()
} catch (e: ClientException) {
    println("4xx response calling PeeringApi#adminPeeringPeersDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeeringApi#adminPeeringPeersDelete")
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

<a name="adminPeeringPeersGet"></a>
# **adminPeeringPeersGet**
> adminPeeringPeersGet()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = PeeringApi()
try {
    apiInstance.adminPeeringPeersGet()
} catch (e: ClientException) {
    println("4xx response calling PeeringApi#adminPeeringPeersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeeringApi#adminPeeringPeersGet")
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

<a name="adminPeeringPeersPost"></a>
# **adminPeeringPeersPost**
> adminPeeringPeersPost()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = PeeringApi()
try {
    apiInstance.adminPeeringPeersPost()
} catch (e: ClientException) {
    println("4xx response calling PeeringApi#adminPeeringPeersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeeringApi#adminPeeringPeersPost")
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

<a name="adminPeeringStartPost"></a>
# **adminPeeringStartPost**
> adminPeeringStartPost()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = PeeringApi()
try {
    apiInstance.adminPeeringStartPost()
} catch (e: ClientException) {
    println("4xx response calling PeeringApi#adminPeeringStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeeringApi#adminPeeringStartPost")
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

<a name="adminPeeringStatusGet"></a>
# **adminPeeringStatusGet**
> adminPeeringStatusGet()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = PeeringApi()
try {
    apiInstance.adminPeeringStatusGet()
} catch (e: ClientException) {
    println("4xx response calling PeeringApi#adminPeeringStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeeringApi#adminPeeringStatusGet")
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

<a name="adminPeeringStopPost"></a>
# **adminPeeringStopPost**
> adminPeeringStopPost()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = PeeringApi()
try {
    apiInstance.adminPeeringStopPost()
} catch (e: ClientException) {
    println("4xx response calling PeeringApi#adminPeeringStopPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PeeringApi#adminPeeringStopPost")
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

