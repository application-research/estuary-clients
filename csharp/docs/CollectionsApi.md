# estuary_client.Api.CollectionsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CollectionsColuuidCommitPost**](CollectionsApi.md#collectionscoluuidcommitpost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**CollectionsColuuidDelete**](CollectionsApi.md#collectionscoluuiddelete) | **DELETE** /collections/{coluuid} | Deletes a collection
[**CollectionsColuuidGet**](CollectionsApi.md#collectionscoluuidget) | **GET** /collections/{coluuid} | Get contents in a collection
[**CollectionsColuuidPost**](CollectionsApi.md#collectionscoluuidpost) | **POST** /collections/{coluuid} | Add contents to a collection
[**CollectionsFsAddPost**](CollectionsApi.md#collectionsfsaddpost) | **POST** /collections/fs/add | Add a file to a collection
[**CollectionsGet**](CollectionsApi.md#collectionsget) | **GET** /collections/ | List all collections
[**CollectionsPost**](CollectionsApi.md#collectionspost) | **POST** /collections/ | Create a new collection


<a name="collectionscoluuidcommitpost"></a>
# **CollectionsColuuidCommitPost**
> string CollectionsColuuidCommitPost (string coluuid)

Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsColuuidCommitPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | coluuid

            try
            {
                // Produce a CID of the collection contents
                string result = apiInstance.CollectionsColuuidCommitPost(coluuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsColuuidCommitPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **string**| coluuid | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionscoluuiddelete"></a>
# **CollectionsColuuidDelete**
> void CollectionsColuuidDelete (string coluuid)

Deletes a collection

This endpoint is used to delete an existing collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsColuuidDeleteExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | Collection ID

            try
            {
                // Deletes a collection
                apiInstance.CollectionsColuuidDelete(coluuid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsColuuidDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **string**| Collection ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionscoluuidget"></a>
# **CollectionsColuuidGet**
> string CollectionsColuuidGet (string coluuid, string dir = null)

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsColuuidGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | Collection UUID
            var dir = dir_example;  // string | Directory (optional) 

            try
            {
                // Get contents in a collection
                string result = apiInstance.CollectionsColuuidGet(coluuid, dir);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsColuuidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **string**| Collection UUID | 
 **dir** | **string**| Directory | [optional] 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionscoluuidpost"></a>
# **CollectionsColuuidPost**
> Dictionary<string, string> CollectionsColuuidPost (List<int?> body)

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsColuuidPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var body = ;  // List<int?> | Content IDs to add to collection

            try
            {
                // Add contents to a collection
                Dictionary&lt;string, string&gt; result = apiInstance.CollectionsColuuidPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsColuuidPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;int?&gt;**| Content IDs to add to collection | 

### Return type

**Dictionary<string, string>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionsfsaddpost"></a>
# **CollectionsFsAddPost**
> void CollectionsFsAddPost (string coluuid, string content, string path)

Add a file to a collection

This endpoint adds a file to a collection

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsFsAddPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | Collection ID
            var content = content_example;  // string | Content
            var path = path_example;  // string | Path to file

            try
            {
                // Add a file to a collection
                apiInstance.CollectionsFsAddPost(coluuid, content, path);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsFsAddPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **string**| Collection ID | 
 **content** | **string**| Content | 
 **path** | **string**| Path to file | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionsget"></a>
# **CollectionsGet**
> List<MainCollection> CollectionsGet (int? id)

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsGetExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var id = 56;  // int? | User ID

            try
            {
                // List all collections
                List&lt;MainCollection&gt; result = apiInstance.CollectionsGet(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**| User ID | 

### Return type

[**List<MainCollection>**](MainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionspost"></a>
# **CollectionsPost**
> MainCollection CollectionsPost (MainCreateCollectionBody body)

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary_client.Api;
using estuary_client.Client;
using estuary_client.Model;

namespace Example
{
    public class CollectionsPostExample
    {
        public void main()
        {
            // Configure API key authorization: bearerAuth
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var body = new MainCreateCollectionBody(); // MainCreateCollectionBody | Collection name and description

            try
            {
                // Create a new collection
                MainCollection result = apiInstance.CollectionsPost(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MainCreateCollectionBody**](MainCreateCollectionBody.md)| Collection name and description | 

### Return type

[**MainCollection**](MainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

