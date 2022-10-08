# CollectionsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionsColuuidCommitPost**](CollectionsApi.md#collectionsColuuidCommitPost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
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
//import estuary_client.infrastructure.*
//import estuary_client.models.*

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

<a name="collectionsColuuidDelete"></a>
# **collectionsColuuidDelete**
> collectionsColuuidDelete(coluuid)

Deletes a collection

This endpoint is used to delete an existing collection.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection ID
try {
    apiInstance.collectionsColuuidDelete(coluuid)
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="collectionsColuuidGet"></a>
# **collectionsColuuidGet**
> kotlin.String collectionsColuuidGet(coluuid, dir)

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection UUID
val dir : kotlin.String = dir_example // kotlin.String | Directory
try {
    val result : kotlin.String = apiInstance.collectionsColuuidGet(coluuid, dir)
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
 **coluuid** | **kotlin.String**| Collection UUID |
 **dir** | **kotlin.String**| Directory | [optional]

### Return type

**kotlin.String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsColuuidPost"></a>
# **collectionsColuuidPost**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; collectionsColuuidPost(body)

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = CollectionsApi()
val body : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Content IDs to add to collection
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.collectionsColuuidPost(body)
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
 **body** | **kotlin.Array&lt;kotlin.Int&gt;**| Content IDs to add to collection |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="collectionsFsAddPost"></a>
# **collectionsFsAddPost**
> collectionsFsAddPost(coluuid, content, path)

Add a file to a collection

This endpoint adds a file to a collection

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = CollectionsApi()
val coluuid : kotlin.String = coluuid_example // kotlin.String | Collection ID
val content : kotlin.String = content_example // kotlin.String | Content
val path : kotlin.String = path_example // kotlin.String | Path to file
try {
    apiInstance.collectionsFsAddPost(coluuid, content, path)
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
 **path** | **kotlin.String**| Path to file |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsGet"></a>
# **collectionsGet**
> kotlin.Array&lt;MainCollection&gt; collectionsGet(id)

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = CollectionsApi()
val id : kotlin.Int = 56 // kotlin.Int | User ID
try {
    val result : kotlin.Array<MainCollection> = apiInstance.collectionsGet(id)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| User ID |

### Return type

[**kotlin.Array&lt;MainCollection&gt;**](MainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsPost"></a>
# **collectionsPost**
> MainCollection collectionsPost(body)

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Example
```kotlin
// Import classes:
//import estuary_client.infrastructure.*
//import estuary_client.models.*

val apiInstance = CollectionsApi()
val body : MaincreateCollectionBody =  // MaincreateCollectionBody | Collection name and description
try {
    val result : MainCollection = apiInstance.collectionsPost(body)
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
 **body** | [**MaincreateCollectionBody**](MaincreateCollectionBody.md)| Collection name and description |

### Return type

[**MainCollection**](MainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

