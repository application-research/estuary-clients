part of swagger.api;

class MainCollection {
  
  String cid = null;
  

  String createdAt = null;
  

  String description = null;
  

  String name = null;
  

  int userId = null;
  

  String uuid = null;
  
  MainCollection();

  @override
  String toString() {
    return 'MainCollection[cid=$cid, createdAt=$createdAt, description=$description, name=$name, userId=$userId, uuid=$uuid, ]';
  }

  MainCollection.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    cid =
        json['cid']
    ;
    createdAt =
        json['createdAt']
    ;
    description =
        json['description']
    ;
    name =
        json['name']
    ;
    userId =
        json['userId']
    ;
    uuid =
        json['uuid']
    ;
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

  static List<MainCollection> listFromJson(List<dynamic> json) {
    return json == null ? new List<MainCollection>() : json.map((value) => new MainCollection.fromJson(value)).toList();
  }

  static Map<String, MainCollection> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, MainCollection>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new MainCollection.fromJson(value));
    }
    return map;
  }
}

