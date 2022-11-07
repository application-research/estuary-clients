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
> String contentAddCarPost(body, ignoreDupes, filename)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String body = "body_example"; // String | Car
String ignoreDupes = "ignoreDupes_example"; // String | Ignore Dupes
String filename = "filename_example"; // String | Filename
try {
    String result = apiInstance.contentAddCarPost(body, ignoreDupes, filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAddCarPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| Car |
 **ignoreDupes** | **String**| Ignore Dupes | [optional]
 **filename** | **String**| Filename | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAddIpfsPost"></a>
# **contentAddIpfsPost**
> String contentAddIpfsPost(body, ignoreDupes)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
UtilContentAddIpfsBody body = new UtilContentAddIpfsBody(); // UtilContentAddIpfsBody | IPFS Body
String ignoreDupes = "ignoreDupes_example"; // String | Ignore Dupes
try {
    String result = apiInstance.contentAddIpfsPost(body, ignoreDupes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAddIpfsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body |
 **ignoreDupes** | **String**| Ignore Dupes | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAddPost"></a>
# **contentAddPost**
> UtilContentAddResponse contentAddPost(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir)

Add new content

This endpoint is used to upload new content.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
File data = new File("/path/to/file.txt"); // File | File to upload
String filename = "filename_example"; // String | Filenam to use for upload
String coluuid = "coluuid_example"; // String | Collection UUID
Integer replication = 56; // Integer | Replication value
String ignoreDupes = "ignoreDupes_example"; // String | Ignore Dupes true/false
String lazyProvide = "lazyProvide_example"; // String | Lazy Provide true/false
String dir = "dir_example"; // String | Directory
try {
    UtilContentAddResponse result = apiInstance.contentAddPost(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | **File**| File to upload |
 **filename** | **String**| Filenam to use for upload | [optional]
 **coluuid** | **String**| Collection UUID | [optional]
 **replication** | **Integer**| Replication value | [optional]
 **ignoreDupes** | **String**| Ignore Dupes true/false | [optional]
 **lazyProvide** | **String**| Lazy Provide true/false | [optional]
 **dir** | **String**| Directory | [optional]

### Return type

[**UtilContentAddResponse**](UtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="contentAggregatedContentGet"></a>
# **contentAggregatedContentGet**
> String contentAggregatedContentGet(content)

Get aggregated content stats

This endpoint returns aggregated content stats

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String content = "content_example"; // String | Content ID
try {
    String result = apiInstance.contentAggregatedContentGet(content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAggregatedContentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Content ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentAllDealsGet"></a>
# **contentAllDealsGet**
> String contentAllDealsGet(begin, duration, all)

Get all deals for a user

This endpoint is used to get all deals for a user

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String begin = "begin_example"; // String | Begin
String duration = "duration_example"; // String | Duration
String all = "all_example"; // String | All
try {
    String result = apiInstance.contentAllDealsGet(begin, duration, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAllDealsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **String**| Begin |
 **duration** | **String**| Duration |
 **all** | **String**| All |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentBwUsageContentGet"></a>
# **contentBwUsageContentGet**
> String contentBwUsageContentGet(content)

Get content bandwidth

This endpoint returns content bandwidth

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String content = "content_example"; // String | Content ID
try {
    String result = apiInstance.contentBwUsageContentGet(content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentBwUsageContentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Content ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentCreatePost"></a>
# **contentCreatePost**
> String contentCreatePost(req, ignoreDupes)

Add a new content

This endpoint adds a new content

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
UtilContentCreateBody req = new UtilContentCreateBody(); // UtilContentCreateBody | Content
String ignoreDupes = "ignoreDupes_example"; // String | Ignore Dupes
try {
    String result = apiInstance.contentCreatePost(req, ignoreDupes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content |
 **ignoreDupes** | **String**| Ignore Dupes | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentDealsGet"></a>
# **contentDealsGet**
> String contentDealsGet(limit, offset)

Content with deals

This endpoint lists all content with deals

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
Integer limit = 56; // Integer | Limit
Integer offset = 56; // Integer | Offset
try {
    String result = apiInstance.contentDealsGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentDealsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit | [optional]
 **offset** | **Integer**| Offset | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentEnsureReplicationDatacidGet"></a>
# **contentEnsureReplicationDatacidGet**
> String contentEnsureReplicationDatacidGet(datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String datacid = "datacid_example"; // String | Data CID
try {
    String result = apiInstance.contentEnsureReplicationDatacidGet(datacid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentEnsureReplicationDatacidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **String**| Data CID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentFailuresContentGet"></a>
# **contentFailuresContentGet**
> String contentFailuresContentGet(content)

List all failures for a content

This endpoint returns all failures for a content

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String content = "content_example"; // String | Content ID
try {
    String result = apiInstance.contentFailuresContentGet(content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentFailuresContentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **String**| Content ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentIdGet"></a>
# **contentIdGet**
> String contentIdGet(id)

Content

This endpoint returns a content by its ID

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
Integer id = 56; // Integer | Content ID
try {
    String result = apiInstance.contentIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Content ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentImportdealPost"></a>
# **contentImportdealPost**
> String contentImportdealPost(body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
MainImportDealBody body = new MainImportDealBody(); // MainImportDealBody | Import a deal
try {
    String result = apiInstance.contentImportdealPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentImportdealPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainImportDealBody**](MainImportDealBody.md)| Import a deal |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentListGet"></a>
# **contentListGet**
> String contentListGet()

List all pinned content

This endpoint lists all content

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
try {
    String result = apiInstance.contentListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentReadContGet"></a>
# **contentReadContGet**
> String contentReadContGet(cont)

Read content

This endpoint reads content from the blockstore

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String cont = "cont_example"; // String | CID
try {
    String result = apiInstance.contentReadContGet(cont);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentReadContGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cont** | **String**| CID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStagingZonesGet"></a>
# **contentStagingZonesGet**
> String contentStagingZonesGet()

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
try {
    String result = apiInstance.contentStagingZonesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentStagingZonesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStatsGet"></a>
# **contentStatsGet**
> String contentStatsGet(limit, offset)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String limit = "limit_example"; // String | limit
String offset = "offset_example"; // String | offset
try {
    String result = apiInstance.contentStatsGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentStatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| limit |
 **offset** | **String**| offset |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentStatusIdGet"></a>
# **contentStatusIdGet**
> String contentStatusIdGet(id)

Content Status

This endpoint returns the status of a content

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
Integer id = 56; // Integer | Content ID
try {
    String result = apiInstance.contentStatusIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentStatusIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Content ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

