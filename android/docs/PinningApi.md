# PinningApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object


<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> String pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```java
// Import classes:
//import io.swagger.client.api.PinningApi;

PinningApi apiInstance = new PinningApi();
try {
    String result = apiInstance.pinningPinsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> String pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```java
// Import classes:
//import io.swagger.client.api.PinningApi;

PinningApi apiInstance = new PinningApi();
String pinid = "pinid_example"; // String | Pin ID
try {
    String result = apiInstance.pinningPinsPinidDelete(pinid);
    System.out.println(result);
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> String pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```java
// Import classes:
//import io.swagger.client.api.PinningApi;

PinningApi apiInstance = new PinningApi();
String pinid = "pinid_example"; // String | cid
try {
    String result = apiInstance.pinningPinsPinidGet(pinid);
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> String pinningPinsPinidPost(pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```java
// Import classes:
//import io.swagger.client.api.PinningApi;

PinningApi apiInstance = new PinningApi();
String pinid = "pinid_example"; // String | Pin ID
try {
    String result = apiInstance.pinningPinsPinidPost(pinid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsPinidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> String pinningPinsPost(pin)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```java
// Import classes:
//import io.swagger.client.api.PinningApi;

PinningApi apiInstance = new PinningApi();
TypesIpfsPin pin = new TypesIpfsPin(); // TypesIpfsPin | Pin Body {cid:cid, name:name}
try {
    String result = apiInstance.pinningPinsPost(pin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinningApi#pinningPinsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**TypesIpfsPin**](TypesIpfsPin.md)| Pin Body {cid:cid, name:name} |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

