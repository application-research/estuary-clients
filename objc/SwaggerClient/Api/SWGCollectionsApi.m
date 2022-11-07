#import "SWGCollectionsApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGCollectionsCollection.h"
#import "SWGMainCreateCollectionBody.h"
#import "SWGMainDeleteContentFromCollectionBody.h"
#import "SWGUtilHttpError.h"


@interface SWGCollectionsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGCollectionsApi

NSString* kSWGCollectionsApiErrorDomain = @"SWGCollectionsApiErrorDomain";
NSInteger kSWGCollectionsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[SWGApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Produce a CID of the collection contents
/// This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
///  @param coluuid coluuid 
///
///  @returns NSString*
///
-(NSURLSessionTask*) collectionsColuuidCommitPostWithColuuid: (NSString*) coluuid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'coluuid' is set
    if (coluuid == nil) {
        NSParameterAssert(coluuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"coluuid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/{coluuid}/commit"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (coluuid != nil) {
        pathParams[@"coluuid"] = coluuid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Deletes a content from a collection
/// This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
///  @param coluuid Collection ID 
///
///  @param contentid Content ID 
///
///  @param body Variable to use when filtering for files (must be either 'path' or 'content_id') 
///
///  @returns NSString*
///
-(NSURLSessionTask*) collectionsColuuidContentsDeleteWithColuuid: (NSString*) coluuid
    contentid: (NSString*) contentid
    body: (SWGMainDeleteContentFromCollectionBody*) body
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'coluuid' is set
    if (coluuid == nil) {
        NSParameterAssert(coluuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"coluuid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'contentid' is set
    if (contentid == nil) {
        NSParameterAssert(contentid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"contentid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/{coluuid}/contents"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (coluuid != nil) {
        pathParams[@"coluuid"] = coluuid;
    }
    if (contentid != nil) {
        pathParams[@"contentid"] = contentid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Deletes a collection
/// This endpoint is used to delete an existing collection.
///  @param coluuid Collection ID 
///
///  @returns NSString*
///
-(NSURLSessionTask*) collectionsColuuidDeleteWithColuuid: (NSString*) coluuid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'coluuid' is set
    if (coluuid == nil) {
        NSParameterAssert(coluuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"coluuid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/{coluuid}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (coluuid != nil) {
        pathParams[@"coluuid"] = coluuid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Get contents in a collection
/// This endpoint is used to get contents in a collection. If no colpath query param is passed
///  @param coluuid coluuid 
///
///  @param dir Directory (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) collectionsColuuidGetWithColuuid: (NSString*) coluuid
    dir: (NSString*) dir
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'coluuid' is set
    if (coluuid == nil) {
        NSParameterAssert(coluuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"coluuid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/{coluuid}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (coluuid != nil) {
        pathParams[@"coluuid"] = coluuid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (dir != nil) {
        queryParams[@"dir"] = dir;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Add contents to a collection
/// This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
///  @param coluuid coluuid 
///
///  @param contentIDs Content IDs to add to collection 
///
///  @returns NSString*
///
-(NSURLSessionTask*) collectionsColuuidPostWithColuuid: (NSString*) coluuid
    contentIDs: (NSArray<NSNumber*>*) contentIDs
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'coluuid' is set
    if (coluuid == nil) {
        NSParameterAssert(coluuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"coluuid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'contentIDs' is set
    if (contentIDs == nil) {
        NSParameterAssert(contentIDs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"contentIDs"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/{coluuid}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (coluuid != nil) {
        pathParams[@"coluuid"] = coluuid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = contentIDs;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Add a file to a collection
/// This endpoint adds a file to a collection
///  @param coluuid Collection ID 
///
///  @param content Content 
///
///  @param path Path to file 
///
///  @returns NSString*
///
-(NSURLSessionTask*) collectionsFsAddPostWithColuuid: (NSString*) coluuid
    content: (NSString*) content
    path: (NSString*) path
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'coluuid' is set
    if (coluuid == nil) {
        NSParameterAssert(coluuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"coluuid"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'content' is set
    if (content == nil) {
        NSParameterAssert(content);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"content"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/fs/add"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (coluuid != nil) {
        queryParams[@"coluuid"] = coluuid;
    }
    if (content != nil) {
        queryParams[@"content"] = content;
    }
    if (path != nil) {
        queryParams[@"path"] = path;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// List all collections
/// This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
///  @returns NSArray<NSArray<SWGCollectionsCollection>*>*
///
-(NSURLSessionTask*) collectionsGetWithCompletionHandler: 
    (void (^)(NSArray<NSArray<SWGCollectionsCollection>*>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<NSArray<SWGCollectionsCollection>*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSArray<SWGCollectionsCollection>*>*)data, error);
                                }
                            }];
}

///
/// Create a new collection
/// This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
///  @param body Collection name and description 
///
///  @returns SWGCollectionsCollection*
///
-(NSURLSessionTask*) collectionsPostWithBody: (SWGMainCreateCollectionBody*) body
    completionHandler: (void (^)(SWGCollectionsCollection* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGCollectionsApiErrorDomain code:kSWGCollectionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/collections/"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"bearerAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGCollectionsCollection*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGCollectionsCollection*)data, error);
                                }
                            }];
}



@end
