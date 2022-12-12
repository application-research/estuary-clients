//
// ContentAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class ContentAPI: APIBase {
    /**
     Create an Estuary invite
     - parameter code: (path) Invite code to be created 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminInvitesCodePost(code: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        adminInvitesCodePostWithRequestBuilder(code: code).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Create an Estuary invite
     - POST /admin/invites/{code}
     - This endpoint is used to create an estuary invite.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter code: (path) Invite code to be created 
     - returns: RequestBuilder<String> 
     */
    open class func adminInvitesCodePostWithRequestBuilder(code: String) -> RequestBuilder<String> {
        var path = "/admin/invites/{code}"
        let codePreEscape = "\(code)"
        let codePostEscape = codePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{code}", with: codePostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get Estuary invites
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func adminInvitesGet(completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        adminInvitesGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Estuary invites
     - GET /admin/invites
     - This endpoint is used to list all estuary invites.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - returns: RequestBuilder<String> 
     */
    open class func adminInvitesGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/admin/invites"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Upload content via a car file
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAddCarPost(completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentAddCarPostWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Upload content via a car file
     - POST /content/add-car
     - This endpoint uploads content via a car file
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - returns: RequestBuilder<String> 
     */
    open class func contentAddCarPostWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/content/add-car"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Add IPFS object
     - parameter body: (body) IPFS Body 
     - parameter ignoreDupes: (query) Ignore Dupes (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAddIpfsPost(body: TypesIpfsPin, ignoreDupes: String? = nil, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentAddIpfsPostWithRequestBuilder(body: body, ignoreDupes: ignoreDupes).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add IPFS object
     - POST /content/add-ipfs
     - This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) IPFS Body 
     - parameter ignoreDupes: (query) Ignore Dupes (optional)
     - returns: RequestBuilder<String> 
     */
    open class func contentAddIpfsPostWithRequestBuilder(body: TypesIpfsPin, ignoreDupes: String? = nil) -> RequestBuilder<String> {
        let path = "/content/add-ipfs"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = body.encodeToJSON()
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "ignore-dupes": ignoreDupes
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Upload a file
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAddPost(completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentAddPostWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Upload a file
     - POST /content/add
     - This endpoint uploads a file.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - returns: RequestBuilder<String> 
     */
    open class func contentAddPostWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/content/add"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get aggregated content stats
     - parameter content: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAggregatedContentGet(content: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentAggregatedContentGetWithRequestBuilder(content: content).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get aggregated content stats
     - GET /content/aggregated/{content}
     - This endpoint returns aggregated content stats
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter content: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentAggregatedContentGetWithRequestBuilder(content: String) -> RequestBuilder<String> {
        var path = "/content/aggregated/{content}"
        let contentPreEscape = "\(content)"
        let contentPostEscape = contentPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{content}", with: contentPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get all deals for a user
     - parameter begin: (query) Begin 
     - parameter duration: (query) Duration 
     - parameter all: (query) All 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentAllDealsGet(begin: String, duration: String, all: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentAllDealsGetWithRequestBuilder(begin: begin, duration: duration, all: all).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get all deals for a user
     - GET /content/all-deals
     - This endpoint is used to get all deals for a user
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter begin: (query) Begin 
     - parameter duration: (query) Duration 
     - parameter all: (query) All 
     - returns: RequestBuilder<String> 
     */
    open class func contentAllDealsGetWithRequestBuilder(begin: String, duration: String, all: String) -> RequestBuilder<String> {
        let path = "/content/all-deals"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "begin": begin,
                        "duration": duration,
                        "all": all
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get content bandwidth
     - parameter content: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentBwUsageContentGet(content: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentBwUsageContentGetWithRequestBuilder(content: content).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get content bandwidth
     - GET /content/bw-usage/{content}
     - This endpoint returns content bandwidth
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter content: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentBwUsageContentGetWithRequestBuilder(content: String) -> RequestBuilder<String> {
        var path = "/content/bw-usage/{content}"
        let contentPreEscape = "\(content)"
        let contentPostEscape = contentPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{content}", with: contentPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Add a new content
     - parameter body: (body) Content 
     - parameter ignoreDupes: (query) Ignore Dupes (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentCreatePost(body: UtilContentCreateBody, ignoreDupes: String? = nil, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentCreatePostWithRequestBuilder(body: body, ignoreDupes: ignoreDupes).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Add a new content
     - POST /content/create
     - This endpoint adds a new content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Content 
     - parameter ignoreDupes: (query) Ignore Dupes (optional)
     - returns: RequestBuilder<String> 
     */
    open class func contentCreatePostWithRequestBuilder(body: UtilContentCreateBody, ignoreDupes: String? = nil) -> RequestBuilder<String> {
        let path = "/content/create"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = body.encodeToJSON()
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "ignore-dupes": ignoreDupes
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Content with deals
     - parameter limit: (query) Limit (optional)
     - parameter offset: (query) Offset (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentDealsGet(limit: Int32? = nil, offset: Int32? = nil, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentDealsGetWithRequestBuilder(limit: limit, offset: offset).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Content with deals
     - GET /content/deals
     - This endpoint lists all content with deals
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter limit: (query) Limit (optional)
     - parameter offset: (query) Offset (optional)
     - returns: RequestBuilder<String> 
     */
    open class func contentDealsGetWithRequestBuilder(limit: Int32? = nil, offset: Int32? = nil) -> RequestBuilder<String> {
        let path = "/content/deals"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "limit": limit?.encodeToJSON(),
                        "offset": offset?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Ensure Replication
     - parameter datacid: (path) Data CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentEnsureReplicationDatacidGet(datacid: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentEnsureReplicationDatacidGetWithRequestBuilder(datacid: datacid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Ensure Replication
     - GET /content/ensure-replication/{datacid}
     - This endpoint ensures that the content is replicated to the specified number of providers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter datacid: (path) Data CID 
     - returns: RequestBuilder<String> 
     */
    open class func contentEnsureReplicationDatacidGetWithRequestBuilder(datacid: String) -> RequestBuilder<String> {
        var path = "/content/ensure-replication/{datacid}"
        let datacidPreEscape = "\(datacid)"
        let datacidPostEscape = datacidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{datacid}", with: datacidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     List all failures for a content
     - parameter content: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentFailuresContentGet(content: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentFailuresContentGetWithRequestBuilder(content: content).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all failures for a content
     - GET /content/failures/{content}
     - This endpoint returns all failures for a content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter content: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentFailuresContentGetWithRequestBuilder(content: String) -> RequestBuilder<String> {
        var path = "/content/failures/{content}"
        let contentPreEscape = "\(content)"
        let contentPostEscape = contentPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{content}", with: contentPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Content
     - parameter id: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentIdGet(id: Int32, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentIdGetWithRequestBuilder(id: id).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Content
     - GET /content/{id}
     - This endpoint returns a content by its ID
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter id: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentIdGetWithRequestBuilder(id: Int32) -> RequestBuilder<String> {
        var path = "/content/{id}"
        let idPreEscape = "\(id)"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Import a deal
     - parameter body: (body) Import a deal 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentImportdealPost(body: MainImportDealBody, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentImportdealPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Import a deal
     - POST /content/importdeal
     - This endpoint imports a deal into the shuttle.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Import a deal 
     - returns: RequestBuilder<String> 
     */
    open class func contentImportdealPostWithRequestBuilder(body: MainImportDealBody) -> RequestBuilder<String> {
        let path = "/content/importdeal"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = body.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     List all pinned content
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentListGet(completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentListGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     List all pinned content
     - GET /content/list
     - This endpoint lists all content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - returns: RequestBuilder<String> 
     */
    open class func contentListGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/content/list"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Read content
     - parameter cont: (path) CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentReadContGet(cont: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentReadContGetWithRequestBuilder(cont: cont).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Read content
     - GET /content/read/{cont}
     - This endpoint reads content from the blockstore
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter cont: (path) CID 
     - returns: RequestBuilder<String> 
     */
    open class func contentReadContGetWithRequestBuilder(cont: String) -> RequestBuilder<String> {
        var path = "/content/read/{cont}"
        let contPreEscape = "\(cont)"
        let contPostEscape = contPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{cont}", with: contPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get staging zone for user, excluding its contents
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStagingZonesGet(completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentStagingZonesGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get staging zone for user, excluding its contents
     - GET /content/staging-zones
     - This endpoint is used to get staging zone for user, excluding its contents.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - returns: RequestBuilder<String> 
     */
    open class func contentStagingZonesGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/content/staging-zones"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get contents for a staging zone
     - parameter stagingZone: (path) Staging Zone Content ID 
     - parameter limit: (query) limit 
     - parameter offset: (query) offset 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStagingZonesStagingZoneContentsGet(stagingZone: Int32, limit: String, offset: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentStagingZonesStagingZoneContentsGetWithRequestBuilder(stagingZone: stagingZone, limit: limit, offset: offset).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get contents for a staging zone
     - GET /content/staging-zones/{staging_zone}/contents
     - This endpoint is used to get the contents for a staging zone
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter stagingZone: (path) Staging Zone Content ID 
     - parameter limit: (query) limit 
     - parameter offset: (query) offset 
     - returns: RequestBuilder<String> 
     */
    open class func contentStagingZonesStagingZoneContentsGetWithRequestBuilder(stagingZone: Int32, limit: String, offset: String) -> RequestBuilder<String> {
        var path = "/content/staging-zones/{staging_zone}/contents"
        let stagingZonePreEscape = "\(stagingZone)"
        let stagingZonePostEscape = stagingZonePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{staging_zone}", with: stagingZonePostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "limit": limit,
                        "offset": offset
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get staging zone without its contents field populated
     - parameter stagingZone: (path) Staging Zone Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStagingZonesStagingZoneGet(stagingZone: Int32, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentStagingZonesStagingZoneGetWithRequestBuilder(stagingZone: stagingZone).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get staging zone without its contents field populated
     - GET /content/staging-zones/{staging_zone}
     - This endpoint is used to get a staging zone, excluding its contents.
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter stagingZone: (path) Staging Zone Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentStagingZonesStagingZoneGetWithRequestBuilder(stagingZone: Int32) -> RequestBuilder<String> {
        var path = "/content/staging-zones/{staging_zone}"
        let stagingZonePreEscape = "\(stagingZone)"
        let stagingZonePostEscape = stagingZonePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{staging_zone}", with: stagingZonePostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get content statistics
     - parameter limit: (query) limit 
     - parameter offset: (query) offset 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStatsGet(limit: String, offset: String, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentStatsGetWithRequestBuilder(limit: limit, offset: offset).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get content statistics
     - GET /content/stats
     - This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter limit: (query) limit 
     - parameter offset: (query) offset 
     - returns: RequestBuilder<String> 
     */
    open class func contentStatsGetWithRequestBuilder(limit: String, offset: String) -> RequestBuilder<String> {
        let path = "/content/stats"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "limit": limit,
                        "offset": offset
        ])

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Content Status
     - parameter id: (path) Content ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func contentStatusIdGet(id: Int32, completion: @escaping ((_ data: String?, _ error: ErrorResponse?) -> Void)) {
        contentStatusIdGetWithRequestBuilder(id: id).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Content Status
     - GET /content/status/{id}
     - This endpoint returns the status of a content
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter id: (path) Content ID 
     - returns: RequestBuilder<String> 
     */
    open class func contentStatusIdGetWithRequestBuilder(id: Int32) -> RequestBuilder<String> {
        var path = "/content/status/{id}"
        let idPreEscape = "\(id)"
        let idPostEscape = idPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{id}", with: idPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
