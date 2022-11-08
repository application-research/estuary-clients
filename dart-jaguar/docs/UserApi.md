# swagger.api.UserApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApiKeysGet**](UserApi.md#userApiKeysGet) | **Get** /user/api-keys | Get API keys for a user
[**userApiKeysKeyOrHashDelete**](UserApi.md#userApiKeysKeyOrHashDelete) | **Delete** /user/api-keys/:key_or_hash | Revoke a User API Key.
[**userApiKeysPost**](UserApi.md#userApiKeysPost) | **Post** /user/api-keys | Create API keys for a user
[**userExportGet**](UserApi.md#userExportGet) | **Get** /user/export | Export user data
[**userStatsGet**](UserApi.md#userStatsGet) | **Get** /user/stats | Create API keys for a user


# **userApiKeysGet**
> List<List<MainGetApiKeysResp>> userApiKeysGet()

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new UserApi();

try { 
    var result = api_instance.userApiKeysGet();
    print(result);
} catch (e) {
    print("Exception when calling UserApi->userApiKeysGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<List<MainGetApiKeysResp>>**](List.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userApiKeysKeyOrHashDelete**
> String userApiKeysKeyOrHashDelete(keyOrHash)

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily used to access all estuary features. This endpoint can be used to revoke the API key that's assigned to the user. Revoked API keys are completely deleted and are not recoverable.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new UserApi();
var keyOrHash = keyOrHash_example; // String | Key or Hash

try { 
    var result = api_instance.userApiKeysKeyOrHashDelete(keyOrHash);
    print(result);
} catch (e) {
    print("Exception when calling UserApi->userApiKeysKeyOrHashDelete: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyOrHash** | **String**| Key or Hash | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userApiKeysPost**
> MainGetApiKeysResp userApiKeysPost(expiry, perms)

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new UserApi();
var expiry = expiry_example; // String | Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h
var perms = perms_example; // String | Permissions -- currently unused

try { 
    var result = api_instance.userApiKeysPost(expiry, perms);
    print(result);
} catch (e) {
    print("Exception when calling UserApi->userApiKeysPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiry** | **String**| Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h | [optional] 
 **perms** | **String**| Permissions -- currently unused | [optional] 

### Return type

[**MainGetApiKeysResp**](MainGetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userExportGet**
> String userExportGet()

Export user data

This endpoint is used to get API keys for a user.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new UserApi();

try { 
    var result = api_instance.userExportGet();
    print(result);
} catch (e) {
    print("Exception when calling UserApi->userExportGet: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userStatsGet**
> String userStatsGet()

Create API keys for a user

This endpoint is used to create API keys for a user.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new UserApi();

try { 
    var result = api_instance.userStatsGet();
    print(result);
} catch (e) {
    print("Exception when calling UserApi->userStatsGet: $e\n");
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

