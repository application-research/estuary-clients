# \NetApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**net_addrs_get**](NetApi.md#net_addrs_get) | **Get** /net/addrs | Net Addrs
[**public_miners_failures_miner_get**](NetApi.md#public_miners_failures_miner_get) | **Get** /public/miners/failures/{miner} | Get all miners
[**public_miners_get**](NetApi.md#public_miners_get) | **Get** /public/miners | Get all miners
[**public_net_addrs_get**](NetApi.md#public_net_addrs_get) | **Get** /public/net/addrs | Net Addrs
[**public_net_peers_get**](NetApi.md#public_net_peers_get) | **Get** /public/net/peers | Net Peers


# **net_addrs_get**
> String net_addrs_get(ctx, )
Net Addrs

This endpoint is used to get net addrs

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

# **public_miners_failures_miner_get**
> String public_miners_failures_miner_get(ctx, miner)
Get all miners

This endpoint returns all miners

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **miner** | **String**| Filter by miner | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_miners_get**
> String public_miners_get(ctx, )
Get all miners

This endpoint returns all miners

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

# **public_net_addrs_get**
> Vec<String> public_net_addrs_get(ctx, )
Net Addrs

This endpoint is used to get net addrs

### Required Parameters
This endpoint does not need any parameter.

### Return type

**Vec<String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_net_peers_get**
> Vec<String> public_net_peers_get(ctx, )
Net Peers

This endpoint is used to get net peers

### Required Parameters
This endpoint does not need any parameter.

### Return type

**Vec<String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

