# SwagContentApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentAddCarPost**](SwagContentApi.md#contentAddCarPost) | **POST** /content/add-car | Add Car object
[**contentAddIpfsPost**](SwagContentApi.md#contentAddIpfsPost) | **POST** /content/add-ipfs | Add IPFS object
[**contentAddPost**](SwagContentApi.md#contentAddPost) | **POST** /content/add | Add new content
[**contentAggregatedContentGet**](SwagContentApi.md#contentAggregatedContentGet) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**contentAllDealsGet**](SwagContentApi.md#contentAllDealsGet) | **GET** /content/all-deals | Get all deals for a user
[**contentBwUsageContentGet**](SwagContentApi.md#contentBwUsageContentGet) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**contentCreatePost**](SwagContentApi.md#contentCreatePost) | **POST** /content/create | Add a new content
[**contentDealsGet**](SwagContentApi.md#contentDealsGet) | **GET** /content/deals | Content with deals
[**contentEnsureReplicationDatacidGet**](SwagContentApi.md#contentEnsureReplicationDatacidGet) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**contentFailuresContentGet**](SwagContentApi.md#contentFailuresContentGet) | **GET** /content/failures/{content} | List all failures for a content
[**contentImportdealPost**](SwagContentApi.md#contentImportdealPost) | **POST** /content/importdeal | Import a deal
[**contentListGet**](SwagContentApi.md#contentListGet) | **GET** /content/list | List all pinned content
[**contentReadContGet**](SwagContentApi.md#contentReadContGet) | **GET** /content/read/{cont} | Read content
[**contentStagingZonesGet**](SwagContentApi.md#contentStagingZonesGet) | **GET** /content/staging-zones | Get staging zone for user
[**contentStatsGet**](SwagContentApi.md#contentStatsGet) | **GET** /content/stats | Get content statistics
[**contentStatusIdGet**](SwagContentApi.md#contentStatusIdGet) | **GET** /content/status/{id} | Content Status


<a name="contentAddCarPost"></a>
# **contentAddCarPost**
> contentAddCarPost(body, filename, commp, size)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'body' => 'body_example',
    'filename' => 'filename_example',
    'commp' => 'commp_example',
    'size' => 'size_example'
};

try {
    // cross your fingers
    api.contentAddCarPost(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentAddIpfsPost"></a>
# **contentAddIpfsPost**
> contentAddIpfsPost(body)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagUtilContentAddIpfsBody.getExample()
};

try {
    // cross your fingers
    api.contentAddIpfsPost(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SwagUtilContentAddIpfsBody**](SwagUtilContentAddIpfsBody.md)| IPFS Body |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentAddPost"></a>
# **contentAddPost**
> SwagUtilContentAddResponse contentAddPost(file, coluuid, dir)

Add new content

This endpoint is used to upload new content.

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'file' => Blob.valueOf('Sample text file\nContents'),
    'coluuid' => 'coluuid_example',
    'dir' => 'dir_example'
};

try {
    // cross your fingers
    SwagUtilContentAddResponse result = api.contentAddPost(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **Blob**| File to upload |
 **coluuid** | **String**| Collection UUID |
 **dir** | **String**| Directory |

### Return type

[**SwagUtilContentAddResponse**](SwagUtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="contentAggregatedContentGet"></a>
# **contentAggregatedContentGet**
> String contentAggregatedContentGet(content)

Get aggregated content stats

This endpoint returns aggregated content stats

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'content' => 'content_example'
};

try {
    // cross your fingers
    String result = api.contentAggregatedContentGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentAllDealsGet"></a>
# **contentAllDealsGet**
> contentAllDealsGet(r_begin, duration, all)

Get all deals for a user

This endpoint is used to get all deals for a user

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'r_begin' => 'r_begin_example',
    'duration' => 'duration_example',
    'all' => 'all_example'
};

try {
    // cross your fingers
    api.contentAllDealsGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r_begin** | **String**| Begin |
 **duration** | **String**| Duration |
 **all** | **String**| All |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentBwUsageContentGet"></a>
# **contentBwUsageContentGet**
> contentBwUsageContentGet(content)

Get content bandwidth

This endpoint returns content bandwidth

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'content' => 'content_example'
};

try {
    // cross your fingers
    api.contentBwUsageContentGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentCreatePost"></a>
# **contentCreatePost**
> contentCreatePost(body)

Add a new content

This endpoint adds a new content

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'body' => 'body_example'
};

try {
    // cross your fingers
    api.contentCreatePost(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentDealsGet"></a>
# **contentDealsGet**
> contentDealsGet(r_limit, offset)

Content with deals

This endpoint lists all content with deals

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'r_limit' => 56,
    'offset' => 56
};

try {
    // cross your fingers
    api.contentDealsGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r_limit** | **Integer**| Limit | [optional]
 **offset** | **Integer**| Offset | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentEnsureReplicationDatacidGet"></a>
# **contentEnsureReplicationDatacidGet**
> contentEnsureReplicationDatacidGet(datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'datacid' => 'datacid_example'
};

try {
    // cross your fingers
    api.contentEnsureReplicationDatacidGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentFailuresContentGet"></a>
# **contentFailuresContentGet**
> String contentFailuresContentGet(content)

List all failures for a content

This endpoint returns all failures for a content

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'content' => 'content_example'
};

try {
    // cross your fingers
    String result = api.contentFailuresContentGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentImportdealPost"></a>
# **contentImportdealPost**
> contentImportdealPost(body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'body' => SwagMainImportDealBody.getExample()
};

try {
    // cross your fingers
    api.contentImportdealPost(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SwagMainImportDealBody**](SwagMainImportDealBody.md)| Import a deal |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentListGet"></a>
# **contentListGet**
> List&lt;String&gt; contentListGet()

List all pinned content

This endpoint lists all content

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    List<String> result = api.contentListGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentReadContGet"></a>
# **contentReadContGet**
> contentReadContGet(cont)

Read content

This endpoint reads content from the blockstore

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'cont' => 'cont_example'
};

try {
    // cross your fingers
    api.contentReadContGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentStagingZonesGet"></a>
# **contentStagingZonesGet**
> contentStagingZonesGet()

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    api.contentStagingZonesGet();
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentStatsGet"></a>
# **contentStatsGet**
> contentStatsGet(r_limit)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'r_limit' => 'r_limit_example'
};

try {
    // cross your fingers
    api.contentStatsGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r_limit** | **String**| limit |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contentStatusIdGet"></a>
# **contentStatusIdGet**
> contentStatusIdGet(id)

Content Status

This endpoint returns the status of a content

### Example
```java
SwagContentApi api = new SwagContentApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'id' => 56
};

try {
    // cross your fingers
    api.contentStatusIdGet(params);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

