//
// UtilContentAddResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class UtilContentAddResponse: JSONEncodable {

    public var cid: String?
    public var estuaryId: Int32?
    public var providers: [String]?
    public var retrievalUrl: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["cid"] = self.cid
        nillableDictionary["estuaryId"] = self.estuaryId?.encodeToJSON()
        nillableDictionary["providers"] = self.providers?.encodeToJSON()
        nillableDictionary["retrieval_url"] = self.retrievalUrl

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
