# DefaultApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**viewerGet**](DefaultApi.md#viewerGet) | **GET** /viewer | Fetch viewer details

<a name="viewerGet"></a>
# **viewerGet**
> UtilViewerResponse viewerGet()

Fetch viewer details

This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
try {
    val result : UtilViewerResponse = apiInstance.viewerGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#viewerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#viewerGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UtilViewerResponse**](UtilViewerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

