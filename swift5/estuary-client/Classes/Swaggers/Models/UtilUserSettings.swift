//
// UtilUserSettings.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UtilUserSettings: Codable {

    public var contentAddingDisabled: Bool?
    public var dealDuration: Int?
    public var dealMakingDisabled: Bool?
    public var fileStagingThreshold: Int?
    public var flags: Int?
    public var replication: Int?
    public var uploadEndpoints: [String]?
    public var verified: Bool?

    public init(contentAddingDisabled: Bool? = nil, dealDuration: Int? = nil, dealMakingDisabled: Bool? = nil, fileStagingThreshold: Int? = nil, flags: Int? = nil, replication: Int? = nil, uploadEndpoints: [String]? = nil, verified: Bool? = nil) {
        self.contentAddingDisabled = contentAddingDisabled
        self.dealDuration = dealDuration
        self.dealMakingDisabled = dealMakingDisabled
        self.fileStagingThreshold = fileStagingThreshold
        self.flags = flags
        self.replication = replication
        self.uploadEndpoints = uploadEndpoints
        self.verified = verified
    }


}
