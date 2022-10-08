# ContentApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentAddCarPost**](ContentApi.md#contentAddCarPost) | **POST** /content/add-car | Add Car object
[**contentAddIpfsPost**](ContentApi.md#contentAddIpfsPost) | **POST** /content/add-ipfs | Add IPFS object
[**contentAddPost**](ContentApi.md#contentAddPost) | **POST** /content/add | Add new content
[**contentAggregatedContentGet**](ContentApi.md#contentAggregatedContentGet) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**contentAllDealsGet**](ContentApi.md#contentAllDealsGet) | **GET** /content/all-deals | Get all deals for a user
[**contentBwUsageContentGet**](ContentApi.md#contentBwUsageContentGet) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**contentCreatePost**](ContentApi.md#contentCreatePost) | **POST** /content/create | Add a new content
[**contentDealsGet**](ContentApi.md#contentDealsGet) | **GET** /content/deals | Content with deals
[**contentEnsureReplicationDatacidGet**](ContentApi.md#contentEnsureReplicationDatacidGet) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**contentFailuresContentGet**](ContentApi.md#contentFailuresContentGet) | **GET** /content/failures/{content} | List all failures for a content
[**contentImportdealPost**](ContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal
[**contentListGet**](ContentApi.md#contentListGet) | **GET** /content/list | List all pinned content
[**contentReadContGet**](ContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content
[**contentStagingZonesGet**](ContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user
[**contentStatsGet**](ContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics
[**contentStatusIdGet**](ContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status


<a name="contentAddCarPost"></a>
# **contentAddCarPost**
> contentAddCarPost(body, filename, commp, size)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val body : kotlin.String = body_example // kotlin.String | Car
val filename : kotlin.String = filename_example // kotlin.String | Filename
val commp : kotlin.String = commp_example // kotlin.String | Commp
val size : kotlin.String = size_example // kotlin.String | Size
try {
    apiInstance.contentAddCarPost(body, filename, commp, size)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentAddCarPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentAddCarPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**| Car |
 **filename** | **kotlin.String**| Filename | [optional]
 **commp** | **kotlin.String**| Commp | [optional]
 **size** | **kotlin.String**| Size | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAddIpfsPost"></a>
# **contentAddIpfsPost**
> contentAddIpfsPost(body)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val body : UtilContentAddIpfsBody =  // UtilContentAddIpfsBody | IPFS Body
try {
    apiInstance.contentAddIpfsPost(body)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentAddIpfsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentAddIpfsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAddPost"></a>
# **contentAddPost**
> UtilContentAddResponse contentAddPost(file, coluuid, dir)

Add new content

This endpoint is used to upload new content.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val file : java.io.File = /path/to/file.txt // java.io.File | File to upload
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection UUID
val dir : kotlin.String = dir_example // kotlin.String | Directory
try {
    val result : UtilContentAddResponse = apiInstance.contentAddPost(file, coluuid, dir)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentAddPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| File to upload |
 **coluuid** | **kotlin.String**| Collection UUID |
 **dir** | **kotlin.String**| Directory |

### Return type

[**UtilContentAddResponse**](UtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="contentAggregatedContentGet"></a>
# **contentAggregatedContentGet**
> kotlin.String contentAggregatedContentGet(content)

Get aggregated content stats

This endpoint returns aggregated content stats

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val content : kotlin.String = content_example // kotlin.String | Content ID
try {
    val result : kotlin.String = apiInstance.contentAggregatedContentGet(content)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentAggregatedContentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentAggregatedContentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **kotlin.String**| Content ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAllDealsGet"></a>
# **contentAllDealsGet**
> contentAllDealsGet(begin, duration, all)

Get all deals for a user

This endpoint is used to get all deals for a user

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val begin : kotlin.String = begin_example // kotlin.String | Begin
val duration : kotlin.String = duration_example // kotlin.String | Duration
val all : kotlin.String = all_example // kotlin.String | All
try {
    apiInstance.contentAllDealsGet(begin, duration, all)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentAllDealsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentAllDealsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **kotlin.String**| Begin |
 **duration** | **kotlin.String**| Duration |
 **all** | **kotlin.String**| All |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentBwUsageContentGet"></a>
# **contentBwUsageContentGet**
> contentBwUsageContentGet(content)

Get content bandwidth

This endpoint returns content bandwidth

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val content : kotlin.String = content_example // kotlin.String | Content ID
try {
    apiInstance.contentBwUsageContentGet(content)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentBwUsageContentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentBwUsageContentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **kotlin.String**| Content ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentCreatePost"></a>
# **contentCreatePost**
> contentCreatePost(body)

Add a new content

This endpoint adds a new content

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val body : kotlin.String = body_example // kotlin.String | Content
try {
    apiInstance.contentCreatePost(body)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentCreatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**| Content |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentDealsGet"></a>
# **contentDealsGet**
> contentDealsGet(limit, offset)

Content with deals

This endpoint lists all content with deals

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit
val offset : kotlin.Int = 56 // kotlin.Int | Offset
try {
    apiInstance.contentDealsGet(limit, offset)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentDealsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentDealsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Limit | [optional]
 **offset** | **kotlin.Int**| Offset | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentEnsureReplicationDatacidGet"></a>
# **contentEnsureReplicationDatacidGet**
> contentEnsureReplicationDatacidGet(datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val datacid : kotlin.String = datacid_example // kotlin.String | Data CID
try {
    apiInstance.contentEnsureReplicationDatacidGet(datacid)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentEnsureReplicationDatacidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentEnsureReplicationDatacidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **kotlin.String**| Data CID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentFailuresContentGet"></a>
# **contentFailuresContentGet**
> kotlin.String contentFailuresContentGet(content)

List all failures for a content

This endpoint returns all failures for a content

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val content : kotlin.String = content_example // kotlin.String | Content ID
try {
    val result : kotlin.String = apiInstance.contentFailuresContentGet(content)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentFailuresContentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentFailuresContentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **kotlin.String**| Content ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentImportdealPost"></a>
# **contentImportdealPost**
> contentImportdealPost(body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val body : MainimportDealBody =  // MainimportDealBody | Import a deal
try {
    apiInstance.contentImportdealPost(body)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentImportdealPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentImportdealPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainimportDealBody**](MainimportDealBody.md)| Import a deal |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentListGet"></a>
# **contentListGet**
> kotlin.Array&lt;kotlin.String&gt; contentListGet()

List all pinned content

This endpoint lists all content

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.contentListGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentListGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentListGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentReadContGet"></a>
# **contentReadContGet**
> contentReadContGet(cont)

Read content

This endpoint reads content from the blockstore

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val cont : kotlin.String = cont_example // kotlin.String | CID
try {
    apiInstance.contentReadContGet(cont)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentReadContGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentReadContGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cont** | **kotlin.String**| CID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStagingZonesGet"></a>
# **contentStagingZonesGet**
> contentStagingZonesGet()

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
try {
    apiInstance.contentStagingZonesGet()
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentStagingZonesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentStagingZonesGet")
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

<a name="contentStatsGet"></a>
# **contentStatsGet**
> contentStatsGet(limit)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val limit : kotlin.String = limit_example // kotlin.String | limit
try {
    apiInstance.contentStatsGet(limit)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentStatsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.String**| limit |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStatusIdGet"></a>
# **contentStatusIdGet**
> contentStatusIdGet(id)

Content Status

This endpoint returns the status of a content

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = ContentApi()
val id : kotlin.Int = 56 // kotlin.Int | Content ID
try {
    apiInstance.contentStatusIdGet(id)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentStatusIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentStatusIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Content ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

