# PinningApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object

<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> PinnerIpfsListPinStatusResponse pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PinningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

PinningApi apiInstance = new PinningApi();
try {
    PinnerIpfsListPinStatusResponse result = apiInstance.pinningPinsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PinnerIpfsListPinStatusResponse**](PinnerIpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PinningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

PinningApi apiInstance = new PinningApi();
String pinid = "pinid_example"; // String | Pin ID
try {
    apiInstance.pinningPinsPinidDelete(pinid);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsPinidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> PinnerIpfsPinStatusResponse pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PinningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

PinningApi apiInstance = new PinningApi();
String pinid = "pinid_example"; // String | cid
try {
    PinnerIpfsPinStatusResponse result = apiInstance.pinningPinsPinidGet(pinid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsPinidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| cid |

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> PinnerIpfsPinStatusResponse pinningPinsPinidPost(body, pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PinningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

PinningApi apiInstance = new PinningApi();
PinnerIpfsPin body = new PinnerIpfsPin(); // PinnerIpfsPin | New pin
String pinid = "pinid_example"; // String | Pin ID to be replaced
try {
    PinnerIpfsPinStatusResponse result = apiInstance.pinningPinsPinidPost(body, pinid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsPinidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| New pin |
 **pinid** | **String**| Pin ID to be replaced |

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> PinnerIpfsPinStatusResponse pinningPinsPost(body, ignoreDupes, overwrite)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PinningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

PinningApi apiInstance = new PinningApi();
PinnerIpfsPin body = new PinnerIpfsPin(); // PinnerIpfsPin | Pin Body {cid:cid, name:name}
String ignoreDupes = "ignoreDupes_example"; // String | Ignore Dupes
String overwrite = "overwrite_example"; // String | Overwrite conflicting files in collections
try {
    PinnerIpfsPinStatusResponse result = apiInstance.pinningPinsPost(body, ignoreDupes, overwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| Pin Body {cid:cid, name:name} |
 **ignoreDupes** | **String**| Ignore Dupes | [optional]
 **overwrite** | **String**| Overwrite conflicting files in collections | [optional]

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

