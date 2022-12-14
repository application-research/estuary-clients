//
// MinerClaimMinerBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MinerClaimMinerBody: Codable {

    public var claim: String?
    public var miner: AddressAddress?
    public var name: String?

    public init(claim: String? = nil, miner: AddressAddress? = nil, name: String? = nil) {
        self.claim = claim
        self.miner = miner
        self.name = name
    }


}
