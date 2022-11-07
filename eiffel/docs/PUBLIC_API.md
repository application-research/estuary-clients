# PUBLIC_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**public_by_cid_cid_get**](PUBLIC_API.md#public_by_cid_cid_get) | **Get** /public/by-cid/{cid} | Get Content by Cid
[**public_info_get**](PUBLIC_API.md#public_info_get) | **Get** /public/info | Get public node info
[**public_metrics_deals_on_chain_get**](PUBLIC_API.md#public_metrics_deals_on_chain_get) | **Get** /public/metrics/deals-on-chain | Get deal metrics
[**public_miners_deals_miner_get**](PUBLIC_API.md#public_miners_deals_miner_get) | **Get** /public/miners/deals/{miner} | Get all miners deals
[**public_miners_failures_miner_get**](PUBLIC_API.md#public_miners_failures_miner_get) | **Get** /public/miners/failures/{miner} | Get all miners
[**public_miners_get**](PUBLIC_API.md#public_miners_get) | **Get** /public/miners | Get all miners
[**public_miners_stats_miner_get**](PUBLIC_API.md#public_miners_stats_miner_get) | **Get** /public/miners/stats/{miner} | Get miner stats
[**public_net_addrs_get**](PUBLIC_API.md#public_net_addrs_get) | **Get** /public/net/addrs | Net Addrs
[**public_net_peers_get**](PUBLIC_API.md#public_net_peers_get) | **Get** /public/net/peers | Net Peers
[**public_stats_get**](PUBLIC_API.md#public_stats_get) | **Get** /public/stats | Public stats


# **public_by_cid_cid_get**
> public_by_cid_cid_get (cid: STRING_32 ): detachable STRING_32
	

Get Content by Cid

This endpoint returns the content associated with a CID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **STRING_32**| Cid | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **public_info_get**
> public_info_get : detachable STRING_32
	

Get public node info

This endpoint returns information about the node


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

# **public_metrics_deals_on_chain_get**
> public_metrics_deals_on_chain_get : detachable STRING_32
	

Get deal metrics

This endpoint is used to get deal metrics


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

# **public_miners_deals_miner_get**
> public_miners_deals_miner_get (miner: STRING_32 ; ignore_failed:  detachable STRING_32 ): detachable STRING_32
	

Get all miners deals

This endpoint returns all miners deals


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **STRING_32**| Filter by miner | 
 **ignore_failed** | **STRING_32**| Ignore Failed | [optional] 

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

# **public_miners_stats_miner_get**
> public_miners_stats_miner_get (miner: STRING_32 ): detachable STRING_32
	

Get miner stats

This endpoint returns miner stats


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

# **public_stats_get**
> public_stats_get : detachable STRING_32
	

Public stats

This endpoint is used to get public stats.


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

