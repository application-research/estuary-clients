# SWGContentApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentAddCarPost**](SWGContentApi.md#contentaddcarpost) | **POST** /content/add-car | Add Car object
[**contentAddIpfsPost**](SWGContentApi.md#contentaddipfspost) | **POST** /content/add-ipfs | Add IPFS object
[**contentAddPost**](SWGContentApi.md#contentaddpost) | **POST** /content/add | Add new content
[**contentAggregatedContentGet**](SWGContentApi.md#contentaggregatedcontentget) | **GET** /content/aggregated/{content} | Get aggregated content stats
[**contentAllDealsGet**](SWGContentApi.md#contentalldealsget) | **GET** /content/all-deals | Get all deals for a user
[**contentBwUsageContentGet**](SWGContentApi.md#contentbwusagecontentget) | **GET** /content/bw-usage/{content} | Get content bandwidth
[**contentCreatePost**](SWGContentApi.md#contentcreatepost) | **POST** /content/create | Add a new content
[**contentDealsGet**](SWGContentApi.md#contentdealsget) | **GET** /content/deals | Content with deals
[**contentEnsureReplicationDatacidGet**](SWGContentApi.md#contentensurereplicationdatacidget) | **GET** /content/ensure-replication/{datacid} | Ensure Replication
[**contentFailuresContentGet**](SWGContentApi.md#contentfailurescontentget) | **GET** /content/failures/{content} | List all failures for a content
[**contentIdGet**](SWGContentApi.md#contentidget) | **GET** /content/{id} | Content
[**contentImportdealPost**](SWGContentApi.md#contentimportdealpost) | **POST** /content/importdeal | Import a deal
[**contentListGet**](SWGContentApi.md#contentlistget) | **GET** /content/list | List all pinned content
[**contentReadContGet**](SWGContentApi.md#contentreadcontget) | **GET** /content/read/{cont} | Read content
[**contentStagingZonesGet**](SWGContentApi.md#contentstagingzonesget) | **GET** /content/staging-zones | Get staging zone for user
[**contentStatsGet**](SWGContentApi.md#contentstatsget) | **GET** /content/stats | Get content statistics
[**contentStatusIdGet**](SWGContentApi.md#contentstatusidget) | **GET** /content/status/{id} | Content Status


# **contentAddCarPost**
```objc
-(NSURLSessionTask*) contentAddCarPostWithBody: (NSString*) body
    ignoreDupes: (NSString*) ignoreDupes
    filename: (NSString*) filename
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add Car object

This endpoint is used to add a car object to the network. The object can be a file or a directory.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* body = body_example; // Car
NSString* ignoreDupes = @"ignoreDupes_example"; // Ignore Dupes (optional)
NSString* filename = @"filename_example"; // Filename (optional)

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Add Car object
[apiInstance contentAddCarPostWithBody:body
              ignoreDupes:ignoreDupes
              filename:filename
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentAddCarPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **NSString***| Car | 
 **ignoreDupes** | **NSString***| Ignore Dupes | [optional] 
 **filename** | **NSString***| Filename | [optional] 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentAddIpfsPost**
```objc
-(NSURLSessionTask*) contentAddIpfsPostWithBody: (SWGUtilContentAddIpfsBody*) body
    ignoreDupes: (NSString*) ignoreDupes
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add IPFS object

This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


SWGUtilContentAddIpfsBody* body = [[SWGUtilContentAddIpfsBody alloc] init]; // IPFS Body
NSString* ignoreDupes = @"ignoreDupes_example"; // Ignore Dupes (optional)

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Add IPFS object
[apiInstance contentAddIpfsPostWithBody:body
              ignoreDupes:ignoreDupes
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentAddIpfsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGUtilContentAddIpfsBody***](SWGUtilContentAddIpfsBody.md)| IPFS Body | 
 **ignoreDupes** | **NSString***| Ignore Dupes | [optional] 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentAddPost**
```objc
-(NSURLSessionTask*) contentAddPostWithData: (NSURL*) data
    filename: (NSString*) filename
    coluuid: (NSString*) coluuid
    replication: (NSNumber*) replication
    ignoreDupes: (NSString*) ignoreDupes
    lazyProvide: (NSString*) lazyProvide
    dir: (NSString*) dir
        completionHandler: (void (^)(SWGUtilContentAddResponse* output, NSError* error)) handler;
```

Add new content

This endpoint is used to upload new content.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSURL* data = [NSURL fileURLWithPath:@"/path/to/file.txt"]; // File to upload
NSString* filename = @"filename_example"; // Filenam to use for upload (optional)
NSString* coluuid = @"coluuid_example"; // Collection UUID (optional)
NSNumber* replication = @56; // Replication value (optional)
NSString* ignoreDupes = @"ignoreDupes_example"; // Ignore Dupes true/false (optional)
NSString* lazyProvide = @"lazyProvide_example"; // Lazy Provide true/false (optional)
NSString* dir = @"dir_example"; // Directory (optional)

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Add new content
[apiInstance contentAddPostWithData:data
              filename:filename
              coluuid:coluuid
              replication:replication
              ignoreDupes:ignoreDupes
              lazyProvide:lazyProvide
              dir:dir
          completionHandler: ^(SWGUtilContentAddResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentAddPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | **NSURL***| File to upload | 
 **filename** | **NSString***| Filenam to use for upload | [optional] 
 **coluuid** | **NSString***| Collection UUID | [optional] 
 **replication** | **NSNumber***| Replication value | [optional] 
 **ignoreDupes** | **NSString***| Ignore Dupes true/false | [optional] 
 **lazyProvide** | **NSString***| Lazy Provide true/false | [optional] 
 **dir** | **NSString***| Directory | [optional] 

### Return type

[**SWGUtilContentAddResponse***](SWGUtilContentAddResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentAggregatedContentGet**
```objc
-(NSURLSessionTask*) contentAggregatedContentGetWithContent: (NSString*) content
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get aggregated content stats

This endpoint returns aggregated content stats

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* content = @"content_example"; // Content ID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Get aggregated content stats
[apiInstance contentAggregatedContentGetWithContent:content
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentAggregatedContentGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **NSString***| Content ID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentAllDealsGet**
```objc
-(NSURLSessionTask*) contentAllDealsGetWithBegin: (NSString*) begin
    duration: (NSString*) duration
    all: (NSString*) all
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get all deals for a user

This endpoint is used to get all deals for a user

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* begin = @"begin_example"; // Begin
NSString* duration = @"duration_example"; // Duration
NSString* all = @"all_example"; // All

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Get all deals for a user
[apiInstance contentAllDealsGetWithBegin:begin
              duration:duration
              all:all
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentAllDealsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **NSString***| Begin | 
 **duration** | **NSString***| Duration | 
 **all** | **NSString***| All | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentBwUsageContentGet**
```objc
-(NSURLSessionTask*) contentBwUsageContentGetWithContent: (NSString*) content
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get content bandwidth

This endpoint returns content bandwidth

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* content = @"content_example"; // Content ID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Get content bandwidth
[apiInstance contentBwUsageContentGetWithContent:content
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentBwUsageContentGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **NSString***| Content ID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentCreatePost**
```objc
-(NSURLSessionTask*) contentCreatePostWithReq: (SWGUtilContentCreateBody*) req
    ignoreDupes: (NSString*) ignoreDupes
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Add a new content

This endpoint adds a new content

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


SWGUtilContentCreateBody* req = [[SWGUtilContentCreateBody alloc] init]; // Content
NSString* ignoreDupes = @"ignoreDupes_example"; // Ignore Dupes (optional)

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Add a new content
[apiInstance contentCreatePostWithReq:req
              ignoreDupes:ignoreDupes
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentCreatePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**SWGUtilContentCreateBody***](SWGUtilContentCreateBody.md)| Content | 
 **ignoreDupes** | **NSString***| Ignore Dupes | [optional] 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentDealsGet**
```objc
-(NSURLSessionTask*) contentDealsGetWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Content with deals

This endpoint lists all content with deals

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSNumber* limit = @56; // Limit (optional)
NSNumber* offset = @56; // Offset (optional)

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Content with deals
[apiInstance contentDealsGetWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentDealsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Limit | [optional] 
 **offset** | **NSNumber***| Offset | [optional] 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentEnsureReplicationDatacidGet**
```objc
-(NSURLSessionTask*) contentEnsureReplicationDatacidGetWithDatacid: (NSString*) datacid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Ensure Replication

This endpoint ensures that the content is replicated to the specified number of providers

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* datacid = @"datacid_example"; // Data CID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Ensure Replication
[apiInstance contentEnsureReplicationDatacidGetWithDatacid:datacid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentEnsureReplicationDatacidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datacid** | **NSString***| Data CID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentFailuresContentGet**
```objc
-(NSURLSessionTask*) contentFailuresContentGetWithContent: (NSString*) content
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List all failures for a content

This endpoint returns all failures for a content

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* content = @"content_example"; // Content ID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// List all failures for a content
[apiInstance contentFailuresContentGetWithContent:content
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentFailuresContentGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **NSString***| Content ID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentIdGet**
```objc
-(NSURLSessionTask*) contentIdGetWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Content

This endpoint returns a content by its ID

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSNumber* _id = @56; // Content ID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Content
[apiInstance contentIdGetWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentIdGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| Content ID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentImportdealPost**
```objc
-(NSURLSessionTask*) contentImportdealPostWithBody: (SWGMainImportDealBody*) body
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Import a deal

This endpoint imports a deal into the shuttle.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


SWGMainImportDealBody* body = [[SWGMainImportDealBody alloc] init]; // Import a deal

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Import a deal
[apiInstance contentImportdealPostWithBody:body
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentImportdealPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMainImportDealBody***](SWGMainImportDealBody.md)| Import a deal | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentListGet**
```objc
-(NSURLSessionTask*) contentListGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

List all pinned content

This endpoint lists all content

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// List all pinned content
[apiInstance contentListGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentListGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentReadContGet**
```objc
-(NSURLSessionTask*) contentReadContGetWithCont: (NSString*) cont
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Read content

This endpoint reads content from the blockstore

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* cont = @"cont_example"; // CID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Read content
[apiInstance contentReadContGetWithCont:cont
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentReadContGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cont** | **NSString***| CID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentStagingZonesGet**
```objc
-(NSURLSessionTask*) contentStagingZonesGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Get staging zone for user

This endpoint is used to get staging zone for user.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Get staging zone for user
[apiInstance contentStagingZonesGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentStagingZonesGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentStatsGet**
```objc
-(NSURLSessionTask*) contentStatsGetWithLimit: (NSString*) limit
    offset: (NSString*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get content statistics

This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* limit = @"limit_example"; // limit
NSString* offset = @"offset_example"; // offset

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Get content statistics
[apiInstance contentStatsGetWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentStatsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSString***| limit | 
 **offset** | **NSString***| offset | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contentStatusIdGet**
```objc
-(NSURLSessionTask*) contentStatusIdGetWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Content Status

This endpoint returns the status of a content

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSNumber* _id = @56; // Content ID

SWGContentApi*apiInstance = [[SWGContentApi alloc] init];

// Content Status
[apiInstance contentStatusIdGetWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGContentApi->contentStatusIdGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| Content ID | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

