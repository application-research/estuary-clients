//
// UtilContentCreateBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UtilContentCreateBody: Codable {

    public var coluuid: String?
    public var dir: String?
    public var location: String?
    public var name: String?
    public var root: String?
    public var type: UtilContentType?

    public init(coluuid: String? = nil, dir: String? = nil, location: String? = nil, name: String? = nil, root: String? = nil, type: UtilContentType? = nil) {
        self.coluuid = coluuid
        self.dir = dir
        self.location = location
        self.name = name
        self.root = root
        self.type = type
    }


}
