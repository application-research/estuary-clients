# swagger.api.DealsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealEstimatePost**](DealsApi.md#dealEstimatePost) | **Post** /deal/estimate | Estimate the cost of a deal
[**dealInfoDealidGet**](DealsApi.md#dealInfoDealidGet) | **Get** /deal/info/:dealid | Get Deal Info
[**dealProposalPropcidGet**](DealsApi.md#dealProposalPropcidGet) | **Get** /deal/proposal/:propcid | Get Proposal
[**dealQueryMinerGet**](DealsApi.md#dealQueryMinerGet) | **Get** /deal/query/:miner | Query Ask
[**dealStatusByProposalPropcidGet**](DealsApi.md#dealStatusByProposalPropcidGet) | **Get** /deal/status-by-proposal/:propcid | Get Deal Status by PropCid
[**dealStatusMinerPropcidGet**](DealsApi.md#dealStatusMinerPropcidGet) | **Get** /deal/status/:miner/:propcid | Deal Status
[**dealTransferInProgressGet**](DealsApi.md#dealTransferInProgressGet) | **Get** /deal/transfer/in-progress | Transfer In Progress
[**dealsFailuresGet**](DealsApi.md#dealsFailuresGet) | **Get** /deals/failures | Get storage failures for user
[**dealsMakeMinerPost**](DealsApi.md#dealsMakeMinerPost) | **Post** /deals/make/:miner | Make Deal
[**dealsStatusDealGet**](DealsApi.md#dealsStatusDealGet) | **Get** /deals/status/:deal | Get Deal Status
[**publicDealsFailuresGet**](DealsApi.md#publicDealsFailuresGet) | **Get** /public/deals/failures | Get storage failures
[**publicMinersStorageQueryMinerGet**](DealsApi.md#publicMinersStorageQueryMinerGet) | **Get** /public/miners/storage/query/:miner | Query Ask


# **dealEstimatePost**
> dealEstimatePost(body)

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var body = new MainEstimateDealBody(); // MainEstimateDealBody | The size of the deal in bytes, the replication factor, and the duration of the deal in blocks

try { 
    api_instance.dealEstimatePost(body);
} catch (e) {
    print("Exception when calling DealsApi->dealEstimatePost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainEstimateDealBody**](MainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealInfoDealidGet**
> dealInfoDealidGet(dealid)

Get Deal Info

This endpoint returns the deal info for a deal

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var dealid = 56; // int | Deal ID

try { 
    api_instance.dealInfoDealidGet(dealid);
} catch (e) {
    print("Exception when calling DealsApi->dealInfoDealidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealid** | **int**| Deal ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealProposalPropcidGet**
> dealProposalPropcidGet(propcid)

Get Proposal

This endpoint returns the proposal for a deal

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var propcid = propcid_example; // String | Proposal CID

try { 
    api_instance.dealProposalPropcidGet(propcid);
} catch (e) {
    print("Exception when calling DealsApi->dealProposalPropcidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **String**| Proposal CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealQueryMinerGet**
> dealQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var miner = miner_example; // String | CID

try { 
    api_instance.dealQueryMinerGet(miner);
} catch (e) {
    print("Exception when calling DealsApi->dealQueryMinerGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealStatusByProposalPropcidGet**
> dealStatusByProposalPropcidGet(propcid)

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var propcid = propcid_example; // String | PropCid

try { 
    api_instance.dealStatusByProposalPropcidGet(propcid);
} catch (e) {
    print("Exception when calling DealsApi->dealStatusByProposalPropcidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **String**| PropCid | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealStatusMinerPropcidGet**
> dealStatusMinerPropcidGet(miner, propcid)

Deal Status

This endpoint returns the status of a deal

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var miner = miner_example; // String | Miner
var propcid = propcid_example; // String | Proposal CID

try { 
    api_instance.dealStatusMinerPropcidGet(miner, propcid);
} catch (e) {
    print("Exception when calling DealsApi->dealStatusMinerPropcidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner | 
 **propcid** | **String**| Proposal CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealTransferInProgressGet**
> dealTransferInProgressGet()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();

try { 
    api_instance.dealTransferInProgressGet();
} catch (e) {
    print("Exception when calling DealsApi->dealTransferInProgressGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealsFailuresGet**
> dealsFailuresGet()

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();

try { 
    api_instance.dealsFailuresGet();
} catch (e) {
    print("Exception when calling DealsApi->dealsFailuresGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealsMakeMinerPost**
> dealsMakeMinerPost(miner, dealRequest)

Make Deal

This endpoint makes a deal for a given content and miner

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var miner = miner_example; // String | Miner
var dealRequest = new String(); // String | Deal Request

try { 
    api_instance.dealsMakeMinerPost(miner, dealRequest);
} catch (e) {
    print("Exception when calling DealsApi->dealsMakeMinerPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner | 
 **dealRequest** | **String**| Deal Request | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealsStatusDealGet**
> dealsStatusDealGet(deal)

Get Deal Status

This endpoint returns the status of a deal

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var deal = 56; // int | Deal ID

try { 
    api_instance.dealsStatusDealGet(deal);
} catch (e) {
    print("Exception when calling DealsApi->dealsStatusDealGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deal** | **int**| Deal ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicDealsFailuresGet**
> publicDealsFailuresGet()

Get storage failures

This endpoint returns a list of storage failures

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();

try { 
    api_instance.publicDealsFailuresGet();
} catch (e) {
    print("Exception when calling DealsApi->publicDealsFailuresGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersStorageQueryMinerGet**
> publicMinersStorageQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new DealsApi();
var miner = miner_example; // String | CID

try { 
    api_instance.publicMinersStorageQueryMinerGet(miner);
} catch (e) {
    print("Exception when calling DealsApi->publicMinersStorageQueryMinerGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

