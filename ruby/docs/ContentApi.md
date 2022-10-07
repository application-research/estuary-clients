# SwaggerClient::ContentApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**content_add_car_post**](ContentApi.md#content_add_car_post) | **POST** /content/add-car | Add Car object
[**content_add_ipfs_post**](ContentApi.md#content_add_ipfs_post) | **POST** /content/add-ipfs | Add IPFS object
[**content_add_post**](ContentApi.md#content_add_post) | **POST** /content/add | Add new content
[**content_aggregated_content_get**](ContentApi.md#content_aggregated_content_get) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**content_all_deals_get**](ContentApi.md#content_all_deals_get) | **GET** /content/all-deals | Get all deals for a user
[**content_bw_usage_content_get**](ContentApi.md#content_bw_usage_content_get) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**content_create_post**](ContentApi.md#content_create_post) | **POST** /content/create | Add a new content
[**content_deals_get**](ContentApi.md#content_deals_get) | **GET** /content/deals | Content with deals
[**content_ensure_replication_datacid_get**](ContentApi.md#content_ensure_replication_datacid_get) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**content_failures_content_get**](ContentApi.md#content_failures_content_get) | **GET** /content/failures/{content} | List all failures for a content
[**content_importdeal_post**](ContentApi.md#content_importdeal_post) | **POST** /content/importdeal | Import a deal
[**content_list_get**](ContentApi.md#content_list_get) | **GET** /content/list | List all pinned content
[**content_read_cont_get**](ContentApi.md#content_read_cont_get) | **GET** /content/read/{cont} | Read content
[**content_staging_zones_get**](ContentApi.md#content_staging_zones_get) | **GET** /content/staging-zones | Get staging zone for user
[**content_stats_get**](ContentApi.md#content_stats_get) | **GET** /content/stats | Get content statistics
[**content_status_id_get**](ContentApi.md#content_status_id_get) | **GET** /content/status/{id} | Content Status


# **content_add_car_post**
> content_add_car_post(body, opts)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

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

api_instance = SwaggerClient::ContentApi.new

body = 'body_example' # String | Car

opts = { 
  filename: 'filename_example', # String | Filename
  commp: 'commp_example', # String | Commp
  size: 'size_example' # String | Size
}

begin
  #Add Car object
  api_instance.content_add_car_post(body, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_add_car_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| Car | 
 **filename** | **String**| Filename | [optional] 
 **commp** | **String**| Commp | [optional] 
 **size** | **String**| Size | [optional] 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_add_ipfs_post**
> content_add_ipfs_post(body)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

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

api_instance = SwaggerClient::ContentApi.new

body = SwaggerClient::UtilContentAddIpfsBody.new # UtilContentAddIpfsBody | IPFS Body


begin
  #Add IPFS object
  api_instance.content_add_ipfs_post(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_add_ipfs_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_add_post**
> UtilContentAddResponse content_add_post(file, coluuid, dir)

Add new content

This endpoint is used to upload new content.

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

api_instance = SwaggerClient::ContentApi.new

file = File.new('/path/to/file.txt') # File | File to upload

coluuid = 'coluuid_example' # String | Collection UUID

dir = 'dir_example' # String | Directory


begin
  #Add new content
  result = api_instance.content_add_post(file, coluuid, dir)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_add_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload | 
 **coluuid** | **String**| Collection UUID | 
 **dir** | **String**| Directory | 

### Return type

[**UtilContentAddResponse**](UtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json



# **content_aggregated_content_get**
> String content_aggregated_content_get(content)

Get aggregated content stats

This endpoint returns aggregated content stats

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

api_instance = SwaggerClient::ContentApi.new

content = 'content_example' # String | Content ID


begin
  #Get aggregated content stats
  result = api_instance.content_aggregated_content_get(content)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_aggregated_content_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_all_deals_get**
> content_all_deals_get(_begin, duration, all)

Get all deals for a user

This endpoint is used to get all deals for a user

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

api_instance = SwaggerClient::ContentApi.new

_begin = '_begin_example' # String | Begin

duration = 'duration_example' # String | Duration

all = 'all_example' # String | All


begin
  #Get all deals for a user
  api_instance.content_all_deals_get(_begin, duration, all)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_all_deals_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_begin** | **String**| Begin | 
 **duration** | **String**| Duration | 
 **all** | **String**| All | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_bw_usage_content_get**
> content_bw_usage_content_get(content)

Get content bandwidth

This endpoint returns content bandwidth

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

api_instance = SwaggerClient::ContentApi.new

content = 'content_example' # String | Content ID


begin
  #Get content bandwidth
  api_instance.content_bw_usage_content_get(content)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_bw_usage_content_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Content ID | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_create_post**
> content_create_post(body)

Add a new content

This endpoint adds a new content

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

api_instance = SwaggerClient::ContentApi.new

body = 'body_example' # String | Content


begin
  #Add a new content
  api_instance.content_create_post(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_create_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| Content | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_deals_get**
> content_deals_get(opts)

Content with deals

This endpoint lists all content with deals

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

api_instance = SwaggerClient::ContentApi.new

opts = { 
  limit: 56, # Integer | Limit
  offset: 56 # Integer | Offset
}

begin
  #Content with deals
  api_instance.content_deals_get(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_deals_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit | [optional] 
 **offset** | **Integer**| Offset | [optional] 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_ensure_replication_datacid_get**
> content_ensure_replication_datacid_get(datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

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

api_instance = SwaggerClient::ContentApi.new

datacid = 'datacid_example' # String | Data CID


begin
  #Ensure Replication
  api_instance.content_ensure_replication_datacid_get(datacid)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_ensure_replication_datacid_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **String**| Data CID | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_failures_content_get**
> String content_failures_content_get(content)

List all failures for a content

This endpoint returns all failures for a content

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

api_instance = SwaggerClient::ContentApi.new

content = 'content_example' # String | Content ID


begin
  #List all failures for a content
  result = api_instance.content_failures_content_get(content)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_failures_content_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_importdeal_post**
> content_importdeal_post(body)

Import a deal

This endpoint imports a deal into the shuttle.

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

api_instance = SwaggerClient::ContentApi.new

body = SwaggerClient::MainImportDealBody.new # MainImportDealBody | Import a deal


begin
  #Import a deal
  api_instance.content_importdeal_post(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_importdeal_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainImportDealBody**](MainImportDealBody.md)| Import a deal | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_list_get**
> Array&lt;String&gt; content_list_get

List all pinned content

This endpoint lists all content

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

api_instance = SwaggerClient::ContentApi.new

begin
  #List all pinned content
  result = api_instance.content_list_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_list_get: #{e}"
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



# **content_read_cont_get**
> content_read_cont_get(cont)

Read content

This endpoint reads content from the blockstore

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

api_instance = SwaggerClient::ContentApi.new

cont = 'cont_example' # String | CID


begin
  #Read content
  api_instance.content_read_cont_get(cont)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_read_cont_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cont** | **String**| CID | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_staging_zones_get**
> content_staging_zones_get

Get staging zone for user

This endpoint is used to get staging zone for user.

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

api_instance = SwaggerClient::ContentApi.new

begin
  #Get staging zone for user
  api_instance.content_staging_zones_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_staging_zones_get: #{e}"
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



# **content_stats_get**
> content_stats_get(limit)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

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

api_instance = SwaggerClient::ContentApi.new

limit = 'limit_example' # String | limit


begin
  #Get content statistics
  api_instance.content_stats_get(limit)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_stats_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| limit | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_status_id_get**
> content_status_id_get(id)

Content Status

This endpoint returns the status of a content

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

api_instance = SwaggerClient::ContentApi.new

id = 56 # Integer | Content ID


begin
  #Content Status
  api_instance.content_status_id_get(id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_status_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Content ID | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



