# AdminApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](AdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](AdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](AdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](AdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](AdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](AdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
[**adminSystemConfigGet**](AdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
[**adminUsersGet**](AdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users


<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> adminPeeringPeersDelete()

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminPeeringPeersDelete()
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringPeersDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringPeersDelete")
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
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminPeeringPeersGet()
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
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminPeeringPeersPost()
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminPeeringPeersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminPeeringPeersPost")
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
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminPeeringStartPost()
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
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminPeeringStatusGet()
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
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminPeeringStopPost()
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminSystemConfigGet"></a>
# **adminSystemConfigGet**
> adminSystemConfigGet()

Get systems(estuary/shuttle) config

This endpoint is used to get system configs.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminSystemConfigGet()
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminUsersGet"></a>
# **adminUsersGet**
> adminUsersGet()

Get all users

This endpoint is used to get all users.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AdminApi()
try {
    apiInstance.adminUsersGet()
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

