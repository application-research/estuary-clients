//
// TypesIpfsListPinStatusResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct TypesIpfsListPinStatusResponse: Codable {


    public var count: Int?

    public var results: [TypesIpfsPinStatusResponse]?
    public init(count: Int? = nil, results: [TypesIpfsPinStatusResponse]? = nil) { 
        self.count = count
        self.results = results
    }

}
