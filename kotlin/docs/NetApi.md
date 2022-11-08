# NetApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**netAddrsGet**](NetApi.md#netAddrsGet) | **GET** /net/addrs | Net Addrs
[**publicMinersFailuresMinerGet**](NetApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicMinersGet**](NetApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
[**publicNetAddrsGet**](NetApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](NetApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers


<a name="netAddrsGet"></a>
# **netAddrsGet**
> kotlin.String netAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = NetApi()
try {
    val result : kotlin.String = apiInstance.netAddrsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetApi#netAddrsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetApi#netAddrsGet")
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

<a name="publicMinersFailuresMinerGet"></a>
# **publicMinersFailuresMinerGet**
> kotlin.String publicMinersFailuresMinerGet(miner)

Get all miners

This endpoint returns all miners

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

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

<a name="publicMinersGet"></a>
# **publicMinersGet**
> kotlin.String publicMinersGet()

Get all miners

This endpoint returns all miners

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = NetApi()
try {
    val result : kotlin.String = apiInstance.publicMinersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetApi#publicMinersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetApi#publicMinersGet")
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

<a name="publicNetAddrsGet"></a>
# **publicNetAddrsGet**
> kotlin.Array&lt;kotlin.String&gt; publicNetAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

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
//import estuary-client.models.*

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

