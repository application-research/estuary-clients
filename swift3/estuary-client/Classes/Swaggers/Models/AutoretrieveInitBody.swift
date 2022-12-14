//
// AutoretrieveInitBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class AutoretrieveInitBody: JSONEncodable {
    /** Autoretrieve&#x27;s comma-separated list of addresses */
    public var addresses: String?
    /** Autoretrieve&#x27;s public key */
    public var pubKey: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["addresses"] = self.addresses
        nillableDictionary["pubKey"] = self.pubKey

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
