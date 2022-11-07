# SwagPublicApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicByCidCidGet**](SwagPublicApi.md#publicByCidCidGet) | **GET** /public/by-cid/{cid} | Get Content by Cid
[**publicInfoGet**](SwagPublicApi.md#publicInfoGet) | **GET** /public/info | Get public node info
[**publicMetricsDealsOnChainGet**](SwagPublicApi.md#publicMetricsDealsOnChainGet) | **GET** /public/metrics/deals-on-chain | Get deal metrics
[**publicMinersDealsMinerGet**](SwagPublicApi.md#publicMinersDealsMinerGet) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersFailuresMinerGet**](SwagPublicApi.md#publicMinersFailuresMinerGet) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicMinersGet**](SwagPublicApi.md#publicMinersGet) | **GET** /public/miners | Get all miners
[**publicMinersStatsMinerGet**](SwagPublicApi.md#publicMinersStatsMinerGet) | **GET** /public/miners/stats/{miner} | Get miner stats
[**publicNetAddrsGet**](SwagPublicApi.md#publicNetAddrsGet) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](SwagPublicApi.md#publicNetPeersGet) | **GET** /public/net/peers | Net Peers
[**publicStatsGet**](SwagPublicApi.md#publicStatsGet) | **GET** /public/stats | Public stats


<a name="publicByCidCidGet"></a>
# **publicByCidCidGet**
> String publicByCidCidGet(cid)

Get Content by Cid

This endpoint returns the content associated with a CID

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'cid' => 'cid_example'
};

try {
    // cross your fingers
    String result = api.publicByCidCidGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **String**| Cid |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicInfoGet"></a>
# **publicInfoGet**
> String publicInfoGet()

Get public node info

This endpoint returns information about the node

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.publicInfoGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicMetricsDealsOnChainGet"></a>
# **publicMetricsDealsOnChainGet**
> String publicMetricsDealsOnChainGet()

Get deal metrics

This endpoint is used to get deal metrics

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.publicMetricsDealsOnChainGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicMinersDealsMinerGet"></a>
# **publicMinersDealsMinerGet**
> String publicMinersDealsMinerGet(miner, ignoreFailed)

Get all miners deals

This endpoint returns all miners deals

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'miner' => 'miner_example',
    'ignoreFailed' => 'ignoreFailed_example'
};

try {
    // cross your fingers
    String result = api.publicMinersDealsMinerGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicMinersFailuresMinerGet"></a>
# **publicMinersFailuresMinerGet**
> String publicMinersFailuresMinerGet(miner)

Get all miners

This endpoint returns all miners

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'miner' => 'miner_example'
};

try {
    // cross your fingers
    String result = api.publicMinersFailuresMinerGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicMinersGet"></a>
# **publicMinersGet**
> String publicMinersGet()

Get all miners

This endpoint returns all miners

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.publicMinersGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicMinersStatsMinerGet"></a>
# **publicMinersStatsMinerGet**
> String publicMinersStatsMinerGet(miner)

Get miner stats

This endpoint returns miner stats

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

Map<String, Object> params = new Map<String, Object>{
    'miner' => 'miner_example'
};

try {
    // cross your fingers
    String result = api.publicMinersStatsMinerGet(params);
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="publicNetAddrsGet"></a>
# **publicNetAddrsGet**
> List&lt;String&gt; publicNetAddrsGet()

Net Addrs

This endpoint is used to get net addrs

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    List<String> result = api.publicNetAddrsGet();
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

<a name="publicNetPeersGet"></a>
# **publicNetPeersGet**
> List&lt;String&gt; publicNetPeersGet()

Net Peers

This endpoint is used to get net peers

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    List<String> result = api.publicNetPeersGet();
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

<a name="publicStatsGet"></a>
# **publicStatsGet**
> String publicStatsGet()

Public stats

This endpoint is used to get public stats.

### Example
```java
SwagPublicApi api = new SwagPublicApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    String result = api.publicStatsGet();
    System.debug(result);
} catch (Swagger.ApiException e) {
    // ...handle your exceptions
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

