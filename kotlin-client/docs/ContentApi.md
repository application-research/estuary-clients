# ContentApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminInvitesCodePost**](ContentApi.md#adminInvitesCodePost) | **POST** /admin/invites/{code} | Create an Estuary invite
[**adminInvitesGet**](ContentApi.md#adminInvitesGet) | **GET** /admin/invites | Get Estuary invites
[**contentAddCarPost**](ContentApi.md#contentAddCarPost) | **POST** /content/add-car | Upload content via a car file
[**contentAddIpfsPost**](ContentApi.md#contentAddIpfsPost) | **POST** /content/add-ipfs | Add IPFS object
[**contentAddPost**](ContentApi.md#contentAddPost) | **POST** /content/add | Upload a file
[**contentAggregatedContentGet**](ContentApi.md#contentAggregatedContentGet) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**contentAllDealsGet**](ContentApi.md#contentAllDealsGet) | **GET** /content/all-deals | Get all deals for a user
[**contentBwUsageContentGet**](ContentApi.md#contentBwUsageContentGet) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**contentContentsGet**](ContentApi.md#contentContentsGet) | **GET** /content/contents | Get user contents
[**contentCreatePost**](ContentApi.md#contentCreatePost) | **POST** /content/create | Add a new content
[**contentDealsGet**](ContentApi.md#contentDealsGet) | **GET** /content/deals | Content with deals
[**contentEnsureReplicationDatacidGet**](ContentApi.md#contentEnsureReplicationDatacidGet) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**contentFailuresContentGet**](ContentApi.md#contentFailuresContentGet) | **GET** /content/failures/{content} | List all failures for a content
[**contentIdGet**](ContentApi.md#contentIdGet) | **GET** /content/{id} | Content
[**contentImportdealPost**](ContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal
[**contentListGet**](ContentApi.md#contentListGet) | **GET** /content/list | List all pinned content
[**contentReadContGet**](ContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content
[**contentStagingZonesGet**](ContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user, excluding its contents
[**contentStagingZonesStagingZoneContentsGet**](ContentApi.md#contentStagingZonesStagingZoneContentsGet) | **GET** /content/staging-zones/{staging_zone}/contents | Get contents for a staging zone
[**contentStagingZonesStagingZoneGet**](ContentApi.md#contentStagingZonesStagingZoneGet) | **GET** /content/staging-zones/{staging_zone} | Get staging zone without its contents field populated
[**contentStatsGet**](ContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics
[**contentStatusIdGet**](ContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status

<a name="adminInvitesCodePost"></a>
# **adminInvitesCodePost**
> kotlin.String adminInvitesCodePost(code)

Create an Estuary invite

This endpoint is used to create an estuary invite.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val code : kotlin.String = code_example // kotlin.String | Invite code to be created
try {
    val result : kotlin.String = apiInstance.adminInvitesCodePost(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#adminInvitesCodePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#adminInvitesCodePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| Invite code to be created |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminInvitesGet"></a>
# **adminInvitesGet**
> kotlin.String adminInvitesGet()

Get Estuary invites

This endpoint is used to list all estuary invites.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
try {
    val result : kotlin.String = apiInstance.adminInvitesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#adminInvitesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#adminInvitesGet")
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

<a name="contentAddCarPost"></a>
# **contentAddCarPost**
> kotlin.String contentAddCarPost()

Upload content via a car file

This endpoint uploads content via a car file

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
try {
    val result : kotlin.String = apiInstance.contentAddCarPost()
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
This endpoint does not need any parameter.

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
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val body : TypesIpfsPin =  // TypesIpfsPin | IPFS Body
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
 **body** | [**TypesIpfsPin**](TypesIpfsPin.md)| IPFS Body |
 **ignoreDupes** | **kotlin.String**| Ignore Dupes | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="contentAddPost"></a>
# **contentAddPost**
> kotlin.String contentAddPost()

Upload a file

This endpoint uploads a file.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
try {
    val result : kotlin.String = apiInstance.contentAddPost()
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
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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

<a name="contentContentsGet"></a>
# **contentContentsGet**
> kotlin.String contentContentsGet(limit, offset)

Get user contents

This endpoint is used to get user contents

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val limit : kotlin.String = limit_example // kotlin.String | limit
val offset : kotlin.String = offset_example // kotlin.String | offset
try {
    val result : kotlin.String = apiInstance.contentContentsGet(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentContentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentContentsGet")
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

<a name="contentCreatePost"></a>
# **contentCreatePost**
> kotlin.String contentCreatePost(body, ignoreDupes)

Add a new content

This endpoint adds a new content

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val body : UtilContentCreateBody =  // UtilContentCreateBody | Content
val ignoreDupes : kotlin.String = ignoreDupes_example // kotlin.String | Ignore Dupes
try {
    val result : kotlin.String = apiInstance.contentCreatePost(body, ignoreDupes)
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
 **body** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content |
 **ignoreDupes** | **kotlin.String**| Ignore Dupes | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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

 - **Content-Type**: */*
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
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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

Get staging zone for user, excluding its contents

This endpoint is used to get staging zone for user, excluding its contents.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

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

<a name="contentStagingZonesStagingZoneContentsGet"></a>
# **contentStagingZonesStagingZoneContentsGet**
> kotlin.String contentStagingZonesStagingZoneContentsGet(stagingZone, limit, offset)

Get contents for a staging zone

This endpoint is used to get the contents for a staging zone

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val stagingZone : kotlin.Int = 56 // kotlin.Int | Staging Zone Content ID
val limit : kotlin.String = limit_example // kotlin.String | limit
val offset : kotlin.String = offset_example // kotlin.String | offset
try {
    val result : kotlin.String = apiInstance.contentStagingZonesStagingZoneContentsGet(stagingZone, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentStagingZonesStagingZoneContentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentStagingZonesStagingZoneContentsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stagingZone** | **kotlin.Int**| Staging Zone Content ID |
 **limit** | **kotlin.String**| limit |
 **offset** | **kotlin.String**| offset |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStagingZonesStagingZoneGet"></a>
# **contentStagingZonesStagingZoneGet**
> kotlin.String contentStagingZonesStagingZoneGet(stagingZone)

Get staging zone without its contents field populated

This endpoint is used to get a staging zone, excluding its contents.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val stagingZone : kotlin.Int = 56 // kotlin.Int | Staging Zone Content ID
try {
    val result : kotlin.String = apiInstance.contentStagingZonesStagingZoneGet(stagingZone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#contentStagingZonesStagingZoneGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#contentStagingZonesStagingZoneGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stagingZone** | **kotlin.Int**| Staging Zone Content ID |

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

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

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
//import io.swagger.client.models.*;

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

