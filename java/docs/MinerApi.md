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
> GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse minerClaimMinerGet(miner)

Get Claim Miner Message

This endpoint lets a user get the message in order to claim a miner

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
String miner = "miner_example"; // String | Miner claim message
try {
    GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse result = apiInstance.minerClaimMinerGet(miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#minerClaimMinerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner claim message |

### Return type

[**GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV1ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="minerClaimPost"></a>
# **minerClaimPost**
> GithubComApplicationResearchEstuaryApiV1ClaimResponse minerClaimPost(body)

Claim Miner

This endpoint lets a user claim a miner

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
MinerClaimMinerBody body = new MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Miner Body
try {
    GithubComApplicationResearchEstuaryApiV1ClaimResponse result = apiInstance.minerClaimPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#minerClaimPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Miner Body |

### Return type

[**GithubComApplicationResearchEstuaryApiV1ClaimResponse**](GithubComApplicationResearchEstuaryApiV1ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="minerSetInfoMinerPut"></a>
# **minerSetInfoMinerPut**
> Map&lt;String, String&gt; minerSetInfoMinerPut(body, miner)

Set Miner Info

This endpoint lets a user set miner info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
MinerMinerSetInfoParams body = new MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Miner set info params
String miner = "miner_example"; // String | Miner to set info for
try {
    Map<String, String> result = apiInstance.minerSetInfoMinerPut(body, miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#minerSetInfoMinerPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Miner set info params |
 **miner** | **String**| Miner to set info for |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="minerSuspendMinerPost"></a>
# **minerSuspendMinerPost**
> Map&lt;String, String&gt; minerSuspendMinerPost(body, miner)

Suspend Miner

This endpoint lets a user suspend a miner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
MinerSuspendMinerBody body = new MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Miner Body
String miner = "miner_example"; // String | Miner to suspend
try {
    Map<String, String> result = apiInstance.minerSuspendMinerPost(body, miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#minerSuspendMinerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Miner Body |
 **miner** | **String**| Miner to suspend |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="minerUnsuspendMinerPut"></a>
# **minerUnsuspendMinerPut**
> Map&lt;String, String&gt; minerUnsuspendMinerPut(miner)

Unuspend Miner

This endpoint lets a user unsuspend a miner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
String miner = "miner_example"; // String | Miner to unsuspend
try {
    Map<String, String> result = apiInstance.minerUnsuspendMinerPut(miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#minerUnsuspendMinerPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner to unsuspend |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> String publicMinersDealsMinerGet(miner, ignoreFailed)

Get all miners deals

This endpoint returns all miners deals

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
String miner = "miner_example"; // String | Filter by miner
String ignoreFailed = "ignoreFailed_example"; // String | Ignore Failed
try {
    String result = apiInstance.publicMinersDealsMinerGet(miner, ignoreFailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#publicMinersDealsMinerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner |
 **ignoreFailed** | **String**| Ignore Failed | [optional]

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MinerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

MinerApi apiInstance = new MinerApi();
String miner = "miner_example"; // String | Filter by miner
try {
    String result = apiInstance.publicMinersStatsMinerGet(miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MinerApi#publicMinersStatsMinerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Filter by miner |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

