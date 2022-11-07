# estuary-client.Api.MinerApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PublicMinersDealsMinerGet**](MinerApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**PublicMinersStatsMinerGet**](MinerApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats


<a name="publicminersdealsminerget"></a>
# **PublicMinersDealsMinerGet**
> string PublicMinersDealsMinerGet (string miner, string ignoreFailed = null)

Get all miners deals

This endpoint returns all miners deals

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicMinersDealsMinerGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var miner = miner_example;  // string | Filter by miner
            var ignoreFailed = ignoreFailed_example;  // string | Ignore Failed (optional) 

            try
            {
                // Get all miners deals
                string result = apiInstance.PublicMinersDealsMinerGet(miner, ignoreFailed);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.PublicMinersDealsMinerGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| Filter by miner | 
 **ignoreFailed** | **string**| Ignore Failed | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicminersstatsminerget"></a>
# **PublicMinersStatsMinerGet**
> string PublicMinersStatsMinerGet (string miner)

Get miner stats

This endpoint returns miner stats

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicMinersStatsMinerGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var miner = miner_example;  // string | Filter by miner

            try
            {
                // Get miner stats
                string result = apiInstance.PublicMinersStatsMinerGet(miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.PublicMinersStatsMinerGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| Filter by miner | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

