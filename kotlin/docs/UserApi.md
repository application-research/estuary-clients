# UserApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApiKeysGet**](UserApi.md#userApiKeysGet) | **GET** /user/api-keys | Get API keys for a user
[**userApiKeysKeyDelete**](UserApi.md#userApiKeysKeyDelete) | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
[**userApiKeysPost**](UserApi.md#userApiKeysPost) | **POST** /user/api-keys | Create API keys for a user
[**userExportGet**](UserApi.md#userExportGet) | **GET** /user/export | Export user data
[**userStatsGet**](UserApi.md#userStatsGet) | **GET** /user/stats | Create API keys for a user


<a name="userApiKeysGet"></a>
# **userApiKeysGet**
> kotlin.Array&lt;MaingetApiKeysResp&gt; userApiKeysGet()

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UserApi()
try {
    val result : kotlin.Array<MaingetApiKeysResp> = apiInstance.userApiKeysGet()
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

[**kotlin.Array&lt;MaingetApiKeysResp&gt;**](MaingetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userApiKeysKeyDelete"></a>
# **userApiKeysKeyDelete**
> userApiKeysKeyDelete(key)

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UserApi()
val key : kotlin.String = key_example // kotlin.String | Key
try {
    apiInstance.userApiKeysKeyDelete(key)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userApiKeysKeyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userApiKeysKeyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| Key |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userApiKeysPost"></a>
# **userApiKeysPost**
> MaingetApiKeysResp userApiKeysPost()

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UserApi()
try {
    val result : MaingetApiKeysResp = apiInstance.userApiKeysPost()
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
This endpoint does not need any parameter.

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
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

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
> MainuserStatsResponse userStatsGet()

Create API keys for a user

This endpoint is used to create API keys for a user.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = UserApi()
try {
    val result : MainuserStatsResponse = apiInstance.userStatsGet()
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

[**MainuserStatsResponse**](MainuserStatsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

