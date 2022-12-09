# MinerApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**minerClaimMinerGet**](MinerApi.md#minerClaimMinerGet) | **GET** /miner/claim/{miner} | Get Claim Miner Message
[**minerClaimPost**](MinerApi.md#minerClaimPost) | **POST** /miner/claim | Claim Miner
[**minerSetInfoMinerPut**](MinerApi.md#minerSetInfoMinerPut) | **PUT** /miner/set-info/{miner} | Set Miner Info
[**minerSuspendMinerPost**](MinerApi.md#minerSuspendMinerPost) | **POST** /miner/suspend/{miner} | Suspend Miner
[**minerUnsuspendMinerPut**](MinerApi.md#minerUnsuspendMinerPut) | **PUT** /miner/unsuspend/{miner} | Unuspend Miner
[**publicMinersDealsMinerGet**](MinerApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersStatsMinerGet**](MinerApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats

<a name="minerClaimMinerGet"></a>
# **minerClaimMinerGet**
> ApiclaimMsgResponse minerClaimMinerGet(miner)

Get Claim Miner Message

This endpoint lets a user get the message in order to claim a miner

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Miner claim message
try {
    val result : ApiclaimMsgResponse = apiInstance.minerClaimMinerGet(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#minerClaimMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#minerClaimMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Miner claim message |

### Return type

[**ApiclaimMsgResponse**](ApiclaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="minerClaimPost"></a>
# **minerClaimPost**
> ApiclaimResponse minerClaimPost(body)

Claim Miner

This endpoint lets a user claim a miner

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val body : MinerClaimMinerBody =  // MinerClaimMinerBody | Claim Miner Body
try {
    val result : ApiclaimResponse = apiInstance.minerClaimPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#minerClaimPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#minerClaimPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Miner Body |

### Return type

[**ApiclaimResponse**](ApiclaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="minerSetInfoMinerPut"></a>
# **minerSetInfoMinerPut**
> ApiemptyResp minerSetInfoMinerPut(body, miner)

Set Miner Info

This endpoint lets a user set miner info.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val body : MinerMinerSetInfoParams =  // MinerMinerSetInfoParams | Miner set info params
val miner : kotlin.String = miner_example // kotlin.String | Miner to set info for
try {
    val result : ApiemptyResp = apiInstance.minerSetInfoMinerPut(body, miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#minerSetInfoMinerPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#minerSetInfoMinerPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Miner set info params |
 **miner** | **kotlin.String**| Miner to set info for |

### Return type

[**ApiemptyResp**](ApiemptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="minerSuspendMinerPost"></a>
# **minerSuspendMinerPost**
> ApiemptyResp minerSuspendMinerPost(body, miner)

Suspend Miner

This endpoint lets a user suspend a miner.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val body : MinerSuspendMinerBody =  // MinerSuspendMinerBody | Suspend Miner Body
val miner : kotlin.String = miner_example // kotlin.String | Miner to suspend
try {
    val result : ApiemptyResp = apiInstance.minerSuspendMinerPost(body, miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#minerSuspendMinerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#minerSuspendMinerPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Miner Body |
 **miner** | **kotlin.String**| Miner to suspend |

### Return type

[**ApiemptyResp**](ApiemptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="minerUnsuspendMinerPut"></a>
# **minerUnsuspendMinerPut**
> ApiemptyResp minerUnsuspendMinerPut(miner)

Unuspend Miner

This endpoint lets a user unsuspend a miner.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Miner to unsuspend
try {
    val result : ApiemptyResp = apiInstance.minerUnsuspendMinerPut(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#minerUnsuspendMinerPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#minerUnsuspendMinerPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Miner to unsuspend |

### Return type

[**ApiemptyResp**](ApiemptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> kotlin.String publicMinersDealsMinerGet(miner, ignoreFailed)

Get all miners deals

This endpoint returns all miners deals

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
val ignoreFailed : kotlin.String = ignoreFailed_example // kotlin.String | Ignore Failed
try {
    val result : kotlin.String = apiInstance.publicMinersDealsMinerGet(miner, ignoreFailed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#publicMinersDealsMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#publicMinersDealsMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Filter by miner |
 **ignoreFailed** | **kotlin.String**| Ignore Failed | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> kotlin.String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = MinerApi()
val miner : kotlin.String = miner_example // kotlin.String | Filter by miner
try {
    val result : kotlin.String = apiInstance.publicMinersStatsMinerGet(miner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MinerApi#publicMinersStatsMinerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MinerApi#publicMinersStatsMinerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **kotlin.String**| Filter by miner |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

