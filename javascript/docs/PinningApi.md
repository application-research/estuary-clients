# EstuaryClient.PinningApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](PinningApi.md#pinningPinsGet) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](PinningApi.md#pinningPinsPinidDelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](PinningApi.md#pinningPinsPinidGet) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](PinningApi.md#pinningPinsPinidPost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](PinningApi.md#pinningPinsPost) | **POST** /pinning/pins | Add and pin object

<a name="pinningPinsGet"></a>
# **pinningPinsGet**
> PinnerIpfsListPinStatusResponse pinningPinsGet()

List all pin status objects

This endpoint lists all pin status objects

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.PinningApi();
apiInstance.pinningPinsGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PinnerIpfsListPinStatusResponse**](PinnerIpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidDelete"></a>
# **pinningPinsPinidDelete**
> pinningPinsPinidDelete(pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.PinningApi();
let pinid = "pinid_example"; // String | Pin ID

apiInstance.pinningPinsPinidDelete(pinid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| Pin ID | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidGet"></a>
# **pinningPinsPinidGet**
> PinnerIpfsPinStatusResponse pinningPinsPinidGet(pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.PinningApi();
let pinid = "pinid_example"; // String | cid

apiInstance.pinningPinsPinidGet(pinid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **String**| cid | 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinningPinsPinidPost"></a>
# **pinningPinsPinidPost**
> PinnerIpfsPinStatusResponse pinningPinsPinidPost(body, pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.PinningApi();
let body = new EstuaryClient.PinnerIpfsPin(); // PinnerIpfsPin | New pin
let pinid = "pinid_example"; // String | Pin ID to be replaced

apiInstance.pinningPinsPinidPost(body, pinid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| New pin | 
 **pinid** | **String**| Pin ID to be replaced | 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pinningPinsPost"></a>
# **pinningPinsPost**
> PinnerIpfsPinStatusResponse pinningPinsPost(body, opts)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.PinningApi();
let body = new EstuaryClient.PinnerIpfsPin(); // PinnerIpfsPin | Pin Body {cid:cid, name:name}
let opts = { 
  'ignoreDupes': "ignoreDupes_example", // String | Ignore Dupes
  'overwrite': "overwrite_example" // String | Overwrite conflicting files in collections
};
apiInstance.pinningPinsPost(body, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinnerIpfsPin**](PinnerIpfsPin.md)| Pin Body {cid:cid, name:name} | 
 **ignoreDupes** | **String**| Ignore Dupes | [optional] 
 **overwrite** | **String**| Overwrite conflicting files in collections | [optional] 

### Return type

[**PinnerIpfsPinStatusResponse**](PinnerIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

