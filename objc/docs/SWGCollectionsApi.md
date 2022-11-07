# SWGCollectionsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionsColuuidCommitPost**](SWGCollectionsApi.md#collectionscoluuidcommitpost) | **POST** /collections/{coluuid}/commit | Produce a CID of the collection contents
[**collectionsColuuidContentsDelete**](SWGCollectionsApi.md#collectionscoluuidcontentsdelete) | **DELETE** /collections/{coluuid}/contents | Deletes a content from a collection
[**collectionsColuuidDelete**](SWGCollectionsApi.md#collectionscoluuiddelete) | **DELETE** /collections/{coluuid} | Deletes a collection
[**collectionsColuuidGet**](SWGCollectionsApi.md#collectionscoluuidget) | **GET** /collections/{coluuid} | Get contents in a collection
[**collectionsColuuidPost**](SWGCollectionsApi.md#collectionscoluuidpost) | **POST** /collections/{coluuid} | Add contents to a collection
[**collectionsFsAddPost**](SWGCollectionsApi.md#collectionsfsaddpost) | **POST** /collections/fs/add | Add a file to a collection
[**collectionsGet**](SWGCollectionsApi.md#collectionsget) | **GET** /collections/ | List all collections
[**collectionsPost**](SWGCollectionsApi.md#collectionspost) | **POST** /collections/ | Create a new collection


# **collectionsColuuidCommitPost**
```objc
-(NSURLSessionTask*) collectionsColuuidCommitPostWithColuuid: (NSString*) coluuid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Produce a CID of the collection contents

This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* coluuid = @"coluuid_example"; // coluuid

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Produce a CID of the collection contents
[apiInstance collectionsColuuidCommitPostWithColuuid:coluuid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsColuuidCommitPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **NSString***| coluuid | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidContentsDelete**
```objc
-(NSURLSessionTask*) collectionsColuuidContentsDeleteWithColuuid: (NSString*) coluuid
    contentid: (NSString*) contentid
    body: (SWGMainDeleteContentFromCollectionBody*) body
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Deletes a content from a collection

This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* coluuid = @"coluuid_example"; // Collection ID
NSString* contentid = @"contentid_example"; // Content ID
SWGMainDeleteContentFromCollectionBody* body = [[SWGMainDeleteContentFromCollectionBody alloc] init]; // Variable to use when filtering for files (must be either 'path' or 'content_id')

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Deletes a content from a collection
[apiInstance collectionsColuuidContentsDeleteWithColuuid:coluuid
              contentid:contentid
              body:body
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsColuuidContentsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **NSString***| Collection ID | 
 **contentid** | **NSString***| Content ID | 
 **body** | [**SWGMainDeleteContentFromCollectionBody***](SWGMainDeleteContentFromCollectionBody.md)| Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;) | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidDelete**
```objc
-(NSURLSessionTask*) collectionsColuuidDeleteWithColuuid: (NSString*) coluuid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Deletes a collection

This endpoint is used to delete an existing collection.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* coluuid = @"coluuid_example"; // Collection ID

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Deletes a collection
[apiInstance collectionsColuuidDeleteWithColuuid:coluuid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsColuuidDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **NSString***| Collection ID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidGet**
```objc
-(NSURLSessionTask*) collectionsColuuidGetWithColuuid: (NSString*) coluuid
    dir: (NSString*) dir
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get contents in a collection

This endpoint is used to get contents in a collection. If no colpath query param is passed

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* coluuid = @"coluuid_example"; // coluuid
NSString* dir = @"dir_example"; // Directory (optional)

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Get contents in a collection
[apiInstance collectionsColuuidGetWithColuuid:coluuid
              dir:dir
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsColuuidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **NSString***| coluuid | 
 **dir** | **NSString***| Directory | [optional] 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsColuuidPost**
```objc
-(NSURLSessionTask*) collectionsColuuidPostWithColuuid: (NSString*) coluuid
    contentIDs: (NSArray<NSNumber*>*) contentIDs
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add contents to a collection

This endpoint adds already-pinned contents (that have ContentIDs) to a collection.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* coluuid = @"coluuid_example"; // coluuid
NSArray<NSNumber*>* contentIDs = @[[[NSArray<NSNumber> alloc] init]]; // Content IDs to add to collection

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Add contents to a collection
[apiInstance collectionsColuuidPostWithColuuid:coluuid
              contentIDs:contentIDs
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsColuuidPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **NSString***| coluuid | 
 **contentIDs** | **NSArray&lt;NSNumber*&gt;***| Content IDs to add to collection | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsFsAddPost**
```objc
-(NSURLSessionTask*) collectionsFsAddPostWithColuuid: (NSString*) coluuid
    content: (NSString*) content
    path: (NSString*) path
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add a file to a collection

This endpoint adds a file to a collection

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* coluuid = @"coluuid_example"; // Collection ID
NSString* content = @"content_example"; // Content
NSString* path = @"path_example"; // Path to file

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Add a file to a collection
[apiInstance collectionsFsAddPostWithColuuid:coluuid
              content:content
              path:path
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsFsAddPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coluuid** | **NSString***| Collection ID | 
 **content** | **NSString***| Content | 
 **path** | **NSString***| Path to file | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsGet**
```objc
-(NSURLSessionTask*) collectionsGetWithCompletionHandler: 
        (void (^)(NSArray<NSArray<SWGCollectionsCollection>*>* output, NSError* error)) handler;
```

List all collections

This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// List all collections
[apiInstance collectionsGetWithCompletionHandler: 
          ^(NSArray<NSArray<SWGCollectionsCollection>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<NSArray<SWGCollectionsCollection>*>***](NSArray.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **collectionsPost**
```objc
-(NSURLSessionTask*) collectionsPostWithBody: (SWGMainCreateCollectionBody*) body
        completionHandler: (void (^)(SWGCollectionsCollection* output, NSError* error)) handler;
```

Create a new collection

This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


SWGMainCreateCollectionBody* body = [[SWGMainCreateCollectionBody alloc] init]; // Collection name and description

SWGCollectionsApi*apiInstance = [[SWGCollectionsApi alloc] init];

// Create a new collection
[apiInstance collectionsPostWithBody:body
          completionHandler: ^(SWGCollectionsCollection* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCollectionsApi->collectionsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMainCreateCollectionBody***](SWGMainCreateCollectionBody.md)| Collection name and description | 

### Return type

[**SWGCollectionsCollection***](SWGCollectionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

