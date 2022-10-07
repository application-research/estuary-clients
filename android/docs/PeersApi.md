# PeersApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](PeersApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](PeersApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](PeersApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](PeersApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](PeersApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](PeersApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering


<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> adminPeeringPeersDelete()

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```java
// Import classes:
//import io.swagger.client.api.PeersApi;

PeersApi apiInstance = new PeersApi();
try {
    apiInstance.adminPeeringPeersDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#adminPeeringPeersDelete");
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

<a name="adminPeeringPeersGet"></a>
# **adminPeeringPeersGet**
> adminPeeringPeersGet()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```java
// Import classes:
//import io.swagger.client.api.PeersApi;

PeersApi apiInstance = new PeersApi();
try {
    apiInstance.adminPeeringPeersGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#adminPeeringPeersGet");
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

<a name="adminPeeringPeersPost"></a>
# **adminPeeringPeersPost**
> adminPeeringPeersPost()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```java
// Import classes:
//import io.swagger.client.api.PeersApi;

PeersApi apiInstance = new PeersApi();
try {
    apiInstance.adminPeeringPeersPost();
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#adminPeeringPeersPost");
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

<a name="adminPeeringStartPost"></a>
# **adminPeeringStartPost**
> adminPeeringStartPost()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```java
// Import classes:
//import io.swagger.client.api.PeersApi;

PeersApi apiInstance = new PeersApi();
try {
    apiInstance.adminPeeringStartPost();
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#adminPeeringStartPost");
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

<a name="adminPeeringStatusGet"></a>
# **adminPeeringStatusGet**
> adminPeeringStatusGet()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```java
// Import classes:
//import io.swagger.client.api.PeersApi;

PeersApi apiInstance = new PeersApi();
try {
    apiInstance.adminPeeringStatusGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#adminPeeringStatusGet");
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

<a name="adminPeeringStopPost"></a>
# **adminPeeringStopPost**
> adminPeeringStopPost()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```java
// Import classes:
//import io.swagger.client.api.PeersApi;

PeersApi apiInstance = new PeersApi();
try {
    apiInstance.adminPeeringStopPost();
} catch (ApiException e) {
    System.err.println("Exception when calling PeersApi#adminPeeringStopPost");
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

