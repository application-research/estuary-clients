# COLLECTIONS_API

All URIs are relative to *https://api.estuary.tech*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**collections_coluuid_commit_post**](COLLECTIONS_API.md#collections_coluuid_commit_post) | **Post** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**collections_coluuid_contents_delete**](COLLECTIONS_API.md#collections_coluuid_contents_delete) | **Delete** /collections/{coluuid}/contents | Deletes a content from a collection
[**collections_coluuid_delete**](COLLECTIONS_API.md#collections_coluuid_delete) | **Delete** /collections/{coluuid} | Deletes a collection
[**collections_coluuid_get**](COLLECTIONS_API.md#collections_coluuid_get) | **Get** /collections/{coluuid} | Get contents in a collection
[**collections_coluuid_post**](COLLECTIONS_API.md#collections_coluuid_post) | **Post** /collections/{coluuid} | Add contents to a collection
[**collections_fs_add_post**](COLLECTIONS_API.md#collections_fs_add_post) | **Post** /collections/fs/add | Add a file to a collection
[**collections_get**](COLLECTIONS_API.md#collections_get) | **Get** /collections/ | List all collections
[**collections_post**](COLLECTIONS_API.md#collections_post) | **Post** /collections/ | Create a new collection


# **collections_coluuid_commit_post**
> collections_coluuid_commit_post (coluuid: STRING_32 ): detachable STRING_32
	

Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **STRING_32**| coluuid | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_coluuid_contents_delete**
> collections_coluuid_contents_delete (coluuid: STRING_32 ; contentid: STRING_32 ; body: MAIN_DELETE_CONTENT_FROM_COLLECTION_BODY ): detachable STRING_32
	

Deletes a content from a collection

This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **STRING_32**| Collection ID | 
 **contentid** | **STRING_32**| Content ID | 
 **body** | [**MAIN_DELETE_CONTENT_FROM_COLLECTION_BODY**](MAIN_DELETE_CONTENT_FROM_COLLECTION_BODY.md)| Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;) | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_coluuid_delete**
> collections_coluuid_delete (coluuid: STRING_32 ): detachable STRING_32
	

Deletes a collection

This endpoint is used to delete an existing collection.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **STRING_32**| Collection ID | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_coluuid_get**
> collections_coluuid_get (coluuid: STRING_32 ; dir:  detachable STRING_32 ): detachable STRING_32
	

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **STRING_32**| coluuid | 
 **dir** | **STRING_32**| Directory | [optional] 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_coluuid_post**
> collections_coluuid_post (coluuid: STRING_32 ; content_ids: LIST [INTEGER_32] ): detachable STRING_32
	

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **STRING_32**| coluuid | 
 **content_ids** | **LIST [INTEGER_32]**| Content IDs to add to collection | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_fs_add_post**
> collections_fs_add_post (coluuid: STRING_32 ; content: STRING_32 ; path: STRING_32 ): detachable STRING_32
	

Add a file to a collection

This endpoint adds a file to a collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **STRING_32**| Collection ID | 
 **content** | **STRING_32**| Content | 
 **path** | **STRING_32**| Path to file | 

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_get**
> collections_get : detachable LIST [LIST [COLLECTIONS_COLLECTION]]
	

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [LIST [COLLECTIONS_COLLECTION]]**](LIST.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collections_post**
> collections_post (body: MAIN_CREATE_COLLECTION_BODY ): detachable COLLECTIONS_COLLECTION
	

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MAIN_CREATE_COLLECTION_BODY**](MAIN_CREATE_COLLECTION_BODY.md)| Collection name and description | 

### Return type

[**COLLECTIONS_COLLECTION**](collections.Collection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

