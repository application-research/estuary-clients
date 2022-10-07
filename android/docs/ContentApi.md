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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String body = "body_example"; // String | Car
String filename = "filename_example"; // String | Filename
String commp = "commp_example"; // String | Commp
String size = "size_example"; // String | Size
try {
    apiInstance.contentAddCarPost(body, filename, commp, size);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAddCarPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| Car |
 **filename** | **String**| Filename | [optional]
 **commp** | **String**| Commp | [optional]
 **size** | **String**| Size | [optional]

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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
UtilContentAddIpfsBody body = new UtilContentAddIpfsBody(); // UtilContentAddIpfsBody | IPFS Body
try {
    apiInstance.contentAddIpfsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAddIpfsPost");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String coluuid = "coluuid_example"; // String | Collection UUID
String dir = "dir_example"; // String | Directory
try {
    UtilContentAddResponse result = apiInstance.contentAddPost(file, coluuid, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **coluuid** | **String**| Collection UUID |
 **dir** | **String**| Directory |

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
> contentAllDealsGet(begin, duration, all)

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
    apiInstance.contentAllDealsGet(begin, duration, all);
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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String content = "content_example"; // String | Content ID
try {
    apiInstance.contentBwUsageContentGet(content);
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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String body = "body_example"; // String | Content
try {
    apiInstance.contentCreatePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| Content |

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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
Integer limit = 56; // Integer | Limit
Integer offset = 56; // Integer | Offset
try {
    apiInstance.contentDealsGet(limit, offset);
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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String datacid = "datacid_example"; // String | Data CID
try {
    apiInstance.contentEnsureReplicationDatacidGet(datacid);
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

null (empty response body)

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

<a name="contentImportdealPost"></a>
# **contentImportdealPost**
> contentImportdealPost(body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
MainImportDealBody body = new MainImportDealBody(); // MainImportDealBody | Import a deal
try {
    apiInstance.contentImportdealPost(body);
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentListGet"></a>
# **contentListGet**
> List&lt;String&gt; contentListGet()

List all pinned content

This endpoint lists all content

### Example
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
try {
    List<String> result = apiInstance.contentListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String cont = "cont_example"; // String | CID
try {
    apiInstance.contentReadContGet(cont);
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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
try {
    apiInstance.contentStagingZonesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentStagingZonesGet");
    e.printStackTrace();
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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
String limit = "limit_example"; // String | limit
try {
    apiInstance.contentStatsGet(limit);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentStatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| limit |

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
```java
// Import classes:
//import io.swagger.client.api.ContentApi;

ContentApi apiInstance = new ContentApi();
Integer id = 56; // Integer | Content ID
try {
    apiInstance.contentStatusIdGet(id);
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

