# SwagPinningApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](SwagPinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](SwagPinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](SwagPinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](SwagPinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](SwagPinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object


<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> String pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```java
SwagPinningApi api = new SwagPinningApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.pinningPinsGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> String pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```java
SwagPinningApi api = new SwagPinningApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'pinid' => 'pinid_example'
};

try {
    // cross your fingers
    String result = api.pinningPinsPinidDelete(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> String pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```java
SwagPinningApi api = new SwagPinningApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'pinid' => 'pinid_example'
};

try {
    // cross your fingers
    String result = api.pinningPinsPinidGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> String pinningPinsPinidPost(pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```java
SwagPinningApi api = new SwagPinningApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'pinid' => 'pinid_example'
};

try {
    // cross your fingers
    String result = api.pinningPinsPinidPost(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> String pinningPinsPost(pin)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```java
SwagPinningApi api = new SwagPinningApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'pin' => SwagTypesIpfsPin.getExample()
};

try {
    // cross your fingers
    String result = api.pinningPinsPost(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**SwagTypesIpfsPin**](SwagTypesIpfsPin.md)| Pin Body {cid:cid, name:name} |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

