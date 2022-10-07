# SwagUserApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApiKeysGet**](SwagUserApi.md#userApiKeysGet) | **GET** /user/api-keys | Get API keys for a user
[**userApiKeysKeyDelete**](SwagUserApi.md#userApiKeysKeyDelete) | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
[**userApiKeysPost**](SwagUserApi.md#userApiKeysPost) | **POST** /user/api-keys | Create API keys for a user
[**userExportGet**](SwagUserApi.md#userExportGet) | **GET** /user/export | Export user data
[**userStatsGet**](SwagUserApi.md#userStatsGet) | **GET** /user/stats | Create API keys for a user


<a name="userApiKeysGet"></a>
# **userApiKeysGet**
> List&lt;SwagMainGetApiKeysResp&gt; userApiKeysGet()

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Example
```java
SwagUserApi api = new SwagUserApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    List<SwagMainGetApiKeysResp> result = api.userApiKeysGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SwagMainGetApiKeysResp&gt;**](SwagMainGetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userApiKeysKeyDelete"></a>
# **userApiKeysKeyDelete**
> userApiKeysKeyDelete(key)

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.

### Example
```java
SwagUserApi api = new SwagUserApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'key' => 'key_example'
};

try {
    // cross your fingers
    api.userApiKeysKeyDelete(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| Key |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userApiKeysPost"></a>
# **userApiKeysPost**
> SwagMainGetApiKeysResp userApiKeysPost()

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Example
```java
SwagUserApi api = new SwagUserApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    SwagMainGetApiKeysResp result = api.userApiKeysPost();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SwagMainGetApiKeysResp**](SwagMainGetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userExportGet"></a>
# **userExportGet**
> String userExportGet()

Export user data

This endpoint is used to get API keys for a user.

### Example
```java
SwagUserApi api = new SwagUserApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.userExportGet();
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

<a name="userStatsGet"></a>
# **userStatsGet**
> SwagMainUserStatsResponse userStatsGet()

Create API keys for a user

This endpoint is used to create API keys for a user.

### Example
```java
SwagUserApi api = new SwagUserApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    SwagMainUserStatsResponse result = api.userStatsGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SwagMainUserStatsResponse**](SwagMainUserStatsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

