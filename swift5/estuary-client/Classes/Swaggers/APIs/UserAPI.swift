//
// UserAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class UserAPI {
    /**
     Get API keys for a user

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func userApiKeysGet(completion: @escaping ((_ data: [ApiGetApiKeysResp]?,_ error: Error?) -> Void)) {
        userApiKeysGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get API keys for a user
     - GET /user/api-keys

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=[ {
  "expiry" : "expiry",
  "label" : "label",
  "tokenHash" : "tokenHash",
  "token" : "token"
}, {
  "expiry" : "expiry",
  "label" : "label",
  "tokenHash" : "tokenHash",
  "token" : "token"
} ]}]

     - returns: RequestBuilder<[ApiGetApiKeysResp]> 
     */
    open class func userApiKeysGetWithRequestBuilder() -> RequestBuilder<[ApiGetApiKeysResp]> {
        let path = "/user/api-keys"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<[ApiGetApiKeysResp]>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Revoke a User API Key.

     - parameter keyOrHash: (path) Key or Hash 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func userApiKeysKeyOrHashDelete(keyOrHash: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        userApiKeysKeyOrHashDeleteWithRequestBuilder(keyOrHash: keyOrHash).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Revoke a User API Key.
     - DELETE /user/api-keys/{key_or_hash}

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter keyOrHash: (path) Key or Hash 

     - returns: RequestBuilder<String> 
     */
    open class func userApiKeysKeyOrHashDeleteWithRequestBuilder(keyOrHash: String) -> RequestBuilder<String> {
        var path = "/user/api-keys/{key_or_hash}"
        let keyOrHashPreEscape = "\(keyOrHash)"
        let keyOrHashPostEscape = keyOrHashPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{key_or_hash}", with: keyOrHashPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Create API keys for a user

     - parameter expiry: (query) Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h (optional)
     - parameter perms: (query) Permissions -- currently unused (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func userApiKeysPost(expiry: String? = nil, perms: String? = nil, completion: @escaping ((_ data: ApiGetApiKeysResp?,_ error: Error?) -> Void)) {
        userApiKeysPostWithRequestBuilder(expiry: expiry, perms: perms).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Create API keys for a user
     - POST /user/api-keys

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "expiry" : "expiry",
  "label" : "label",
  "tokenHash" : "tokenHash",
  "token" : "token"
}}]
     - parameter expiry: (query) Expiration - Expiration - Valid time units are ns, us (or µs),  ms,  s,  m,  h.  for  example  300h (optional)
     - parameter perms: (query) Permissions -- currently unused (optional)

     - returns: RequestBuilder<ApiGetApiKeysResp> 
     */
    open class func userApiKeysPostWithRequestBuilder(expiry: String? = nil, perms: String? = nil) -> RequestBuilder<ApiGetApiKeysResp> {
        let path = "/user/api-keys"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "expiry": expiry, 
                        "perms": perms
        ])


        let requestBuilder: RequestBuilder<ApiGetApiKeysResp>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Export user data

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func userExportGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        userExportGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Export user data
     - GET /user/export

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func userExportGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/user/export"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get stats for the current user

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func userStatsGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        userStatsGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get stats for the current user
     - GET /user/stats

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func userStatsGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/user/stats"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
