# UserApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApiKeysGet**](UserApi.md#userApiKeysGet) | **GET** /user/api-keys | Get API keys for a user
[**userApiKeysKeyOrHashDelete**](UserApi.md#userApiKeysKeyOrHashDelete) | **DELETE** /user/api-keys/{key_or_hash} | Revoke a User API Key.
[**userApiKeysPost**](UserApi.md#userApiKeysPost) | **POST** /user/api-keys | Create API keys for a user
[**userExportGet**](UserApi.md#userExportGet) | **GET** /user/export | Export user data
[**userStatsGet**](UserApi.md#userStatsGet) | **GET** /user/stats | Create API keys for a user


<a name="userApiKeysGet"></a>
# **userApiKeysGet**
> kotlin.Array&lt;kotlin.Array&lt;MaingetApiKeysResp&gt;&gt; userApiKeysGet()

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = UserApi()
try {
    val result : kotlin.Array<kotlin.Array<MaingetApiKeysResp>> = apiInstance.userApiKeysGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userApiKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userApiKeysGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.Array&lt;MaingetApiKeysResp&gt;&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userApiKeysKeyOrHashDelete"></a>
# **userApiKeysKeyOrHashDelete**
> kotlin.String userApiKeysKeyOrHashDelete(keyOrHash)

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that&#39;s assigned to the user. Revoked API keys are completely deleted and are not recoverable.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = UserApi()
val keyOrHash : kotlin.String = keyOrHash_example // kotlin.String | Key or Hash
try {
    val result : kotlin.String = apiInstance.userApiKeysKeyOrHashDelete(keyOrHash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userApiKeysKeyOrHashDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userApiKeysKeyOrHashDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyOrHash** | **kotlin.String**| Key or Hash |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userApiKeysPost"></a>
# **userApiKeysPost**
> MaingetApiKeysResp userApiKeysPost(expiry, perms)

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = UserApi()
val expiry : kotlin.String = expiry_example // kotlin.String | Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
val perms : kotlin.String = perms_example // kotlin.String | Permissions -- currently unused
try {
    val result : MaingetApiKeysResp = apiInstance.userApiKeysPost(expiry, perms)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userApiKeysPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userApiKeysPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiry** | **kotlin.String**| Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h | [optional]
 **perms** | **kotlin.String**| Permissions -- currently unused | [optional]

### Return type

[**MaingetApiKeysResp**](MaingetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userExportGet"></a>
# **userExportGet**
> kotlin.String userExportGet()

Export user data

This endpoint is used to get API keys for a user.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = UserApi()
try {
    val result : kotlin.String = apiInstance.userExportGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userExportGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userExportGet")
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

<a name="userStatsGet"></a>
# **userStatsGet**
> kotlin.String userStatsGet()

Create API keys for a user

This endpoint is used to create API keys for a user.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = UserApi()
try {
    val result : kotlin.String = apiInstance.userStatsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userStatsGet")
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

