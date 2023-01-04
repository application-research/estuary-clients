# CollectionsApi

All URIs are relative to *//api.estuary.tech/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionsColuuidCommitPost**](CollectionsApi.md#collectionsColuuidCommitPost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**collectionsColuuidContentsDelete**](CollectionsApi.md#collectionsColuuidContentsDelete) | **DELETE** /collections/{coluuid}/contents | Deletes a content from a collection
[**collectionsColuuidDelete**](CollectionsApi.md#collectionsColuuidDelete) | **DELETE** /collections/{coluuid} | Deletes a collection
[**collectionsColuuidGet**](CollectionsApi.md#collectionsColuuidGet) | **GET** /collections/{coluuid} | Get contents in a collection
[**collectionsColuuidPost**](CollectionsApi.md#collectionsColuuidPost) | **POST** /collections/{coluuid} | Add contents to a collection
[**collectionsFsAddPost**](CollectionsApi.md#collectionsFsAddPost) | **POST** /collections/fs/add | Add a file to a collection
[**collectionsGet**](CollectionsApi.md#collectionsGet) | **GET** /collections/ | List all collections
[**collectionsPost**](CollectionsApi.md#collectionsPost) | **POST** /collections/ | Create a new collection

<a name="collectionsColuuidCommitPost"></a>
# **collectionsColuuidCommitPost**
> kotlin.String collectionsColuuidCommitPost(coluuid)

Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | coluuid
try {
    val result : kotlin.String = apiInstance.collectionsColuuidCommitPost(coluuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsColuuidCommitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsColuuidCommitPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **kotlin.String**| coluuid |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsColuuidContentsDelete"></a>
# **collectionsColuuidContentsDelete**
> kotlin.String collectionsColuuidContentsDelete(body, coluuid)

Deletes a content from a collection

This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val body : ApideleteContentFromCollectionBody =  // ApideleteContentFromCollectionBody | Variable to use when filtering for files (must be either 'path' or 'content_id')
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection ID
try {
    val result : kotlin.String = apiInstance.collectionsColuuidContentsDelete(body, coluuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsColuuidContentsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsColuuidContentsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApideleteContentFromCollectionBody**](ApideleteContentFromCollectionBody.md)| Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;) |
 **coluuid** | **kotlin.String**| Collection ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="collectionsColuuidDelete"></a>
# **collectionsColuuidDelete**
> kotlin.String collectionsColuuidDelete(coluuid)

Deletes a collection

This endpoint is used to delete an existing collection.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection ID
try {
    val result : kotlin.String = apiInstance.collectionsColuuidDelete(coluuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsColuuidDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsColuuidDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **kotlin.String**| Collection ID |

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="collectionsColuuidGet"></a>
# **collectionsColuuidGet**
> kotlin.Array&lt;CollectionsCollectionListResponse&gt; collectionsColuuidGet(coluuid, dir)

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | coluuid
val dir : kotlin.String = dir_example // kotlin.String | Directory
try {
    val result : kotlin.Array<CollectionsCollectionListResponse> = apiInstance.collectionsColuuidGet(coluuid, dir)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsColuuidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsColuuidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **kotlin.String**| coluuid |
 **dir** | **kotlin.String**| Directory | [optional]

### Return type

[**kotlin.Array&lt;CollectionsCollectionListResponse&gt;**](CollectionsCollectionListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsColuuidPost"></a>
# **collectionsColuuidPost**
> kotlin.String collectionsColuuidPost(body, coluuid, dir, overwrite)

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val body : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Content IDs to add to collection
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection UUID
val dir : kotlin.String = dir_example // kotlin.String | Directory
val overwrite : kotlin.String = overwrite_example // kotlin.String | Overwrite conflicting files
try {
    val result : kotlin.String = apiInstance.collectionsColuuidPost(body, coluuid, dir, overwrite)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsColuuidPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsColuuidPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Content IDs to add to collection |
 **coluuid** | **kotlin.String**| Collection UUID |
 **dir** | **kotlin.String**| Directory | [optional]
 **overwrite** | **kotlin.String**| Overwrite conflicting files | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="collectionsFsAddPost"></a>
# **collectionsFsAddPost**
> kotlin.String collectionsFsAddPost(coluuid, content, dir, overwrite)

Add a file to a collection

This endpoint adds a file to a collection

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection ID
val content : kotlin.String = content_example // kotlin.String | Content
val dir : kotlin.String = dir_example // kotlin.String | Directory inside collection
val overwrite : kotlin.String = overwrite_example // kotlin.String | Overwrite file if already exists in path
try {
    val result : kotlin.String = apiInstance.collectionsFsAddPost(coluuid, content, dir, overwrite)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsFsAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsFsAddPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **kotlin.String**| Collection ID |
 **content** | **kotlin.String**| Content |
 **dir** | **kotlin.String**| Directory inside collection | [optional]
 **overwrite** | **kotlin.String**| Overwrite file if already exists in path | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsGet"></a>
# **collectionsGet**
> kotlin.Array&lt;CollectionsCollection&gt; collectionsGet()

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
try {
    val result : kotlin.Array<CollectionsCollection> = apiInstance.collectionsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;CollectionsCollection&gt;**](CollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsPost"></a>
# **collectionsPost**
> CollectionsCollection collectionsPost(body)

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Example
```kotlin
// Import classes:
//import estuary-client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollectionsApi()
val body : ApicreateCollectionBody =  // ApicreateCollectionBody | Collection name and description
try {
    val result : CollectionsCollection = apiInstance.collectionsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionsApi#collectionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionsApi#collectionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApicreateCollectionBody**](ApicreateCollectionBody.md)| Collection name and description |

### Return type

[**CollectionsCollection**](CollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

