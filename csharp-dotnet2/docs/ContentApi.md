# IO.Swagger.Api.ContentApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContentAddCarPost**](ContentApi.md#contentaddcarpost) | **POST** /content/add-car | Add Car object
[**ContentAddIpfsPost**](ContentApi.md#contentaddipfspost) | **POST** /content/add-ipfs | Add IPFS object
[**ContentAddPost**](ContentApi.md#contentaddpost) | **POST** /content/add | Add new content
[**ContentAggregatedContentGet**](ContentApi.md#contentaggregatedcontentget) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**ContentAllDealsGet**](ContentApi.md#contentalldealsget) | **GET** /content/all-deals | Get all deals for a user
[**ContentBwUsageContentGet**](ContentApi.md#contentbwusagecontentget) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**ContentCreatePost**](ContentApi.md#contentcreatepost) | **POST** /content/create | Add a new content
[**ContentDealsGet**](ContentApi.md#contentdealsget) | **GET** /content/deals | Content with deals
[**ContentEnsureReplicationDatacidGet**](ContentApi.md#contentensurereplicationdatacidget) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**ContentFailuresContentGet**](ContentApi.md#contentfailurescontentget) | **GET** /content/failures/{content} | List all failures for a content
[**ContentIdGet**](ContentApi.md#contentidget) | **GET** /content/{id} | Content
[**ContentImportdealPost**](ContentApi.md#contentimportdealpost) | **POST** /content/importdeal | Import a deal
[**ContentListGet**](ContentApi.md#contentlistget) | **GET** /content/list | List all pinned content
[**ContentReadContGet**](ContentApi.md#contentreadcontget) | **GET** /content/read/{cont} | Read content
[**ContentStagingZonesGet**](ContentApi.md#contentstagingzonesget) | **GET** /content/staging-zones | Get staging zone for user
[**ContentStatsGet**](ContentApi.md#contentstatsget) | **GET** /content/stats | Get content statistics
[**ContentStatusIdGet**](ContentApi.md#contentstatusidget) | **GET** /content/status/{id} | Content Status

<a name="contentaddcarpost"></a>
# **ContentAddCarPost**
> string ContentAddCarPost (string body, string ignoreDupes, string filename)

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentAddCarPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var body = new string(); // string | Car
            var ignoreDupes = ignoreDupes_example;  // string | Ignore Dupes (optional) 
            var filename = filename_example;  // string | Filename (optional) 

            try
            {
                // Add Car object
                string result = apiInstance.ContentAddCarPost(body, ignoreDupes, filename);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentAddCarPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**string**](string.md)| Car | 
 **ignoreDupes** | **string**| Ignore Dupes | [optional] 
 **filename** | **string**| Filename | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentaddipfspost"></a>
# **ContentAddIpfsPost**
> string ContentAddIpfsPost (UtilContentAddIpfsBody body, string ignoreDupes)

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentAddIpfsPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var body = new UtilContentAddIpfsBody(); // UtilContentAddIpfsBody | IPFS Body
            var ignoreDupes = ignoreDupes_example;  // string | Ignore Dupes (optional) 

            try
            {
                // Add IPFS object
                string result = apiInstance.ContentAddIpfsPost(body, ignoreDupes);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentAddIpfsPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentAddIpfsBody**](UtilContentAddIpfsBody.md)| IPFS Body | 
 **ignoreDupes** | **string**| Ignore Dupes | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentaddpost"></a>
# **ContentAddPost**
> UtilContentAddResponse ContentAddPost (byte[] data, string filename, string coluuid, int? replication, string ignoreDupes, string lazyProvide, string dir)

Add new content

This endpoint is used to upload new content.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentAddPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var data = data_example;  // byte[] | 
            var filename = filename_example;  // string | 
            var coluuid = coluuid_example;  // string | Collection UUID (optional) 
            var replication = 56;  // int? | Replication value (optional) 
            var ignoreDupes = ignoreDupes_example;  // string | Ignore Dupes true/false (optional) 
            var lazyProvide = lazyProvide_example;  // string | Lazy Provide true/false (optional) 
            var dir = dir_example;  // string | Directory (optional) 

            try
            {
                // Add new content
                UtilContentAddResponse result = apiInstance.ContentAddPost(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentAddPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | **byte[]****byte[]**|  | 
 **filename** | **string**|  | 
 **coluuid** | **string**| Collection UUID | [optional] 
 **replication** | **int?**| Replication value | [optional] 
 **ignoreDupes** | **string**| Ignore Dupes true/false | [optional] 
 **lazyProvide** | **string**| Lazy Provide true/false | [optional] 
 **dir** | **string**| Directory | [optional] 

### Return type

[**UtilContentAddResponse**](UtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentaggregatedcontentget"></a>
# **ContentAggregatedContentGet**
> string ContentAggregatedContentGet (string content)

Get aggregated content stats

This endpoint returns aggregated content stats

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentAggregatedContentGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var content = content_example;  // string | Content ID

            try
            {
                // Get aggregated content stats
                string result = apiInstance.ContentAggregatedContentGet(content);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentAggregatedContentGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **string**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentalldealsget"></a>
# **ContentAllDealsGet**
> string ContentAllDealsGet (string begin, string duration, string all)

Get all deals for a user

This endpoint is used to get all deals for a user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentAllDealsGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var begin = begin_example;  // string | Begin
            var duration = duration_example;  // string | Duration
            var all = all_example;  // string | All

            try
            {
                // Get all deals for a user
                string result = apiInstance.ContentAllDealsGet(begin, duration, all);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentAllDealsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **string**| Begin | 
 **duration** | **string**| Duration | 
 **all** | **string**| All | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentbwusagecontentget"></a>
# **ContentBwUsageContentGet**
> string ContentBwUsageContentGet (string content)

Get content bandwidth

This endpoint returns content bandwidth

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentBwUsageContentGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var content = content_example;  // string | Content ID

            try
            {
                // Get content bandwidth
                string result = apiInstance.ContentBwUsageContentGet(content);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentBwUsageContentGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **string**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentcreatepost"></a>
# **ContentCreatePost**
> string ContentCreatePost (UtilContentCreateBody body, string ignoreDupes)

Add a new content

This endpoint adds a new content

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentCreatePostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var body = new UtilContentCreateBody(); // UtilContentCreateBody | Content
            var ignoreDupes = ignoreDupes_example;  // string | Ignore Dupes (optional) 

            try
            {
                // Add a new content
                string result = apiInstance.ContentCreatePost(body, ignoreDupes);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentCreatePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UtilContentCreateBody**](UtilContentCreateBody.md)| Content | 
 **ignoreDupes** | **string**| Ignore Dupes | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentdealsget"></a>
# **ContentDealsGet**
> string ContentDealsGet (int? limit, int? offset)

Content with deals

This endpoint lists all content with deals

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentDealsGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var limit = 56;  // int? | Limit (optional) 
            var offset = 56;  // int? | Offset (optional) 

            try
            {
                // Content with deals
                string result = apiInstance.ContentDealsGet(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentDealsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int?**| Limit | [optional] 
 **offset** | **int?**| Offset | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentensurereplicationdatacidget"></a>
# **ContentEnsureReplicationDatacidGet**
> string ContentEnsureReplicationDatacidGet (string datacid)

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentEnsureReplicationDatacidGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var datacid = datacid_example;  // string | Data CID

            try
            {
                // Ensure Replication
                string result = apiInstance.ContentEnsureReplicationDatacidGet(datacid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentEnsureReplicationDatacidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **string**| Data CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentfailurescontentget"></a>
# **ContentFailuresContentGet**
> string ContentFailuresContentGet (string content)

List all failures for a content

This endpoint returns all failures for a content

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentFailuresContentGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var content = content_example;  // string | Content ID

            try
            {
                // List all failures for a content
                string result = apiInstance.ContentFailuresContentGet(content);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentFailuresContentGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **string**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentidget"></a>
# **ContentIdGet**
> string ContentIdGet (int? id)

Content

This endpoint returns a content by its ID

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentIdGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var id = 56;  // int? | Content ID

            try
            {
                // Content
                string result = apiInstance.ContentIdGet(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentimportdealpost"></a>
# **ContentImportdealPost**
> string ContentImportdealPost (MainImportDealBody body)

Import a deal

This endpoint imports a deal into the shuttle.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentImportdealPostExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var body = new MainImportDealBody(); // MainImportDealBody | Import a deal

            try
            {
                // Import a deal
                string result = apiInstance.ContentImportdealPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentImportdealPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainImportDealBody**](MainImportDealBody.md)| Import a deal | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentlistget"></a>
# **ContentListGet**
> string ContentListGet ()

List all pinned content

This endpoint lists all content

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentListGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();

            try
            {
                // List all pinned content
                string result = apiInstance.ContentListGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentListGet: " + e.Message );
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

<a name="contentreadcontget"></a>
# **ContentReadContGet**
> string ContentReadContGet (string cont)

Read content

This endpoint reads content from the blockstore

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentReadContGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var cont = cont_example;  // string | CID

            try
            {
                // Read content
                string result = apiInstance.ContentReadContGet(cont);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentReadContGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cont** | **string**| CID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentstagingzonesget"></a>
# **ContentStagingZonesGet**
> string ContentStagingZonesGet ()

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentStagingZonesGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();

            try
            {
                // Get staging zone for user
                string result = apiInstance.ContentStagingZonesGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentStagingZonesGet: " + e.Message );
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

<a name="contentstatsget"></a>
# **ContentStatsGet**
> string ContentStatsGet (string limit, string offset)

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentStatsGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var limit = limit_example;  // string | limit
            var offset = offset_example;  // string | offset

            try
            {
                // Get content statistics
                string result = apiInstance.ContentStatsGet(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentStatsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **string**| limit | 
 **offset** | **string**| offset | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="contentstatusidget"></a>
# **ContentStatusIdGet**
> string ContentStatusIdGet (int? id)

Content Status

This endpoint returns the status of a content

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ContentStatusIdGetExample
    {
        public void main()
        {

            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new ContentApi();
            var id = 56;  // int? | Content ID

            try
            {
                // Content Status
                string result = apiInstance.ContentStatusIdGet(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.ContentStatusIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**| Content ID | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

