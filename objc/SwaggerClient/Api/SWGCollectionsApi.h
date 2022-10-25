#import <Foundation/Foundation.h>
#import "SWGCollectionsCollection.h"
#import "SWGMainCreateCollectionBody.h"
#import "SWGMainDeleteContentFromCollectionBody.h"
#import "SWGUtilHttpError.h"
#import "SWGApi.h"

/**
* Estuary API
* This is the API for the Estuary application.
*
* OpenAPI spec version: 0.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGCollectionsApi: NSObject <SWGApi>

extern NSString* kSWGCollectionsApiErrorDomain;
extern NSInteger kSWGCollectionsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Produce a CID of the collection contents
/// This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
///
/// @param coluuid coluuid
/// 
///  code:200 message:"OK"
///
/// @return NSString*
-(NSURLSessionTask*) collectionsColuuidCommitPostWithColuuid: (NSString*) coluuid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Deletes a content from a collection
/// This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
///
/// @param coluuid Collection ID
/// @param contentid Content ID
/// @param body Variable to use when filtering for files (must be either &#39;path&#39; or &#39;content_id&#39;)
/// 
///  code:200 message:"OK",
///  code:400 message:"Bad Request"
///
/// @return NSString*
-(NSURLSessionTask*) collectionsColuuidContentsDeleteWithColuuid: (NSString*) coluuid
    contentid: (NSString*) contentid
    body: (SWGMainDeleteContentFromCollectionBody*) body
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Deletes a collection
/// This endpoint is used to delete an existing collection.
///
/// @param coluuid Collection ID
/// 
///
/// @return void
-(NSURLSessionTask*) collectionsColuuidDeleteWithColuuid: (NSString*) coluuid
    completionHandler: (void (^)(NSError* error)) handler;


/// Get contents in a collection
/// This endpoint is used to get contents in a collection. If no colpath query param is passed
///
/// @param coluuid coluuid
/// @param dir Directory (optional)
/// 
///  code:200 message:"OK"
///
/// @return NSString*
-(NSURLSessionTask*) collectionsColuuidGetWithColuuid: (NSString*) coluuid
    dir: (NSString*) dir
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Add contents to a collection
/// This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
///
/// @param coluuid coluuid
/// @param contentIDs Content IDs to add to collection
/// 
///  code:200 message:"OK"
///
/// @return NSDictionary<NSString*, NSString*>*
-(NSURLSessionTask*) collectionsColuuidPostWithColuuid: (NSString*) coluuid
    contentIDs: (NSArray<NSNumber*>*) contentIDs
    completionHandler: (void (^)(NSDictionary<NSString*, NSString*>* output, NSError* error)) handler;


/// Add a file to a collection
/// This endpoint adds a file to a collection
///
/// @param coluuid Collection ID
/// @param content Content
/// @param path Path to file
/// 
///
/// @return void
-(NSURLSessionTask*) collectionsFsAddPostWithColuuid: (NSString*) coluuid
    content: (NSString*) content
    path: (NSString*) path
    completionHandler: (void (^)(NSError* error)) handler;


/// List all collections
/// This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
///
/// 
///  code:200 message:"OK",
///  code:400 message:"Bad Request",
///  code:404 message:"Not Found",
///  code:500 message:"Internal Server Error"
///
/// @return NSArray<SWGCollectionsCollection>*
-(NSURLSessionTask*) collectionsGetWithCompletionHandler: 
    (void (^)(NSArray<SWGCollectionsCollection>* output, NSError* error)) handler;


/// Create a new collection
/// This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
///
/// @param body Collection name and description
/// 
///  code:200 message:"OK",
///  code:400 message:"Bad Request",
///  code:404 message:"Not Found",
///  code:500 message:"Internal Server Error"
///
/// @return SWGCollectionsCollection*
-(NSURLSessionTask*) collectionsPostWithBody: (SWGMainCreateCollectionBody*) body
    completionHandler: (void (^)(SWGCollectionsCollection* output, NSError* error)) handler;



@end
