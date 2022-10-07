# SWGPinningApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinningPinsGet**](SWGPinningApi.md#pinningpinsget) | **GET** /pinning/pins | List all pin status objects
[**pinningPinsPinidDelete**](SWGPinningApi.md#pinningpinspiniddelete) | **DELETE** /pinning/pins/{pinid} | Delete a pinned object
[**pinningPinsPinidGet**](SWGPinningApi.md#pinningpinspinidget) | **GET** /pinning/pins/{pinid} | Get a pin status object
[**pinningPinsPinidPost**](SWGPinningApi.md#pinningpinspinidpost) | **POST** /pinning/pins/{pinid} | Replace a pinned object
[**pinningPinsPost**](SWGPinningApi.md#pinningpinspost) | **POST** /pinning/pins | Add and pin object


# **pinningPinsGet**
```objc
-(NSURLSessionTask*) pinningPinsGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

List all pin status objects

This endpoint lists all pin status objects

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPinningApi*apiInstance = [[SWGPinningApi alloc] init];

// List all pin status objects
[apiInstance pinningPinsGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPinningApi->pinningPinsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidDelete**
```objc
-(NSURLSessionTask*) pinningPinsPinidDeleteWithPinid: (NSString*) pinid
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete a pinned object

This endpoint deletes a pinned object.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* pinid = @"pinid_example"; // Pin ID

SWGPinningApi*apiInstance = [[SWGPinningApi alloc] init];

// Delete a pinned object
[apiInstance pinningPinsPinidDeleteWithPinid:pinid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPinningApi->pinningPinsPinidDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **NSString***| Pin ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidGet**
```objc
-(NSURLSessionTask*) pinningPinsPinidGetWithPinid: (NSString*) pinid
        completionHandler: (void (^)(NSError* error)) handler;
```

Get a pin status object

This endpoint returns a pin status object.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* pinid = @"pinid_example"; // cid

SWGPinningApi*apiInstance = [[SWGPinningApi alloc] init];

// Get a pin status object
[apiInstance pinningPinsPinidGetWithPinid:pinid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPinningApi->pinningPinsPinidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **NSString***| cid | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPinidPost**
```objc
-(NSURLSessionTask*) pinningPinsPinidPostWithPinid: (NSString*) pinid
        completionHandler: (void (^)(NSError* error)) handler;
```

Replace a pinned object

This endpoint replaces a pinned object.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* pinid = @"pinid_example"; // Pin ID

SWGPinningApi*apiInstance = [[SWGPinningApi alloc] init];

// Replace a pinned object
[apiInstance pinningPinsPinidPostWithPinid:pinid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPinningApi->pinningPinsPinidPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinid** | **NSString***| Pin ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinningPinsPost**
```objc
-(NSURLSessionTask*) pinningPinsPostWithCid: (NSString*) cid
    name: (NSString*) name
        completionHandler: (void (^)(NSError* error)) handler;
```

Add and pin object

This endpoint adds a pin to the IPFS daemon.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* cid = @"cid_example"; // cid
NSString* name = @"name_example"; // name

SWGPinningApi*apiInstance = [[SWGPinningApi alloc] init];

// Add and pin object
[apiInstance pinningPinsPostWithCid:cid
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPinningApi->pinningPinsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **NSString***| cid | 
 **name** | **NSString***| name | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

