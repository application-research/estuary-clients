# SwagDefaultApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealTransferStatusPost**](SwagDefaultApi.md#dealTransferStatusPost) | **POST** /deal/transfer/status | 


<a name="dealTransferStatusPost"></a>
# **dealTransferStatusPost**
> dealTransferStatusPost()



### Example
```java
SwagDefaultApi api = new SwagDefaultApi();
SwagClient client = api.getClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) client.getAuthentication('bearerAuth');
bearerAuth.setApiKey('YOUR API KEY');

try {
    // cross your fingers
    api.dealTransferStatusPost();
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

