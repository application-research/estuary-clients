part of swagger.api;

class CollectionsCollectionListResponse {
  
  UtilDbCID cid = null;

  String coluuid = null;

  int contId = null;

  String dir = null;

  String name = null;

  int size = null;

  CollectionsCidType type = null;

  String updatedAt = null;

  CollectionsCollectionListResponse();

  @override
  String toString() {
    return 'CollectionsCollectionListResponse[cid=$cid, coluuid=$coluuid, contId=$contId, dir=$dir, name=$name, size=$size, type=$type, updatedAt=$updatedAt, ]';
  }

  CollectionsCollectionListResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid = new UtilDbCID.fromJson(json['cid']);
    coluuid = json['coluuid'];
    contId = json['contId'];
    dir = json['dir'];
    name = json['name'];
    size = json['size'];
    type = new CollectionsCidType.fromJson(json['type']);
    updatedAt = json['updatedAt'];
  }

  Map<String, dynamic> toJson() {
    return {
      'cid': cid,
      'coluuid': coluuid,
      'contId': contId,
      'dir': dir,
      'name': name,
      'size': size,
      'type': type,
      'updatedAt': updatedAt
     };
  }

  static List<CollectionsCollectionListResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<CollectionsCollectionListResponse>() : json.map((value) => new CollectionsCollectionListResponse.fromJson(value)).toList();
  }

  static Map<String, CollectionsCollectionListResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, CollectionsCollectionListResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new CollectionsCollectionListResponse.fromJson(value));
    }
    return map;
  }
}
