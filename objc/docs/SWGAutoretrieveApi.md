# SWGAutoretrieveApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAutoretrieveInitPost**](SWGAutoretrieveApi.md#adminautoretrieveinitpost) | **POST** /admin/autoretrieve/init | Register autoretrieve server
[**adminAutoretrieveListGet**](SWGAutoretrieveApi.md#adminautoretrievelistget) | **GET** /admin/autoretrieve/list | List autoretrieve servers
[**autoretrieveHeartbeatPost**](SWGAutoretrieveApi.md#autoretrieveheartbeatpost) | **POST** /autoretrieve/heartbeat | Marks autoretrieve server as up


# **adminAutoretrieveInitPost**
```objc
-(NSURLSessionTask*) adminAutoretrieveInitPostWithAddresses: (NSString*) addresses
    pubKey: (NSString*) pubKey
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Register autoretrieve server

This endpoint registers a new autoretrieve server

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* addresses = @"addresses_example"; // Autoretrieve's comma-separated list of addresses
NSString* pubKey = @"pubKey_example"; // Autoretrieve's public key

SWGAutoretrieveApi*apiInstance = [[SWGAutoretrieveApi alloc] init];

// Register autoretrieve server
[apiInstance adminAutoretrieveInitPostWithAddresses:addresses
              pubKey:pubKey
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAutoretrieveApi->adminAutoretrieveInitPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addresses** | **NSString***| Autoretrieve&#39;s comma-separated list of addresses | 
 **pubKey** | **NSString***| Autoretrieve&#39;s public key | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminAutoretrieveListGet**
```objc
-(NSURLSessionTask*) adminAutoretrieveListGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

List autoretrieve servers

This endpoint lists all registered autoretrieve servers

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGAutoretrieveApi*apiInstance = [[SWGAutoretrieveApi alloc] init];

// List autoretrieve servers
[apiInstance adminAutoretrieveListGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAutoretrieveApi->adminAutoretrieveListGet: %@", error);
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

# **autoretrieveHeartbeatPost**
```objc
-(NSURLSessionTask*) autoretrieveHeartbeatPostWithToken: (NSString*) token
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Marks autoretrieve server as up

This endpoint updates the lastConnection field for autoretrieve

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* token = @"token_example"; // Autoretrieve's auth token

SWGAutoretrieveApi*apiInstance = [[SWGAutoretrieveApi alloc] init];

// Marks autoretrieve server as up
[apiInstance autoretrieveHeartbeatPostWithToken:token
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAutoretrieveApi->autoretrieveHeartbeatPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***| Autoretrieve&#39;s auth token | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

