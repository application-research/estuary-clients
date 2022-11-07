# estuary-client.Api.NetApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NetAddrsGet**](NetApi.md#netaddrsget) | **GET** /net/addrs | Net Addrs
[**PublicMinersFailuresMinerGet**](NetApi.md#publicminersfailuresminerget) | **GET** /public/miners/failures/{miner} | Get all miners
[**PublicMinersGet**](NetApi.md#publicminersget) | **GET** /public/miners | Get all miners
[**PublicNetAddrsGet**](NetApi.md#publicnetaddrsget) | **GET** /public/net/addrs | Net Addrs
[**PublicNetPeersGet**](NetApi.md#publicnetpeersget) | **GET** /public/net/peers | Net Peers


<a name="netaddrsget"></a>
# **NetAddrsGet**
> string NetAddrsGet ()

Net Addrs

This endpoint is used to get net addrs

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class NetAddrsGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new NetApi();

            try
            {
                // Net Addrs
                string result = apiInstance.NetAddrsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NetApi.NetAddrsGet: " + e.Message );
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
using IO.Swagger.Client;
using estuary-client.Model;

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

<a name="publicminersget"></a>
# **PublicMinersGet**
> string PublicMinersGet ()

Get all miners

This endpoint returns all miners

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

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

            var apiInstance = new NetApi();

            try
            {
                // Get all miners
                string result = apiInstance.PublicMinersGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NetApi.PublicMinersGet: " + e.Message );
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
using IO.Swagger.Client;
using estuary-client.Model;

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
using IO.Swagger.Client;
using estuary-client.Model;

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

