# SwaggerClient::ContentApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_invites_code_post**](ContentApi.md#admin_invites_code_post) | **POST** /admin/invites/{code} | Create an Estuary invite
[**admin_invites_get**](ContentApi.md#admin_invites_get) | **GET** /admin/invites | Get Estuary invites
[**content_add_car_post**](ContentApi.md#content_add_car_post) | **POST** /content/add-car | Add Car object
[**content_add_ipfs_post**](ContentApi.md#content_add_ipfs_post) | **POST** /content/add-ipfs | Add IPFS object
[**content_add_post**](ContentApi.md#content_add_post) | **POST** /content/add | Add new content
[**content_aggregated_content_get**](ContentApi.md#content_aggregated_content_get) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**content_all_deals_get**](ContentApi.md#content_all_deals_get) | **GET** /content/all-deals | Get all deals for a user
[**content_bw_usage_content_get**](ContentApi.md#content_bw_usage_content_get) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**content_contents_get**](ContentApi.md#content_contents_get) | **GET** /content/contents | Get user contents
[**content_create_post**](ContentApi.md#content_create_post) | **POST** /content/create | Add a new content
[**content_deals_get**](ContentApi.md#content_deals_get) | **GET** /content/deals | Content with deals
[**content_ensure_replication_datacid_get**](ContentApi.md#content_ensure_replication_datacid_get) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**content_failures_content_get**](ContentApi.md#content_failures_content_get) | **GET** /content/failures/{content} | List all failures for a content
[**content_id_get**](ContentApi.md#content_id_get) | **GET** /content/{id} | Content
[**content_list_get**](ContentApi.md#content_list_get) | **GET** /content/list | List all pinned content
[**content_staging_zones_get**](ContentApi.md#content_staging_zones_get) | **GET** /content/staging-zones | Get staging zone for user, excluding its contents
[**content_staging_zones_staging_zone_contents_get**](ContentApi.md#content_staging_zones_staging_zone_contents_get) | **GET** /content/staging-zones/{staging_zone}/contents | Get contents for a staging zone
[**content_staging_zones_staging_zone_get**](ContentApi.md#content_staging_zones_staging_zone_get) | **GET** /content/staging-zones/{staging_zone} | Get staging zone without its contents field populated
[**content_stats_get**](ContentApi.md#content_stats_get) | **GET** /content/stats | Get content statistics
[**content_status_id_get**](ContentApi.md#content_status_id_get) | **GET** /content/status/{id} | Content Status

# **admin_invites_code_post**
> String admin_invites_code_post(code)

Create an Estuary invite

This endpoint is used to create an estuary invite.

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
code = 'code_example' # String | Invite code to be created


begin
  #Create an Estuary invite
  result = api_instance.admin_invites_code_post(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->admin_invites_code_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Invite code to be created | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **admin_invites_get**
> String admin_invites_get

Get Estuary invites

This endpoint is used to list all estuary invites.

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
  #Get Estuary invites
  result = api_instance.admin_invites_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->admin_invites_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_add_car_post**
> UtilContentAddResponse content_add_car_post(body, opts)

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
  ignore_dupes: 'ignore_dupes_example' # String | Ignore Dupes
  filename: 'filename_example' # String | Filename
}

begin
  #Add Car object
  result = api_instance.content_add_car_post(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_add_car_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Car | 
 **ignore_dupes** | **String**| Ignore Dupes | [optional] 
 **filename** | **String**| Filename | [optional] 

### Return type

[**UtilContentAddResponse**](UtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **content_add_ipfs_post**
> String content_add_ipfs_post(body, opts)

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
body = SwaggerClient::TypesIpfsPin.new # TypesIpfsPin | IPFS Body
opts = { 
  ignore_dupes: 'ignore_dupes_example' # String | Ignore Dupes
}

begin
  #Add IPFS object
  result = api_instance.content_add_ipfs_post(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_add_ipfs_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TypesIpfsPin**](TypesIpfsPin.md)| IPFS Body | 
 **ignore_dupes** | **String**| Ignore Dupes | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **content_add_post**
> UtilContentAddResponse content_add_post(datafilename, opts)

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
data = 'data_example' # String | 
filename = 'filename_example' # String | 
opts = { 
  coluuid: 'coluuid_example' # String | Collection UUID
  replication: 56 # Integer | Replication value
  ignore_dupes: 'ignore_dupes_example' # String | Ignore Dupes true/false
  lazy_provide: 'lazy_provide_example' # String | Lazy Provide true/false
  dir: 'dir_example' # String | Directory
}

begin
  #Add new content
  result = api_instance.content_add_post(datafilename, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_add_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | **String**|  | 
 **filename** | **String**|  | 
 **coluuid** | **String**| Collection UUID | [optional] 
 **replication** | **Integer**| Replication value | [optional] 
 **ignore_dupes** | **String**| Ignore Dupes true/false | [optional] 
 **lazy_provide** | **String**| Lazy Provide true/false | [optional] 
 **dir** | **String**| Directory | [optional] 

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
> String content_all_deals_get(_begin, duration, all)

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
  result = api_instance.content_all_deals_get(_begin, duration, all)
  p result
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_bw_usage_content_get**
> String content_bw_usage_content_get(content)

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
  result = api_instance.content_bw_usage_content_get(content)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_bw_usage_content_get: #{e}"
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



# **content_contents_get**
> String content_contents_get(limit, offset)

Get user contents

This endpoint is used to get user contents

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
offset = 'offset_example' # String | offset


begin
  #Get user contents
  result = api_instance.content_contents_get(limit, offset)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_contents_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| limit | 
 **offset** | **String**| offset | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_create_post**
> String content_create_post(body, opts)

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
body = SwaggerClient::UtilContentCreateBody.new # UtilContentCreateBody | Content
opts = { 
  ignore_dupes: 'ignore_dupes_example' # String | Ignore Dupes
}

begin
  #Add a new content
  result = api_instance.content_create_post(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_create_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content | 
 **ignore_dupes** | **String**| Ignore Dupes | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **content_deals_get**
> String content_deals_get(opts)

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
  result = api_instance.content_deals_get(opts)
  p result
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_ensure_replication_datacid_get**
> String content_ensure_replication_datacid_get(datacid)

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
  result = api_instance.content_ensure_replication_datacid_get(datacid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_ensure_replication_datacid_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **String**| Data CID | 

### Return type

**String**

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



# **content_id_get**
> String content_id_get(id)

Content

This endpoint returns a content by its ID

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
  #Content
  result = api_instance.content_id_get(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_list_get**
> String content_list_get

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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_staging_zones_get**
> String content_staging_zones_get

Get staging zone for user, excluding its contents

This endpoint is used to get staging zone for user, excluding its contents.

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
  #Get staging zone for user, excluding its contents
  result = api_instance.content_staging_zones_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_staging_zones_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_staging_zones_staging_zone_contents_get**
> String content_staging_zones_staging_zone_contents_get(staging_zone, limit, offset)

Get contents for a staging zone

This endpoint is used to get the contents for a staging zone

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
staging_zone = 56 # Integer | Staging Zone Content ID
limit = 'limit_example' # String | limit
offset = 'offset_example' # String | offset


begin
  #Get contents for a staging zone
  result = api_instance.content_staging_zones_staging_zone_contents_get(staging_zone, limit, offset)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_staging_zones_staging_zone_contents_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staging_zone** | **Integer**| Staging Zone Content ID | 
 **limit** | **String**| limit | 
 **offset** | **String**| offset | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_staging_zones_staging_zone_get**
> String content_staging_zones_staging_zone_get(staging_zone)

Get staging zone without its contents field populated

This endpoint is used to get a staging zone, excluding its contents.

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
staging_zone = 56 # Integer | Staging Zone Content ID


begin
  #Get staging zone without its contents field populated
  result = api_instance.content_staging_zones_staging_zone_get(staging_zone)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_staging_zones_staging_zone_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staging_zone** | **Integer**| Staging Zone Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_stats_get**
> String content_stats_get(limit, offset)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content

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
offset = 'offset_example' # String | offset


begin
  #Get content statistics
  result = api_instance.content_stats_get(limit, offset)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_stats_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| limit | 
 **offset** | **String**| offset | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **content_status_id_get**
> String content_status_id_get(id)

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
  result = api_instance.content_status_id_get(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ContentApi->content_status_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Content ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



