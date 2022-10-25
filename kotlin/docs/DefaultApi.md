# DefaultApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealTransferStatusPost**](DefaultApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | 


<a name="dealTransferStatusPost"></a>
# **dealTransferStatusPost**
> dealTransferStatusPost()



### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DefaultApi()
try {
    apiInstance.dealTransferStatusPost()
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dealTransferStatusPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dealTransferStatusPost")
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
 - **Accept**: Not defined

