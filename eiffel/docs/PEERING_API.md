# PEERING_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**admin_peering_peers_delete**](PEERING_API.md#admin_peering_peers_delete) | **Delete** /admin/peering/peers | Remove peers on Peering Service
[**admin_peering_peers_get**](PEERING_API.md#admin_peering_peers_get) | **Get** /admin/peering/peers | List all Peering peers
[**admin_peering_peers_post**](PEERING_API.md#admin_peering_peers_post) | **Post** /admin/peering/peers | Add peers on Peering Service
[**admin_peering_start_post**](PEERING_API.md#admin_peering_start_post) | **Post** /admin/peering/start | Start Peering
[**admin_peering_status_get**](PEERING_API.md#admin_peering_status_get) | **Get** /admin/peering/status | Check Peering Status
[**admin_peering_stop_post**](PEERING_API.md#admin_peering_stop_post) | **Post** /admin/peering/stop | Stop Peering


# **admin_peering_peers_delete**
> admin_peering_peers_delete (peer_ids: LIST [BOOLEAN] ): detachable STRING_32
	

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peer_ids** | **LIST [BOOLEAN]**| Peer ids | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_peering_peers_get**
> admin_peering_peers_get : detachable STRING_32
	

List all Peering peers

This endpoint can be used to list all peers on Peering Service


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

# **admin_peering_peers_post**
> admin_peering_peers_post : detachable STRING_32
	

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service


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

# **admin_peering_start_post**
> admin_peering_start_post : detachable STRING_32
	

Start Peering

This endpoint can be used to start the Peering Service


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

# **admin_peering_status_get**
> admin_peering_status_get : detachable STRING_32
	

Check Peering Status

This endpoint can be used to check the Peering status


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

# **admin_peering_stop_post**
> admin_peering_stop_post : detachable STRING_32
	

Stop Peering

This endpoint can be used to stop the Peering Service


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

