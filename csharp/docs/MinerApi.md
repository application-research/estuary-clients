# estuary-client.Api.MinerApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MinerClaimMinerGet**](MinerApi.md#minerclaimminerget) | **GET** /miner/claim/{miner} | Get Claim Miner Message
[**MinerClaimPost**](MinerApi.md#minerclaimpost) | **POST** /miner/claim | Claim Miner
[**MinerSetInfoMinerPut**](MinerApi.md#minersetinfominerput) | **PUT** /miner/set-info/{miner} | Set Miner Info
[**MinerSuspendMinerPost**](MinerApi.md#minersuspendminerpost) | **POST** /miner/suspend/{miner} | Suspend Miner
[**MinerUnsuspendMinerPut**](MinerApi.md#minerunsuspendminerput) | **PUT** /miner/unsuspend/{miner} | Unuspend Miner
[**PublicMinersDealsMinerGet**](MinerApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**PublicMinersStatsMinerGet**](MinerApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats

<a name="minerclaimminerget"></a>
# **MinerClaimMinerGet**
> ApiClaimMsgResponse MinerClaimMinerGet (string miner)

Get Claim Miner Message

This endpoint lets a user get the message in order to claim a miner

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class MinerClaimMinerGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var miner = miner_example;  // string | Miner claim message

            try
            {
                // Get Claim Miner Message
                ApiClaimMsgResponse result = apiInstance.MinerClaimMinerGet(miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.MinerClaimMinerGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| Miner claim message | 

### Return type

[**ApiClaimMsgResponse**](ApiClaimMsgResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="minerclaimpost"></a>
# **MinerClaimPost**
> ApiClaimResponse MinerClaimPost (MinerClaimMinerBody body)

Claim Miner

This endpoint lets a user claim a miner

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class MinerClaimPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var body = new MinerClaimMinerBody(); // MinerClaimMinerBody | Claim Miner Body

            try
            {
                // Claim Miner
                ApiClaimResponse result = apiInstance.MinerClaimPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.MinerClaimPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerClaimMinerBody**](MinerClaimMinerBody.md)| Claim Miner Body | 

### Return type

[**ApiClaimResponse**](ApiClaimResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="minersetinfominerput"></a>
# **MinerSetInfoMinerPut**
> ApiEmptyResp MinerSetInfoMinerPut (MinerMinerSetInfoParams body, string miner)

Set Miner Info

This endpoint lets a user set miner info.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class MinerSetInfoMinerPutExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var body = new MinerMinerSetInfoParams(); // MinerMinerSetInfoParams | Miner set info params
            var miner = miner_example;  // string | Miner to set info for

            try
            {
                // Set Miner Info
                ApiEmptyResp result = apiInstance.MinerSetInfoMinerPut(body, miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.MinerSetInfoMinerPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerMinerSetInfoParams**](MinerMinerSetInfoParams.md)| Miner set info params | 
 **miner** | **string**| Miner to set info for | 

### Return type

[**ApiEmptyResp**](ApiEmptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="minersuspendminerpost"></a>
# **MinerSuspendMinerPost**
> ApiEmptyResp MinerSuspendMinerPost (MinerSuspendMinerBody body, string miner)

Suspend Miner

This endpoint lets a user suspend a miner.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class MinerSuspendMinerPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var body = new MinerSuspendMinerBody(); // MinerSuspendMinerBody | Suspend Miner Body
            var miner = miner_example;  // string | Miner to suspend

            try
            {
                // Suspend Miner
                ApiEmptyResp result = apiInstance.MinerSuspendMinerPost(body, miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.MinerSuspendMinerPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinerSuspendMinerBody**](MinerSuspendMinerBody.md)| Suspend Miner Body | 
 **miner** | **string**| Miner to suspend | 

### Return type

[**ApiEmptyResp**](ApiEmptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="minerunsuspendminerput"></a>
# **MinerUnsuspendMinerPut**
> ApiEmptyResp MinerUnsuspendMinerPut (string miner)

Unuspend Miner

This endpoint lets a user unsuspend a miner.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using estuary-client.Client;
using estuary-client.Model;

namespace Example
{
    public class MinerUnsuspendMinerPutExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new MinerApi();
            var miner = miner_example;  // string | Miner to unsuspend

            try
            {
                // Unuspend Miner
                ApiEmptyResp result = apiInstance.MinerUnsuspendMinerPut(miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MinerApi.MinerUnsuspendMinerPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| Miner to unsuspend | 

### Return type

[**ApiEmptyResp**](ApiEmptyResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
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
