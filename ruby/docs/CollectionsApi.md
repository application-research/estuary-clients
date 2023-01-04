# SwaggerClient::CollectionsApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collections_coluuid_commit_post**](CollectionsApi.md#collections_coluuid_commit_post) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**collections_coluuid_contents_delete**](CollectionsApi.md#collections_coluuid_contents_delete) | **DELETE** /collections/{coluuid}/contents | Deletes a content from a collection
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



# **collections_coluuid_contents_delete**
> String collections_coluuid_contents_delete(bodycoluuid)

Deletes a content from a collection

This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path

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
body = SwaggerClient::ApiDeleteContentFromCollectionBody.new # ApiDeleteContentFromCollectionBody | Variable to use when filtering for files (must be either 'path' or 'content_id')
coluuid = 'coluuid_example' # String | Collection ID


begin
  #Deletes a content from a collection
  result = api_instance.collections_coluuid_contents_delete(bodycoluuid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_contents_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiDeleteContentFromCollectionBody**](ApiDeleteContentFromCollectionBody.md)| Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;) | 
 **coluuid** | **String**| Collection ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



# **collections_coluuid_delete**
> String collections_coluuid_delete(coluuid)

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
  result = api_instance.collections_coluuid_delete(coluuid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **collections_coluuid_get**
> Array&lt;CollectionsCollectionListResponse&gt; collections_coluuid_get(coluuid, opts)

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
coluuid = 'coluuid_example' # String | coluuid
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
 **coluuid** | **String**| coluuid | 
 **dir** | **String**| Directory | [optional] 

### Return type

[**Array&lt;CollectionsCollectionListResponse&gt;**](CollectionsCollectionListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_coluuid_post**
> String collections_coluuid_post(bodycoluuid, opts)

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
body = [56] # Array<Integer> | Content IDs to add to collection
coluuid = 'coluuid_example' # String | Collection UUID
opts = { 
  dir: 'dir_example' # String | Directory
  overwrite: 'overwrite_example' # String | Overwrite conflicting files
}

begin
  #Add contents to a collection
  result = api_instance.collections_coluuid_post(bodycoluuid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_coluuid_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Array&lt;Integer&gt;**](Integer.md)| Content IDs to add to collection | 
 **coluuid** | **String**| Collection UUID | 
 **dir** | **String**| Directory | [optional] 
 **overwrite** | **String**| Overwrite conflicting files | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **collections_fs_add_post**
> String collections_fs_add_post(coluuid, content, opts)

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
opts = { 
  dir: 'dir_example', # String | Directory inside collection
  overwrite: 'overwrite_example' # String | Overwrite file if already exists in path
}

begin
  #Add a file to a collection
  result = api_instance.collections_fs_add_post(coluuid, content, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_fs_add_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 
 **content** | **String**| Content | 
 **dir** | **String**| Directory inside collection | [optional] 
 **overwrite** | **String**| Overwrite file if already exists in path | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_get**
> Array&lt;CollectionsCollection&gt; collections_get

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

begin
  #List all collections
  result = api_instance.collections_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CollectionsApi->collections_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;CollectionsCollection&gt;**](CollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **collections_post**
> CollectionsCollection collections_post(body)

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
body = SwaggerClient::ApiCreateCollectionBody.new # ApiCreateCollectionBody | Collection name and description


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
 **body** | [**ApiCreateCollectionBody**](ApiCreateCollectionBody.md)| Collection name and description | 

### Return type

[**CollectionsCollection**](CollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json



