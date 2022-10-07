# SwaggerClient::CollectionsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collections_coluuid_commit_post**](CollectionsApi.md#collections_coluuid_commit_post) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**collections_coluuid_delete**](CollectionsApi.md#collections_coluuid_delete) | **DELETE** /collections/{coluuid} | Deletes a collection
[**collections_coluuid_get**](CollectionsApi.md#collections_coluuid_get) | **GET** /collections/{coluuid} | Get contents in a collection
[**collections_coluuid_post**](CollectionsApi.md#collections_coluuid_post) | **POST** /collections/{coluuid} | Add contents to a collection
[**collections_fs_add_post**](CollectionsApi.md#collections_fs_add_post) | **POST** /collections/fs/add | Add a file to a collection
[**collections_get**](CollectionsApi.md#collections_get) | **GET** /collections/ | List all collections
[**collections_post**](CollectionsApi.md#collections_post) | **POST** /collections/ | Create a new collection


# **collections_coluuid_commit_post**
> String collections_coluuid_commit_post(coluuid)

Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.

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

api_instance = SwaggerClient::CollectionsApi.new

coluuid = 'coluuid_example' # String | coluuid


begin
  #Produce a CID of the collection contents
  result = api_instance.collections_coluuid_commit_post(coluuid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_commit_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| coluuid | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_coluuid_delete**
> collections_coluuid_delete(coluuid)

Deletes a collection

This endpoint is used to delete an existing collection.

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

api_instance = SwaggerClient::CollectionsApi.new

coluuid = 'coluuid_example' # String | Collection ID


begin
  #Deletes a collection
  api_instance.collections_coluuid_delete(coluuid)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **collections_coluuid_get**
> String collections_coluuid_get(coluuid, opts)

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

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

api_instance = SwaggerClient::CollectionsApi.new

coluuid = 'coluuid_example' # String | Collection UUID

opts = { 
  dir: 'dir_example' # String | Directory
}

begin
  #Get contents in a collection
  result = api_instance.collections_coluuid_get(coluuid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection UUID | 
 **dir** | **String**| Directory | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_coluuid_post**
> Hash&lt;String, String&gt; collections_coluuid_post(body)

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

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

api_instance = SwaggerClient::CollectionsApi.new

body = [SwaggerClient::Array<Integer>.new] # Array<Integer> | Content IDs to add to collection


begin
  #Add contents to a collection
  result = api_instance.collections_coluuid_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Array&lt;Integer&gt;**| Content IDs to add to collection | 

### Return type

**Hash&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **collections_fs_add_post**
> collections_fs_add_post(coluuid, content, path)

Add a file to a collection

This endpoint adds a file to a collection

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

api_instance = SwaggerClient::CollectionsApi.new

coluuid = 'coluuid_example' # String | Collection ID

content = 'content_example' # String | Content

path = 'path_example' # String | Path to file


begin
  #Add a file to a collection
  api_instance.collections_fs_add_post(coluuid, content, path)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_fs_add_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 
 **content** | **String**| Content | 
 **path** | **String**| Path to file | 

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_get**
> Array&lt;MainCollection&gt; collections_get(id)

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

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

api_instance = SwaggerClient::CollectionsApi.new

id = 56 # Integer | User ID


begin
  #List all collections
  result = api_instance.collections_get(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User ID | 

### Return type

[**Array&lt;MainCollection&gt;**](MainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_post**
> MainCollection collections_post(body)

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

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

api_instance = SwaggerClient::CollectionsApi.new

body = SwaggerClient::MainCreateCollectionBody.new # MainCreateCollectionBody | Collection name and description


begin
  #Create a new collection
  result = api_instance.collections_post(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainCreateCollectionBody**](MainCreateCollectionBody.md)| Collection name and description | 

### Return type

[**MainCollection**](MainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



