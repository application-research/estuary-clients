# MinerApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMinersDealsMinerGet**](MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersStatsMinerGet**](MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats


<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> publicMinersDealsMinerGet(miner)

Get all miners deals

This endpoint returns all miners deals

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    apiInstance.publicMinersDealsMinerGet(miner)
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

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    apiInstance.publicMinersStatsMinerGet(miner)
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

