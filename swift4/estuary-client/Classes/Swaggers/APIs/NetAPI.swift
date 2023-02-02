//
// NetAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class NetAPI {
    /**
     Get all miners

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminMinersGet(completion: @escaping ((_ data: ApiMinerResp?,_ error: Error?) -> Void)) {
        adminMinersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all miners
     - GET /admin/miners/
     - This endpoint returns all miners. Note: value may be cached
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "name" : "name",
  "chain_info" : {
    "peerId" : "peerId",
    "addresses" : [ "addresses", "addresses" ]
  },
  "suspendedReason" : "suspendedReason",
  "addr" : { },
  "version" : "version",
  "suspended" : true
}}]

     - returns: RequestBuilder<ApiMinerResp> 
     */
    open class func adminMinersGetWithRequestBuilder() -> RequestBuilder<ApiMinerResp> {
        let path = "/admin/miners/"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<ApiMinerResp>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get all miners
     - parameter miner: (path) Filter by miner 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicMinersFailuresMinerGet(miner: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        publicMinersFailuresMinerGetWithRequestBuilder(miner: miner).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all miners
     - GET /public/miners/failures/{miner}
     - This endpoint returns all miners
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter miner: (path) Filter by miner 

     - returns: RequestBuilder<String> 
     */
    open class func publicMinersFailuresMinerGetWithRequestBuilder(miner: String) -> RequestBuilder<String> {
        var path = "/public/miners/failures/{miner}"
        let minerPreEscape = "\(miner)"
        let minerPostEscape = minerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{miner}", with: minerPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Net Addrs

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicNetAddrsGet(completion: @escaping ((_ data: [String]?,_ error: Error?) -> Void)) {
        publicNetAddrsGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Net Addrs
     - GET /public/net/addrs
     - This endpoint is used to get net addrs
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=[ "", "" ]}]

     - returns: RequestBuilder<[String]> 
     */
    open class func publicNetAddrsGetWithRequestBuilder() -> RequestBuilder<[String]> {
        let path = "/public/net/addrs"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[String]>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Net Peers

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicNetPeersGet(completion: @escaping ((_ data: [String]?,_ error: Error?) -> Void)) {
        publicNetPeersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Net Peers
     - GET /public/net/peers
     - This endpoint is used to get net peers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=[ "", "" ]}]

     - returns: RequestBuilder<[String]> 
     */
    open class func publicNetPeersGetWithRequestBuilder() -> RequestBuilder<[String]> {
        let path = "/public/net/peers"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[String]>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
