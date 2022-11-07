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
[**contentIdGet**](ContentApi.md#contentIdGet) | **GET** /content/{id} | Content
[**contentImportdealPost**](ContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal
[**contentListGet**](ContentApi.md#contentListGet) | **GET** /content/list | List all pinned content
[**contentReadContGet**](ContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content
[**contentStagingZonesGet**](ContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user
[**contentStatsGet**](ContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics
[**contentStatusIdGet**](ContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status


<a name="contentAddCarPost"></a>
# **contentAddCarPost**
> kotlin.String contentAddCarPost(body, ignoreDupes, filename)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val body : kotlin.String = body_example // kotlin.String | Car
val ignoreDupes : kotlin.String = ignoreDupes_example // kotlin.String | Ignore Dupes
val filename : kotlin.String = filename_example // kotlin.String | Filename
try {
    val result : kotlin.String = apiInstance.contentAddCarPost(body, ignoreDupes, filename)
    println(result)
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
 **ignoreDupes** | **kotlin.String**| Ignore Dupes | [optional]
 **filename** | **kotlin.String**| Filename | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAddIpfsPost"></a>
# **contentAddIpfsPost**
> kotlin.String contentAddIpfsPost(body, ignoreDupes)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val body : UtilContentAddIpfsBody =  // UtilContentAddIpfsBody | IPFS Body
val ignoreDupes : kotlin.String = ignoreDupes_example // kotlin.String | Ignore Dupes
try {
    val result : kotlin.String = apiInstance.contentAddIpfsPost(body, ignoreDupes)
    println(result)
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
 **ignoreDupes** | **kotlin.String**| Ignore Dupes | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAddPost"></a>
# **contentAddPost**
> UtilContentAddResponse contentAddPost(`data`, filename, coluuid, replication, ignoreDupes, lazyProvide, dir)

Add new content

This endpoint is used to upload new content.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val `data` : java.io.File = /path/to/file.txt // java.io.File | File to upload
val filename : kotlin.String = filename_example // kotlin.String | Filenam to use for upload
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection UUID
val replication : kotlin.Int = 56 // kotlin.Int | Replication value
val ignoreDupes : kotlin.String = ignoreDupes_example // kotlin.String | Ignore Dupes true/false
val lazyProvide : kotlin.String = lazyProvide_example // kotlin.String | Lazy Provide true/false
val dir : kotlin.String = dir_example // kotlin.String | Directory
try {
    val result : UtilContentAddResponse = apiInstance.contentAddPost(`data`, filename, coluuid, replication, ignoreDupes, lazyProvide, dir)
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
 **&#x60;data&#x60;** | **java.io.File**| File to upload |
 **filename** | **kotlin.String**| Filenam to use for upload | [optional]
 **coluuid** | **kotlin.String**| Collection UUID | [optional]
 **replication** | **kotlin.Int**| Replication value | [optional]
 **ignoreDupes** | **kotlin.String**| Ignore Dupes true/false | [optional]
 **lazyProvide** | **kotlin.String**| Lazy Provide true/false | [optional]
 **dir** | **kotlin.String**| Directory | [optional]

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
//import estuary-client.infrastructure.*
//import estuary-client.models.*

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
> kotlin.String contentAllDealsGet(begin, duration, all)

Get all deals for a user

This endpoint is used to get all deals for a user

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val begin : kotlin.String = begin_example // kotlin.String | Begin
val duration : kotlin.String = duration_example // kotlin.String | Duration
val all : kotlin.String = all_example // kotlin.String | All
try {
    val result : kotlin.String = apiInstance.contentAllDealsGet(begin, duration, all)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentBwUsageContentGet"></a>
# **contentBwUsageContentGet**
> kotlin.String contentBwUsageContentGet(content)

Get content bandwidth

This endpoint returns content bandwidth

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val content : kotlin.String = content_example // kotlin.String | Content ID
try {
    val result : kotlin.String = apiInstance.contentBwUsageContentGet(content)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentCreatePost"></a>
# **contentCreatePost**
> kotlin.String contentCreatePost(req, ignoreDupes)

Add a new content

This endpoint adds a new content

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val req : UtilContentCreateBody =  // UtilContentCreateBody | Content
val ignoreDupes : kotlin.String = ignoreDupes_example // kotlin.String | Ignore Dupes
try {
    val result : kotlin.String = apiInstance.contentCreatePost(req, ignoreDupes)
    println(result)
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
 **req** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content |
 **ignoreDupes** | **kotlin.String**| Ignore Dupes | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentDealsGet"></a>
# **contentDealsGet**
> kotlin.String contentDealsGet(limit, offset)

Content with deals

This endpoint lists all content with deals

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit
val offset : kotlin.Int = 56 // kotlin.Int | Offset
try {
    val result : kotlin.String = apiInstance.contentDealsGet(limit, offset)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentEnsureReplicationDatacidGet"></a>
# **contentEnsureReplicationDatacidGet**
> kotlin.String contentEnsureReplicationDatacidGet(datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val datacid : kotlin.String = datacid_example // kotlin.String | Data CID
try {
    val result : kotlin.String = apiInstance.contentEnsureReplicationDatacidGet(datacid)
    println(result)
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

**kotlin.String**

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
//import estuary-client.infrastructure.*
//import estuary-client.models.*

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

<a name="contentIdGet"></a>
# **contentIdGet**
> kotlin.String contentIdGet(id)

Content

This endpoint returns a content by its ID

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val id : kotlin.Int = 56 // kotlin.Int | Content ID
try {
    val result : kotlin.String = apiInstance.contentIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Content ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentImportdealPost"></a>
# **contentImportdealPost**
> kotlin.String contentImportdealPost(body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val body : MainimportDealBody =  // MainimportDealBody | Import a deal
try {
    val result : kotlin.String = apiInstance.contentImportdealPost(body)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentListGet"></a>
# **contentListGet**
> kotlin.String contentListGet()

List all pinned content

This endpoint lists all content

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
try {
    val result : kotlin.String = apiInstance.contentListGet()
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentReadContGet"></a>
# **contentReadContGet**
> kotlin.String contentReadContGet(cont)

Read content

This endpoint reads content from the blockstore

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val cont : kotlin.String = cont_example // kotlin.String | CID
try {
    val result : kotlin.String = apiInstance.contentReadContGet(cont)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStagingZonesGet"></a>
# **contentStagingZonesGet**
> kotlin.String contentStagingZonesGet()

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
try {
    val result : kotlin.String = apiInstance.contentStagingZonesGet()
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStatsGet"></a>
# **contentStatsGet**
> kotlin.String contentStatsGet(limit, offset)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val limit : kotlin.String = limit_example // kotlin.String | limit
val offset : kotlin.String = offset_example // kotlin.String | offset
try {
    val result : kotlin.String = apiInstance.contentStatsGet(limit, offset)
    println(result)
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
 **offset** | **kotlin.String**| offset |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStatusIdGet"></a>
# **contentStatusIdGet**
> kotlin.String contentStatusIdGet(id)

Content Status

This endpoint returns the status of a content

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import estuary-client.models.*

val apiInstance = ContentApi()
val id : kotlin.Int = 56 // kotlin.Int | Content ID
try {
    val result : kotlin.String = apiInstance.contentStatusIdGet(id)
    println(result)
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

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

