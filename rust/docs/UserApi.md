# \UserApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_api_keys_get**](UserApi.md#user_api_keys_get) | **Get** /user/api-keys | Get API keys for a user
[**user_api_keys_key_delete**](UserApi.md#user_api_keys_key_delete) | **Delete** /user/api-keys/{key} | Revoke a User API Key.
[**user_api_keys_post**](UserApi.md#user_api_keys_post) | **Post** /user/api-keys | Create API keys for a user
[**user_export_get**](UserApi.md#user_export_get) | **Get** /user/export | Export user data
[**user_stats_get**](UserApi.md#user_stats_get) | **Get** /user/stats | Create API keys for a user


# **user_api_keys_get**
> Vec<Vec<::models::MainGetApiKeysResp>> user_api_keys_get(ctx, )
Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<Vec<::models::MainGetApiKeysResp>>**](array.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_api_keys_key_delete**
> String user_api_keys_key_delete(ctx, key)
Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **key** | **String**| Key | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_api_keys_post**
> ::models::MainGetApiKeysResp user_api_keys_post(ctx, optional)
Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiry** | **String**| Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h | 
 **perms** | **String**| Permissions -- currently unused | 

### Return type

[**::models::MainGetApiKeysResp**](main.getApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_export_get**
> String user_export_get(ctx, )
Export user data

This endpoint is used to get API keys for a user.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_stats_get**
> String user_stats_get(ctx, )
Create API keys for a user

This endpoint is used to create API keys for a user.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

