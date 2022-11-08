//
// TypesIpfsPinStatusResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class TypesIpfsPinStatusResponse: JSONEncodable {
    public var created: String?
    public var delegates: [String]?
    public var info: AnyObject?
    public var pin: TypesIpfsPin?
    public var requestid: String?
    public var status: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["created"] = self.created
        nillableDictionary["delegates"] = self.delegates?.encodeToJSON()
        nillableDictionary["info"] = self.info
        nillableDictionary["pin"] = self.pin?.encodeToJSON()
        nillableDictionary["requestid"] = self.requestid
        nillableDictionary["status"] = self.status
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}