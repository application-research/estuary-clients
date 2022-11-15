# estuary-client.Api.MetricsApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PublicMetricsDealsOnChainGet**](MetricsApi.md#publicmetricsdealsonchainget) | **GET** /public/metrics/deals-on-chain | Get deal metrics

<a name="publicmetricsdealsonchainget"></a>
# **PublicMetricsDealsOnChainGet**
> string PublicMetricsDealsOnChainGet ()

Get deal metrics

This endpoint is used to get deal metrics

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicMetricsDealsOnChainGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MetricsApi();

            try
            {
                // Get deal metrics
                string result = apiInstance.PublicMetricsDealsOnChainGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MetricsApi.PublicMetricsDealsOnChainGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
