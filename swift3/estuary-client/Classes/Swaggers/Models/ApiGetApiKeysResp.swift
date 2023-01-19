//
// ApiGetApiKeysResp.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ApiGetApiKeysResp: JSONEncodable {
    public var expiry: String?
    public var isSession: Bool?
    public var label: String?
    public var token: String?
    public var tokenHash: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["expiry"] = self.expiry
        nillableDictionary["isSession"] = self.isSession
        nillableDictionary["label"] = self.label
        nillableDictionary["token"] = self.token
        nillableDictionary["tokenHash"] = self.tokenHash

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
