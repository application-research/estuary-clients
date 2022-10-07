# SwaggerClient::PublicApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**public_by_cid_cid_get**](PublicApi.md#public_by_cid_cid_get) | **GET** /public/by-cid/{cid} | Get Content by Cid
[**public_info_get**](PublicApi.md#public_info_get) | **GET** /public/info | Get public node info
[**public_metrics_deals_on_chain_get**](PublicApi.md#public_metrics_deals_on_chain_get) | **GET** /public/metrics/deals-on-chain | Get deal metrics
[**public_miners_deals_miner_get**](PublicApi.md#public_miners_deals_miner_get) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**public_miners_failures_miner_get**](PublicApi.md#public_miners_failures_miner_get) | **GET** /public/miners/failures/{miner} | Get all miners
[**public_miners_get**](PublicApi.md#public_miners_get) | **GET** /public/miners | Get all miners
[**public_miners_stats_miner_get**](PublicApi.md#public_miners_stats_miner_get) | **GET** /public/miners/stats/{miner} | Get miner stats
[**public_net_addrs_get**](PublicApi.md#public_net_addrs_get) | **GET** /public/net/addrs | Net Addrs
[**public_net_peers_get**](PublicApi.md#public_net_peers_get) | **GET** /public/net/peers | Net Peers
[**public_stats_get**](PublicApi.md#public_stats_get) | **GET** /public/stats | Public stats


# **public_by_cid_cid_get**
> public_by_cid_cid_get(cid)

Get Content by Cid

This endpoint returns the content associated with a CID

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

cid = 'cid_example' # String | Cid


begin
  #Get Content by Cid
  api_instance.public_by_cid_cid_get(cid)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_by_cid_cid_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **String**| Cid | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_info_get**
> public_info_get

Get public node info

This endpoint returns information about the node

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

begin
  #Get public node info
  api_instance.public_info_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_info_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_metrics_deals_on_chain_get**
> public_metrics_deals_on_chain_get

Get deal metrics

This endpoint is used to get deal metrics

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

begin
  #Get deal metrics
  api_instance.public_metrics_deals_on_chain_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_metrics_deals_on_chain_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_miners_deals_miner_get**
> public_miners_deals_miner_get(miner)

Get all miners deals

This endpoint returns all miners deals

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

miner = 'miner_example' # String | Filter by miner


begin
  #Get all miners deals
  api_instance.public_miners_deals_miner_get(miner)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_miners_deals_miner_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_miners_failures_miner_get**
> public_miners_failures_miner_get(miner)

Get all miners

This endpoint returns all miners

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

miner = 'miner_example' # String | Filter by miner


begin
  #Get all miners
  api_instance.public_miners_failures_miner_get(miner)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_miners_failures_miner_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_miners_get**
> public_miners_get

Get all miners

This endpoint returns all miners

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

begin
  #Get all miners
  api_instance.public_miners_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_miners_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_miners_stats_miner_get**
> public_miners_stats_miner_get(miner)

Get miner stats

This endpoint returns miner stats

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

miner = 'miner_example' # String | Filter by miner


begin
  #Get miner stats
  api_instance.public_miners_stats_miner_get(miner)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_miners_stats_miner_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_net_addrs_get**
> Array&lt;String&gt; public_net_addrs_get

Net Addrs

This endpoint is used to get net addrs

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

begin
  #Net Addrs
  result = api_instance.public_net_addrs_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_net_addrs_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Array&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_net_peers_get**
> Array&lt;String&gt; public_net_peers_get

Net Peers

This endpoint is used to get net peers

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

begin
  #Net Peers
  result = api_instance.public_net_peers_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_net_peers_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Array&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **public_stats_get**
> public_stats_get

Public stats

This endpoint is used to get public stats.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: bearerAuth
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'
end

api_instance = SwaggerClient::PublicApi.new

begin
  #Public stats
  api_instance.public_stats_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PublicApi->public_stats_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



