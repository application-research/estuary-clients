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
[**dealTransferStatusPost**](DealsApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | Transfer Status
[**dealsFailuresGet**](DealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures for user
[**dealsMakeMinerPost**](DealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal
[**dealsStatusDealGet**](DealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status
[**publicDealsFailuresGet**](DealsApi.md#publicDealsFailuresGet) | **GET** /public/deals/failures | Get storage failures
[**publicMinersStorageQueryMinerGet**](DealsApi.md#publicMinersStorageQueryMinerGet) | **GET** /public/miners/storage/query/{miner} | Query Ask


<a name="dealEstimatePost"></a>
# **dealEstimatePost**
> kotlin.String dealEstimatePost(body)

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
    val result : kotlin.String = apiInstance.dealEstimatePost(body)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealInfoDealidGet"></a>
# **dealInfoDealidGet**
> kotlin.String dealInfoDealidGet(dealid)

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
    val result : kotlin.String = apiInstance.dealInfoDealidGet(dealid)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealProposalPropcidGet"></a>
# **dealProposalPropcidGet**
> kotlin.String dealProposalPropcidGet(propcid)

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
    val result : kotlin.String = apiInstance.dealProposalPropcidGet(propcid)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealQueryMinerGet"></a>
# **dealQueryMinerGet**
> kotlin.String dealQueryMinerGet(miner)

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
    val result : kotlin.String = apiInstance.dealQueryMinerGet(miner)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealStatusByProposalPropcidGet"></a>
# **dealStatusByProposalPropcidGet**
> kotlin.String dealStatusByProposalPropcidGet(propcid)

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
    val result : kotlin.String = apiInstance.dealStatusByProposalPropcidGet(propcid)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealStatusMinerPropcidGet"></a>
# **dealStatusMinerPropcidGet**
> kotlin.String dealStatusMinerPropcidGet(miner, propcid)

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
    val result : kotlin.String = apiInstance.dealStatusMinerPropcidGet(miner, propcid)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealTransferInProgressGet"></a>
# **dealTransferInProgressGet**
> kotlin.String dealTransferInProgressGet()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
try {
    val result : kotlin.String = apiInstance.dealTransferInProgressGet()
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealTransferStatusPost"></a>
# **dealTransferStatusPost**
> kotlin.String dealTransferStatusPost(chanid)

Transfer Status

This endpoint returns the status of a transfer

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
val chanid : MainChannelIDParam =  // MainChannelIDParam | Channel ID
try {
    val result : kotlin.String = apiInstance.dealTransferStatusPost(chanid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealsApi#dealTransferStatusPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealsApi#dealTransferStatusPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chanid** | [**MainChannelIDParam**](MainChannelIDParam.md)| Channel ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsFailuresGet"></a>
# **dealsFailuresGet**
> kotlin.String dealsFailuresGet()

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
try {
    val result : kotlin.String = apiInstance.dealsFailuresGet()
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsMakeMinerPost"></a>
# **dealsMakeMinerPost**
> kotlin.String dealsMakeMinerPost(miner, dealRequest)

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
    val result : kotlin.String = apiInstance.dealsMakeMinerPost(miner, dealRequest)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsStatusDealGet"></a>
# **dealsStatusDealGet**
> kotlin.String dealsStatusDealGet(deal)

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
    val result : kotlin.String = apiInstance.dealsStatusDealGet(deal)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicDealsFailuresGet"></a>
# **publicDealsFailuresGet**
> kotlin.String publicDealsFailuresGet()

Get storage failures

This endpoint returns a list of storage failures

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = DealsApi()
try {
    val result : kotlin.String = apiInstance.publicDealsFailuresGet()
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersStorageQueryMinerGet"></a>
# **publicMinersStorageQueryMinerGet**
> kotlin.String publicMinersStorageQueryMinerGet(miner)

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
    val result : kotlin.String = apiInstance.publicMinersStorageQueryMinerGet(miner)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

