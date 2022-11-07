# \AutoretrieveApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_autoretrieve_init_post**](AutoretrieveApi.md#admin_autoretrieve_init_post) | **Post** /admin/autoretrieve/init | Register autoretrieve server
[**admin_autoretrieve_list_get**](AutoretrieveApi.md#admin_autoretrieve_list_get) | **Get** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieve_heartbeat_post**](AutoretrieveApi.md#autoretrieve_heartbeat_post) | **Post** /autoretrieve/heartbeat | Marks autoretrieve server as up


# **admin_autoretrieve_init_post**
> String admin_autoretrieve_init_post(ctx, addresses, pub_key)
Register autoretrieve server

This endpoint registers a new autoretrieve server

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **addresses** | **String**| Autoretrieve&#39;s comma-separated list of addresses | 
  **pub_key** | **String**| Autoretrieve&#39;s public key | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_autoretrieve_list_get**
> String admin_autoretrieve_list_get(ctx, )
List autoretrieve servers

This endpoint lists all registered autoretrieve servers

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

# **autoretrieve_heartbeat_post**
> String autoretrieve_heartbeat_post(ctx, token)
Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **token** | **String**| Autoretrieve&#39;s auth token | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

