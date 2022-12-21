# IO.Swagger.Api.SpApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StorageProvidersClaimPost**](SpApi.md#storageprovidersclaimpost) | **POST** /storage-providers/claim | Claim Storage Provider
[**StorageProvidersClaimSpGet**](SpApi.md#storageprovidersclaimspget) | **GET** /storage-providers/claim/{sp} | Get Claim Storage Provider
[**StorageProvidersDealsSpGet**](SpApi.md#storageprovidersdealsspget) | **GET** /storage-providers/deals/{sp} | Get all storage providers deals
[**StorageProvidersFailuresSpGet**](SpApi.md#storageprovidersfailuresspget) | **GET** /storage-providers/failures/{sp} | Get all storage providers
[**StorageProvidersGet**](SpApi.md#storageprovidersget) | **GET** /storage-providers | Get all storage providers
[**StorageProvidersSetInfoSpPut**](SpApi.md#storageproviderssetinfospput) | **PUT** /storage-providers/set-info/{sp} | Set Storage Provider Info
[**StorageProvidersStatsSpGet**](SpApi.md#storageprovidersstatsspget) | **GET** /storage-providers/stats/{sp} | Get storage provider stats
[**StorageProvidersSuspendSpPost**](SpApi.md#storageproviderssuspendsppost) | **POST** /storage-providers/suspend/{sp} | Suspend Storage Provider
[**StorageProvidersUnsuspendSpPut**](SpApi.md#storageprovidersunsuspendspput) | **PUT** /storage-providers/unsuspend/{sp} | Unuspend Storage Provider

<a name="storageprovidersclaimpost"></a>
# **StorageProvidersClaimPost**
> GithubComApplicationResearchEstuaryApiV2ClaimResponse StorageProvidersClaimPost (MinerClaimMinerBody body)

Claim Storage Provider

This endpoint lets a user claim a storage provider

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersClaimPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var body = new MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Storage Provider Body

            try
            {
                // Claim Storage Provider
                GithubComApplicationResearchEstuaryApiV2ClaimResponse result = apiInstance.StorageProvidersClaimPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersClaimPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Storage Provider Body | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimResponse**](GithubComApplicationResearchEstuaryApiV2ClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageprovidersclaimspget"></a>
# **StorageProvidersClaimSpGet**
> GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse StorageProvidersClaimSpGet (string sp)

Get Claim Storage Provider

This endpoint lets a user get the message in order to claim a storage provider

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersClaimSpGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var sp = sp_example;  // string | Storage Provider claim message

            try
            {
                // Get Claim Storage Provider
                GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse result = apiInstance.StorageProvidersClaimSpGet(sp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersClaimSpGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Storage Provider claim message | 

### Return type

[**GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse**](GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageprovidersdealsspget"></a>
# **StorageProvidersDealsSpGet**
> string StorageProvidersDealsSpGet (string sp, string ignoreFailed)

Get all storage providers deals

This endpoint returns all storage providers deals

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersDealsSpGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var sp = sp_example;  // string | Filter by storage provider
            var ignoreFailed = ignoreFailed_example;  // string | Ignore Failed (optional) 

            try
            {
                // Get all storage providers deals
                string result = apiInstance.StorageProvidersDealsSpGet(sp, ignoreFailed);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersDealsSpGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Filter by storage provider | 
 **ignoreFailed** | **string**| Ignore Failed | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageprovidersfailuresspget"></a>
# **StorageProvidersFailuresSpGet**
> string StorageProvidersFailuresSpGet (string sp)

Get all storage providers

This endpoint returns all storage providers

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersFailuresSpGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var sp = sp_example;  // string | Filter by storage provider

            try
            {
                // Get all storage providers
                string result = apiInstance.StorageProvidersFailuresSpGet(sp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersFailuresSpGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Filter by storage provider | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageprovidersget"></a>
# **StorageProvidersGet**
> List<ApiStorageProviderResp> StorageProvidersGet ()

Get all storage providers

This endpoint returns all storage providers

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();

            try
            {
                // Get all storage providers
                List&lt;ApiStorageProviderResp&gt; result = apiInstance.StorageProvidersGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<ApiStorageProviderResp>**](ApiStorageProviderResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageproviderssetinfospput"></a>
# **StorageProvidersSetInfoSpPut**
> void StorageProvidersSetInfoSpPut (MinerMinerSetInfoParams body, string sp)

Set Storage Provider Info

This endpoint lets a user set storage provider info.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersSetInfoSpPutExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var body = new MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Storage Provider set info params
            var sp = sp_example;  // string | Storage Provider to set info for

            try
            {
                // Set Storage Provider Info
                apiInstance.StorageProvidersSetInfoSpPut(body, sp);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersSetInfoSpPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Storage Provider set info params | 
 **sp** | **string**| Storage Provider to set info for | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageprovidersstatsspget"></a>
# **StorageProvidersStatsSpGet**
> string StorageProvidersStatsSpGet (string sp)

Get storage provider stats

This endpoint returns storage provider stats

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersStatsSpGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var sp = sp_example;  // string | Filter by storage provider

            try
            {
                // Get storage provider stats
                string result = apiInstance.StorageProvidersStatsSpGet(sp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersStatsSpGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Filter by storage provider | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageproviderssuspendsppost"></a>
# **StorageProvidersSuspendSpPost**
> Dictionary<string, string> StorageProvidersSuspendSpPost (MinerSuspendMinerBody body, string sp)

Suspend Storage Provider

This endpoint lets a user suspend a storage provider.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersSuspendSpPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var body = new MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Storage Provider Body
            var sp = sp_example;  // string | Storage Provider to suspend

            try
            {
                // Suspend Storage Provider
                Dictionary&lt;string, string&gt; result = apiInstance.StorageProvidersSuspendSpPost(body, sp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersSuspendSpPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Storage Provider Body | 
 **sp** | **string**| Storage Provider to suspend | 

### Return type

**Dictionary<string, string>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="storageprovidersunsuspendspput"></a>
# **StorageProvidersUnsuspendSpPut**
> void StorageProvidersUnsuspendSpPut (string sp)

Unuspend Storage Provider

This endpoint lets a user unsuspend a Storage Provider.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StorageProvidersUnsuspendSpPutExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new SpApi();
            var sp = sp_example;  // string | Storage Provider to unsuspend

            try
            {
                // Unuspend Storage Provider
                apiInstance.StorageProvidersUnsuspendSpPut(sp);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpApi.StorageProvidersUnsuspendSpPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sp** | **string**| Storage Provider to unsuspend | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

