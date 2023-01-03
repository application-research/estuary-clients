//
// DealsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class DealsAPI {
    /**
     Estimate the cost of a deal
     - parameter body: (body) The size of the deal in bytes, the replication factor, and the duration of the deal in blocks 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealEstimatePost(body: ApiEstimateDealBody, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealEstimatePostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Estimate the cost of a deal
     - POST /deal/estimate
     - This endpoint estimates the cost of a deal
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) The size of the deal in bytes, the replication factor, and the duration of the deal in blocks 

     - returns: RequestBuilder<String> 
     */
    open class func dealEstimatePostWithRequestBuilder(body: ApiEstimateDealBody) -> RequestBuilder<String> {
        let path = "/deal/estimate"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Get Deal Info
     - parameter dealid: (path) Deal ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealInfoDealidGet(dealid: Int, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealInfoDealidGetWithRequestBuilder(dealid: dealid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Deal Info
     - GET /deal/info/{dealid}
     - This endpoint returns the deal info for a deal
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter dealid: (path) Deal ID 

     - returns: RequestBuilder<String> 
     */
    open class func dealInfoDealidGetWithRequestBuilder(dealid: Int) -> RequestBuilder<String> {
        var path = "/deal/info/{dealid}"
        let dealidPreEscape = "\(dealid)"
        let dealidPostEscape = dealidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{dealid}", with: dealidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get Proposal
     - parameter propcid: (path) Proposal CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealProposalPropcidGet(propcid: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealProposalPropcidGetWithRequestBuilder(propcid: propcid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Proposal
     - GET /deal/proposal/{propcid}
     - This endpoint returns the proposal for a deal
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter propcid: (path) Proposal CID 

     - returns: RequestBuilder<String> 
     */
    open class func dealProposalPropcidGetWithRequestBuilder(propcid: String) -> RequestBuilder<String> {
        var path = "/deal/proposal/{propcid}"
        let propcidPreEscape = "\(propcid)"
        let propcidPostEscape = propcidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{propcid}", with: propcidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Query Ask
     - parameter miner: (path) CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealQueryMinerGet(miner: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealQueryMinerGetWithRequestBuilder(miner: miner).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Query Ask
     - GET /deal/query/{miner}
     - This endpoint returns the ask for a given CID
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter miner: (path) CID 

     - returns: RequestBuilder<String> 
     */
    open class func dealQueryMinerGetWithRequestBuilder(miner: String) -> RequestBuilder<String> {
        var path = "/deal/query/{miner}"
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
     Get Deal Status by PropCid
     - parameter propcid: (path) PropCid 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealStatusByProposalPropcidGet(propcid: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealStatusByProposalPropcidGetWithRequestBuilder(propcid: propcid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Deal Status by PropCid
     - GET /deal/status-by-proposal/{propcid}
     - Get Deal Status by PropCid
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter propcid: (path) PropCid 

     - returns: RequestBuilder<String> 
     */
    open class func dealStatusByProposalPropcidGetWithRequestBuilder(propcid: String) -> RequestBuilder<String> {
        var path = "/deal/status-by-proposal/{propcid}"
        let propcidPreEscape = "\(propcid)"
        let propcidPostEscape = propcidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{propcid}", with: propcidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Deal Status
     - parameter miner: (path) Miner      - parameter propcid: (path) Proposal CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealStatusMinerPropcidGet(miner: String, propcid: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealStatusMinerPropcidGetWithRequestBuilder(miner: miner, propcid: propcid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Deal Status
     - GET /deal/status/{miner}/{propcid}
     - This endpoint returns the status of a deal
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter miner: (path) Miner      - parameter propcid: (path) Proposal CID 

     - returns: RequestBuilder<String> 
     */
    open class func dealStatusMinerPropcidGetWithRequestBuilder(miner: String, propcid: String) -> RequestBuilder<String> {
        var path = "/deal/status/{miner}/{propcid}"
        let minerPreEscape = "\(miner)"
        let minerPostEscape = minerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{miner}", with: minerPostEscape, options: .literal, range: nil)
        let propcidPreEscape = "\(propcid)"
        let propcidPostEscape = propcidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{propcid}", with: propcidPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Transfer In Progress

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealTransferInProgressGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealTransferInProgressGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Transfer In Progress
     - GET /deal/transfer/in-progress
     - This endpoint returns the in-progress transfers
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func dealTransferInProgressGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/deal/transfer/in-progress"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Transfer Status
     - parameter body: (body) Channel ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealTransferStatusPost(body: ApiChannelIDParam, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealTransferStatusPostWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Transfer Status
     - POST /deal/transfer/status
     - This endpoint returns the status of a transfer
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Channel ID 

     - returns: RequestBuilder<String> 
     */
    open class func dealTransferStatusPostWithRequestBuilder(body: ApiChannelIDParam) -> RequestBuilder<String> {
        let path = "/deal/transfer/status"
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Get storage failures for user

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealsFailuresGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealsFailuresGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get storage failures for user
     - GET /deals/failures
     - This endpoint returns a list of storage failures for user
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func dealsFailuresGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/deals/failures"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Make Deal
     - parameter body: (body) Deal Request      - parameter miner: (path) Miner 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealsMakeMinerPost(body: String, miner: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealsMakeMinerPostWithRequestBuilder(body: body, miner: miner).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Make Deal
     - POST /deals/make/{miner}
     - This endpoint makes a deal for a given content and miner
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter body: (body) Deal Request      - parameter miner: (path) Miner 

     - returns: RequestBuilder<String> 
     */
    open class func dealsMakeMinerPostWithRequestBuilder(body: String, miner: String) -> RequestBuilder<String> {
        var path = "/deals/make/{miner}"
        let minerPreEscape = "\(miner)"
        let minerPostEscape = minerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{miner}", with: minerPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Get Deal Status
     - parameter deal: (path) Deal ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func dealsStatusDealGet(deal: Int, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        dealsStatusDealGetWithRequestBuilder(deal: deal).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Deal Status
     - GET /deals/status/{deal}
     - This endpoint returns the status of a deal
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter deal: (path) Deal ID 

     - returns: RequestBuilder<String> 
     */
    open class func dealsStatusDealGetWithRequestBuilder(deal: Int) -> RequestBuilder<String> {
        var path = "/deals/status/{deal}"
        let dealPreEscape = "\(deal)"
        let dealPostEscape = dealPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{deal}", with: dealPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get storage failures

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicDealsFailuresGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        publicDealsFailuresGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get storage failures
     - GET /public/deals/failures
     - This endpoint returns a list of storage failures
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func publicDealsFailuresGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/public/deals/failures"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Query Ask
     - parameter miner: (path) CID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicMinersStorageQueryMinerGet(miner: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        publicMinersStorageQueryMinerGetWithRequestBuilder(miner: miner).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Query Ask
     - GET /public/miners/storage/query/{miner}
     - This endpoint returns the ask for a given CID
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter miner: (path) CID 

     - returns: RequestBuilder<String> 
     */
    open class func publicMinersStorageQueryMinerGetWithRequestBuilder(miner: String) -> RequestBuilder<String> {
        var path = "/public/miners/storage/query/{miner}"
        let minerPreEscape = "\(miner)"
        let minerPostEscape = minerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{miner}", with: minerPostEscape, options: .literal, range: nil)
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
