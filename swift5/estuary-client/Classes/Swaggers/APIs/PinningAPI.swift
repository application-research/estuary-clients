//
// PinningAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class PinningAPI {
    /**
     List all pin status objects

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func pinningPinsGet(completion: @escaping ((_ data: PinnerIpfsListPinStatusResponse?,_ error: Error?) -> Void)) {
        pinningPinsGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all pin status objects
     - GET /pinning/pins

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "count" : 0,
  "results" : [ {
    "pin" : {
      "meta" : "",
      "name" : "name",
      "origins" : [ "origins", "origins" ],
      "cid" : "cid"
    },
    "created" : "created",
    "requestid" : "requestid",
    "delegates" : [ "delegates", "delegates" ],
    "content" : {
      "aggregatedIn" : 6,
      "offloaded" : true,
      "replication" : 5,
      "pinning" : true,
      "pinMeta" : "pinMeta",
      "replace" : true,
      "active" : true,
      "description" : "description",
      "dagSplit" : true,
      "dealStatus" : "dealStatus",
      "failed" : true,
      "type" : 7,
      "userId" : 9,
      "aggregate" : true,
      "createdAt" : "createdAt",
      "pinningStatus" : "pinningStatus",
      "size" : 5,
      "splitFrom" : 2,
      "name" : "name",
      "origins" : "origins",
      "location" : "location",
      "id" : 1,
      "cid" : {
        "cid" : { }
      },
      "updatedAt" : "updatedAt"
    },
    "info" : "",
    "status" : "pinning"
  }, {
    "pin" : {
      "meta" : "",
      "name" : "name",
      "origins" : [ "origins", "origins" ],
      "cid" : "cid"
    },
    "created" : "created",
    "requestid" : "requestid",
    "delegates" : [ "delegates", "delegates" ],
    "content" : {
      "aggregatedIn" : 6,
      "offloaded" : true,
      "replication" : 5,
      "pinning" : true,
      "pinMeta" : "pinMeta",
      "replace" : true,
      "active" : true,
      "description" : "description",
      "dagSplit" : true,
      "dealStatus" : "dealStatus",
      "failed" : true,
      "type" : 7,
      "userId" : 9,
      "aggregate" : true,
      "createdAt" : "createdAt",
      "pinningStatus" : "pinningStatus",
      "size" : 5,
      "splitFrom" : 2,
      "name" : "name",
      "origins" : "origins",
      "location" : "location",
      "id" : 1,
      "cid" : {
        "cid" : { }
      },
      "updatedAt" : "updatedAt"
    },
    "info" : "",
    "status" : "pinning"
  } ]
}}]

     - returns: RequestBuilder<PinnerIpfsListPinStatusResponse> 
     */
    open class func pinningPinsGetWithRequestBuilder() -> RequestBuilder<PinnerIpfsListPinStatusResponse> {
        let path = "/pinning/pins"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<PinnerIpfsListPinStatusResponse>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Delete a pinned object

     - parameter pinid: (path) Pin ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func pinningPinsPinidDelete(pinid: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        pinningPinsPinidDeleteWithRequestBuilder(pinid: pinid).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Delete a pinned object
     - DELETE /pinning/pins/{pinid}

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - parameter pinid: (path) Pin ID 

     - returns: RequestBuilder<Void> 
     */
    open class func pinningPinsPinidDeleteWithRequestBuilder(pinid: String) -> RequestBuilder<Void> {
        var path = "/pinning/pins/{pinid}"
        let pinidPreEscape = "\(pinid)"
        let pinidPostEscape = pinidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{pinid}", with: pinidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = estuary-clientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get a pin status object

     - parameter pinid: (path) cid 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func pinningPinsPinidGet(pinid: String, completion: @escaping ((_ data: PinnerIpfsPinStatusResponse?,_ error: Error?) -> Void)) {
        pinningPinsPinidGetWithRequestBuilder(pinid: pinid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get a pin status object
     - GET /pinning/pins/{pinid}

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
}}]
     - parameter pinid: (path) cid 

     - returns: RequestBuilder<PinnerIpfsPinStatusResponse> 
     */
    open class func pinningPinsPinidGetWithRequestBuilder(pinid: String) -> RequestBuilder<PinnerIpfsPinStatusResponse> {
        var path = "/pinning/pins/{pinid}"
        let pinidPreEscape = "\(pinid)"
        let pinidPostEscape = pinidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{pinid}", with: pinidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<PinnerIpfsPinStatusResponse>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Replace a pinned object

     - parameter body: (body) New pin 
     - parameter pinid: (path) Pin ID to be replaced 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func pinningPinsPinidPost(body: PinnerIpfsPin, pinid: String, completion: @escaping ((_ data: PinnerIpfsPinStatusResponse?,_ error: Error?) -> Void)) {
        pinningPinsPinidPostWithRequestBuilder(body: body, pinid: pinid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Replace a pinned object
     - POST /pinning/pins/{pinid}

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
}}]
     - parameter body: (body) New pin 
     - parameter pinid: (path) Pin ID to be replaced 

     - returns: RequestBuilder<PinnerIpfsPinStatusResponse> 
     */
    open class func pinningPinsPinidPostWithRequestBuilder(body: PinnerIpfsPin, pinid: String) -> RequestBuilder<PinnerIpfsPinStatusResponse> {
        var path = "/pinning/pins/{pinid}"
        let pinidPreEscape = "\(pinid)"
        let pinidPostEscape = pinidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{pinid}", with: pinidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<PinnerIpfsPinStatusResponse>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Add and pin object

     - parameter body: (body) Pin Body {cid:cid, name:name} 
     - parameter ignoreDupes: (query) Ignore Dupes (optional)
     - parameter overwrite: (query) Overwrite conflicting files in collections (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func pinningPinsPost(body: PinnerIpfsPin, ignoreDupes: String? = nil, overwrite: String? = nil, completion: @escaping ((_ data: PinnerIpfsPinStatusResponse?,_ error: Error?) -> Void)) {
        pinningPinsPostWithRequestBuilder(body: body, ignoreDupes: ignoreDupes, overwrite: overwrite).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add and pin object
     - POST /pinning/pins

     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "pin" : {
    "meta" : "",
    "name" : "name",
    "origins" : [ "origins", "origins" ],
    "cid" : "cid"
  },
  "created" : "created",
  "requestid" : "requestid",
  "delegates" : [ "delegates", "delegates" ],
  "content" : {
    "aggregatedIn" : 6,
    "offloaded" : true,
    "replication" : 5,
    "pinning" : true,
    "pinMeta" : "pinMeta",
    "replace" : true,
    "active" : true,
    "description" : "description",
    "dagSplit" : true,
    "dealStatus" : "dealStatus",
    "failed" : true,
    "type" : 7,
    "userId" : 9,
    "aggregate" : true,
    "createdAt" : "createdAt",
    "pinningStatus" : "pinningStatus",
    "size" : 5,
    "splitFrom" : 2,
    "name" : "name",
    "origins" : "origins",
    "location" : "location",
    "id" : 1,
    "cid" : {
      "cid" : { }
    },
    "updatedAt" : "updatedAt"
  },
  "info" : "",
  "status" : "pinning"
}}]
     - parameter body: (body) Pin Body {cid:cid, name:name} 
     - parameter ignoreDupes: (query) Ignore Dupes (optional)
     - parameter overwrite: (query) Overwrite conflicting files in collections (optional)

     - returns: RequestBuilder<PinnerIpfsPinStatusResponse> 
     */
    open class func pinningPinsPostWithRequestBuilder(body: PinnerIpfsPin, ignoreDupes: String? = nil, overwrite: String? = nil) -> RequestBuilder<PinnerIpfsPinStatusResponse> {
        let path = "/pinning/pins"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "ignore-dupes": ignoreDupes, 
                        "overwrite": overwrite
        ])


        let requestBuilder: RequestBuilder<PinnerIpfsPinStatusResponse>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
}
