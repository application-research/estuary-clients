part of swagger.api;

class UtilContent {
  
  bool active = null;

  bool aggregate = null;
/* TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler */
  int aggregatedIn = null;

  UtilDbCID cid = null;

  String createdAt = null;
/* If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates) */
  bool dagSplit = null;

  String dealStatus = null;

  String description = null;

  bool failed = null;

  int id = null;

  String location = null;

  String name = null;

  bool offloaded = null;

  String origins = null;

  String pinMeta = null;

  bool pinning = null;

  String pinningStatus = null;

  bool replace = null;

  int replication = null;

  int size = null;

  int splitFrom = null;

  UtilContentType type = null;

  String updatedAt = null;

  int userId = null;

  UtilContent();

  @override
  String toString() {
    return 'UtilContent[active=$active, aggregate=$aggregate, aggregatedIn=$aggregatedIn, cid=$cid, createdAt=$createdAt, dagSplit=$dagSplit, dealStatus=$dealStatus, description=$description, failed=$failed, id=$id, location=$location, name=$name, offloaded=$offloaded, origins=$origins, pinMeta=$pinMeta, pinning=$pinning, pinningStatus=$pinningStatus, replace=$replace, replication=$replication, size=$size, splitFrom=$splitFrom, type=$type, updatedAt=$updatedAt, userId=$userId, ]';
  }

  UtilContent.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    active = json['active'];
    aggregate = json['aggregate'];
    aggregatedIn = json['aggregatedIn'];
    cid = new UtilDbCID.fromJson(json['cid']);
    createdAt = json['createdAt'];
    dagSplit = json['dagSplit'];
    dealStatus = json['dealStatus'];
    description = json['description'];
    failed = json['failed'];
    id = json['id'];
    location = json['location'];
    name = json['name'];
    offloaded = json['offloaded'];
    origins = json['origins'];
    pinMeta = json['pinMeta'];
    pinning = json['pinning'];
    pinningStatus = json['pinningStatus'];
    replace = json['replace'];
    replication = json['replication'];
    size = json['size'];
    splitFrom = json['splitFrom'];
    type = new UtilContentType.fromJson(json['type']);
    updatedAt = json['updatedAt'];
    userId = json['userId'];
  }

  Map<String, dynamic> toJson() {
    return {
      'active': active,
      'aggregate': aggregate,
      'aggregatedIn': aggregatedIn,
      'cid': cid,
      'createdAt': createdAt,
      'dagSplit': dagSplit,
      'dealStatus': dealStatus,
      'description': description,
      'failed': failed,
      'id': id,
      'location': location,
      'name': name,
      'offloaded': offloaded,
      'origins': origins,
      'pinMeta': pinMeta,
      'pinning': pinning,
      'pinningStatus': pinningStatus,
      'replace': replace,
      'replication': replication,
      'size': size,
      'splitFrom': splitFrom,
      'type': type,
      'updatedAt': updatedAt,
      'userId': userId
     };
  }

  static List<UtilContent> listFromJson(List<dynamic> json) {
    return json == null ? new List<UtilContent>() : json.map((value) => new UtilContent.fromJson(value)).toList();
  }

  static Map<String, UtilContent> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, UtilContent>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new UtilContent.fromJson(value));
    }
    return map;
  }
}
