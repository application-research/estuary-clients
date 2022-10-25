# SWGPeeringApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminPeeringPeersDelete**](SWGPeeringApi.md#adminpeeringpeersdelete) | **DELETE** /admin/peering/peers | Remove peers on Peering Service
[**adminPeeringPeersGet**](SWGPeeringApi.md#adminpeeringpeersget) | **GET** /admin/peering/peers | List all Peering peers
[**adminPeeringPeersPost**](SWGPeeringApi.md#adminpeeringpeerspost) | **POST** /admin/peering/peers | Add peers on Peering Service
[**adminPeeringStartPost**](SWGPeeringApi.md#adminpeeringstartpost) | **POST** /admin/peering/start | Start Peering
[**adminPeeringStatusGet**](SWGPeeringApi.md#adminpeeringstatusget) | **GET** /admin/peering/status | Check Peering Status
[**adminPeeringStopPost**](SWGPeeringApi.md#adminpeeringstoppost) | **POST** /admin/peering/stop | Stop Peering


# **adminPeeringPeersDelete**
```objc
-(NSURLSessionTask*) adminPeeringPeersDeleteWithBody: (NSArray<NSString*>*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Remove peers on Peering Service

This endpoint can be used to remove a Peer from the Peering Service

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSArray<NSString*>* body = @[[[NSArray<NSString> alloc] init]]; // Peer ids

SWGPeeringApi*apiInstance = [[SWGPeeringApi alloc] init];

// Remove peers on Peering Service
[apiInstance adminPeeringPeersDeleteWithBody:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPeeringApi->adminPeeringPeersDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **NSArray&lt;NSString*&gt;***| Peer ids | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminPeeringPeersGet**
```objc
-(NSURLSessionTask*) adminPeeringPeersGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

List all Peering peers

This endpoint can be used to list all peers on Peering Service

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPeeringApi*apiInstance = [[SWGPeeringApi alloc] init];

// List all Peering peers
[apiInstance adminPeeringPeersGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPeeringApi->adminPeeringPeersGet: %@", error);
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

# **adminPeeringPeersPost**
```objc
-(NSURLSessionTask*) adminPeeringPeersPostWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Add peers on Peering Service

This endpoint can be used to add a Peer from the Peering Service

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPeeringApi*apiInstance = [[SWGPeeringApi alloc] init];

// Add peers on Peering Service
[apiInstance adminPeeringPeersPostWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPeeringApi->adminPeeringPeersPost: %@", error);
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

# **adminPeeringStartPost**
```objc
-(NSURLSessionTask*) adminPeeringStartPostWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Start Peering

This endpoint can be used to start the Peering Service

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPeeringApi*apiInstance = [[SWGPeeringApi alloc] init];

// Start Peering
[apiInstance adminPeeringStartPostWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPeeringApi->adminPeeringStartPost: %@", error);
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

# **adminPeeringStatusGet**
```objc
-(NSURLSessionTask*) adminPeeringStatusGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Check Peering Status

This endpoint can be used to check the Peering status

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPeeringApi*apiInstance = [[SWGPeeringApi alloc] init];

// Check Peering Status
[apiInstance adminPeeringStatusGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPeeringApi->adminPeeringStatusGet: %@", error);
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

# **adminPeeringStopPost**
```objc
-(NSURLSessionTask*) adminPeeringStopPostWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Stop Peering

This endpoint can be used to stop the Peering Service

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPeeringApi*apiInstance = [[SWGPeeringApi alloc] init];

// Stop Peering
[apiInstance adminPeeringStopPostWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPeeringApi->adminPeeringStopPost: %@", error);
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

