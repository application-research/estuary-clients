part of swagger.api;

class CollectionsCollection {
  
  String cid = null;

  String createdAt = null;

  String description = null;

  String name = null;

  int userId = null;

  String uuid = null;

  CollectionsCollection();

  @override
  String toString() {
    return 'CollectionsCollection[cid=$cid, createdAt=$createdAt, description=$description, name=$name, userId=$userId, uuid=$uuid, ]';
  }

  CollectionsCollection.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid = json['cid'];
    createdAt = json['createdAt'];
    description = json['description'];
    name = json['name'];
    userId = json['userId'];
    uuid = json['uuid'];
  }

  Map<String, dynamic> toJson() {
    return {
      'cid': cid,
      'createdAt': createdAt,
      'description': description,
      'name': name,
      'userId': userId,
      'uuid': uuid
     };
  }

  static List<CollectionsCollection> listFromJson(List<dynamic> json) {
    return json == null ? new List<CollectionsCollection>() : json.map((value) => new CollectionsCollection.fromJson(value)).toList();
  }

  static Map<String, CollectionsCollection> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, CollectionsCollection>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new CollectionsCollection.fromJson(value));
    }
    return map;
  }
}
