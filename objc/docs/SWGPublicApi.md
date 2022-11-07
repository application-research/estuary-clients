# SWGPublicApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicByCidCidGet**](SWGPublicApi.md#publicbycidcidget) | **GET** /public/by-cid/{cid} | Get Content by Cid
[**publicInfoGet**](SWGPublicApi.md#publicinfoget) | **GET** /public/info | Get public node info
[**publicMetricsDealsOnChainGet**](SWGPublicApi.md#publicmetricsdealsonchainget) | **GET** /public/metrics/deals-on-chain | Get deal metrics
[**publicMinersDealsMinerGet**](SWGPublicApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersFailuresMinerGet**](SWGPublicApi.md#publicminersfailuresminerget) | **GET** /public/miners/failures/{miner} | Get all miners
[**publicMinersGet**](SWGPublicApi.md#publicminersget) | **GET** /public/miners | Get all miners
[**publicMinersStatsMinerGet**](SWGPublicApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats
[**publicNetAddrsGet**](SWGPublicApi.md#publicnetaddrsget) | **GET** /public/net/addrs | Net Addrs
[**publicNetPeersGet**](SWGPublicApi.md#publicnetpeersget) | **GET** /public/net/peers | Net Peers
[**publicStatsGet**](SWGPublicApi.md#publicstatsget) | **GET** /public/stats | Public stats


# **publicByCidCidGet**
```objc
-(NSURLSessionTask*) publicByCidCidGetWithCid: (NSString*) cid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get Content by Cid

This endpoint returns the content associated with a CID

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* cid = @"cid_example"; // Cid

SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get Content by Cid
[apiInstance publicByCidCidGetWithCid:cid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicByCidCidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **NSString***| Cid | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicInfoGet**
```objc
-(NSURLSessionTask*) publicInfoGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Get public node info

This endpoint returns information about the node

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get public node info
[apiInstance publicInfoGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicInfoGet: %@", error);
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

# **publicMetricsDealsOnChainGet**
```objc
-(NSURLSessionTask*) publicMetricsDealsOnChainGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Get deal metrics

This endpoint is used to get deal metrics

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get deal metrics
[apiInstance publicMetricsDealsOnChainGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicMetricsDealsOnChainGet: %@", error);
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

# **publicMinersDealsMinerGet**
```objc
-(NSURLSessionTask*) publicMinersDealsMinerGetWithMiner: (NSString*) miner
    ignoreFailed: (NSString*) ignoreFailed
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get all miners deals

This endpoint returns all miners deals

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // Filter by miner
NSString* ignoreFailed = @"ignoreFailed_example"; // Ignore Failed (optional)

SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get all miners deals
[apiInstance publicMinersDealsMinerGetWithMiner:miner
              ignoreFailed:ignoreFailed
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicMinersDealsMinerGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| Filter by miner | 
 **ignoreFailed** | **NSString***| Ignore Failed | [optional] 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersFailuresMinerGet**
```objc
-(NSURLSessionTask*) publicMinersFailuresMinerGetWithMiner: (NSString*) miner
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get all miners

This endpoint returns all miners

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // Filter by miner

SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get all miners
[apiInstance publicMinersFailuresMinerGetWithMiner:miner
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicMinersFailuresMinerGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| Filter by miner | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicMinersGet**
```objc
-(NSURLSessionTask*) publicMinersGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Get all miners

This endpoint returns all miners

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get all miners
[apiInstance publicMinersGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicMinersGet: %@", error);
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

# **publicMinersStatsMinerGet**
```objc
-(NSURLSessionTask*) publicMinersStatsMinerGetWithMiner: (NSString*) miner
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get miner stats

This endpoint returns miner stats

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // Filter by miner

SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Get miner stats
[apiInstance publicMinersStatsMinerGetWithMiner:miner
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicMinersStatsMinerGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| Filter by miner | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicNetAddrsGet**
```objc
-(NSURLSessionTask*) publicNetAddrsGetWithCompletionHandler: 
        (void (^)(NSArray<NSString*>* output, NSError* error)) handler;
```

Net Addrs

This endpoint is used to get net addrs

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Net Addrs
[apiInstance publicNetAddrsGetWithCompletionHandler: 
          ^(NSArray<NSString*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicNetAddrsGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSArray<NSString*>***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicNetPeersGet**
```objc
-(NSURLSessionTask*) publicNetPeersGetWithCompletionHandler: 
        (void (^)(NSArray<NSString*>* output, NSError* error)) handler;
```

Net Peers

This endpoint is used to get net peers

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Net Peers
[apiInstance publicNetPeersGetWithCompletionHandler: 
          ^(NSArray<NSString*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicNetPeersGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSArray<NSString*>***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicStatsGet**
```objc
-(NSURLSessionTask*) publicStatsGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Public stats

This endpoint is used to get public stats.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGPublicApi*apiInstance = [[SWGPublicApi alloc] init];

// Public stats
[apiInstance publicStatsGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPublicApi->publicStatsGet: %@", error);
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

