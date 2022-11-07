# SWGUserApi

All URIs are relative to *https://api.estuary.tech*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApiKeysGet**](SWGUserApi.md#userapikeysget) | **GET** /user/api-keys | Get API keys for a user
[**userApiKeysKeyDelete**](SWGUserApi.md#userapikeyskeydelete) | **DELETE** /user/api-keys/{key} | Revoke a User API Key.
[**userApiKeysPost**](SWGUserApi.md#userapikeyspost) | **POST** /user/api-keys | Create API keys for a user
[**userExportGet**](SWGUserApi.md#userexportget) | **GET** /user/export | Export user data
[**userStatsGet**](SWGUserApi.md#userstatsget) | **GET** /user/stats | Create API keys for a user


# **userApiKeysGet**
```objc
-(NSURLSessionTask*) userApiKeysGetWithCompletionHandler: 
        (void (^)(NSArray<NSArray<SWGMainGetApiKeysResp>*>* output, NSError* error)) handler;
```

Get API keys for a user

This endpoint is used to get API keys for a user. In estuary, each user can be given multiple API keys (tokens). This endpoint can be used to retrieve all available API keys for a given user.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Get API keys for a user
[apiInstance userApiKeysGetWithCompletionHandler: 
          ^(NSArray<NSArray<SWGMainGetApiKeysResp>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userApiKeysGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<NSArray<SWGMainGetApiKeysResp>*>***](NSArray.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userApiKeysKeyDelete**
```objc
-(NSURLSessionTask*) userApiKeysKeyDeleteWithKey: (NSString*) key
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Revoke a User API Key.

This endpoint is used to revoke a user API key. In estuary, every user is assigned with an API key, this API key is generated and issued for each user and is primarily use to access all estuary features. This endpoint can be used to revoke the API key thats assigned to the user.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* key = @"key_example"; // Key

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Revoke a User API Key.
[apiInstance userApiKeysKeyDeleteWithKey:key
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userApiKeysKeyDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **NSString***| Key | 

### Return type

**NSString***

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userApiKeysPost**
```objc
-(NSURLSessionTask*) userApiKeysPostWithExpiry: (NSString*) expiry
    perms: (NSString*) perms
        completionHandler: (void (^)(SWGMainGetApiKeysResp* output, NSError* error)) handler;
```

Create API keys for a user

This endpoint is used to create API keys for a user. In estuary, each user is given an API key to access all features.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* expiry = @"expiry_example"; // Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h (optional)
NSString* perms = @"perms_example"; // Permissions -- currently unused (optional)

SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Create API keys for a user
[apiInstance userApiKeysPostWithExpiry:expiry
              perms:perms
          completionHandler: ^(SWGMainGetApiKeysResp* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userApiKeysPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiry** | **NSString***| Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h | [optional] 
 **perms** | **NSString***| Permissions -- currently unused | [optional] 

### Return type

[**SWGMainGetApiKeysResp***](SWGMainGetApiKeysResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **userExportGet**
```objc
-(NSURLSessionTask*) userExportGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Export user data

This endpoint is used to get API keys for a user.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Export user data
[apiInstance userExportGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userExportGet: %@", error);
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

# **userStatsGet**
```objc
-(NSURLSessionTask*) userStatsGetWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```

Create API keys for a user

This endpoint is used to create API keys for a user.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: bearerAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



SWGUserApi*apiInstance = [[SWGUserApi alloc] init];

// Create API keys for a user
[apiInstance userStatsGetWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserApi->userStatsGet: %@", error);
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

