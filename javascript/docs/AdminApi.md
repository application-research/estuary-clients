# EstuaryClient.AdminApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](AdminApi.md#adminPeeringPeersDelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](AdminApi.md#adminPeeringPeersGet) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](AdminApi.md#adminPeeringPeersPost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](AdminApi.md#adminPeeringStartPost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](AdminApi.md#adminPeeringStatusGet) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](AdminApi.md#adminPeeringStopPost) | **POST** /admin/peering/stop | Stop Peering
[**adminSystemConfigGet**](AdminApi.md#adminSystemConfigGet) | **GET** /admin/system/config | Get systems(estuary/shuttle) config
[**adminUsersGet**](AdminApi.md#adminUsersGet) | **GET** /admin/users | Get all users


<a name="adminPeeringPeersDelete"></a>
# **adminPeeringPeersDelete**
> 'String' adminPeeringPeersDelete(peerIds)

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var peerIds = [new EstuaryClient.[Boolean]()]; // [Boolean] | Peer ids


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminPeeringPeersDelete(peerIds, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peerIds** | **[Boolean]**| Peer ids | 

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringPeersGet"></a>
# **adminPeeringPeersGet**
> 'String' adminPeeringPeersGet()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminPeeringPeersGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringPeersPost"></a>
# **adminPeeringPeersPost**
> 'String' adminPeeringPeersPost()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminPeeringPeersPost(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringStartPost"></a>
# **adminPeeringStartPost**
> 'String' adminPeeringStartPost()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminPeeringStartPost(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringStatusGet"></a>
# **adminPeeringStatusGet**
> 'String' adminPeeringStatusGet()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminPeeringStatusGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminPeeringStopPost"></a>
# **adminPeeringStopPost**
> 'String' adminPeeringStopPost()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminPeeringStopPost(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminSystemConfigGet"></a>
# **adminSystemConfigGet**
> 'String' adminSystemConfigGet()

Get systems(estuary/shuttle) config

This endpoint is used to get system configs.

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminSystemConfigGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminUsersGet"></a>
# **adminUsersGet**
> 'String' adminUsersGet()

Get all users

This endpoint is used to get all users.

### Example
```javascript
var EstuaryClient = require('estuary-client');
var defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
var bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

var apiInstance = new EstuaryClient.AdminApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.adminUsersGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**'String'**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

