# SpApi

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
> GithubComApplicationResearchEstuaryApiV2claimResponse storageProvidersClaimPost(body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val body : MinerClaimMinerBody =  // MinerClaimMinerBody | Claim Storage Provider Body
try {
    val result : GithubComApplicationResearchEstuaryApiV2claimResponse = apiInstance.storageProvidersClaimPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersClaimPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersClaimPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body |

### Return type

[**GithubComApplicationResearchEstuaryApiV2claimResponse**](GithubComApplicationResearchEstuaryApiV2claimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersClaimSpGet"></a>
# **storageProvidersClaimSpGet**
> GithubComApplicationResearchEstuaryApiV2claimMsgResponse storageProvidersClaimSpGet(sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val sp : kotlin.String = sp_example // kotlin.String | Storage Provider claim message
try {
    val result : GithubComApplicationResearchEstuaryApiV2claimMsgResponse = apiInstance.storageProvidersClaimSpGet(sp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersClaimSpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersClaimSpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **kotlin.String**| Storage Provider claim message |

### Return type

[**GithubComApplicationResearchEstuaryApiV2claimMsgResponse**](GithubComApplicationResearchEstuaryApiV2claimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersDealsSpGet"></a>
# **storageProvidersDealsSpGet**
> kotlin.String storageProvidersDealsSpGet(sp, ignoreFailed)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val sp : kotlin.String = sp_example // kotlin.String | Filter by storage provider
val ignoreFailed : kotlin.String = ignoreFailed_example // kotlin.String | Ignore Failed
try {
    val result : kotlin.String = apiInstance.storageProvidersDealsSpGet(sp, ignoreFailed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersDealsSpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersDealsSpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **kotlin.String**| Filter by storage provider |
 **ignoreFailed** | **kotlin.String**| Ignore Failed | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersFailuresSpGet"></a>
# **storageProvidersFailuresSpGet**
> kotlin.String storageProvidersFailuresSpGet(sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val sp : kotlin.String = sp_example // kotlin.String | Filter by storage provider
try {
    val result : kotlin.String = apiInstance.storageProvidersFailuresSpGet(sp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersFailuresSpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersFailuresSpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **kotlin.String**| Filter by storage provider |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersGet"></a>
# **storageProvidersGet**
> kotlin.Array&lt;ApistorageProviderResp&gt; storageProvidersGet()

Get all storage providers

This endpoint returns all storage providers

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
try {
    val result : kotlin.Array<ApistorageProviderResp> = apiInstance.storageProvidersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ApistorageProviderResp&gt;**](ApistorageProviderResp.md)

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
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val body : MinerMinerSetInfoParams =  // MinerMinerSetInfoParams | Storage Provider set info params
val sp : kotlin.String = sp_example // kotlin.String | Storage Provider to set info for
try {
    apiInstance.storageProvidersSetInfoSpPut(body, sp)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersSetInfoSpPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersSetInfoSpPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params |
 **sp** | **kotlin.String**| Storage Provider to set info for |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersStatsSpGet"></a>
# **storageProvidersStatsSpGet**
> kotlin.String storageProvidersStatsSpGet(sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val sp : kotlin.String = sp_example // kotlin.String | Filter by storage provider
try {
    val result : kotlin.String = apiInstance.storageProvidersStatsSpGet(sp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersStatsSpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersStatsSpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **kotlin.String**| Filter by storage provider |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersSuspendSpPost"></a>
# **storageProvidersSuspendSpPost**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; storageProvidersSuspendSpPost(body, sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val body : MinerSuspendMinerBody =  // MinerSuspendMinerBody | Suspend Storage Provider Body
val sp : kotlin.String = sp_example // kotlin.String | Storage Provider to suspend
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.storageProvidersSuspendSpPost(body, sp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersSuspendSpPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersSuspendSpPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body |
 **sp** | **kotlin.String**| Storage Provider to suspend |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

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
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SpApi()
val sp : kotlin.String = sp_example // kotlin.String | Storage Provider to unsuspend
try {
    apiInstance.storageProvidersUnsuspendSpPut(sp)
} catch (e: ClientException) {
    println("4xx response calling SpApi#storageProvidersUnsuspendSpPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpApi#storageProvidersUnsuspendSpPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **kotlin.String**| Storage Provider to unsuspend |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

