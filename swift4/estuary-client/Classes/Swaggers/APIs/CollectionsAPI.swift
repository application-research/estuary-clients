//
// CollectionsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class CollectionsAPI {
    /**
     Produce a CID of the collection contents
     - parameter coluuid: (path) coluuid 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsColuuidCommitPost(coluuid: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        collectionsColuuidCommitPostWithRequestBuilder(coluuid: coluuid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Produce a CID of the collection contents
     - POST /collections/{coluuid}/commit
     - This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter coluuid: (path) coluuid 

     - returns: RequestBuilder<String> 
     */
    open class func collectionsColuuidCommitPostWithRequestBuilder(coluuid: String) -> RequestBuilder<String> {
        var path = "/collections/{coluuid}/commit"
        let coluuidPreEscape = "\(coluuid)"
        let coluuidPostEscape = coluuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{coluuid}", with: coluuidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Deletes a content from a collection
     - parameter body: (body) Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;)      - parameter coluuid: (path) Collection ID      - parameter contentid: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsColuuidContentsDelete(body: MainDeleteContentFromCollectionBody, coluuid: String, contentid: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        collectionsColuuidContentsDeleteWithRequestBuilder(body: body, coluuid: coluuid, contentid: contentid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Deletes a content from a collection
     - DELETE /collections/{coluuid}/contents
     - This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;)      - parameter coluuid: (path) Collection ID      - parameter contentid: (path) Content ID 

     - returns: RequestBuilder<String> 
     */
    open class func collectionsColuuidContentsDeleteWithRequestBuilder(body: MainDeleteContentFromCollectionBody, coluuid: String, contentid: String) -> RequestBuilder<String> {
        var path = "/collections/{coluuid}/contents"
        let coluuidPreEscape = "\(coluuid)"
        let coluuidPostEscape = coluuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{coluuid}", with: coluuidPostEscape, options: .literal, range: nil)
        let contentidPreEscape = "\(contentid)"
        let contentidPostEscape = contentidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{contentid}", with: contentidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Deletes a collection
     - parameter coluuid: (path) Collection ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsColuuidDelete(coluuid: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        collectionsColuuidDeleteWithRequestBuilder(coluuid: coluuid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Deletes a collection
     - DELETE /collections/{coluuid}
     - This endpoint is used to delete an existing collection.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter coluuid: (path) Collection ID 

     - returns: RequestBuilder<String> 
     */
    open class func collectionsColuuidDeleteWithRequestBuilder(coluuid: String) -> RequestBuilder<String> {
        var path = "/collections/{coluuid}"
        let coluuidPreEscape = "\(coluuid)"
        let coluuidPostEscape = coluuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{coluuid}", with: coluuidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get contents in a collection
     - parameter coluuid: (path) coluuid      - parameter dir: (query) Directory (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsColuuidGet(coluuid: String, dir: String? = nil, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        collectionsColuuidGetWithRequestBuilder(coluuid: coluuid, dir: dir).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get contents in a collection
     - GET /collections/{coluuid}
     - This endpoint is used to get contents in a collection. If no colpath query param is passed
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter coluuid: (path) coluuid      - parameter dir: (query) Directory (optional)

     - returns: RequestBuilder<String> 
     */
    open class func collectionsColuuidGetWithRequestBuilder(coluuid: String, dir: String? = nil) -> RequestBuilder<String> {
        var path = "/collections/{coluuid}"
        let coluuidPreEscape = "\(coluuid)"
        let coluuidPostEscape = coluuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{coluuid}", with: coluuidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "dir": dir
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Add contents to a collection
     - parameter body: (body) Content IDs to add to collection      - parameter coluuid: (path) Collection UUID      - parameter dir: (query) Directory (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsColuuidPost(body: [Int], coluuid: String, dir: String? = nil, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        collectionsColuuidPostWithRequestBuilder(body: body, coluuid: coluuid, dir: dir).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add contents to a collection
     - POST /collections/{coluuid}
     - This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Content IDs to add to collection      - parameter coluuid: (path) Collection UUID      - parameter dir: (query) Directory (optional)

     - returns: RequestBuilder<String> 
     */
    open class func collectionsColuuidPostWithRequestBuilder(body: [Int], coluuid: String, dir: String? = nil) -> RequestBuilder<String> {
        var path = "/collections/{coluuid}"
        let coluuidPreEscape = "\(coluuid)"
        let coluuidPostEscape = coluuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{coluuid}", with: coluuidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "dir": dir
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Add a file to a collection
     - parameter coluuid: (query) Collection ID      - parameter content: (query) Content      - parameter path: (query) Path to file 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsFsAddPost(coluuid: String, content: String, path: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        collectionsFsAddPostWithRequestBuilder(coluuid: coluuid, content: content, path: path).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add a file to a collection
     - POST /collections/fs/add
     - This endpoint adds a file to a collection
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter coluuid: (query) Collection ID      - parameter content: (query) Content      - parameter path: (query) Path to file 

     - returns: RequestBuilder<String> 
     */
    open class func collectionsFsAddPostWithRequestBuilder(coluuid: String, content: String, path: String) -> RequestBuilder<String> {
        let path = "/collections/fs/add"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "coluuid": coluuid, 
                        "content": content, 
                        "path": path
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     List all collections

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsGet(completion: @escaping ((_ data: [CollectionsCollection]?,_ error: Error?) -> Void)) {
        collectionsGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all collections
     - GET /collections/
     - This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=[ {
  "createdAt" : "createdAt",
  "name" : "name",
  "description" : "description",
  "userId" : 0,
  "uuid" : "uuid",
  "cid" : "cid"
}, {
  "createdAt" : "createdAt",
  "name" : "name",
  "description" : "description",
  "userId" : 0,
  "uuid" : "uuid",
  "cid" : "cid"
} ]}]

     - returns: RequestBuilder<[CollectionsCollection]> 
     */
    open class func collectionsGetWithRequestBuilder() -> RequestBuilder<[CollectionsCollection]> {
        let path = "/collections/"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[CollectionsCollection]>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Create a new collection
     - parameter body: (body) Collection name and description 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func collectionsPost(body: MainCreateCollectionBody, completion: @escaping ((_ data: CollectionsCollection?,_ error: Error?) -> Void)) {
        collectionsPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Create a new collection
     - POST /collections/
     - This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example={
  "createdAt" : "createdAt",
  "name" : "name",
  "description" : "description",
  "userId" : 0,
  "uuid" : "uuid",
  "cid" : "cid"
}}]
     - parameter body: (body) Collection name and description 

     - returns: RequestBuilder<CollectionsCollection> 
     */
    open class func collectionsPostWithRequestBuilder(body: MainCreateCollectionBody) -> RequestBuilder<CollectionsCollection> {
        let path = "/collections/"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<CollectionsCollection>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}
