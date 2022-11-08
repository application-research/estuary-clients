# AUTORETRIEVE_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**admin_autoretrieve_init_post**](AUTORETRIEVE_API.md#admin_autoretrieve_init_post) | **Post** /admin/autoretrieve/init | Register autoretrieve server
[**admin_autoretrieve_list_get**](AUTORETRIEVE_API.md#admin_autoretrieve_list_get) | **Get** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieve_heartbeat_post**](AUTORETRIEVE_API.md#autoretrieve_heartbeat_post) | **Post** /autoretrieve/heartbeat | Marks autoretrieve server as up


# **admin_autoretrieve_init_post**
> admin_autoretrieve_init_post (addresses: STRING_32 ; pub_key: STRING_32 ): detachable STRING_32
	

Register autoretrieve server

This endpoint registers a new autoretrieve server


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addresses** | **STRING_32**| Autoretrieve&#39;s comma-separated list of addresses | 
 **pub_key** | **STRING_32**| Autoretrieve&#39;s public key | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_autoretrieve_list_get**
> admin_autoretrieve_list_get : detachable STRING_32
	

List autoretrieve servers

This endpoint lists all registered autoretrieve servers


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

# **autoretrieve_heartbeat_post**
> autoretrieve_heartbeat_post (token: STRING_32 ): detachable STRING_32
	

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **STRING_32**| Autoretrieve&#39;s auth token | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

