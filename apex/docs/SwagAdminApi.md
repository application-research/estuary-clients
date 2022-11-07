# SwagAdminApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](SwagAdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](SwagAdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](SwagAdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](SwagAdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](SwagAdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](SwagAdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
[**adminSystemConfigGet**](SwagAdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
[**adminUsersGet**](SwagAdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users


<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> String adminPeeringPeersDelete(peerIds)

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'peerIds' => new List<Boolean>{true}
};

try {
    // cross your fingers
    String result = api.adminPeeringPeersDelete(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peerIds** | **List&lt;Boolean&gt;**| Peer ids |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminPeeringPeersGet"></a>
# **adminPeeringPeersGet**
> String adminPeeringPeersGet()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminPeeringPeersGet();
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

<a name="adminPeeringPeersPost"></a>
# **adminPeeringPeersPost**
> String adminPeeringPeersPost()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminPeeringPeersPost();
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

<a name="adminPeeringStartPost"></a>
# **adminPeeringStartPost**
> String adminPeeringStartPost()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminPeeringStartPost();
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

<a name="adminPeeringStatusGet"></a>
# **adminPeeringStatusGet**
> String adminPeeringStatusGet()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminPeeringStatusGet();
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

<a name="adminPeeringStopPost"></a>
# **adminPeeringStopPost**
> String adminPeeringStopPost()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminPeeringStopPost();
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

<a name="adminSystemConfigGet"></a>
# **adminSystemConfigGet**
> String adminSystemConfigGet()

Get systems(estuary/shuttle) config

This endpoint is used to get system configs.

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminSystemConfigGet();
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

<a name="adminUsersGet"></a>
# **adminUsersGet**
> String adminUsersGet()

Get all users

This endpoint is used to get all users.

### Example
```java
SwagAdminApi api = new SwagAdminApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.adminUsersGet();
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

