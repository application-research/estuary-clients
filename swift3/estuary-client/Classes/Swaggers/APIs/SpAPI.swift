//
// SpAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class SpAPI: APIBase {
    /**
     Claim Storage Provider
     - parameter body: (body) Claim Storage Provider Body 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersClaimPost(body: MinerClaimMinerBody, completion: @escaping ((_ data: GithubComApplicationResearchEstuaryApiV2ClaimResponse?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersClaimPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Claim Storage Provider
     - POST /storage-providers/claim
     - This endpoint lets a user claim a storage provider
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "success" : true
}}]
     - parameter body: (body) Claim Storage Provider Body 
     - returns: RequestBuilder<GithubComApplicationResearchEstuaryApiV2ClaimResponse> 
     */
    open class func storageProvidersClaimPostWithRequestBuilder(body: MinerClaimMinerBody) -> RequestBuilder<GithubComApplicationResearchEstuaryApiV2ClaimResponse> {
        let path = "/storage-providers/claim"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<GithubComApplicationResearchEstuaryApiV2ClaimResponse>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Get Claim Storage Provider
     - parameter sp: (path) Storage Provider claim message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersClaimSpGet(sp: String, completion: @escaping ((_ data: GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersClaimSpGetWithRequestBuilder(sp: sp).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Claim Storage Provider
     - GET /storage-providers/claim/{sp}
     - This endpoint lets a user get the message in order to claim a storage provider
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "hexmsg" : "hexmsg"
}}]
     - parameter sp: (path) Storage Provider claim message 
     - returns: RequestBuilder<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> 
     */
    open class func storageProvidersClaimSpGetWithRequestBuilder(sp: String) -> RequestBuilder<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse> {
        var path = "/storage-providers/claim/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<GithubComApplicationResearchEstuaryApiV2ClaimMsgResponse>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get all storage providers deals
     - parameter sp: (path) Filter by storage provider 
     - parameter ignoreFailed: (query) Ignore Failed (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersDealsSpGet(sp: String, ignoreFailed: String? = nil, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersDealsSpGetWithRequestBuilder(sp: sp, ignoreFailed: ignoreFailed).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all storage providers deals
     - GET /storage-providers/deals/{sp}
     - This endpoint returns all storage providers deals
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter sp: (path) Filter by storage provider 
     - parameter ignoreFailed: (query) Ignore Failed (optional)
     - returns: RequestBuilder<String> 
     */
    open class func storageProvidersDealsSpGetWithRequestBuilder(sp: String, ignoreFailed: String? = nil) -> RequestBuilder<String> {
        var path = "/storage-providers/deals/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "ignore-failed": ignoreFailed
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get all storage providers
     - parameter sp: (path) Filter by storage provider 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersFailuresSpGet(sp: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersFailuresSpGetWithRequestBuilder(sp: sp).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all storage providers
     - GET /storage-providers/failures/{sp}
     - This endpoint returns all storage providers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter sp: (path) Filter by storage provider 
     - returns: RequestBuilder<String> 
     */
    open class func storageProvidersFailuresSpGetWithRequestBuilder(sp: String) -> RequestBuilder<String> {
        var path = "/storage-providers/failures/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get all storage providers
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersGet(completion: @escaping ((_ data: [ApiStorageProviderResp]?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all storage providers
     - GET /storage-providers
     - This endpoint returns all storage providers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=[ {
  "name" : "name",
  "suspendedReason" : "suspendedReason",
  "addr" : { },
  "version" : "version",
  "suspended" : true
}, {
  "name" : "name",
  "suspendedReason" : "suspendedReason",
  "addr" : { },
  "version" : "version",
  "suspended" : true
} ]}]
     - returns: RequestBuilder<[ApiStorageProviderResp]> 
     */
    open class func storageProvidersGetWithRequestBuilder() -> RequestBuilder<[ApiStorageProviderResp]> {
        let path = "/storage-providers"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[ApiStorageProviderResp]>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Set Storage Provider Info
     - parameter body: (body) Storage Provider set info params 
     - parameter sp: (path) Storage Provider to set info for 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersSetInfoSpPut(body: MinerMinerSetInfoParams, sp: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        storageProvidersSetInfoSpPutWithRequestBuilder(body: body, sp: sp).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Set Storage Provider Info
     - PUT /storage-providers/set-info/{sp}
     - This endpoint lets a user set storage provider info.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter body: (body) Storage Provider set info params 
     - parameter sp: (path) Storage Provider to set info for 
     - returns: RequestBuilder<Void> 
     */
    open class func storageProvidersSetInfoSpPutWithRequestBuilder(body: MinerMinerSetInfoParams, sp: String) -> RequestBuilder<Void> {
        var path = "/storage-providers/set-info/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Get storage provider stats
     - parameter sp: (path) Filter by storage provider 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersStatsSpGet(sp: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersStatsSpGetWithRequestBuilder(sp: sp).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get storage provider stats
     - GET /storage-providers/stats/{sp}
     - This endpoint returns storage provider stats
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter sp: (path) Filter by storage provider 
     - returns: RequestBuilder<String> 
     */
    open class func storageProvidersStatsSpGetWithRequestBuilder(sp: String) -> RequestBuilder<String> {
        var path = "/storage-providers/stats/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Suspend Storage Provider
     - parameter body: (body) Suspend Storage Provider Body 
     - parameter sp: (path) Storage Provider to suspend 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersSuspendSpPost(body: MinerSuspendMinerBody, sp: String, completion: @escaping ((_ data: [String:String]?, _ error: ErrorResponse?) -> Void)) {
        storageProvidersSuspendSpPostWithRequestBuilder(body: body, sp: sp).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Suspend Storage Provider
     - POST /storage-providers/suspend/{sp}
     - This endpoint lets a user suspend a storage provider.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "key" : ""
}}]
     - parameter body: (body) Suspend Storage Provider Body 
     - parameter sp: (path) Storage Provider to suspend 
     - returns: RequestBuilder<[String:String]> 
     */
    open class func storageProvidersSuspendSpPostWithRequestBuilder(body: MinerSuspendMinerBody, sp: String) -> RequestBuilder<[String:String]> {
        var path = "/storage-providers/suspend/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[String:String]>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Unuspend Storage Provider
     - parameter sp: (path) Storage Provider to unsuspend 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func storageProvidersUnsuspendSpPut(sp: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        storageProvidersUnsuspendSpPutWithRequestBuilder(sp: sp).execute { (response, error) -> Void in
            completion(error)
        }
    }


    /**
     Unuspend Storage Provider
     - PUT /storage-providers/unsuspend/{sp}
     - This endpoint lets a user unsuspend a Storage Provider.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter sp: (path) Storage Provider to unsuspend 
     - returns: RequestBuilder<Void> 
     */
    open class func storageProvidersUnsuspendSpPutWithRequestBuilder(sp: String) -> RequestBuilder<Void> {
        var path = "/storage-providers/unsuspend/{sp}"
        let spPreEscape = "\(sp)"
        let spPostEscape = spPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sp}", with: spPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Void>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
