# estuary-client.Api.CollectionsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CollectionsColuuidCommitPost**](CollectionsApi.md#collectionscoluuidcommitpost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**CollectionsColuuidContentsDelete**](CollectionsApi.md#collectionscoluuidcontentsdelete) | **DELETE** /collections/{coluuid}/contents | Deletes a content from a collection
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
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsColuuidCommitPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

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

<a name="collectionscoluuidcontentsdelete"></a>
# **CollectionsColuuidContentsDelete**
> string CollectionsColuuidContentsDelete (string coluuid, string contentid, MainDeleteContentFromCollectionBody body)

Deletes a content from a collection

This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsColuuidContentsDeleteExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | Collection ID
            var contentid = contentid_example;  // string | Content ID
            var body = new MainDeleteContentFromCollectionBody(); // MainDeleteContentFromCollectionBody | Variable to use when filtering for files (must be either 'path' or 'content_id')

            try
            {
                // Deletes a content from a collection
                string result = apiInstance.CollectionsColuuidContentsDelete(coluuid, contentid, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CollectionsApi.CollectionsColuuidContentsDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **string**| Collection ID | 
 **contentid** | **string**| Content ID | 
 **body** | [**MainDeleteContentFromCollectionBody**](MainDeleteContentFromCollectionBody.md)| Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;) | 

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
> string CollectionsColuuidDelete (string coluuid)

Deletes a collection

This endpoint is used to delete an existing collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsColuuidDeleteExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | Collection ID

            try
            {
                // Deletes a collection
                string result = apiInstance.CollectionsColuuidDelete(coluuid);
                Debug.WriteLine(result);
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

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionscoluuidget"></a>
# **CollectionsColuuidGet**
> string CollectionsColuuidGet (string coluuid, string dir)

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsColuuidGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | coluuid
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
 **coluuid** | **string**| coluuid | 
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
> string CollectionsColuuidPost (string coluuid, List<int?> contentIDs)

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsColuuidPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | coluuid
            var contentIDs = ;  // List<int?> | Content IDs to add to collection

            try
            {
                // Add contents to a collection
                string result = apiInstance.CollectionsColuuidPost(coluuid, contentIDs);
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
 **coluuid** | **string**| coluuid | 
 **contentIDs** | **List<int?>**| Content IDs to add to collection | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionsfsaddpost"></a>
# **CollectionsFsAddPost**
> string CollectionsFsAddPost (string coluuid, string content, string path)

Add a file to a collection

This endpoint adds a file to a collection

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsFsAddPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var coluuid = coluuid_example;  // string | Collection ID
            var content = content_example;  // string | Content
            var path = path_example;  // string | Path to file

            try
            {
                // Add a file to a collection
                string result = apiInstance.CollectionsFsAddPost(coluuid, content, path);
                Debug.WriteLine(result);
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

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionsget"></a>
# **CollectionsGet**
> List<List<CollectionsCollection>> CollectionsGet ()

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsGetExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();

            try
            {
                // List all collections
                List&lt;List&lt;CollectionsCollection&gt;&gt; result = apiInstance.CollectionsGet();
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
This endpoint does not need any parameter.

### Return type

**List<List<CollectionsCollection>>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="collectionspost"></a>
# **CollectionsPost**
> CollectionsCollection CollectionsPost (MainCreateCollectionBody body)

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Example
```csharp
using System;
using System.Diagnostics;
using estuary-client.Api;
using IO.Swagger.Client;
using estuary-client.Model;

namespace Example
{
    public class CollectionsPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: bearerAuth
            Configuration.Default.ApiKey.Add("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("Authorization", "Bearer");

            var apiInstance = new CollectionsApi();
            var body = new MainCreateCollectionBody(); // MainCreateCollectionBody | Collection name and description

            try
            {
                // Create a new collection
                CollectionsCollection result = apiInstance.CollectionsPost(body);
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

[**CollectionsCollection**](CollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

