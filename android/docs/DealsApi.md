# DealsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealEstimatePost**](DealsApi.md#dealEstimatePost) | **POST** /deal/estimate | Estimate the cost of a deal
[**dealInfoDealidGet**](DealsApi.md#dealInfoDealidGet) | **GET** /deal/info/{dealid} | Get Deal Info
[**dealProposalPropcidGet**](DealsApi.md#dealProposalPropcidGet) | **GET** /deal/proposal/{propcid} | Get Proposal
[**dealQueryMinerGet**](DealsApi.md#dealQueryMinerGet) | **GET** /deal/query/{miner} | Query Ask
[**dealStatusByProposalPropcidGet**](DealsApi.md#dealStatusByProposalPropcidGet) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**dealStatusMinerPropcidGet**](DealsApi.md#dealStatusMinerPropcidGet) | **GET** /deal/status/{miner}/{propcid} | Deal Status
[**dealTransferInProgressGet**](DealsApi.md#dealTransferInProgressGet) | **GET** /deal/transfer/in-progress | Transfer In Progress
[**dealTransferStatusPost**](DealsApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | Transfer Status
[**dealsFailuresGet**](DealsApi.md#dealsFailuresGet) | **GET** /deals/failures | Get storage failures for user
[**dealsMakeMinerPost**](DealsApi.md#dealsMakeMinerPost) | **POST** /deals/make/{miner} | Make Deal
[**dealsStatusDealGet**](DealsApi.md#dealsStatusDealGet) | **GET** /deals/status/{deal} | Get Deal Status
[**publicDealsFailuresGet**](DealsApi.md#publicDealsFailuresGet) | **GET** /public/deals/failures | Get storage failures
[**publicMinersStorageQueryMinerGet**](DealsApi.md#publicMinersStorageQueryMinerGet) | **GET** /public/miners/storage/query/{miner} | Query Ask


<a name="dealEstimatePost"></a>
# **dealEstimatePost**
> String dealEstimatePost(body)

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
MainEstimateDealBody body = new MainEstimateDealBody(); // MainEstimateDealBody | The size of the deal in bytes, the replication factor, and the duration of the deal in blocks
try {
    String result = apiInstance.dealEstimatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealEstimatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainEstimateDealBody**](MainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealInfoDealidGet"></a>
# **dealInfoDealidGet**
> String dealInfoDealidGet(dealid)

Get Deal Info

This endpoint returns the deal info for a deal

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
Integer dealid = 56; // Integer | Deal ID
try {
    String result = apiInstance.dealInfoDealidGet(dealid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealInfoDealidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealid** | **Integer**| Deal ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealProposalPropcidGet"></a>
# **dealProposalPropcidGet**
> String dealProposalPropcidGet(propcid)

Get Proposal

This endpoint returns the proposal for a deal

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
String propcid = "propcid_example"; // String | Proposal CID
try {
    String result = apiInstance.dealProposalPropcidGet(propcid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealProposalPropcidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **String**| Proposal CID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealQueryMinerGet"></a>
# **dealQueryMinerGet**
> String dealQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
String miner = "miner_example"; // String | CID
try {
    String result = apiInstance.dealQueryMinerGet(miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealQueryMinerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| CID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealStatusByProposalPropcidGet"></a>
# **dealStatusByProposalPropcidGet**
> String dealStatusByProposalPropcidGet(propcid)

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
String propcid = "propcid_example"; // String | PropCid
try {
    String result = apiInstance.dealStatusByProposalPropcidGet(propcid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealStatusByProposalPropcidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **String**| PropCid |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealStatusMinerPropcidGet"></a>
# **dealStatusMinerPropcidGet**
> String dealStatusMinerPropcidGet(miner, propcid)

Deal Status

This endpoint returns the status of a deal

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
String miner = "miner_example"; // String | Miner
String propcid = "propcid_example"; // String | Proposal CID
try {
    String result = apiInstance.dealStatusMinerPropcidGet(miner, propcid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealStatusMinerPropcidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner |
 **propcid** | **String**| Proposal CID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealTransferInProgressGet"></a>
# **dealTransferInProgressGet**
> String dealTransferInProgressGet()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
try {
    String result = apiInstance.dealTransferInProgressGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealTransferInProgressGet");
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

<a name="dealTransferStatusPost"></a>
# **dealTransferStatusPost**
> String dealTransferStatusPost(chanid)

Transfer Status

This endpoint returns the status of a transfer

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
MainChannelIDParam chanid = new MainChannelIDParam(); // MainChannelIDParam | Channel ID
try {
    String result = apiInstance.dealTransferStatusPost(chanid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealTransferStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chanid** | [**MainChannelIDParam**](MainChannelIDParam.md)| Channel ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsFailuresGet"></a>
# **dealsFailuresGet**
> String dealsFailuresGet()

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
try {
    String result = apiInstance.dealsFailuresGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealsFailuresGet");
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

<a name="dealsMakeMinerPost"></a>
# **dealsMakeMinerPost**
> String dealsMakeMinerPost(miner, dealRequest)

Make Deal

This endpoint makes a deal for a given content and miner

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
String miner = "miner_example"; // String | Miner
String dealRequest = "dealRequest_example"; // String | Deal Request
try {
    String result = apiInstance.dealsMakeMinerPost(miner, dealRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealsMakeMinerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| Miner |
 **dealRequest** | **String**| Deal Request |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dealsStatusDealGet"></a>
# **dealsStatusDealGet**
> String dealsStatusDealGet(deal)

Get Deal Status

This endpoint returns the status of a deal

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
Integer deal = 56; // Integer | Deal ID
try {
    String result = apiInstance.dealsStatusDealGet(deal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#dealsStatusDealGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deal** | **Integer**| Deal ID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publicDealsFailuresGet"></a>
# **publicDealsFailuresGet**
> String publicDealsFailuresGet()

Get storage failures

This endpoint returns a list of storage failures

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
try {
    String result = apiInstance.publicDealsFailuresGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#publicDealsFailuresGet");
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

<a name="publicMinersStorageQueryMinerGet"></a>
# **publicMinersStorageQueryMinerGet**
> String publicMinersStorageQueryMinerGet(miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```java
// Import classes:
//import io.swagger.client.api.DealsApi;

DealsApi apiInstance = new DealsApi();
String miner = "miner_example"; // String | CID
try {
    String result = apiInstance.publicMinersStorageQueryMinerGet(miner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#publicMinersStorageQueryMinerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **String**| CID |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

