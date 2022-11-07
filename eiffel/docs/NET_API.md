# NET_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**net_addrs_get**](NET_API.md#net_addrs_get) | **Get** /net/addrs | Net Addrs
[**public_miners_failures_miner_get**](NET_API.md#public_miners_failures_miner_get) | **Get** /public/miners/failures/{miner} | Get all miners
[**public_miners_get**](NET_API.md#public_miners_get) | **Get** /public/miners | Get all miners
[**public_net_addrs_get**](NET_API.md#public_net_addrs_get) | **Get** /public/net/addrs | Net Addrs
[**public_net_peers_get**](NET_API.md#public_net_peers_get) | **Get** /public/net/peers | Net Peers


# **net_addrs_get**
> net_addrs_get : detachable STRING_32
	

Net Addrs

This endpoint is used to get net addrs


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

# **public_miners_failures_miner_get**
> public_miners_failures_miner_get (miner: STRING_32 ): detachable STRING_32
	

Get all miners

This endpoint returns all miners


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **STRING_32**| Filter by miner | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_miners_get**
> public_miners_get : detachable STRING_32
	

Get all miners

This endpoint returns all miners


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

# **public_net_addrs_get**
> public_net_addrs_get : detachable LIST [STRING_32]
	

Net Addrs

This endpoint is used to get net addrs


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [STRING_32]**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_net_peers_get**
> public_net_peers_get : detachable LIST [STRING_32]
	

Net Peers

This endpoint is used to get net peers


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [STRING_32]**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

