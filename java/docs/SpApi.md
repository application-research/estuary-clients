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
> GithubComApplicationResearchEstuaryApiV2ClaimResponse storageProvidersClaimPost(body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
MinerClaimMinerBody body = new MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Storage Provider Body
try {
    GithubComApplicationResearchEstuaryApiV2ClaimResponse result = apiInstance.storageProvidersClaimPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersClaimPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body |

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersClaimSpGet"></a>
# **storageProvidersClaimSpGet**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse storageProvidersClaimSpGet(sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
String sp = "sp_example"; // String | Storage Provider claim message
try {
    GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse result = apiInstance.storageProvidersClaimSpGet(sp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersClaimSpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Storage Provider claim message |

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersDealsSpGet"></a>
# **storageProvidersDealsSpGet**
> String storageProvidersDealsSpGet(sp, ignoreFailed)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
String sp = "sp_example"; // String | Filter by storage provider
String ignoreFailed = "ignoreFailed_example"; // String | Ignore Failed
try {
    String result = apiInstance.storageProvidersDealsSpGet(sp, ignoreFailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersDealsSpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider |
 **ignoreFailed** | **String**| Ignore Failed | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersFailuresSpGet"></a>
# **storageProvidersFailuresSpGet**
> String storageProvidersFailuresSpGet(sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
String sp = "sp_example"; // String | Filter by storage provider
try {
    String result = apiInstance.storageProvidersFailuresSpGet(sp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersFailuresSpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersGet"></a>
# **storageProvidersGet**
> List&lt;ApiStorageProviderResp&gt; storageProvidersGet()

Get all storage providers

This endpoint returns all storage providers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
try {
    List<ApiStorageProviderResp> result = apiInstance.storageProvidersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ApiStorageProviderResp&gt;**](ApiStorageProviderResp.md)

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
MinerMinerSetInfoParams body = new MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Storage Provider set info params
String sp = "sp_example"; // String | Storage Provider to set info for
try {
    apiInstance.storageProvidersSetInfoSpPut(body, sp);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersSetInfoSpPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params |
 **sp** | **String**| Storage Provider to set info for |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="storageProvidersStatsSpGet"></a>
# **storageProvidersStatsSpGet**
> String storageProvidersStatsSpGet(sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
String sp = "sp_example"; // String | Filter by storage provider
try {
    String result = apiInstance.storageProvidersStatsSpGet(sp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersStatsSpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Filter by storage provider |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storageProvidersSuspendSpPost"></a>
# **storageProvidersSuspendSpPost**
> Map&lt;String, String&gt; storageProvidersSuspendSpPost(body, sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
MinerSuspendMinerBody body = new MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Storage Provider Body
String sp = "sp_example"; // String | Storage Provider to suspend
try {
    Map<String, String> result = apiInstance.storageProvidersSuspendSpPost(body, sp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersSuspendSpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body |
 **sp** | **String**| Storage Provider to suspend |

### Return type

**Map&lt;String, String&gt;**

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

SpApi apiInstance = new SpApi();
String sp = "sp_example"; // String | Storage Provider to unsuspend
try {
    apiInstance.storageProvidersUnsuspendSpPut(sp);
} catch (ApiException e) {
    System.err.println("Exception when calling SpApi#storageProvidersUnsuspendSpPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **String**| Storage Provider to unsuspend |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

