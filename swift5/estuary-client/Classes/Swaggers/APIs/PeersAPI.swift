//
// PeersAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class PeersAPI {
    /**
     Remove peers on Peering Service

     - parameter body: (body) Peer ids 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringPeersDelete(body: [Bool], completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
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
    open class func adminPeeringPeersDeleteWithRequestBuilder(body: [Bool]) -> RequestBuilder<String> {
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

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminPeeringPeersPost(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        adminPeeringPeersPostWithRequestBuilder().execute { (response, error) -> Void in
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

     - returns: RequestBuilder<String> 
     */
    open class func adminPeeringPeersPostWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/peering/peers"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
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
}
