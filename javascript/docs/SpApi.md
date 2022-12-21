# EstuaryClient.SpApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storageProvidersClaimPost**](SpApi.md#storageProvidersClaimPost) | **POST** /storage-providers/claim | Claim Storage Provider
[**storageProvidersClaimSpGet**](SpApi.md#storageProvidersClaimSpGet) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**storageProvidersDealsSpGet**](SpApi.md#storageProvidersDealsSpGet) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
[**storageProvidersFailuresSpGet**](SpApi.md#storageProvidersFailuresSpGet) | **GET** /storage-providers/failures/{sp} | Get all storage providers
[**storageProvidersGet**](SpApi.md#storageProvidersGet) | **GET** /storage-providers | Get all storage providers
[**storageProvidersSetInfoSpPut**](SpApi.md#storageProvidersSetInfoSpPut) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**storageProvidersStatsSpGet**](SpApi.md#storageProvidersStatsSpGet) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
[**storageProvidersSuspendSpPost**](SpApi.md#storageProvidersSuspendSpPost) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**storageProvidersUnsuspendSpPut**](SpApi.md#storageProvidersUnsuspendSpPut) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

<a name="storageProvidersClaimPost"></a>
# **storageProvidersClaimPost**
> GithubComApplicationResearchEstuaryApiV2ClaimResponse storageProvidersClaimPost(body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let body = new EstuaryClient.MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Storage Provider Body

apiInstance.storageProvidersClaimPost(body, (error, data, response) => {
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
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersClaimSpGet"></a>
# **storageProvidersClaimSpGet**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storageProvidersClaimSpGet(sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let sp = "sp_example"; // String | Storage Provider claim message

apiInstance.storageProvidersClaimSpGet(sp, (error, data, response) => {
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
 **sp** | **String**| Storage Provider claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersDealsSpGet"></a>
# **storageProvidersDealsSpGet**
> &#x27;String&#x27; storageProvidersDealsSpGet(sp, opts)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let sp = "sp_example"; // String | Filter by storage provider
let opts = { 
  'ignoreFailed': "ignoreFailed_example" // String | Ignore Failed
};
apiInstance.storageProvidersDealsSpGet(sp, opts, (error, data, response) => {
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
 **sp** | **String**| Filter by storage provider | 
 **ignoreFailed** | **String**| Ignore Failed | [optional] 

### Return type

**&#x27;String&#x27;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersFailuresSpGet"></a>
# **storageProvidersFailuresSpGet**
> &#x27;String&#x27; storageProvidersFailuresSpGet(sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let sp = "sp_example"; // String | Filter by storage provider

apiInstance.storageProvidersFailuresSpGet(sp, (error, data, response) => {
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
 **sp** | **String**| Filter by storage provider | 

### Return type

**&#x27;String&#x27;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersGet"></a>
# **storageProvidersGet**
> [ApiStorageProviderResp] storageProvidersGet()

Get all storage providers

This endpoint returns all storage providers

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
apiInstance.storageProvidersGet((error, data, response) => {
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

[**[ApiStorageProviderResp]**](ApiStorageProviderResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersSetInfoSpPut"></a>
# **storageProvidersSetInfoSpPut**
> storageProvidersSetInfoSpPut(body, sp)

Set Storage Provider Info

This endpoint lets a user set storage provider info.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let body = new EstuaryClient.MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Storage Provider set info params
let sp = "sp_example"; // String | Storage Provider to set info for

apiInstance.storageProvidersSetInfoSpPut(body, sp, (error, data, response) => {
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
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params | 
 **sp** | **String**| Storage Provider to set info for | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersStatsSpGet"></a>
# **storageProvidersStatsSpGet**
> &#x27;String&#x27; storageProvidersStatsSpGet(sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let sp = "sp_example"; // String | Filter by storage provider

apiInstance.storageProvidersStatsSpGet(sp, (error, data, response) => {
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
 **sp** | **String**| Filter by storage provider | 

### Return type

**&#x27;String&#x27;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersSuspendSpPost"></a>
# **storageProvidersSuspendSpPost**
> {&#x27;String&#x27;: &#x27;String&#x27;} storageProvidersSuspendSpPost(body, sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let body = new EstuaryClient.MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Storage Provider Body
let sp = "sp_example"; // String | Storage Provider to suspend

apiInstance.storageProvidersSuspendSpPost(body, sp, (error, data, response) => {
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
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body | 
 **sp** | **String**| Storage Provider to suspend | 

### Return type

**{&#x27;String&#x27;: &#x27;String&#x27;}**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersUnsuspendSpPut"></a>
# **storageProvidersUnsuspendSpPut**
> storageProvidersUnsuspendSpPut(sp)

Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

### Example
```javascript
import {EstuaryClient} from 'estuary-client';
let defaultClient = EstuaryClient.ApiClient.instance;

// Configure API key authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.apiKeyPrefix = 'Token';

let apiInstance = new EstuaryClient.SpApi();
let sp = "sp_example"; // String | Storage Provider to unsuspend

apiInstance.storageProvidersUnsuspendSpPut(sp, (error, data, response) => {
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
 **sp** | **String**| Storage Provider to unsuspend | 

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

