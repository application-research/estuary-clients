# SWGDealsApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealEstimatePost**](SWGDealsApi.md#dealestimatepost) | **POST** /deal/estimate | Estimate the cost of a deal
[**dealInfoDealidGet**](SWGDealsApi.md#dealinfodealidget) | **GET** /deal/info/{dealid} | Get Deal Info
[**dealProposalPropcidGet**](SWGDealsApi.md#dealproposalpropcidget) | **GET** /deal/proposal/{propcid} | Get Proposal
[**dealQueryMinerGet**](SWGDealsApi.md#dealqueryminerget) | **GET** /deal/query/{miner} | Query Ask
[**dealStatusByProposalPropcidGet**](SWGDealsApi.md#dealstatusbyproposalpropcidget) | **GET** /deal/status-by-proposal/{propcid} | Get Deal Status by PropCid
[**dealStatusMinerPropcidGet**](SWGDealsApi.md#dealstatusminerpropcidget) | **GET** /deal/status/{miner}/{propcid} | Deal Status
[**dealTransferInProgressGet**](SWGDealsApi.md#dealtransferinprogressget) | **GET** /deal/transfer/in-progress | Transfer In Progress
[**dealTransferStatusPost**](SWGDealsApi.md#dealtransferstatuspost) | **POST** /deal/transfer/status | Transfer Status
[**dealsFailuresGet**](SWGDealsApi.md#dealsfailuresget) | **GET** /deals/failures | Get storage failures for user
[**dealsMakeMinerPost**](SWGDealsApi.md#dealsmakeminerpost) | **POST** /deals/make/{miner} | Make Deal
[**dealsStatusDealGet**](SWGDealsApi.md#dealsstatusdealget) | **GET** /deals/status/{deal} | Get Deal Status
[**publicDealsFailuresGet**](SWGDealsApi.md#publicdealsfailuresget) | **GET** /public/deals/failures | Get storage failures
[**publicMinersStorageQueryMinerGet**](SWGDealsApi.md#publicminersstoragequeryminerget) | **GET** /public/miners/storage/query/{miner} | Query Ask


# **dealEstimatePost**
```objc
-(NSURLSessionTask*) dealEstimatePostWithBody: (SWGMainEstimateDealBody*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Estimate the cost of a deal

This endpoint estimates the cost of a deal

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


SWGMainEstimateDealBody* body = [[SWGMainEstimateDealBody alloc] init]; // The size of the deal in bytes, the replication factor, and the duration of the deal in blocks

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Estimate the cost of a deal
[apiInstance dealEstimatePostWithBody:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealEstimatePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMainEstimateDealBody***](SWGMainEstimateDealBody.md)| The size of the deal in bytes, the replication factor, and the duration of the deal in blocks | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealInfoDealidGet**
```objc
-(NSURLSessionTask*) dealInfoDealidGetWithDealid: (NSNumber*) dealid
        completionHandler: (void (^)(NSError* error)) handler;
```

Get Deal Info

This endpoint returns the deal info for a deal

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSNumber* dealid = @56; // Deal ID

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Get Deal Info
[apiInstance dealInfoDealidGetWithDealid:dealid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealInfoDealidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealid** | **NSNumber***| Deal ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealProposalPropcidGet**
```objc
-(NSURLSessionTask*) dealProposalPropcidGetWithPropcid: (NSString*) propcid
        completionHandler: (void (^)(NSError* error)) handler;
```

Get Proposal

This endpoint returns the proposal for a deal

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* propcid = @"propcid_example"; // Proposal CID

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Get Proposal
[apiInstance dealProposalPropcidGetWithPropcid:propcid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealProposalPropcidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **NSString***| Proposal CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealQueryMinerGet**
```objc
-(NSURLSessionTask*) dealQueryMinerGetWithMiner: (NSString*) miner
        completionHandler: (void (^)(NSError* error)) handler;
```

Query Ask

This endpoint returns the ask for a given CID

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // CID

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Query Ask
[apiInstance dealQueryMinerGetWithMiner:miner
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealQueryMinerGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealStatusByProposalPropcidGet**
```objc
-(NSURLSessionTask*) dealStatusByProposalPropcidGetWithPropcid: (NSString*) propcid
        completionHandler: (void (^)(NSError* error)) handler;
```

Get Deal Status by PropCid

Get Deal Status by PropCid

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* propcid = @"propcid_example"; // PropCid

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Get Deal Status by PropCid
[apiInstance dealStatusByProposalPropcidGetWithPropcid:propcid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealStatusByProposalPropcidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propcid** | **NSString***| PropCid | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealStatusMinerPropcidGet**
```objc
-(NSURLSessionTask*) dealStatusMinerPropcidGetWithMiner: (NSString*) miner
    propcid: (NSString*) propcid
        completionHandler: (void (^)(NSError* error)) handler;
```

Deal Status

This endpoint returns the status of a deal

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // Miner
NSString* propcid = @"propcid_example"; // Proposal CID

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Deal Status
[apiInstance dealStatusMinerPropcidGetWithMiner:miner
              propcid:propcid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealStatusMinerPropcidGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| Miner | 
 **propcid** | **NSString***| Proposal CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealTransferInProgressGet**
```objc
-(NSURLSessionTask*) dealTransferInProgressGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Transfer In Progress

This endpoint returns the in-progress transfers

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Transfer In Progress
[apiInstance dealTransferInProgressGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealTransferInProgressGet: %@", error);
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

# **dealTransferStatusPost**
```objc
-(NSURLSessionTask*) dealTransferStatusPostWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Transfer Status

This endpoint returns the status of a transfer

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Transfer Status
[apiInstance dealTransferStatusPostWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealTransferStatusPost: %@", error);
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

# **dealsFailuresGet**
```objc
-(NSURLSessionTask*) dealsFailuresGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Get storage failures for user

This endpoint returns a list of storage failures for user

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Get storage failures for user
[apiInstance dealsFailuresGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealsFailuresGet: %@", error);
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

# **dealsMakeMinerPost**
```objc
-(NSURLSessionTask*) dealsMakeMinerPostWithMiner: (NSString*) miner
    dealRequest: (NSString*) dealRequest
        completionHandler: (void (^)(NSError* error)) handler;
```

Make Deal

This endpoint makes a deal for a given content and miner

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // Miner
NSString* dealRequest = dealRequest_example; // Deal Request

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Make Deal
[apiInstance dealsMakeMinerPostWithMiner:miner
              dealRequest:dealRequest
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealsMakeMinerPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| Miner | 
 **dealRequest** | **NSString***| Deal Request | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dealsStatusDealGet**
```objc
-(NSURLSessionTask*) dealsStatusDealGetWithDeal: (NSNumber*) deal
        completionHandler: (void (^)(NSError* error)) handler;
```

Get Deal Status

This endpoint returns the status of a deal

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSNumber* deal = @56; // Deal ID

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Get Deal Status
[apiInstance dealsStatusDealGetWithDeal:deal
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->dealsStatusDealGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deal** | **NSNumber***| Deal ID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **publicDealsFailuresGet**
```objc
-(NSURLSessionTask*) publicDealsFailuresGetWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Get storage failures

This endpoint returns a list of storage failures

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Get storage failures
[apiInstance publicDealsFailuresGetWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->publicDealsFailuresGet: %@", error);
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

# **publicMinersStorageQueryMinerGet**
```objc
-(NSURLSessionTask*) publicMinersStorageQueryMinerGetWithMiner: (NSString*) miner
        completionHandler: (void (^)(NSError* error)) handler;
```

Query Ask

This endpoint returns the ask for a given CID

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* miner = @"miner_example"; // CID

SWGDealsApi*apiInstance = [[SWGDealsApi alloc] init];

// Query Ask
[apiInstance publicMinersStorageQueryMinerGetWithMiner:miner
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGDealsApi->publicMinersStorageQueryMinerGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miner** | **NSString***| CID | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

