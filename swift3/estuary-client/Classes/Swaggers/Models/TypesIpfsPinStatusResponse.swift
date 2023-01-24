//
// TypesIpfsPinStatusResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class TypesIpfsPinStatusResponse: JSONEncodable {
    public var content: UtilContent?
    public var created: String?
    public var delegates: [String]?
    public var info: [String:Any]?
    public var pin: TypesIpfsPin?
    public var requestid: String?
    public var status: TypesPinningStatus?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["content"] = self.content?.encodeToJSON()
        nillableDictionary["created"] = self.created
        nillableDictionary["delegates"] = self.delegates?.encodeToJSON()
        nillableDictionary["info"] = self.info?.encodeToJSON()
        nillableDictionary["pin"] = self.pin?.encodeToJSON()
        nillableDictionary["requestid"] = self.requestid
        nillableDictionary["status"] = self.status?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
