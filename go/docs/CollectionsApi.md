# \CollectionsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CollectionsColuuidCommitPost**](CollectionsApi.md#CollectionsColuuidCommitPost) | **Post** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**CollectionsColuuidDelete**](CollectionsApi.md#CollectionsColuuidDelete) | **Delete** /collections/{coluuid} | Deletes a collection
[**CollectionsColuuidGet**](CollectionsApi.md#CollectionsColuuidGet) | **Get** /collections/{coluuid} | Get contents in a collection
[**CollectionsColuuidPost**](CollectionsApi.md#CollectionsColuuidPost) | **Post** /collections/{coluuid} | Add contents to a collection
[**CollectionsFsAddPost**](CollectionsApi.md#CollectionsFsAddPost) | **Post** /collections/fs/add | Add a file to a collection
[**CollectionsGet**](CollectionsApi.md#CollectionsGet) | **Get** /collections/ | List all collections
[**CollectionsPost**](CollectionsApi.md#CollectionsPost) | **Post** /collections/ | Create a new collection


# **CollectionsColuuidCommitPost**
> string CollectionsColuuidCommitPost(ctx, coluuid)
Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **coluuid** | **string**| coluuid | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsColuuidDelete**
> CollectionsColuuidDelete(ctx, coluuid)
Deletes a collection

This endpoint is used to delete an existing collection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **coluuid** | **string**| Collection ID | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsColuuidGet**
> string CollectionsColuuidGet(ctx, coluuid, optional)
Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **coluuid** | **string**| Collection UUID | 
 **optional** | ***CollectionsApiCollectionsColuuidGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CollectionsApiCollectionsColuuidGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dir** | **optional.String**| Directory | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsColuuidPost**
> map[string]string CollectionsColuuidPost(ctx, body)
Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | **[]int32**| Content IDs to add to collection | 

### Return type

**map[string]string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsFsAddPost**
> CollectionsFsAddPost(ctx, coluuid, content, path)
Add a file to a collection

This endpoint adds a file to a collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **coluuid** | **string**| Collection ID | 
  **content** | **string**| Content | 
  **path** | **string**| Path to file | 

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsGet**
> []MainCollection CollectionsGet(ctx, id)
List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **int32**| User ID | 

### Return type

[**[]MainCollection**](main.Collection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsPost**
> MainCollection CollectionsPost(ctx, body)
Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**MainCreateCollectionBody**](MainCreateCollectionBody.md)| Collection name and description | 

### Return type

[**MainCollection**](main.Collection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

