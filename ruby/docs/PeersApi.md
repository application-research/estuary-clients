# SwaggerClient::PeersApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_peering_peers_delete**](PeersApi.md#admin_peering_peers_delete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**admin_peering_peers_get**](PeersApi.md#admin_peering_peers_get) | **GET** /admin/peering/peers | List all Peering peers
[**admin_peering_peers_post**](PeersApi.md#admin_peering_peers_post) | **POST** /admin/peering/peers | Add peers on Peering Service
[**admin_peering_start_post**](PeersApi.md#admin_peering_start_post) | **POST** /admin/peering/start | Start Peering
[**admin_peering_status_get**](PeersApi.md#admin_peering_status_get) | **GET** /admin/peering/status | Check Peering Status
[**admin_peering_stop_post**](PeersApi.md#admin_peering_stop_post) | **POST** /admin/peering/stop | Stop Peering


# **admin_peering_peers_delete**
> admin_peering_peers_delete

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

api_instance = SwaggerClient::PeersApi.new

begin
  #Remove peers on Peering Service
  api_instance.admin_peering_peers_delete
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PeersApi->admin_peering_peers_delete: #{e}"
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



# **admin_peering_peers_get**
> admin_peering_peers_get

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

api_instance = SwaggerClient::PeersApi.new

begin
  #List all Peering peers
  api_instance.admin_peering_peers_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PeersApi->admin_peering_peers_get: #{e}"
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



# **admin_peering_peers_post**
> admin_peering_peers_post

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

api_instance = SwaggerClient::PeersApi.new

begin
  #Add peers on Peering Service
  api_instance.admin_peering_peers_post
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PeersApi->admin_peering_peers_post: #{e}"
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



# **admin_peering_start_post**
> admin_peering_start_post

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

api_instance = SwaggerClient::PeersApi.new

begin
  #Start Peering
  api_instance.admin_peering_start_post
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PeersApi->admin_peering_start_post: #{e}"
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



# **admin_peering_status_get**
> admin_peering_status_get

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

api_instance = SwaggerClient::PeersApi.new

begin
  #Check Peering Status
  api_instance.admin_peering_status_get
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PeersApi->admin_peering_status_get: #{e}"
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



# **admin_peering_stop_post**
> admin_peering_stop_post

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

api_instance = SwaggerClient::PeersApi.new

begin
  #Stop Peering
  api_instance.admin_peering_stop_post
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PeersApi->admin_peering_stop_post: #{e}"
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



