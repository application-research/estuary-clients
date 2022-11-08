# SWGMinerApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMinersDealsMinerGet**](SWGMinerApi.md#publicminersdealsminerget) | **GET** /public/miners/deals/{miner} | Get all miners deals
[**publicMinersStatsMinerGet**](SWGMinerApi.md#publicminersstatsminerget) | **GET** /public/miners/stats/{miner} | Get miner stats


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

SWGMinerApi*apiInstance = [[SWGMinerApi alloc] init];

// Get all miners deals
[apiInstance publicMinersDealsMinerGetWithMiner:miner
              ignoreFailed:ignoreFailed
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMinerApi->publicMinersDealsMinerGet: %@", error);
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

SWGMinerApi*apiInstance = [[SWGMinerApi alloc] init];

// Get miner stats
[apiInstance publicMinersStatsMinerGetWithMiner:miner
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMinerApi->publicMinersStatsMinerGet: %@", error);
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

