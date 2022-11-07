# SwaggerClient::AdminApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_peering_peers_delete**](AdminApi.md#admin_peering_peers_delete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**admin_peering_peers_get**](AdminApi.md#admin_peering_peers_get) | **GET** /admin/peering/peers | List all Peering peers
[**admin_peering_peers_post**](AdminApi.md#admin_peering_peers_post) | **POST** /admin/peering/peers | Add peers on Peering Service
[**admin_peering_start_post**](AdminApi.md#admin_peering_start_post) | **POST** /admin/peering/start | Start Peering
[**admin_peering_status_get**](AdminApi.md#admin_peering_status_get) | **GET** /admin/peering/status | Check Peering Status
[**admin_peering_stop_post**](AdminApi.md#admin_peering_stop_post) | **POST** /admin/peering/stop | Stop Peering
[**admin_system_config_get**](AdminApi.md#admin_system_config_get) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
[**admin_users_get**](AdminApi.md#admin_users_get) | **GET** /admin/users | Get all users


# **admin_peering_peers_delete**
> String admin_peering_peers_delete(peer_ids)

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

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

api_instance = SwaggerClient::AdminApi.new

peer_ids = [SwaggerClient::Array<BOOLEAN>.new] # Array<BOOLEAN> | Peer ids


begin
  #Remove peers on Peering Service
  result = api_instance.admin_peering_peers_delete(peer_ids)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_peering_peers_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peer_ids** | **Array&lt;BOOLEAN&gt;**| Peer ids | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **admin_peering_peers_get**
> String admin_peering_peers_get

List all Peering peers

This endpoint can be used to list all peers on Peering Service

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

api_instance = SwaggerClient::AdminApi.new

begin
  #List all Peering peers
  result = api_instance.admin_peering_peers_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_peering_peers_get: #{e}"
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



# **admin_peering_peers_post**
> String admin_peering_peers_post

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

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

api_instance = SwaggerClient::AdminApi.new

begin
  #Add peers on Peering Service
  result = api_instance.admin_peering_peers_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_peering_peers_post: #{e}"
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



# **admin_peering_start_post**
> String admin_peering_start_post

Start Peering

This endpoint can be used to start the Peering Service

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

api_instance = SwaggerClient::AdminApi.new

begin
  #Start Peering
  result = api_instance.admin_peering_start_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_peering_start_post: #{e}"
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



# **admin_peering_status_get**
> String admin_peering_status_get

Check Peering Status

This endpoint can be used to check the Peering status

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

api_instance = SwaggerClient::AdminApi.new

begin
  #Check Peering Status
  result = api_instance.admin_peering_status_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_peering_status_get: #{e}"
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



# **admin_peering_stop_post**
> String admin_peering_stop_post

Stop Peering

This endpoint can be used to stop the Peering Service

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

api_instance = SwaggerClient::AdminApi.new

begin
  #Stop Peering
  result = api_instance.admin_peering_stop_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_peering_stop_post: #{e}"
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



# **admin_system_config_get**
> String admin_system_config_get

Get systems(estuary/shuttle) config

This endpoint is used to get system configs.

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

api_instance = SwaggerClient::AdminApi.new

begin
  #Get systems(estuary/shuttle) config
  result = api_instance.admin_system_config_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_system_config_get: #{e}"
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



# **admin_users_get**
> String admin_users_get

Get all users

This endpoint is used to get all users.

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

api_instance = SwaggerClient::AdminApi.new

begin
  #Get all users
  result = api_instance.admin_users_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminApi->admin_users_get: #{e}"
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



