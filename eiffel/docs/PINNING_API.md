# PINNING_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**pinning_pins_get**](PINNING_API.md#pinning_pins_get) | **Get** /pinning/pins | List all pin status objects
[**pinning_pins_pinid_delete**](PINNING_API.md#pinning_pins_pinid_delete) | **Delete** /pinning/pins/{pinid} | Delete a pinned object
[**pinning_pins_pinid_get**](PINNING_API.md#pinning_pins_pinid_get) | **Get** /pinning/pins/{pinid} | Get a pin status object
[**pinning_pins_pinid_post**](PINNING_API.md#pinning_pins_pinid_post) | **Post** /pinning/pins/{pinid} | Replace a pinned object
[**pinning_pins_post**](PINNING_API.md#pinning_pins_post) | **Post** /pinning/pins | Add and pin object


# **pinning_pins_get**
> pinning_pins_get : detachable STRING_32
	

List all pin status objects

This endpoint lists all pin status objects


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

# **pinning_pins_pinid_delete**
> pinning_pins_pinid_delete (pinid: STRING_32 ): detachable STRING_32
	

Delete a pinned object

This endpoint deletes a pinned object.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **STRING_32**| Pin ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_get**
> pinning_pins_pinid_get (pinid: STRING_32 ): detachable STRING_32
	

Get a pin status object

This endpoint returns a pin status object.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **STRING_32**| cid | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_post**
> pinning_pins_pinid_post (pinid: STRING_32 ): detachable STRING_32
	

Replace a pinned object

This endpoint replaces a pinned object.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **STRING_32**| Pin ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_post**
> pinning_pins_post (pin: TYPES_IPFS_PIN ): detachable STRING_32
	

Add and pin object

This endpoint adds a pin to the IPFS daemon.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**TYPES_IPFS_PIN**](TYPES_IPFS_PIN.md)| Pin Body {cid:cid, name:name} | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

