# swagger.api.CollectionsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionsColuuidCommitPost**](CollectionsApi.md#collectionsColuuidCommitPost) | **Post** /collections/:coluuid/commit | Produce a CID of the collection contents
[**collectionsColuuidContentsDelete**](CollectionsApi.md#collectionsColuuidContentsDelete) | **Delete** /collections/:coluuid/contents | Deletes a content from a collection
[**collectionsColuuidDelete**](CollectionsApi.md#collectionsColuuidDelete) | **Delete** /collections/:coluuid | Deletes a collection
[**collectionsColuuidGet**](CollectionsApi.md#collectionsColuuidGet) | **Get** /collections/:coluuid | Get contents in a collection
[**collectionsColuuidPost**](CollectionsApi.md#collectionsColuuidPost) | **Post** /collections/:coluuid | Add contents to a collection
[**collectionsFsAddPost**](CollectionsApi.md#collectionsFsAddPost) | **Post** /collections/fs/add | Add a file to a collection
[**collectionsGet**](CollectionsApi.md#collectionsGet) | **Get** /collections/ | List all collections
[**collectionsPost**](CollectionsApi.md#collectionsPost) | **Post** /collections/ | Create a new collection


# **collectionsColuuidCommitPost**
> String collectionsColuuidCommitPost(coluuid)

Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var coluuid = coluuid_example; // String | coluuid

try { 
    var result = api_instance.collectionsColuuidCommitPost(coluuid);
    print(result);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsColuuidCommitPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| coluuid | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidContentsDelete**
> String collectionsColuuidContentsDelete(coluuid, contentid, body)

Deletes a content from a collection

This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var coluuid = coluuid_example; // String | Collection ID
var contentid = contentid_example; // String | Content ID
var body = new MainDeleteContentFromCollectionBody(); // MainDeleteContentFromCollectionBody | Variable to use when filtering for files (must be either 'path' or 'content_id')

try { 
    var result = api_instance.collectionsColuuidContentsDelete(coluuid, contentid, body);
    print(result);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsColuuidContentsDelete: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 
 **contentid** | **String**| Content ID | 
 **body** | [**MainDeleteContentFromCollectionBody**](MainDeleteContentFromCollectionBody.md)| Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;) | 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidDelete**
> collectionsColuuidDelete(coluuid)

Deletes a collection

This endpoint is used to delete an existing collection.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var coluuid = coluuid_example; // String | Collection ID

try { 
    api_instance.collectionsColuuidDelete(coluuid);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsColuuidDelete: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidGet**
> String collectionsColuuidGet(coluuid, dir)

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var coluuid = coluuid_example; // String | coluuid
var dir = dir_example; // String | Directory

try { 
    var result = api_instance.collectionsColuuidGet(coluuid, dir);
    print(result);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsColuuidGet: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| coluuid | 
 **dir** | **String**| Directory | [optional] 

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidPost**
> Map<String, String> collectionsColuuidPost(coluuid, contentIDs)

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var coluuid = coluuid_example; // String | coluuid
var contentIDs = [new List&lt;int&gt;()]; // List<int> | Content IDs to add to collection

try { 
    var result = api_instance.collectionsColuuidPost(coluuid, contentIDs);
    print(result);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsColuuidPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| coluuid | 
 **contentIDs** | **List&lt;int&gt;**| Content IDs to add to collection | 

### Return type

**Map<String, String>**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsFsAddPost**
> collectionsFsAddPost(coluuid, content, path)

Add a file to a collection

This endpoint adds a file to a collection

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var coluuid = coluuid_example; // String | Collection ID
var content = content_example; // String | Content
var path = path_example; // String | Path to file

try { 
    api_instance.collectionsFsAddPost(coluuid, content, path);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsFsAddPost: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **String**| Collection ID | 
 **content** | **String**| Content | 
 **path** | **String**| Path to file | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsGet**
> List<CollectionsCollection> collectionsGet()

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();

try { 
    var result = api_instance.collectionsGet();
    print(result);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsGet: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<CollectionsCollection>**](CollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsPost**
> CollectionsCollection collectionsPost(body)

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Example 
```dart
import 'package:swagger/api.dart';
// TODO Configure API key authorization: bearerAuth
//swagger.api.Configuration.apiKey{'Authorization'} = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//swagger.api.Configuration.apiKeyPrefix{'Authorization'} = "Bearer";

var api_instance = new CollectionsApi();
var body = new MainCreateCollectionBody(); // MainCreateCollectionBody | Collection name and description

try { 
    var result = api_instance.collectionsPost(body);
    print(result);
} catch (e) {
    print("Exception when calling CollectionsApi->collectionsPost: $e\n");
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

