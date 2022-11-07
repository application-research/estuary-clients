# MINER_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**public_miners_deals_miner_get**](MINER_API.md#public_miners_deals_miner_get) | **Get** /public/miners/deals/{miner} | Get all miners deals
[**public_miners_stats_miner_get**](MINER_API.md#public_miners_stats_miner_get) | **Get** /public/miners/stats/{miner} | Get miner stats


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

