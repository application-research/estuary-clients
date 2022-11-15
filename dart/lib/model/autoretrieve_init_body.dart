part of swagger.api;

class AutoretrieveInitBody {
  /* Autoretrieve's comma-separated list of addresses */
  String addresses = null;
/* Autoretrieve's public key */
  String pubKey = null;

  AutoretrieveInitBody();

  @override
  String toString() {
    return 'AutoretrieveInitBody[addresses=$addresses, pubKey=$pubKey, ]';
  }

  AutoretrieveInitBody.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    addresses = json['addresses'];
    pubKey = json['pubKey'];
  }

  Map<String, dynamic> toJson() {
    return {
      'addresses': addresses,
      'pubKey': pubKey
     };
  }

  static List<AutoretrieveInitBody> listFromJson(List<dynamic> json) {
    return json == null ? new List<AutoretrieveInitBody>() : json.map((value) => new AutoretrieveInitBody.fromJson(value)).toList();
  }

  static Map<String, AutoretrieveInitBody> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, AutoretrieveInitBody>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new AutoretrieveInitBody.fromJson(value));
    }
    return map;
  }
}
