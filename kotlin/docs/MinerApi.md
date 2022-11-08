# MinerApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMinersDealsMinerGet**](MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersStatsMinerGet**](MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats


<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> kotlin.String publicMinersDealsMinerGet(miner, ignoreFailed)

Get all miners deals

This endpoint returns all miners deals

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
val ignoreFailed : kotlin.String = ignoreFailed_example // kotlin.String | Ignore Failed
try {
    val result : kotlin.String = apiInstance.publicMinersDealsMinerGet(miner, ignoreFailed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#publicMinersDealsMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#publicMinersDealsMinerGet")
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

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> kotlin.String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    val result : kotlin.String = apiInstance.publicMinersStatsMinerGet(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#publicMinersStatsMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#publicMinersStatsMinerGet")
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

