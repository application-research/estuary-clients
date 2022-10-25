# DealsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealEstimatePost**](DealsApi.md#dealEstimatePost) | **POST** /deal/estimate | Estimate the cost of a deal
[**dealInfoDealidGet**](DealsApi.md#dealInfoDealidGet) | **GET** /deal/info/{dealid} | Get Deal Info
[**dealProposalPropcidGet**](DealsApi.md#dealProposalPropcidGet) | **GET** /deal/proposal/{propcid} | Get Proposal
[**dealQueryMinerGet**](DealsApi.md#dealQueryMinerGet) | **GET** /deal/query/{miner} | Query Ask
[**dealStatusByProposalPropcidGet**](DealsApi.md#dealStatusByProposalPropcidGet) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**dealStatusMinerPropcidGet**](DealsApi.md#dealStatusMinerPropcidGet) | **GET** /deal/status/{miner}/{propcid} | Deal Status
[**dealTransferInProgressGet**](DealsApi.md#dealTransferInProgressGet) | **GET** /deal/transfer/in-progress | Transfer In Progress
[**dealsFailuresGet**](DealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures for user
[**dealsMakeMinerPost**](DealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal
[**dealsStatusDealGet**](DealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status
[**publicDealsFailuresGet**](DealsApi.md#publicDealsFailuresGet) | **GET** /public/deals/failures | Get storage failures
[**publicMinersStorageQueryMinerGet**](DealsApi.md#publicMinersStorageQueryMinerGet) | **GET** /public/miners/storage/query/{miner} | Query Ask


<a name="dealEstimatePost"></a>
# **dealEstimatePost**
> dealEstimatePost(body)

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val body : MainestimateDealBody =  // MainestimateDealBody | The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
try {
    apiInstance.dealEstimatePost(body)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealEstimatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealEstimatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainestimateDealBody**](MainestimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealInfoDealidGet"></a>
# **dealInfoDealidGet**
> dealInfoDealidGet(dealid)

Get Deal Info

This endpoint returns the deal info for a deal

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val dealid : kotlin.Int = 56 // kotlin.Int | Deal ID
try {
    apiInstance.dealInfoDealidGet(dealid)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealInfoDealidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealInfoDealidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealid** | **kotlin.Int**| Deal ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealProposalPropcidGet"></a>
# **dealProposalPropcidGet**
> dealProposalPropcidGet(propcid)

Get Proposal

This endpoint returns the proposal for a deal

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val propcid : kotlin.String = propcid_example // kotlin.String | Proposal CID
try {
    apiInstance.dealProposalPropcidGet(propcid)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealProposalPropcidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealProposalPropcidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **kotlin.String**| Proposal CID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealQueryMinerGet"></a>
# **dealQueryMinerGet**
> dealQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val miner : kotlin.String = miner_example // kotlin.String | CID
try {
    apiInstance.dealQueryMinerGet(miner)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealQueryMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealQueryMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| CID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealStatusByProposalPropcidGet"></a>
# **dealStatusByProposalPropcidGet**
> dealStatusByProposalPropcidGet(propcid)

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val propcid : kotlin.String = propcid_example // kotlin.String | PropCid
try {
    apiInstance.dealStatusByProposalPropcidGet(propcid)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealStatusByProposalPropcidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealStatusByProposalPropcidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **kotlin.String**| PropCid |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealStatusMinerPropcidGet"></a>
# **dealStatusMinerPropcidGet**
> dealStatusMinerPropcidGet(miner, propcid)

Deal Status

This endpoint returns the status of a deal

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val miner : kotlin.String = miner_example // kotlin.String | Miner
val propcid : kotlin.String = propcid_example // kotlin.String | Proposal CID
try {
    apiInstance.dealStatusMinerPropcidGet(miner, propcid)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealStatusMinerPropcidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealStatusMinerPropcidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Miner |
 **propcid** | **kotlin.String**| Proposal CID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealTransferInProgressGet"></a>
# **dealTransferInProgressGet**
> dealTransferInProgressGet()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
try {
    apiInstance.dealTransferInProgressGet()
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealTransferInProgressGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealTransferInProgressGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsFailuresGet"></a>
# **dealsFailuresGet**
> dealsFailuresGet()

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
try {
    apiInstance.dealsFailuresGet()
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealsFailuresGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealsFailuresGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsMakeMinerPost"></a>
# **dealsMakeMinerPost**
> dealsMakeMinerPost(miner, dealRequest)

Make Deal

This endpoint makes a deal for a given content and miner

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val miner : kotlin.String = miner_example // kotlin.String | Miner
val dealRequest : kotlin.String = dealRequest_example // kotlin.String | Deal Request
try {
    apiInstance.dealsMakeMinerPost(miner, dealRequest)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealsMakeMinerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealsMakeMinerPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Miner |
 **dealRequest** | **kotlin.String**| Deal Request |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsStatusDealGet"></a>
# **dealsStatusDealGet**
> dealsStatusDealGet(deal)

Get Deal Status

This endpoint returns the status of a deal

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val deal : kotlin.Int = 56 // kotlin.Int | Deal ID
try {
    apiInstance.dealsStatusDealGet(deal)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealsStatusDealGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealsStatusDealGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deal** | **kotlin.Int**| Deal ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicDealsFailuresGet"></a>
# **publicDealsFailuresGet**
> publicDealsFailuresGet()

Get storage failures

This endpoint returns a list of storage failures

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
try {
    apiInstance.publicDealsFailuresGet()
} catch (e: ClientException) {
    println("4xx response calling DealsApi#publicDealsFailuresGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#publicDealsFailuresGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersStorageQueryMinerGet"></a>
# **publicMinersStorageQueryMinerGet**
> publicMinersStorageQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val miner : kotlin.String = miner_example // kotlin.String | CID
try {
    apiInstance.publicMinersStorageQueryMinerGet(miner)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#publicMinersStorageQueryMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#publicMinersStorageQueryMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| CID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

