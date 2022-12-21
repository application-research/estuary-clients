# SwaggerClient::SpApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storage_providers_claim_post**](SpApi.md#storage_providers_claim_post) | **POST** /storage-providers/claim | Claim Storage Provider
[**storage_providers_claim_sp_get**](SpApi.md#storage_providers_claim_sp_get) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**storage_providers_deals_sp_get**](SpApi.md#storage_providers_deals_sp_get) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
[**storage_providers_failures_sp_get**](SpApi.md#storage_providers_failures_sp_get) | **GET** /storage-providers/failures/{sp} | Get all storage providers
[**storage_providers_get**](SpApi.md#storage_providers_get) | **GET** /storage-providers | Get all storage providers
[**storage_providers_set_info_sp_put**](SpApi.md#storage_providers_set_info_sp_put) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**storage_providers_stats_sp_get**](SpApi.md#storage_providers_stats_sp_get) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
[**storage_providers_suspend_sp_post**](SpApi.md#storage_providers_suspend_sp_post) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**storage_providers_unsuspend_sp_put**](SpApi.md#storage_providers_unsuspend_sp_put) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

# **storage_providers_claim_post**
> GithubComApplicationResearchEstuaryApiV2ClaimResponse storage_providers_claim_post(body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

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

api_instance = SwaggerClient::SpApi.new
body = SwaggerClient::MinerClaimMinerBody.new # MinerClaimMinerBody | Claim Storage Provider Body


begin
  #Claim Storage Provider
  result = api_instance.storage_providers_claim_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_claim_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **storage_providers_claim_sp_get**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storage_providers_claim_sp_get(sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

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

api_instance = SwaggerClient::SpApi.new
sp = 'sp_example' # String | Storage Provider claim message


begin
  #Get Claim Storage Provider
  result = api_instance.storage_providers_claim_sp_get(sp)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_claim_sp_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Storage Provider claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **storage_providers_deals_sp_get**
> String storage_providers_deals_sp_get(sp, opts)

Get all storage providers deals

This endpoint returns all storage providers deals

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

api_instance = SwaggerClient::SpApi.new
sp = 'sp_example' # String | Filter by storage provider
opts = { 
  ignore_failed: 'ignore_failed_example' # String | Ignore Failed
}

begin
  #Get all storage providers deals
  result = api_instance.storage_providers_deals_sp_get(sp, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_deals_sp_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider | 
 **ignore_failed** | **String**| Ignore Failed | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **storage_providers_failures_sp_get**
> String storage_providers_failures_sp_get(sp)

Get all storage providers

This endpoint returns all storage providers

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

api_instance = SwaggerClient::SpApi.new
sp = 'sp_example' # String | Filter by storage provider


begin
  #Get all storage providers
  result = api_instance.storage_providers_failures_sp_get(sp)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_failures_sp_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **storage_providers_get**
> Array&lt;ApiStorageProviderResp&gt; storage_providers_get

Get all storage providers

This endpoint returns all storage providers

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

api_instance = SwaggerClient::SpApi.new

begin
  #Get all storage providers
  result = api_instance.storage_providers_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;ApiStorageProviderResp&gt;**](ApiStorageProviderResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **storage_providers_set_info_sp_put**
> storage_providers_set_info_sp_put(bodysp)

Set Storage Provider Info

This endpoint lets a user set storage provider info.

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

api_instance = SwaggerClient::SpApi.new
body = SwaggerClient::MinerMinerSetInfoParams.new # MinerMinerSetInfoParams | Storage Provider set info params
sp = 'sp_example' # String | Storage Provider to set info for


begin
  #Set Storage Provider Info
  api_instance.storage_providers_set_info_sp_put(bodysp)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_set_info_sp_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params | 
 **sp** | **String**| Storage Provider to set info for | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **storage_providers_stats_sp_get**
> String storage_providers_stats_sp_get(sp)

Get storage provider stats

This endpoint returns storage provider stats

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

api_instance = SwaggerClient::SpApi.new
sp = 'sp_example' # String | Filter by storage provider


begin
  #Get storage provider stats
  result = api_instance.storage_providers_stats_sp_get(sp)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_stats_sp_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **storage_providers_suspend_sp_post**
> Hash&lt;String, String&gt; storage_providers_suspend_sp_post(bodysp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

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

api_instance = SwaggerClient::SpApi.new
body = SwaggerClient::MinerSuspendMinerBody.new # MinerSuspendMinerBody | Suspend Storage Provider Body
sp = 'sp_example' # String | Storage Provider to suspend


begin
  #Suspend Storage Provider
  result = api_instance.storage_providers_suspend_sp_post(bodysp)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_suspend_sp_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body | 
 **sp** | **String**| Storage Provider to suspend | 

### Return type

**Hash&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **storage_providers_unsuspend_sp_put**
> storage_providers_unsuspend_sp_put(sp)

Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

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

api_instance = SwaggerClient::SpApi.new
sp = 'sp_example' # String | Storage Provider to unsuspend


begin
  #Unuspend Storage Provider
  api_instance.storage_providers_unsuspend_sp_put(sp)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpApi->storage_providers_unsuspend_sp_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Storage Provider to unsuspend | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



