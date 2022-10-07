# MetricsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMetricsDealsOnChainGet**](MetricsApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics


<a name="publicMetricsDealsOnChainGet"></a>
# **publicMetricsDealsOnChainGet**
> publicMetricsDealsOnChainGet()

Get deal metrics

This endpoint is used to get deal metrics

### Example
```java
// Import classes:
//import io.swagger.client.api.MetricsApi;

MetricsApi apiInstance = new MetricsApi();
try {
    apiInstance.publicMetricsDealsOnChainGet();
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#publicMetricsDealsOnChainGet");
    e.printStackTrace();
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

