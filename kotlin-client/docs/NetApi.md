# NetApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminMinersGet**](NetApi.md#adminMinersGet) | **GET** /admin/miners/ | Get all miners
[**publicMinersFailuresMinerGet**](NetApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicNetAddrsGet**](NetApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](NetApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers

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

val apiInstance = NetApi()
try {
    val result : ApiminerResp = apiInstance.adminMinersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetApi#adminMinersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetApi#adminMinersGet")
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

<a name="publicMinersFailuresMinerGet"></a>
# **publicMinersFailuresMinerGet**
> kotlin.String publicMinersFailuresMinerGet(miner)

Get all miners

This endpoint returns all miners

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NetApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    val result : kotlin.String = apiInstance.publicMinersFailuresMinerGet(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetApi#publicMinersFailuresMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetApi#publicMinersFailuresMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Filter by miner |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicNetAddrsGet"></a>
# **publicNetAddrsGet**
> kotlin.Array&lt;kotlin.String&gt; publicNetAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NetApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.publicNetAddrsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetApi#publicNetAddrsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetApi#publicNetAddrsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicNetPeersGet"></a>
# **publicNetPeersGet**
> kotlin.Array&lt;kotlin.String&gt; publicNetPeersGet()

Net Peers

This endpoint is used to get net peers

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = NetApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.publicNetPeersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetApi#publicNetPeersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetApi#publicNetPeersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

