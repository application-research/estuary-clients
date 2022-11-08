# \PinningApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinning_pins_get**](PinningApi.md#pinning_pins_get) | **Get** /pinning/pins | List all pin status objects
[**pinning_pins_pinid_delete**](PinningApi.md#pinning_pins_pinid_delete) | **Delete** /pinning/pins/{pinid} | Delete a pinned object
[**pinning_pins_pinid_get**](PinningApi.md#pinning_pins_pinid_get) | **Get** /pinning/pins/{pinid} | Get a pin status object
[**pinning_pins_pinid_post**](PinningApi.md#pinning_pins_pinid_post) | **Post** /pinning/pins/{pinid} | Replace a pinned object
[**pinning_pins_post**](PinningApi.md#pinning_pins_post) | **Post** /pinning/pins | Add and pin object


# **pinning_pins_get**
> ::models::TypesIpfsListPinStatusResponse pinning_pins_get(ctx, )
List all pin status objects

This endpoint lists all pin status objects

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**::models::TypesIpfsListPinStatusResponse**](types.IpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_delete**
> pinning_pins_pinid_delete(ctx, pinid)
Delete a pinned object

This endpoint deletes a pinned object.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pinid** | **String**| Pin ID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_get**
> ::models::TypesIpfsPinStatusResponse pinning_pins_pinid_get(ctx, pinid)
Get a pin status object

This endpoint returns a pin status object.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pinid** | **String**| cid | 

### Return type

[**::models::TypesIpfsPinStatusResponse**](types.IpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_pinid_post**
> ::models::TypesIpfsPinStatusResponse pinning_pins_pinid_post(ctx, pinid, cid, optional)
Replace a pinned object

This endpoint replaces a pinned object.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pinid** | **String**| Pin ID | 
  **cid** | **String**| CID of new pin | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID | 
 **cid** | **String**| CID of new pin | 
 **name** | **String**| Name (filename) of new pin | 
 **origins** | **String**| Origins of new pin | 
 **meta** | **String**| Meta information of new pin | 

### Return type

[**::models::TypesIpfsPinStatusResponse**](types.IpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinning_pins_post**
> ::models::TypesIpfsPinStatusResponse pinning_pins_post(ctx, pin)
Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pin** | [**TypesIpfsPin**](TypesIpfsPin.md)| Pin Body {cid:cid, name:name} | 

### Return type

[**::models::TypesIpfsPinStatusResponse**](types.IpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

