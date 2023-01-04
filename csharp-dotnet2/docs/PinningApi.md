# IO.Swagger.Api.PinningApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PinningPinsGet**](PinningApi.md#pinningpinsget) | **GET** /pinning/pins | List all pin status objects
[**PinningPinsPinidDelete**](PinningApi.md#pinningpinspiniddelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**PinningPinsPinidGet**](PinningApi.md#pinningpinspinidget) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**PinningPinsPinidPost**](PinningApi.md#pinningpinspinidpost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**PinningPinsPost**](PinningApi.md#pinningpinspost) | **POST** /pinning/pins | Add and pin object

<a name="pinningpinsget"></a>
# **PinningPinsGet**
> TypesIpfsListPinStatusResponse PinningPinsGet ()

List all pin status objects

This endpoint lists all pin status objects

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PinningPinsGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PinningApi();

            try
            {
                // List all pin status objects
                TypesIpfsListPinStatusResponse result = apiInstance.PinningPinsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinningApi.PinningPinsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TypesIpfsListPinStatusResponse**](TypesIpfsListPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pinningpinspiniddelete"></a>
# **PinningPinsPinidDelete**
> void PinningPinsPinidDelete (string pinid)

Delete a pinned object

This endpoint deletes a pinned object.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PinningPinsPinidDeleteExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PinningApi();
            var pinid = pinid_example;  // string | Pin ID

            try
            {
                // Delete a pinned object
                apiInstance.PinningPinsPinidDelete(pinid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinningApi.PinningPinsPinidDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string**| Pin ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pinningpinspinidget"></a>
# **PinningPinsPinidGet**
> TypesIpfsPinStatusResponse PinningPinsPinidGet (string pinid)

Get a pin status object

This endpoint returns a pin status object.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PinningPinsPinidGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PinningApi();
            var pinid = pinid_example;  // string | cid

            try
            {
                // Get a pin status object
                TypesIpfsPinStatusResponse result = apiInstance.PinningPinsPinidGet(pinid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinningApi.PinningPinsPinidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **string**| cid | 

### Return type

[**TypesIpfsPinStatusResponse**](TypesIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pinningpinspinidpost"></a>
# **PinningPinsPinidPost**
> TypesIpfsPinStatusResponse PinningPinsPinidPost (TypesIpfsPin body, string pinid)

Replace a pinned object

This endpoint replaces a pinned object.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PinningPinsPinidPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PinningApi();
            var body = new TypesIpfsPin(); // TypesIpfsPin | New pin
            var pinid = pinid_example;  // string | Pin ID to be replaced

            try
            {
                // Replace a pinned object
                TypesIpfsPinStatusResponse result = apiInstance.PinningPinsPinidPost(body, pinid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinningApi.PinningPinsPinidPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TypesIpfsPin**](TypesIpfsPin.md)| New pin | 
 **pinid** | **string**| Pin ID to be replaced | 

### Return type

[**TypesIpfsPinStatusResponse**](TypesIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pinningpinspost"></a>
# **PinningPinsPost**
> TypesIpfsPinStatusResponse PinningPinsPost (TypesIpfsPin body, string ignoreDupes, string overwrite)

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PinningPinsPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new PinningApi();
            var body = new TypesIpfsPin(); // TypesIpfsPin | Pin Body {cid:cid, name:name}
            var ignoreDupes = ignoreDupes_example;  // string | Ignore Dupes (optional) 
            var overwrite = overwrite_example;  // string | Overwrite conflicting files in collections (optional) 

            try
            {
                // Add and pin object
                TypesIpfsPinStatusResponse result = apiInstance.PinningPinsPost(body, ignoreDupes, overwrite);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinningApi.PinningPinsPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TypesIpfsPin**](TypesIpfsPin.md)| Pin Body {cid:cid, name:name} | 
 **ignoreDupes** | **string**| Ignore Dupes | [optional] 
 **overwrite** | **string**| Overwrite conflicting files in collections | [optional] 

### Return type

[**TypesIpfsPinStatusResponse**](TypesIpfsPinStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

