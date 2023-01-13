//
// AdminAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class AdminAPI {
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

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "name" : "name",
  "chain_info" : {
    "owner" : "owner",
    "peerId" : "peerId",
    "addresses" : [ "addresses", "addresses" ],
    "worker" : "worker"
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
     Remove peers on Peering Service

     - parameter body: (body) Peer ids 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringPeersDelete(body: [String], completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringPeersDeleteWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Remove peers on Peering Service
     - DELETE /admin/peering/peers

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Peer ids 

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringPeersDeleteWithRequestBuilder(body: [String]) -> RequestBuilder<String> {
        let path = "/admin/peering/peers"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     List all Peering peers

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringPeersGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringPeersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all Peering peers
     - GET /admin/peering/peers

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringPeersGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/peering/peers"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Add peers on Peering Service

     - parameter body: (body) Peering Peer array 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringPeersPost(body: [PeeringPeeringPeer], completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringPeersPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add peers on Peering Service
     - POST /admin/peering/peers

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Peering Peer array 

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringPeersPostWithRequestBuilder(body: [PeeringPeeringPeer]) -> RequestBuilder<String> {
        let path = "/admin/peering/peers"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Start Peering

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringStartPost(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringStartPostWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Start Peering
     - POST /admin/peering/start

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringStartPostWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/peering/start"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Check Peering Status

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringStatusGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringStatusGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Check Peering Status
     - GET /admin/peering/status

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringStatusGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/peering/status"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Stop Peering

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringStopPost(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringStopPostWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Stop Peering
     - POST /admin/peering/stop

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringStopPostWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/peering/stop"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get systems(estuary/shuttle) config

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminSystemConfigGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminSystemConfigGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get systems(estuary/shuttle) config
     - GET /admin/system/config

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func adminSystemConfigGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/system/config"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get all users

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminUsersGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminUsersGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all users
     - GET /admin/users

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func adminUsersGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/users"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
