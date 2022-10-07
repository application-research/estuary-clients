# IO.Swagger.Api.PeeringApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminPeeringPeersDelete**](PeeringApi.md#adminpeeringpeersdelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**AdminPeeringPeersGet**](PeeringApi.md#adminpeeringpeersget) | **GET** /admin/peering/peers | List all Peering peers
[**AdminPeeringPeersPost**](PeeringApi.md#adminpeeringpeerspost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**AdminPeeringStartPost**](PeeringApi.md#adminpeeringstartpost) | **POST** /admin/peering/start | Start Peering
[**AdminPeeringStatusGet**](PeeringApi.md#adminpeeringstatusget) | **GET** /admin/peering/status | Check Peering Status
[**AdminPeeringStopPost**](PeeringApi.md#adminpeeringstoppost) | **POST** /admin/peering/stop | Stop Peering


<a name="adminpeeringpeersdelete"></a>
# **AdminPeeringPeersDelete**
> void AdminPeeringPeersDelete ()

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminPeeringPeersDeleteExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PeeringApi();

            try
            {
                // Remove peers on Peering Service
                apiInstance.AdminPeeringPeersDelete();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PeeringApi.AdminPeeringPeersDelete: " + e.Message );
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

<a name="adminpeeringpeersget"></a>
# **AdminPeeringPeersGet**
> void AdminPeeringPeersGet ()

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminPeeringPeersGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PeeringApi();

            try
            {
                // List all Peering peers
                apiInstance.AdminPeeringPeersGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PeeringApi.AdminPeeringPeersGet: " + e.Message );
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

<a name="adminpeeringpeerspost"></a>
# **AdminPeeringPeersPost**
> void AdminPeeringPeersPost ()

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminPeeringPeersPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PeeringApi();

            try
            {
                // Add peers on Peering Service
                apiInstance.AdminPeeringPeersPost();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PeeringApi.AdminPeeringPeersPost: " + e.Message );
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

<a name="adminpeeringstartpost"></a>
# **AdminPeeringStartPost**
> void AdminPeeringStartPost ()

Start Peering

This endpoint can be used to start the Peering Service

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminPeeringStartPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PeeringApi();

            try
            {
                // Start Peering
                apiInstance.AdminPeeringStartPost();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PeeringApi.AdminPeeringStartPost: " + e.Message );
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

<a name="adminpeeringstatusget"></a>
# **AdminPeeringStatusGet**
> void AdminPeeringStatusGet ()

Check Peering Status

This endpoint can be used to check the Peering status

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminPeeringStatusGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PeeringApi();

            try
            {
                // Check Peering Status
                apiInstance.AdminPeeringStatusGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PeeringApi.AdminPeeringStatusGet: " + e.Message );
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

<a name="adminpeeringstoppost"></a>
# **AdminPeeringStopPost**
> void AdminPeeringStopPost ()

Stop Peering

This endpoint can be used to stop the Peering Service

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AdminPeeringStopPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PeeringApi();

            try
            {
                // Stop Peering
                apiInstance.AdminPeeringStopPost();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PeeringApi.AdminPeeringStopPost: " + e.Message );
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

