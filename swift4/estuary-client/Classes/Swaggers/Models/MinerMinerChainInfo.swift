//
// MinerMinerChainInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct MinerMinerChainInfo: Codable {


    public var addresses: [String]?

    public var owner: String?

    public var peerId: String?

    public var worker: String?
    public init(addresses: [String]? = nil, owner: String? = nil, peerId: String? = nil, worker: String? = nil) { 
        self.addresses = addresses
        self.owner = owner
        self.peerId = peerId
        self.worker = worker
    }

}
