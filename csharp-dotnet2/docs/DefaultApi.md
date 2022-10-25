# estuary-client.Api.DefaultApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DealTransferStatusPost**](DefaultApi.md#dealtransferstatuspost) | **POST** /deal/transfer/status | 


<a name="dealtransferstatuspost"></a>
# **DealTransferStatusPost**
> void DealTransferStatusPost ()



### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealTransferStatusPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DefaultApi();

            try
            {
                apiInstance.DealTransferStatusPost();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.DealTransferStatusPost: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

