# estuary_client.Api.PublicApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PublicByCidCidGet**](PublicApi.md#publicbycidcidget) | **GET** /public/by-cid/{cid} | Get Content by Cid
[**PublicInfoGet**](PublicApi.md#publicinfoget) | **GET** /public/info | Get public node info
[**PublicMetricsDealsOnChainGet**](PublicApi.md#publicmetricsdealsonchainget) | **GET** /public/metrics/deals-on-chain | Get deal metrics
[**PublicMinersDealsMinerGet**](PublicApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**PublicMinersFailuresMinerGet**](PublicApi.md#publicminersfailuresminerget) | **GET** /public/miners/failures/{miner} | Get all miners
[**PublicMinersGet**](PublicApi.md#publicminersget) | **GET** /public/miners | Get all miners
[**PublicMinersStatsMinerGet**](PublicApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats
[**PublicNetAddrsGet**](PublicApi.md#publicnetaddrsget) | **GET** /public/net/addrs | Net Addrs
[**PublicNetPeersGet**](PublicApi.md#publicnetpeersget) | **GET** /public/net/peers | Net Peers
[**PublicStatsGet**](PublicApi.md#publicstatsget) | **GET** /public/stats | Public stats


<a name="publicbycidcidget"></a>
# **PublicByCidCidGet**
> void PublicByCidCidGet (string cid)

Get Content by Cid

This endpoint returns the content associated with a CID

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicByCidCidGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();
            var cid = cid_example;  // string | Cid

            try
            {
                // Get Content by Cid
                apiInstance.PublicByCidCidGet(cid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicByCidCidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **string**| Cid | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicinfoget"></a>
# **PublicInfoGet**
> void PublicInfoGet ()

Get public node info

This endpoint returns information about the node

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicInfoGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();

            try
            {
                // Get public node info
                apiInstance.PublicInfoGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicInfoGet: " + e.Message );
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicmetricsdealsonchainget"></a>
# **PublicMetricsDealsOnChainGet**
> void PublicMetricsDealsOnChainGet ()

Get deal metrics

This endpoint is used to get deal metrics

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicMetricsDealsOnChainGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();

            try
            {
                // Get deal metrics
                apiInstance.PublicMetricsDealsOnChainGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicMetricsDealsOnChainGet: " + e.Message );
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicminersdealsminerget"></a>
# **PublicMinersDealsMinerGet**
> void PublicMinersDealsMinerGet (string miner)

Get all miners deals

This endpoint returns all miners deals

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicMinersDealsMinerGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();
            var miner = miner_example;  // string | Filter by miner

            try
            {
                // Get all miners deals
                apiInstance.PublicMinersDealsMinerGet(miner);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicMinersDealsMinerGet: " + e.Message );
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

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicminersfailuresminerget"></a>
# **PublicMinersFailuresMinerGet**
> void PublicMinersFailuresMinerGet (string miner)

Get all miners

This endpoint returns all miners

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicMinersFailuresMinerGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();
            var miner = miner_example;  // string | Filter by miner

            try
            {
                // Get all miners
                apiInstance.PublicMinersFailuresMinerGet(miner);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicMinersFailuresMinerGet: " + e.Message );
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

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicminersget"></a>
# **PublicMinersGet**
> void PublicMinersGet ()

Get all miners

This endpoint returns all miners

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicMinersGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();

            try
            {
                // Get all miners
                apiInstance.PublicMinersGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicMinersGet: " + e.Message );
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicminersstatsminerget"></a>
# **PublicMinersStatsMinerGet**
> void PublicMinersStatsMinerGet (string miner)

Get miner stats

This endpoint returns miner stats

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicMinersStatsMinerGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();
            var miner = miner_example;  // string | Filter by miner

            try
            {
                // Get miner stats
                apiInstance.PublicMinersStatsMinerGet(miner);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicMinersStatsMinerGet: " + e.Message );
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

void (empty response body)

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
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicNetAddrsGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();

            try
            {
                // Net Addrs
                List&lt;string&gt; result = apiInstance.PublicNetAddrsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicNetAddrsGet: " + e.Message );
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
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicNetPeersGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();

            try
            {
                // Net Peers
                List&lt;string&gt; result = apiInstance.PublicNetPeersGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicNetPeersGet: " + e.Message );
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

<a name="publicstatsget"></a>
# **PublicStatsGet**
> void PublicStatsGet ()

Public stats

This endpoint is used to get public stats.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using IO.Swagger.Client;
using estuary_client.Model;

namespace Example
{
    public class PublicStatsGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PublicApi();

            try
            {
                // Public stats
                apiInstance.PublicStatsGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PublicApi.PublicStatsGet: " + e.Message );
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

