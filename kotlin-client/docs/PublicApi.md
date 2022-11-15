# PublicApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicByCidCidGet**](PublicApi.md#publicByCidCidGet) | **GET** /public/by-cid/{cid} | Get Content by Cid
[**publicInfoGet**](PublicApi.md#publicInfoGet) | **GET** /public/info | Get public node info
[**publicMetricsDealsOnChainGet**](PublicApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics
[**publicMinersDealsMinerGet**](PublicApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersFailuresMinerGet**](PublicApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicMinersGet**](PublicApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
[**publicMinersStatsMinerGet**](PublicApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats
[**publicNetAddrsGet**](PublicApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](PublicApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers
[**publicStatsGet**](PublicApi.md#publicStatsGet) | **GET** /public/stats | Public stats

<a name="publicByCidCidGet"></a>
# **publicByCidCidGet**
> kotlin.String publicByCidCidGet(cid)

Get Content by Cid

This endpoint returns the content associated with a CID

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
val cid : kotlin.String = cid_example // kotlin.String | Cid
try {
    val result : kotlin.String = apiInstance.publicByCidCidGet(cid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicByCidCidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicByCidCidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **kotlin.String**| Cid |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicInfoGet"></a>
# **publicInfoGet**
> kotlin.String publicInfoGet()

Get public node info

This endpoint returns information about the node

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
try {
    val result : kotlin.String = apiInstance.publicInfoGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicInfoGet")
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

<a name="publicMetricsDealsOnChainGet"></a>
# **publicMetricsDealsOnChainGet**
> kotlin.String publicMetricsDealsOnChainGet()

Get deal metrics

This endpoint is used to get deal metrics

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
try {
    val result : kotlin.String = apiInstance.publicMetricsDealsOnChainGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicMetricsDealsOnChainGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicMetricsDealsOnChainGet")
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

<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> kotlin.String publicMinersDealsMinerGet(miner, ignoreFailed)

Get all miners deals

This endpoint returns all miners deals

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
val ignoreFailed : kotlin.String = ignoreFailed_example // kotlin.String | Ignore Failed
try {
    val result : kotlin.String = apiInstance.publicMinersDealsMinerGet(miner, ignoreFailed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicMinersDealsMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicMinersDealsMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Filter by miner |
 **ignoreFailed** | **kotlin.String**| Ignore Failed | [optional]

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
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    val result : kotlin.String = apiInstance.publicMinersFailuresMinerGet(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicMinersFailuresMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicMinersFailuresMinerGet")
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
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
try {
    val result : kotlin.String = apiInstance.publicMinersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicMinersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicMinersGet")
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

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> kotlin.String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    val result : kotlin.String = apiInstance.publicMinersStatsMinerGet(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicMinersStatsMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicMinersStatsMinerGet")
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

val apiInstance = PublicApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.publicNetAddrsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicNetAddrsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicNetAddrsGet")
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

val apiInstance = PublicApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.publicNetPeersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicNetPeersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicNetPeersGet")
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

<a name="publicStatsGet"></a>
# **publicStatsGet**
> kotlin.String publicStatsGet()

Public stats

This endpoint is used to get public stats.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PublicApi()
try {
    val result : kotlin.String = apiInstance.publicStatsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicApi#publicStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicApi#publicStatsGet")
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

