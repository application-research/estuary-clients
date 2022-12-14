//
// AutoretrieveInitBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AutoretrieveInitBody: Codable {

    /** Autoretrieve&#x27;s comma-separated list of addresses */
    public var addresses: String
    /** Autoretrieve&#x27;s public key */
    public var pubKey: String

    public init(addresses: String, pubKey: String) {
        self.addresses = addresses
        self.pubKey = pubKey
    }


}
