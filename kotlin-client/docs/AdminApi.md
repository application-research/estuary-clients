# AdminApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminMinersGet**](AdminApi.md#adminMinersGet) | **GET** /admin/miners/ | Get all miners
[**adminPeeringPeersDelete**](AdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](AdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](AdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](AdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](AdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](AdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
[**adminSystemConfigGet**](AdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
[**adminUsersGet**](AdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users

<a name="adminMinersGet"></a>
# **adminMinersGet**
> ApiminerResp adminMinersGet()

Get all miners

This endpoint returns all miners. Note: value may be cached

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : ApiminerResp = apiInstance.adminMinersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminMinersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminMinersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiminerResp**](ApiminerResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> kotlin.String adminPeeringPeersDelete(body)

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
val body : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Peer ids
try {
    val result : kotlin.String = apiInstance.adminPeeringPeersDelete(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringPeersDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringPeersDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Peer ids |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
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
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringPeersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringPeersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringPeersGet")
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
> kotlin.String adminPeeringPeersPost(body)

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
val body : kotlin.Array<PeeringPeeringPeer> =  // kotlin.Array<PeeringPeeringPeer> | Peering Peer array
try {
    val result : kotlin.String = apiInstance.adminPeeringPeersPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringPeersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringPeersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;PeeringPeeringPeer&gt;**](PeeringPeeringPeer.md)| Peering Peer array |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
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
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringStartPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringStartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringStartPost")
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
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringStatusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringStatusGet")
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
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : kotlin.String = apiInstance.adminPeeringStopPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringStopPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringStopPost")
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

<a name="adminSystemConfigGet"></a>
# **adminSystemConfigGet**
> kotlin.String adminSystemConfigGet()

Get systems(estuary/shuttle) config

This endpoint is used to get system configs.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : kotlin.String = apiInstance.adminSystemConfigGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSystemConfigGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSystemConfigGet")
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

<a name="adminUsersGet"></a>
# **adminUsersGet**
> kotlin.String adminUsersGet()

Get all users

This endpoint is used to get all users.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AdminApi()
try {
    val result : kotlin.String = apiInstance.adminUsersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminUsersGet")
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

