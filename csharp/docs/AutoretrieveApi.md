# estuary-client.Api.AutoretrieveApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminAutoretrieveInitPost**](AutoretrieveApi.md#adminautoretrieveinitpost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
[**AdminAutoretrieveListGet**](AutoretrieveApi.md#adminautoretrievelistget) | **GET** /admin/autoretrieve/list | List autoretrieve servers
[**AutoretrieveHeartbeatPost**](AutoretrieveApi.md#autoretrieveheartbeatpost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up


<a name="adminautoretrieveinitpost"></a>
# **AdminAutoretrieveInitPost**
> string AdminAutoretrieveInitPost (string addresses, string pubKey)

Register autoretrieve server

This endpoint registers a new autoretrieve server

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class AdminAutoretrieveInitPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new AutoretrieveApi();
            var addresses = addresses_example;  // string | Autoretrieve's comma-separated list of addresses
            var pubKey = pubKey_example;  // string | Autoretrieve's public key

            try
            {
                // Register autoretrieve server
                string result = apiInstance.AdminAutoretrieveInitPost(addresses, pubKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AutoretrieveApi.AdminAutoretrieveInitPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addresses** | **string**| Autoretrieve&#39;s comma-separated list of addresses | 
 **pubKey** | **string**| Autoretrieve&#39;s public key | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="adminautoretrievelistget"></a>
# **AdminAutoretrieveListGet**
> string AdminAutoretrieveListGet ()

List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class AdminAutoretrieveListGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new AutoretrieveApi();

            try
            {
                // List autoretrieve servers
                string result = apiInstance.AdminAutoretrieveListGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AutoretrieveApi.AdminAutoretrieveListGet: " + e.Message );
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

<a name="autoretrieveheartbeatpost"></a>
# **AutoretrieveHeartbeatPost**
> string AutoretrieveHeartbeatPost (string token)

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class AutoretrieveHeartbeatPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new AutoretrieveApi();
            var token = token_example;  // string | Autoretrieve's auth token

            try
            {
                // Marks autoretrieve server as up
                string result = apiInstance.AutoretrieveHeartbeatPost(token);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AutoretrieveApi.AutoretrieveHeartbeatPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Autoretrieve&#39;s auth token | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

