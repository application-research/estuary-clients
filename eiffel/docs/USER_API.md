# USER_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**user_api_keys_get**](USER_API.md#user_api_keys_get) | **Get** /user/api-keys | Get API keys for a user
[**user_api_keys_key_delete**](USER_API.md#user_api_keys_key_delete) | **Delete** /user/api-keys/{key} | Revoke a User API Key.
[**user_api_keys_post**](USER_API.md#user_api_keys_post) | **Post** /user/api-keys | Create API keys for a user
[**user_export_get**](USER_API.md#user_export_get) | **Get** /user/export | Export user data
[**user_stats_get**](USER_API.md#user_stats_get) | **Get** /user/stats | Create API keys for a user


# **user_api_keys_get**
> user_api_keys_get : detachable LIST [MAIN_GET_API_KEYS_RESP]
	

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [MAIN_GET_API_KEYS_RESP]**](main.getApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_api_keys_key_delete**
> user_api_keys_key_delete (key: STRING_32 )
	

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **STRING_32**| Key | 

### Return type

{empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_api_keys_post**
> user_api_keys_post : detachable MAIN_GET_API_KEYS_RESP
	

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.


### Parameters
This endpoint does not need any parameter.

### Return type

[**MAIN_GET_API_KEYS_RESP**](main.getApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_export_get**
> user_export_get : detachable STRING_32
	

Export user data

This endpoint is used to get API keys for a user.


### Parameters
This endpoint does not need any parameter.

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_stats_get**
> user_stats_get : detachable MAIN_USER_STATS_RESPONSE
	

Create API keys for a user

This endpoint is used to create API keys for a user.


### Parameters
This endpoint does not need any parameter.

### Return type

[**MAIN_USER_STATS_RESPONSE**](main.userStatsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

