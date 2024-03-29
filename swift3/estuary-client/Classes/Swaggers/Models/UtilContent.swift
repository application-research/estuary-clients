//
// UtilContent.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class UtilContent: JSONEncodable {
    public var active: Bool?
    public var aggregate: Bool?
    /** TODO: shift most of the &#x27;state&#x27; booleans in here into a single state field, should make reasoning about things much simpler */
    public var aggregatedIn: Int32?
    public var cid: UtilDbCID?
    public var createdAt: String?
    /** If set, this content is part of a split dag. In such a case, the &#x27;root&#x27; content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) */
    public var dagSplit: Bool?
    public var dealStatus: String?
    public var description: String?
    public var failed: Bool?
    public var id: Int32?
    public var location: String?
    public var name: String?
    public var offloaded: Bool?
    public var origins: String?
    public var pinMeta: String?
    public var pinning: Bool?
    public var pinningStatus: String?
    public var replace: Bool?
    public var replication: Int32?
    public var size: Int32?
    public var splitFrom: Int32?
    public var type: UtilContentType?
    public var updatedAt: String?
    public var userId: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["active"] = self.active
        nillableDictionary["aggregate"] = self.aggregate
        nillableDictionary["aggregatedIn"] = self.aggregatedIn?.encodeToJSON()
        nillableDictionary["cid"] = self.cid?.encodeToJSON()
        nillableDictionary["createdAt"] = self.createdAt
        nillableDictionary["dagSplit"] = self.dagSplit
        nillableDictionary["dealStatus"] = self.dealStatus
        nillableDictionary["description"] = self.description
        nillableDictionary["failed"] = self.failed
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["location"] = self.location
        nillableDictionary["name"] = self.name
        nillableDictionary["offloaded"] = self.offloaded
        nillableDictionary["origins"] = self.origins
        nillableDictionary["pinMeta"] = self.pinMeta
        nillableDictionary["pinning"] = self.pinning
        nillableDictionary["pinningStatus"] = self.pinningStatus
        nillableDictionary["replace"] = self.replace
        nillableDictionary["replication"] = self.replication?.encodeToJSON()
        nillableDictionary["size"] = self.size?.encodeToJSON()
        nillableDictionary["splitFrom"] = self.splitFrom?.encodeToJSON()
        nillableDictionary["type"] = self.type?.encodeToJSON()
        nillableDictionary["updatedAt"] = self.updatedAt
        nillableDictionary["userId"] = self.userId?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
