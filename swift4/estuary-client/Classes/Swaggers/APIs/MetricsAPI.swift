//
// MetricsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class MetricsAPI {
    /**
     Get deal metrics

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func publicMetricsDealsOnChainGet(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        publicMetricsDealsOnChainGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get deal metrics
     - GET /public/metrics/deals-on-chain
     - This endpoint is used to get deal metrics
     - API Key:
       - type: apiKey Authorization 
       - name: bearerAuth
     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func publicMetricsDealsOnChainGetWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/public/metrics/deals-on-chain"
        let URLString = estuary-clientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<String>.Type = estuary-clientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
