#import <Foundation/Foundation.h>
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



@interface SWGAdminApi: NSObject <SWGApi>

extern NSString* kSWGAdminApiErrorDomain;
extern NSInteger kSWGAdminApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Remove peers on Peering Service
/// This endpoint can be used to remove a Peer from the Peering Service
///
/// @param body Peer ids
/// 
///
/// @return void
-(NSURLSessionTask*) adminPeeringPeersDeleteWithBody: (NSArray<NSString*>*) body
    completionHandler: (void (^)(NSError* error)) handler;


/// List all Peering peers
/// This endpoint can be used to list all peers on Peering Service
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminPeeringPeersGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Add peers on Peering Service
/// This endpoint can be used to add a Peer from the Peering Service
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminPeeringPeersPostWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Start Peering
/// This endpoint can be used to start the Peering Service
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminPeeringStartPostWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Check Peering Status
/// This endpoint can be used to check the Peering status
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminPeeringStatusGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Stop Peering
/// This endpoint can be used to stop the Peering Service
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminPeeringStopPostWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Get systems(estuary/shuttle) config
/// This endpoint is used to get system configs.
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminSystemConfigGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;


/// Get all users
/// This endpoint is used to get all users.
///
/// 
///
/// @return void
-(NSURLSessionTask*) adminUsersGetWithCompletionHandler: 
    (void (^)(NSError* error)) handler;



@end
