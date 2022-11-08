# estuary-client.Api.DealsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DealEstimatePost**](DealsApi.md#dealestimatepost) | **POST** /deal/estimate | Estimate the cost of a deal
[**DealInfoDealidGet**](DealsApi.md#dealinfodealidget) | **GET** /deal/info/{dealid} | Get Deal Info
[**DealProposalPropcidGet**](DealsApi.md#dealproposalpropcidget) | **GET** /deal/proposal/{propcid} | Get Proposal
[**DealQueryMinerGet**](DealsApi.md#dealqueryminerget) | **GET** /deal/query/{miner} | Query Ask
[**DealStatusByProposalPropcidGet**](DealsApi.md#dealstatusbyproposalpropcidget) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**DealStatusMinerPropcidGet**](DealsApi.md#dealstatusminerpropcidget) | **GET** /deal/status/{miner}/{propcid} | Deal Status
[**DealTransferInProgressGet**](DealsApi.md#dealtransferinprogressget) | **GET** /deal/transfer/in-progress | Transfer In Progress
[**DealTransferStatusPost**](DealsApi.md#dealtransferstatuspost) | **POST** /deal/transfer/status | Transfer Status
[**DealsFailuresGet**](DealsApi.md#dealsfailuresget) | **GET** /deals/failures | Get storage failures for user
[**DealsMakeMinerPost**](DealsApi.md#dealsmakeminerpost) | **POST** /deals/make/{miner} | Make Deal
[**DealsStatusDealGet**](DealsApi.md#dealsstatusdealget) | **GET** /deals/status/{deal} | Get Deal Status
[**PublicDealsFailuresGet**](DealsApi.md#publicdealsfailuresget) | **GET** /public/deals/failures | Get storage failures
[**PublicMinersStorageQueryMinerGet**](DealsApi.md#publicminersstoragequeryminerget) | **GET** /public/miners/storage/query/{miner} | Query Ask


<a name="dealestimatepost"></a>
# **DealEstimatePost**
> string DealEstimatePost (MainEstimateDealBody body)

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealEstimatePostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var body = new MainEstimateDealBody(); // MainEstimateDealBody | The size of the deal in bytes, the replication factor, and the duration of the deal in blocks

            try
            {
                // Estimate the cost of a deal
                string result = apiInstance.DealEstimatePost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealEstimatePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainEstimateDealBody**](MainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealinfodealidget"></a>
# **DealInfoDealidGet**
> string DealInfoDealidGet (int? dealid)

Get Deal Info

This endpoint returns the deal info for a deal

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealInfoDealidGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var dealid = 56;  // int? | Deal ID

            try
            {
                // Get Deal Info
                string result = apiInstance.DealInfoDealidGet(dealid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealInfoDealidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealid** | **int?**| Deal ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealproposalpropcidget"></a>
# **DealProposalPropcidGet**
> string DealProposalPropcidGet (string propcid)

Get Proposal

This endpoint returns the proposal for a deal

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealProposalPropcidGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var propcid = propcid_example;  // string | Proposal CID

            try
            {
                // Get Proposal
                string result = apiInstance.DealProposalPropcidGet(propcid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealProposalPropcidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **string**| Proposal CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealqueryminerget"></a>
# **DealQueryMinerGet**
> string DealQueryMinerGet (string miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealQueryMinerGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var miner = miner_example;  // string | CID

            try
            {
                // Query Ask
                string result = apiInstance.DealQueryMinerGet(miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealQueryMinerGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealstatusbyproposalpropcidget"></a>
# **DealStatusByProposalPropcidGet**
> string DealStatusByProposalPropcidGet (string propcid)

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealStatusByProposalPropcidGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var propcid = propcid_example;  // string | PropCid

            try
            {
                // Get Deal Status by PropCid
                string result = apiInstance.DealStatusByProposalPropcidGet(propcid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealStatusByProposalPropcidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **string**| PropCid | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealstatusminerpropcidget"></a>
# **DealStatusMinerPropcidGet**
> string DealStatusMinerPropcidGet (string miner, string propcid)

Deal Status

This endpoint returns the status of a deal

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealStatusMinerPropcidGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var miner = miner_example;  // string | Miner
            var propcid = propcid_example;  // string | Proposal CID

            try
            {
                // Deal Status
                string result = apiInstance.DealStatusMinerPropcidGet(miner, propcid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealStatusMinerPropcidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| Miner | 
 **propcid** | **string**| Proposal CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealtransferinprogressget"></a>
# **DealTransferInProgressGet**
> string DealTransferInProgressGet ()

Transfer In Progress

This endpoint returns the in-progress transfers

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealTransferInProgressGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();

            try
            {
                // Transfer In Progress
                string result = apiInstance.DealTransferInProgressGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealTransferInProgressGet: " + e.Message );
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

<a name="dealtransferstatuspost"></a>
# **DealTransferStatusPost**
> string DealTransferStatusPost (MainChannelIDParam chanid)

Transfer Status

This endpoint returns the status of a transfer

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

            var apiInstance = new DealsApi();
            var chanid = new MainChannelIDParam(); // MainChannelIDParam | Channel ID

            try
            {
                // Transfer Status
                string result = apiInstance.DealTransferStatusPost(chanid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealTransferStatusPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chanid** | [**MainChannelIDParam**](MainChannelIDParam.md)| Channel ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealsfailuresget"></a>
# **DealsFailuresGet**
> string DealsFailuresGet ()

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealsFailuresGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();

            try
            {
                // Get storage failures for user
                string result = apiInstance.DealsFailuresGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealsFailuresGet: " + e.Message );
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

<a name="dealsmakeminerpost"></a>
# **DealsMakeMinerPost**
> string DealsMakeMinerPost (string miner, string dealRequest)

Make Deal

This endpoint makes a deal for a given content and miner

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealsMakeMinerPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var miner = miner_example;  // string | Miner
            var dealRequest = dealRequest_example;  // string | Deal Request

            try
            {
                // Make Deal
                string result = apiInstance.DealsMakeMinerPost(miner, dealRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealsMakeMinerPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| Miner | 
 **dealRequest** | **string**| Deal Request | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="dealsstatusdealget"></a>
# **DealsStatusDealGet**
> string DealsStatusDealGet (int? deal)

Get Deal Status

This endpoint returns the status of a deal

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class DealsStatusDealGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var deal = 56;  // int? | Deal ID

            try
            {
                // Get Deal Status
                string result = apiInstance.DealsStatusDealGet(deal);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.DealsStatusDealGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deal** | **int?**| Deal ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="publicdealsfailuresget"></a>
# **PublicDealsFailuresGet**
> string PublicDealsFailuresGet ()

Get storage failures

This endpoint returns a list of storage failures

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicDealsFailuresGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();

            try
            {
                // Get storage failures
                string result = apiInstance.PublicDealsFailuresGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.PublicDealsFailuresGet: " + e.Message );
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

<a name="publicminersstoragequeryminerget"></a>
# **PublicMinersStorageQueryMinerGet**
> string PublicMinersStorageQueryMinerGet (string miner)

Query Ask

This endpoint returns the ask for a given CID

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class PublicMinersStorageQueryMinerGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new DealsApi();
            var miner = miner_example;  // string | CID

            try
            {
                // Query Ask
                string result = apiInstance.PublicMinersStorageQueryMinerGet(miner);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DealsApi.PublicMinersStorageQueryMinerGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **string**| CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

