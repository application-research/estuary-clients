# {{classname}}

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminAutoretrieveInitPost**](AutoretrieveApi.md#AdminAutoretrieveInitPost) | **Post** /admin/autoretrieve/init | Register autoretrieve server
[**AdminAutoretrieveListGet**](AutoretrieveApi.md#AdminAutoretrieveListGet) | **Get** /admin/autoretrieve/list | List autoretrieve servers
[**AutoretrieveHeartbeatPost**](AutoretrieveApi.md#AutoretrieveHeartbeatPost) | **Post** /autoretrieve/heartbeat | Marks autoretrieve server as up

# **AdminAutoretrieveInitPost**
> AdminAutoretrieveInitPost(ctx, body)
Register autoretrieve server

This endpoint registers a new autoretrieve server

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**string**](string.md)| Autoretrieve&#x27;s public key | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdminAutoretrieveListGet**
> AdminAutoretrieveListGet(ctx, )
List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AutoretrieveHeartbeatPost**
> AutoretrieveHeartbeatPost(ctx, token)
Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Autoretrieve&#x27;s auth token | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

