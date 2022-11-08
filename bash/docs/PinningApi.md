# PinningApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object


## **pinningPinsGet**

List all pin status objects

This endpoint lists all pin status objects

### Example
```bash
 pinningPinsGet
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Types.IpfsListPinStatusResponse**](Types.IpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **pinningPinsPinidDelete**

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```bash
 pinningPinsPinidDelete pinid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string** | Pin ID |

### Return type

(empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **pinningPinsPinidGet**

Get a pin status object

This endpoint returns a pin status object.

### Example
```bash
 pinningPinsPinidGet pinid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string** | cid |

### Return type

[**Types.IpfsPinStatusResponse**](Types.IpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **pinningPinsPinidPost**

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```bash
 pinningPinsPinidPost pinid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string** | Pin ID |
 **cid** | **string** | CID of new pin |
 **name** | **string** | Name (filename) of new pin | [optional]
 **origins** | **string** | Origins of new pin | [optional]
 **meta** | **string** | Meta information of new pin | [optional]

### Return type

[**Types.IpfsPinStatusResponse**](Types.IpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **pinningPinsPost**

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```bash
 pinningPinsPost
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Types.IpfsPin**](Types.IpfsPin.md) | Pin Body {cid:cid, name:name} |

### Return type

[**Types.IpfsPinStatusResponse**](Types.IpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

