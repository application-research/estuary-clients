# MetricsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMetricsDealsOnChainGet**](MetricsApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics


<a name="publicMetricsDealsOnChainGet"></a>
# **publicMetricsDealsOnChainGet**
> kotlin.String publicMetricsDealsOnChainGet()

Get deal metrics

This endpoint is used to get deal metrics

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = MetricsApi()
try {
    val result : kotlin.String = apiInstance.publicMetricsDealsOnChainGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#publicMetricsDealsOnChainGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#publicMetricsDealsOnChainGet")
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

