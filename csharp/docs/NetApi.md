# estuary-client.Api.NetApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminMinersGet**](NetApi.md#adminminersget) | **GET** /admin/miners/ | Get all miners
[**PublicMinersFailuresMinerGet**](NetApi.md#publicminersfailuresminerget) | **GET** /public/miners/failures/{miner} | Get all miners
[**PublicNetAddrsGet**](NetApi.md#publicnetaddrsget) | **GET** /public/net/addrs | Net Addrs
[**PublicNetPeersGet**](NetApi.md#publicnetpeersget) | **GET** /public/net/peers | Net Peers

<a name="adminminersget"></a>
# **AdminMinersGet**
> ApiMinerResp AdminMinersGet ()

Get all miners

This endpoint returns all miners. Note: value may be cached

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class AdminMinersGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new NetApi();

            try
            {
                // Get all miners
                ApiMinerResp result = apiInstance.AdminMinersGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NetApi.AdminMinersGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiMinerResp**](ApiMinerResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="publicminersfailuresminerget"></a>
# **PublicMinersFailuresMinerGet**
> string PublicMinersFailuresMinerGet (string miner)

Get all miners

This endpoint returns all miners

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicMinersFailuresMinerGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new NetApi();
            var miner = miner_example;  // string | Filter by miner

            try
            {
                // Get all miners
                string result = apiInstance.PublicMinersFailuresMinerGet(miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NetApi.PublicMinersFailuresMinerGet: " + e.Message );
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
<a name="publicnetaddrsget"></a>
# **PublicNetAddrsGet**
> List<string> PublicNetAddrsGet ()

Net Addrs

This endpoint is used to get net addrs

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicNetAddrsGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new NetApi();

            try
            {
                // Net Addrs
                List&lt;string&gt; result = apiInstance.PublicNetAddrsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NetApi.PublicNetAddrsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<string>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="publicnetpeersget"></a>
# **PublicNetPeersGet**
> List<string> PublicNetPeersGet ()

Net Peers

This endpoint is used to get net peers

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicNetPeersGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new NetApi();

            try
            {
                // Net Peers
                List&lt;string&gt; result = apiInstance.PublicNetPeersGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NetApi.PublicNetPeersGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<string>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
